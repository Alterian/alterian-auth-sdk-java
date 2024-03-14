/*
 * Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 6.35.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alterian.auth.api;

import com.alterian.auth.ApiException;
import com.alterian.auth.model.ApplicationLoginDefaultResponse;
import com.alterian.auth.model.ApplicationLoginRequest;
import com.alterian.auth.model.FormsAuthenticationDefaultResponse;
import com.alterian.auth.model.FormsAuthenticationRequest;
import com.alterian.auth.model.GetIdentityUrlDefaultResponse;
import com.alterian.auth.model.GetIdentityUrlRequest;
import com.alterian.auth.model.GetSiteDetailsRequest;
import com.alterian.auth.model.LogoutDefaultResponse;
import com.alterian.auth.model.SAMLAuthenticationRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationApi
 */
@Disabled
public class AuthenticationApiTest {

    private final AuthenticationApi api = new AuthenticationApi();

    /**
     * this method requests the auth server give you a token for a particular \&quot;application\&quot;
     *
     * this method requests the auth server give you a token for a particular \&quot;application\&quot;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void applicationLoginTest() throws ApiException {
        ApplicationLoginRequest applicationLoginRequest = null;
        ApplicationLoginDefaultResponse response = api.applicationLogin(applicationLoginRequest);
        // TODO: test validations
    }

    /**
     * Provide a username and SHA1 encoded password to log into the system.  It is always recommended that this method be called via a secured method.              Should be followed by a call to @see(ApplicationLogin)
     *
     * Provide a username and SHA1 encoded password to log into the system.  It is always recommended that this method be called via a secured method.              Should be followed by a call to @see(ApplicationLogin)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void formsAuthenticationTest() throws ApiException {
        FormsAuthenticationRequest formsAuthenticationRequest = null;
        FormsAuthenticationDefaultResponse response = api.formsAuthentication(formsAuthenticationRequest);
        // TODO: test validations
    }

    /**
     * 
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getIdentityUrlTest() throws ApiException {
        GetIdentityUrlRequest getIdentityUrlRequest = null;
        GetIdentityUrlDefaultResponse response = api.getIdentityUrl(getIdentityUrlRequest);
        // TODO: test validations
    }

    /**
     * Returns the details for a particular application.  This is the same information as returned when you call @see(ApplicationLogin) but you will not receive an access token from this method.
     *
     * Returns the details for a particular application.  This is the same information as returned when you call @see(ApplicationLogin) but you will not receive an access token from this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSiteDetailsTest() throws ApiException {
        GetSiteDetailsRequest getSiteDetailsRequest = null;
        ApplicationLoginDefaultResponse response = api.getSiteDetails(getSiteDetailsRequest);
        // TODO: test validations
    }

    /**
     * Logs the requested token out of the authentication system and out of any application for which a call has been made to @see(ApplicationLogin)
     *
     * Logs the requested token out of the authentication system and out of any application for which a call has been made to @see(ApplicationLogin)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void logoutTest() throws ApiException {
        LogoutDefaultResponse response = api.logout();
        // TODO: test validations
    }

    /**
     * If you have configured NTLM authentication properly, you can use this to get an authentication token.  Please note you must have configured IIS and everything correctly for this method to function.
     *
     * If you have configured NTLM authentication properly, you can use this to get an authentication token.  Please note you must have configured IIS and everything correctly for this method to function.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void nTLMAuthenticationTest() throws ApiException {
        FormsAuthenticationDefaultResponse response = api.nTLMAuthentication();
        // TODO: test validations
    }

    /**
     * Use an Open Id Connect token to connect.  Your system must be configured to allow this; please review the documentation.
     *
     * Use an Open Id Connect token to connect.  Your system must be configured to allow this; please review the documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void openIdAuthenticationTest() throws ApiException {
        String code = null;
        String state = null;
        Object response = api.openIdAuthentication(code, state);
        // TODO: test validations
    }

    /**
     * Provided a valid SAML [Base64 encoded] token, this will return back an auth server token and application information.
     *
     * Provided a valid SAML [Base64 encoded] token, this will return back an auth server token and application information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sAMLAuthenticationTest() throws ApiException {
        SAMLAuthenticationRequest saMLAuthenticationRequest = null;
        FormsAuthenticationDefaultResponse response = api.sAMLAuthentication(saMLAuthenticationRequest);
        // TODO: test validations
    }

}