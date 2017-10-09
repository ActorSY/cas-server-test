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
package org.jasig.cas.adaptors.ldap.remote;

import org.jasig.cas.authentication.AbstractCredential;

/**
 *
 * @author Scott Battaglia
 * @since 3.2.1
 *
 */
public final class RemoteAddressCredential extends AbstractCredential {

    /** Serialization version marker. */
    private static final long serialVersionUID = -3638145328441211073L;

    private final String remoteAddress;

    public RemoteAddressCredential(final String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    public String getRemoteAddress() {
        return this.remoteAddress;
    }

    @Override
    public String getId() {
        return this.remoteAddress;
    }
}
