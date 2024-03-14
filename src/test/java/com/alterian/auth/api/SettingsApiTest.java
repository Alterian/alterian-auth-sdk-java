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
import com.alterian.auth.model.AddSettingRequest;
import com.alterian.auth.model.DeleteSettingRequest;
import com.alterian.auth.model.GetSettingDefaultResponse;
import com.alterian.auth.model.GetSettingRequest;
import com.alterian.auth.model.GetSettingsDefaultResponse;
import com.alterian.auth.model.GetSettingsRequest;
import com.alterian.auth.model.GetSettingsValuesRequest;
import com.alterian.auth.model.LogoutDefaultResponse;
import com.alterian.auth.model.SetEMServiceURLRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SettingsApi
 */
@Disabled
public class SettingsApiTest {

    private final SettingsApi api = new SettingsApi();

    /**
     * Adds in a setting which can then be mapped to an issuer for the purposes of claims authentication.
     *
     * Adds in a setting which can then be mapped to an issuer for the purposes of claims authentication.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addSettingTest() throws ApiException {
        AddSettingRequest addSettingRequest = null;
        AddCertificateDefaultResponse response = api.addSetting(addSettingRequest);
        // TODO: test validations
    }

    /**
     * Deletes a setting
     *
     * Deletes a setting
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSettingTest() throws ApiException {
        DeleteSettingRequest deleteSettingRequest = null;
        LogoutDefaultResponse response = api.deleteSetting(deleteSettingRequest);
        // TODO: test validations
    }

    /**
     * Read a setting
     *
     * Read a setting
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSettingTest() throws ApiException {
        GetSettingRequest getSettingRequest = null;
        GetSettingDefaultResponse response = api.getSetting(getSettingRequest);
        // TODO: test validations
    }

    /**
     * Reads a list of settings
     *
     * Reads a list of settings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSettingsTest() throws ApiException {
        GetSettingsRequest getSettingsRequest = null;
        GetSettingsDefaultResponse response = api.getSettings(getSettingsRequest);
        // TODO: test validations
    }

    /**
     * Reads settings and their values
     *
     * Reads settings and their values
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSettingsValuesTest() throws ApiException {
        GetSettingsValuesRequest getSettingsValuesRequest = null;
        GetSettingsDefaultResponse response = api.getSettingsValues(getSettingsValuesRequest);
        // TODO: test validations
    }

    /**
     * Updates the EM service URL
     *
     * Updates the EM service URL
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setEMServiceURLTest() throws ApiException {
        SetEMServiceURLRequest setEMServiceURLRequest = null;
        LogoutDefaultResponse response = api.setEMServiceURL(setEMServiceURLRequest);
        // TODO: test validations
    }

    /**
     * Updates a setting
     *
     * Updates a setting
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSettingTest() throws ApiException {
        AddSettingRequest addSettingRequest = null;
        LogoutDefaultResponse response = api.updateSetting(addSettingRequest);
        // TODO: test validations
    }

}