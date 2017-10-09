/*
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.cas.ticket.support;

import static org.junit.Assert.*;

import org.jasig.cas.TestUtils;
import org.jasig.cas.ticket.TicketGrantingTicket;
import org.jasig.cas.ticket.TicketGrantingTicketImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Scott Battaglia
 * @since 3.0
 */
public class ThrottledUseAndTimeoutExpirationPolicyTests  {

    private static final long TIMEOUT = 50;

    private static final long TIMEOUT_BUFFER = 10;

    private ThrottledUseAndTimeoutExpirationPolicy expirationPolicy;

    private TicketGrantingTicket ticket;

    @Before
    public void setUp() throws Exception {
        this.expirationPolicy = new ThrottledUseAndTimeoutExpirationPolicy();
        this.expirationPolicy.setTimeToKillInMilliSeconds(TIMEOUT);
        this.expirationPolicy.setTimeInBetweenUsesInMilliSeconds(TIMEOUT / 5);

        this.ticket = new TicketGrantingTicketImpl("test", TestUtils
            .getAuthentication(), this.expirationPolicy);

    }

    @Test
    public void testTicketIsNotExpired() {
        assertFalse(this.ticket.isExpired());
    }

    @Test
    public void testTicketIsExpired() throws InterruptedException {
        Thread.sleep(TIMEOUT + TIMEOUT_BUFFER);
        assertTrue(this.ticket.isExpired());
    }

    @Test
    public void testTicketUsedButWithTimeout() throws InterruptedException {
        this.ticket.grantServiceTicket("test", TestUtils.getService(), this.expirationPolicy, false);
        Thread.sleep(TIMEOUT - TIMEOUT_BUFFER);
        assertFalse(this.ticket.isExpired());
    }

    @Test
    public void testNotWaitingEnoughTime() {
        this.ticket.grantServiceTicket("test", TestUtils.getService(), this.expirationPolicy, false);
        assertTrue(this.ticket.isExpired());
    }
}
