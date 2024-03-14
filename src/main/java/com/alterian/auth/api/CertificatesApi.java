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

import com.alterian.auth.ApiCallback;
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.ApiResponse;
import com.alterian.auth.Configuration;
import com.alterian.auth.Pair;
import com.alterian.auth.ProgressRequestBody;
import com.alterian.auth.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.alterian.auth.model.AddCertificateDefaultResponse;
import com.alterian.auth.model.AddCertificateRequest;
import com.alterian.auth.model.DeleteCertificateRequest;
import com.alterian.auth.model.GetCertificateDefaultResponse;
import com.alterian.auth.model.GetCertificateRequest;
import com.alterian.auth.model.GetCertificatesDefaultResponse;
import com.alterian.auth.model.GetCertificatesRequest;
import com.alterian.auth.model.LogoutDefaultResponse;
import com.alterian.auth.model.UpdateCertificateRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CertificatesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CertificatesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CertificatesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for addCertificate
     * @param addCertificateRequest Adds a certificate for use with single sign on (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addCertificateCall(AddCertificateRequest addCertificateRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = addCertificateRequest;

        // create path and map variables
        String localVarPath = "/AddCertificate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addCertificateValidateBeforeCall(AddCertificateRequest addCertificateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'addCertificateRequest' is set
        if (addCertificateRequest == null) {
            throw new ApiException("Missing the required parameter 'addCertificateRequest' when calling addCertificate(Async)");
        }

        return addCertificateCall(addCertificateRequest, _callback);

    }

    /**
     * Adds a certificate for use with single sign on
     * Adds a certificate for use with single sign on
     * @param addCertificateRequest Adds a certificate for use with single sign on (required)
     * @return AddCertificateDefaultResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public AddCertificateDefaultResponse addCertificate(AddCertificateRequest addCertificateRequest) throws ApiException {
        ApiResponse<AddCertificateDefaultResponse> localVarResp = addCertificateWithHttpInfo(addCertificateRequest);
        return localVarResp.getData();
    }

    /**
     * Adds a certificate for use with single sign on
     * Adds a certificate for use with single sign on
     * @param addCertificateRequest Adds a certificate for use with single sign on (required)
     * @return ApiResponse&lt;AddCertificateDefaultResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AddCertificateDefaultResponse> addCertificateWithHttpInfo(AddCertificateRequest addCertificateRequest) throws ApiException {
        okhttp3.Call localVarCall = addCertificateValidateBeforeCall(addCertificateRequest, null);
        Type localVarReturnType = new TypeToken<AddCertificateDefaultResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Adds a certificate for use with single sign on (asynchronously)
     * Adds a certificate for use with single sign on
     * @param addCertificateRequest Adds a certificate for use with single sign on (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addCertificateAsync(AddCertificateRequest addCertificateRequest, final ApiCallback<AddCertificateDefaultResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = addCertificateValidateBeforeCall(addCertificateRequest, _callback);
        Type localVarReturnType = new TypeToken<AddCertificateDefaultResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCertificate
     * @param deleteCertificateRequest Deletes the specified certificate (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCertificateCall(DeleteCertificateRequest deleteCertificateRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = deleteCertificateRequest;

        // create path and map variables
        String localVarPath = "/DeleteCertificate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCertificateValidateBeforeCall(DeleteCertificateRequest deleteCertificateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'deleteCertificateRequest' is set
        if (deleteCertificateRequest == null) {
            throw new ApiException("Missing the required parameter 'deleteCertificateRequest' when calling deleteCertificate(Async)");
        }

        return deleteCertificateCall(deleteCertificateRequest, _callback);

    }

    /**
     * Deletes the specified certificate
     * Deletes the specified certificate
     * @param deleteCertificateRequest Deletes the specified certificate (required)
     * @return LogoutDefaultResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public LogoutDefaultResponse deleteCertificate(DeleteCertificateRequest deleteCertificateRequest) throws ApiException {
        ApiResponse<LogoutDefaultResponse> localVarResp = deleteCertificateWithHttpInfo(deleteCertificateRequest);
        return localVarResp.getData();
    }

    /**
     * Deletes the specified certificate
     * Deletes the specified certificate
     * @param deleteCertificateRequest Deletes the specified certificate (required)
     * @return ApiResponse&lt;LogoutDefaultResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LogoutDefaultResponse> deleteCertificateWithHttpInfo(DeleteCertificateRequest deleteCertificateRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteCertificateValidateBeforeCall(deleteCertificateRequest, null);
        Type localVarReturnType = new TypeToken<LogoutDefaultResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Deletes the specified certificate (asynchronously)
     * Deletes the specified certificate
     * @param deleteCertificateRequest Deletes the specified certificate (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCertificateAsync(DeleteCertificateRequest deleteCertificateRequest, final ApiCallback<LogoutDefaultResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCertificateValidateBeforeCall(deleteCertificateRequest, _callback);
        Type localVarReturnType = new TypeToken<LogoutDefaultResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCertificate
     * @param getCertificateRequest Gets the specified certificate (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCertificateCall(GetCertificateRequest getCertificateRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getCertificateRequest;

        // create path and map variables
        String localVarPath = "/GetCertificate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCertificateValidateBeforeCall(GetCertificateRequest getCertificateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'getCertificateRequest' is set
        if (getCertificateRequest == null) {
            throw new ApiException("Missing the required parameter 'getCertificateRequest' when calling getCertificate(Async)");
        }

        return getCertificateCall(getCertificateRequest, _callback);

    }

    /**
     * Gets the specified certificate
     * Gets the specified certificate
     * @param getCertificateRequest Gets the specified certificate (required)
     * @return GetCertificateDefaultResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GetCertificateDefaultResponse getCertificate(GetCertificateRequest getCertificateRequest) throws ApiException {
        ApiResponse<GetCertificateDefaultResponse> localVarResp = getCertificateWithHttpInfo(getCertificateRequest);
        return localVarResp.getData();
    }

    /**
     * Gets the specified certificate
     * Gets the specified certificate
     * @param getCertificateRequest Gets the specified certificate (required)
     * @return ApiResponse&lt;GetCertificateDefaultResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetCertificateDefaultResponse> getCertificateWithHttpInfo(GetCertificateRequest getCertificateRequest) throws ApiException {
        okhttp3.Call localVarCall = getCertificateValidateBeforeCall(getCertificateRequest, null);
        Type localVarReturnType = new TypeToken<GetCertificateDefaultResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Gets the specified certificate (asynchronously)
     * Gets the specified certificate
     * @param getCertificateRequest Gets the specified certificate (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCertificateAsync(GetCertificateRequest getCertificateRequest, final ApiCallback<GetCertificateDefaultResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCertificateValidateBeforeCall(getCertificateRequest, _callback);
        Type localVarReturnType = new TypeToken<GetCertificateDefaultResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCertificates
     * @param getCertificatesRequest Gets a list of available certificates (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCertificatesCall(GetCertificatesRequest getCertificatesRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getCertificatesRequest;

        // create path and map variables
        String localVarPath = "/GetCertificates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCertificatesValidateBeforeCall(GetCertificatesRequest getCertificatesRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'getCertificatesRequest' is set
        if (getCertificatesRequest == null) {
            throw new ApiException("Missing the required parameter 'getCertificatesRequest' when calling getCertificates(Async)");
        }

        return getCertificatesCall(getCertificatesRequest, _callback);

    }

    /**
     * Gets a list of available certificates
     * Gets a list of available certificates
     * @param getCertificatesRequest Gets a list of available certificates (required)
     * @return GetCertificatesDefaultResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GetCertificatesDefaultResponse getCertificates(GetCertificatesRequest getCertificatesRequest) throws ApiException {
        ApiResponse<GetCertificatesDefaultResponse> localVarResp = getCertificatesWithHttpInfo(getCertificatesRequest);
        return localVarResp.getData();
    }

    /**
     * Gets a list of available certificates
     * Gets a list of available certificates
     * @param getCertificatesRequest Gets a list of available certificates (required)
     * @return ApiResponse&lt;GetCertificatesDefaultResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetCertificatesDefaultResponse> getCertificatesWithHttpInfo(GetCertificatesRequest getCertificatesRequest) throws ApiException {
        okhttp3.Call localVarCall = getCertificatesValidateBeforeCall(getCertificatesRequest, null);
        Type localVarReturnType = new TypeToken<GetCertificatesDefaultResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Gets a list of available certificates (asynchronously)
     * Gets a list of available certificates
     * @param getCertificatesRequest Gets a list of available certificates (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCertificatesAsync(GetCertificatesRequest getCertificatesRequest, final ApiCallback<GetCertificatesDefaultResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCertificatesValidateBeforeCall(getCertificatesRequest, _callback);
        Type localVarReturnType = new TypeToken<GetCertificatesDefaultResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateCertificate
     * @param updateCertificateRequest Updates information associated with a certificate (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCertificateCall(UpdateCertificateRequest updateCertificateRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = updateCertificateRequest;

        // create path and map variables
        String localVarPath = "/UpdateCertificate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateCertificateValidateBeforeCall(UpdateCertificateRequest updateCertificateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'updateCertificateRequest' is set
        if (updateCertificateRequest == null) {
            throw new ApiException("Missing the required parameter 'updateCertificateRequest' when calling updateCertificate(Async)");
        }

        return updateCertificateCall(updateCertificateRequest, _callback);

    }

    /**
     * Updates information associated with a certificate
     * Updates information associated with a certificate
     * @param updateCertificateRequest Updates information associated with a certificate (required)
     * @return LogoutDefaultResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public LogoutDefaultResponse updateCertificate(UpdateCertificateRequest updateCertificateRequest) throws ApiException {
        ApiResponse<LogoutDefaultResponse> localVarResp = updateCertificateWithHttpInfo(updateCertificateRequest);
        return localVarResp.getData();
    }

    /**
     * Updates information associated with a certificate
     * Updates information associated with a certificate
     * @param updateCertificateRequest Updates information associated with a certificate (required)
     * @return ApiResponse&lt;LogoutDefaultResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LogoutDefaultResponse> updateCertificateWithHttpInfo(UpdateCertificateRequest updateCertificateRequest) throws ApiException {
        okhttp3.Call localVarCall = updateCertificateValidateBeforeCall(updateCertificateRequest, null);
        Type localVarReturnType = new TypeToken<LogoutDefaultResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Updates information associated with a certificate (asynchronously)
     * Updates information associated with a certificate
     * @param updateCertificateRequest Updates information associated with a certificate (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCertificateAsync(UpdateCertificateRequest updateCertificateRequest, final ApiCallback<LogoutDefaultResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateCertificateValidateBeforeCall(updateCertificateRequest, _callback);
        Type localVarReturnType = new TypeToken<LogoutDefaultResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
