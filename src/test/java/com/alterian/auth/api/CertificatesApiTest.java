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
import com.alterian.auth.model.AddCertificateDefaultResponse;
import com.alterian.auth.model.AddCertificateRequest;
import com.alterian.auth.model.DeleteCertificateRequest;
import com.alterian.auth.model.GetCertificateDefaultResponse;
import com.alterian.auth.model.GetCertificateRequest;
import com.alterian.auth.model.GetCertificatesDefaultResponse;
import com.alterian.auth.model.GetCertificatesRequest;
import com.alterian.auth.model.LogoutDefaultResponse;
import com.alterian.auth.model.UpdateCertificateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CertificatesApi
 */
@Disabled
public class CertificatesApiTest {

    private final CertificatesApi api = new CertificatesApi();

    /**
     * Adds a certificate for use with single sign on
     *
     * Adds a certificate for use with single sign on
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCertificateTest() throws ApiException {
        AddCertificateRequest addCertificateRequest = null;
        AddCertificateDefaultResponse response = api.addCertificate(addCertificateRequest);
        // TODO: test validations
    }

    /**
     * Deletes the specified certificate
     *
     * Deletes the specified certificate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCertificateTest() throws ApiException {
        DeleteCertificateRequest deleteCertificateRequest = null;
        LogoutDefaultResponse response = api.deleteCertificate(deleteCertificateRequest);
        // TODO: test validations
    }

    /**
     * Gets the specified certificate
     *
     * Gets the specified certificate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCertificateTest() throws ApiException {
        GetCertificateRequest getCertificateRequest = null;
        GetCertificateDefaultResponse response = api.getCertificate(getCertificateRequest);
        // TODO: test validations
    }

    /**
     * Gets a list of available certificates
     *
     * Gets a list of available certificates
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCertificatesTest() throws ApiException {
        GetCertificatesRequest getCertificatesRequest = null;
        GetCertificatesDefaultResponse response = api.getCertificates(getCertificatesRequest);
        // TODO: test validations
    }

    /**
     * Updates information associated with a certificate
     *
     * Updates information associated with a certificate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCertificateTest() throws ApiException {
        UpdateCertificateRequest updateCertificateRequest = null;
        LogoutDefaultResponse response = api.updateCertificate(updateCertificateRequest);
        // TODO: test validations
    }

}