/*
 * Demoiselle Framework
 *
 * License: GNU Lesser General Public License (LGPL), version 3 or later.
 * See the lgpl.txt file in the root directory or <https://www.gnu.org/licenses/lgpl.html>.
 */
package org.demoiselle.jee.security.token.impl;

import javax.annotation.Priority;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import static javax.ws.rs.Priorities.AUTHENTICATION;
import org.demoiselle.jee.core.api.security.DemoiselleUser;
import org.demoiselle.jee.core.api.security.Token;
import org.demoiselle.jee.core.api.security.TokenManager;
import org.demoiselle.jee.core.api.security.TokenType;

/**
 *
 * @author COMUNIDADE
 */
@RequestScoped
@Priority(AUTHENTICATION)
public class TokenManagerImpl implements TokenManager {

    @Inject
    private Token token;

    /**
     * Returns the user that is stored in a list in memory, from the token sent
     * in http header
     *
     * @return org.demoiselle.jee.core.api.security.DemoiselleUser
     */
    @Override
    public DemoiselleUser getUser() {

        return null;
    }

    @Override
    public DemoiselleUser getUser(String issuer, String audience) {
        DemoiselleUser dml = getUser();

        return null;
    }

    /**
     * It will be included in the user memory and generate a unique
     * identification token to be placed in the header of HTTP requests
     *
     * @param user org.demoiselle.jee.core.api.security.DemoiselleUser
     */
    @Override
    public void setUser(DemoiselleUser user) {
        token.setKey(null);

        token.setType(TokenType.TOKEN);
    }

    /**
     * It will be included in the user memory and generate a unique
     * identification token to be placed in the header of HTTP requests
     *
     * @param user org.demoiselle.jee.core.api.security.DemoiselleUser
     * @param issuer
     * @param audience
     */
    @Override
    public void setUser(DemoiselleUser user, String issuer, String audience) {
        user.addParam("issuer", issuer);
        user.addParam("audience", audience);
        setUser(user);
    }

    /**
     * validate the token and the user is in memory
     *
     * @return boolean
     */
    @Override
    public boolean validate() {
        return getUser() != null;
    }

    /**
     * validate the token and the user is in memory
     *
     * @return boolean
     */
    @Override
    public boolean validate(String issuer, String audience) {
        return getUser() != null;
    }

    /**
     * remove the token and the user is in memory
     */
    public void removeToken() {

        token.setKey(null);
    }

    /**
     * remove the token and the user is in memory
     *
     * @param user principal
     */
    @Override
    public void removeUser(DemoiselleUser user) {

        removeToken();
    }

}
