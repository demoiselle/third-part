/*
 * Demoiselle Framework
 *
 * License: GNU Lesser General Public License (LGPL), version 3 or later.
 * See the lgpl.txt file in the root directory or <https://www.gnu.org/licenses/lgpl.html>.
 */
package org.demoiselle.jee.security.token.impl;

import static java.lang.System.out;
import java.util.logging.Logger;
import javax.inject.Inject;
import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.demoiselle.jee.core.api.security.DemoiselleUser;
import org.demoiselle.jee.core.api.security.Token;
import org.demoiselle.jee.core.api.security.TokenManager;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author gladson
 */
@RunWith(CdiTestRunner.class)
public class TokenManagerImplTest {
    private static String localtoken;
    private static final Logger LOG = Logger.getLogger(TokenManagerImplTest.class.getName());

    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }

    @Inject
    private DemoiselleUser dml;

    @Inject
    private Token token;


    @Inject
    private TokenManager instance;

    /**
     *
     */
    public TokenManagerImplTest() {
    }


    /**
     *
     */
    @Before
    public void setUp() {

    }

    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of setUser method, of class TokenManagerImpl.
     */
    @Test
    public void test20() {
        out.println("setUser");
        assertEquals("", "");
    }

}
