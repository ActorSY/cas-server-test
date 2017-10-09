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
package org.jasig.cas.authentication.handler;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Scott Battaglia
 * @since 3.1
 */
public final class BlockedCredentialsAuthenticationExceptionTests {

    private static final String CODE = "error.authentication.credentials.blocked";

    @Test
    public void testGetCode() {
        AuthenticationException e = new BlockedCredentialsAuthenticationException();
        assertEquals(CODE, e.getCode());
        assertEquals(CODE, e.toString());
    }

    @Test
    public void testThrowableConstructor() {
        final RuntimeException r = new RuntimeException();
        final BlockedCredentialsAuthenticationException e = new BlockedCredentialsAuthenticationException(r);

        assertEquals(CODE, e.getCode());
        assertEquals(r, e.getCause());
    }

    @Test
    public void testCodeConstructor() {
        final String MESSAGE = "GG";
        final BlockedCredentialsAuthenticationException e = new BlockedCredentialsAuthenticationException(MESSAGE);

        assertEquals(MESSAGE, e.getCode());
    }

    @Test
    public void testThrowableConstructorWithCode() {
        final String MESSAGE = "GG";
        final RuntimeException r = new RuntimeException();
        final BlockedCredentialsAuthenticationException e = new BlockedCredentialsAuthenticationException(MESSAGE, r);

        assertEquals(MESSAGE, e.getCode());
        assertEquals(r, e.getCause());
    }
}
