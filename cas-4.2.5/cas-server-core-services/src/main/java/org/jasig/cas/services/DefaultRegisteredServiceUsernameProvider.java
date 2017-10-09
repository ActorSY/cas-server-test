package org.jasig.cas.services;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jasig.cas.authentication.principal.Principal;
import org.jasig.cas.authentication.principal.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Resolves the username for the service to be the default principal id.
 * @author Misagh Moayyed
 * @since 4.1.0
 */
public final class DefaultRegisteredServiceUsernameProvider implements RegisteredServiceUsernameAttributeProvider {
    private static final long serialVersionUID = 5823989148794052951L;
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultRegisteredServiceUsernameProvider.class);

    @Override
    public String resolveUsername(final Principal principal, final Service service) {
        LOGGER.debug("Returning the default principal id [{}] for username.", principal.getId());
        return principal.getId();
    }


    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(13, 113).toHashCode();
    }
}
