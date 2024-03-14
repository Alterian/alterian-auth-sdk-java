# SitesApi

All URIs are relative to *http://localhost/auth/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getHostNames**](SitesApi.md#getHostNames) | **POST** /GetHostNames | This is the name of the server that you have IMS running on |
| [**getSite**](SitesApi.md#getSite) | **POST** /GetSite | Return back a specific @see(AuthSite) |
| [**getSiteTypes**](SitesApi.md#getSiteTypes) | **POST** /GetSiteTypes | Return back a list of site types for use with @see(GetSites) |
| [**getSites**](SitesApi.md#getSites) | **POST** /GetSites | Return back a list of @see(AuthSite)s; useful for APIs which require an authentication site identifier |


<a id="getHostNames"></a>
# **getHostNames**
> GetHostNamesDefaultResponse getHostNames(getCertificatesRequest)

This is the name of the server that you have IMS running on

This is the name of the server that you have IMS running on

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.SitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    SitesApi apiInstance = new SitesApi(defaultClient);
    GetCertificatesRequest getCertificatesRequest = new GetCertificatesRequest(); // GetCertificatesRequest | This is the name of the server that you have IMS running on
    try {
      GetHostNamesDefaultResponse result = apiInstance.getHostNames(getCertificatesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SitesApi#getHostNames");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getCertificatesRequest** | [**GetCertificatesRequest**](GetCertificatesRequest.md)| This is the name of the server that you have IMS running on | |

### Return type

[**GetHostNamesDefaultResponse**](GetHostNamesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getSite"></a>
# **getSite**
> GetSiteDefaultResponse getSite(getSiteRequest)

Return back a specific @see(AuthSite)

Return back a specific @see(AuthSite)

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.SitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    SitesApi apiInstance = new SitesApi(defaultClient);
    GetSiteRequest getSiteRequest = new GetSiteRequest(); // GetSiteRequest | Return back a specific @see(AuthSite)
    try {
      GetSiteDefaultResponse result = apiInstance.getSite(getSiteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SitesApi#getSite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getSiteRequest** | [**GetSiteRequest**](GetSiteRequest.md)| Return back a specific @see(AuthSite) | |

### Return type

[**GetSiteDefaultResponse**](GetSiteDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getSiteTypes"></a>
# **getSiteTypes**
> GetSiteTypesDefaultResponse getSiteTypes()

Return back a list of site types for use with @see(GetSites)

Return back a list of site types for use with @see(GetSites)

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.SitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    SitesApi apiInstance = new SitesApi(defaultClient);
    try {
      GetSiteTypesDefaultResponse result = apiInstance.getSiteTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SitesApi#getSiteTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSiteTypesDefaultResponse**](GetSiteTypesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getSites"></a>
# **getSites**
> GetSitesDefaultResponse getSites(getSitesRequest)

Return back a list of @see(AuthSite)s; useful for APIs which require an authentication site identifier

Return back a list of @see(AuthSite)s; useful for APIs which require an authentication site identifier

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.SitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    SitesApi apiInstance = new SitesApi(defaultClient);
    GetSitesRequest getSitesRequest = new GetSitesRequest(); // GetSitesRequest | Return back a list of @see(AuthSite)s; useful for APIs which require an authentication site identifier
    try {
      GetSitesDefaultResponse result = apiInstance.getSites(getSitesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SitesApi#getSites");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getSitesRequest** | [**GetSitesRequest**](GetSitesRequest.md)| Return back a list of @see(AuthSite)s; useful for APIs which require an authentication site identifier | |

### Return type

[**GetSitesDefaultResponse**](GetSitesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

