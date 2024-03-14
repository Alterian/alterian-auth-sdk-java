# IssuersApi

All URIs are relative to *http://localhost/auth/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addIssuer**](IssuersApi.md#addIssuer) | **POST** /AddIssuer | Adds an Issuer for a Certificate used with single sign on |
| [**deleteIssuer**](IssuersApi.md#deleteIssuer) | **POST** /DeleteIssuer | Deletes an @see(Issuer) for a Certificate used with single sign on |
| [**getIssuer**](IssuersApi.md#getIssuer) | **POST** /GetIssuer | Retrieves an Issuer for a Certificate used with single sign on |
| [**getIssuers**](IssuersApi.md#getIssuers) | **POST** /GetIssuers | Gets a list of available issuers |
| [**updateIssuer**](IssuersApi.md#updateIssuer) | **POST** /UpdateIssuer | Updates information associated with a certificate&#39;s issuer |


<a id="addIssuer"></a>
# **addIssuer**
> AddCertificateDefaultResponse addIssuer(addIssuerRequest)

Adds an Issuer for a Certificate used with single sign on

Adds an Issuer for a Certificate used with single sign on

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.IssuersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    IssuersApi apiInstance = new IssuersApi(defaultClient);
    AddIssuerRequest addIssuerRequest = new AddIssuerRequest(); // AddIssuerRequest | Adds an Issuer for a Certificate used with single sign on
    try {
      AddCertificateDefaultResponse result = apiInstance.addIssuer(addIssuerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuersApi#addIssuer");
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
| **addIssuerRequest** | [**AddIssuerRequest**](AddIssuerRequest.md)| Adds an Issuer for a Certificate used with single sign on | |

### Return type

[**AddCertificateDefaultResponse**](AddCertificateDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="deleteIssuer"></a>
# **deleteIssuer**
> LogoutDefaultResponse deleteIssuer(deleteIssuerRequest)

Deletes an @see(Issuer) for a Certificate used with single sign on

Deletes an @see(Issuer) for a Certificate used with single sign on

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.IssuersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    IssuersApi apiInstance = new IssuersApi(defaultClient);
    DeleteIssuerRequest deleteIssuerRequest = new DeleteIssuerRequest(); // DeleteIssuerRequest | Deletes an @see(Issuer) for a Certificate used with single sign on
    try {
      LogoutDefaultResponse result = apiInstance.deleteIssuer(deleteIssuerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuersApi#deleteIssuer");
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
| **deleteIssuerRequest** | [**DeleteIssuerRequest**](DeleteIssuerRequest.md)| Deletes an @see(Issuer) for a Certificate used with single sign on | |

### Return type

[**LogoutDefaultResponse**](LogoutDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getIssuer"></a>
# **getIssuer**
> GetIssuerDefaultResponse getIssuer(getIssuerRequest)

Retrieves an Issuer for a Certificate used with single sign on

Retrieves an Issuer for a Certificate used with single sign on

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.IssuersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    IssuersApi apiInstance = new IssuersApi(defaultClient);
    GetIssuerRequest getIssuerRequest = new GetIssuerRequest(); // GetIssuerRequest | Retrieves an Issuer for a Certificate used with single sign on
    try {
      GetIssuerDefaultResponse result = apiInstance.getIssuer(getIssuerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuersApi#getIssuer");
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
| **getIssuerRequest** | [**GetIssuerRequest**](GetIssuerRequest.md)| Retrieves an Issuer for a Certificate used with single sign on | |

### Return type

[**GetIssuerDefaultResponse**](GetIssuerDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getIssuers"></a>
# **getIssuers**
> GetIssuersDefaultResponse getIssuers(getCertificatesRequest)

Gets a list of available issuers

Gets a list of available issuers

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.IssuersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    IssuersApi apiInstance = new IssuersApi(defaultClient);
    GetCertificatesRequest getCertificatesRequest = new GetCertificatesRequest(); // GetCertificatesRequest | Gets a list of available issuers
    try {
      GetIssuersDefaultResponse result = apiInstance.getIssuers(getCertificatesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuersApi#getIssuers");
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
| **getCertificatesRequest** | [**GetCertificatesRequest**](GetCertificatesRequest.md)| Gets a list of available issuers | |

### Return type

[**GetIssuersDefaultResponse**](GetIssuersDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="updateIssuer"></a>
# **updateIssuer**
> LogoutDefaultResponse updateIssuer(addIssuerRequest)

Updates information associated with a certificate&#39;s issuer

Updates information associated with a certificate&#39;s issuer

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.IssuersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    IssuersApi apiInstance = new IssuersApi(defaultClient);
    AddIssuerRequest addIssuerRequest = new AddIssuerRequest(); // AddIssuerRequest | Updates information associated with a certificate's issuer
    try {
      LogoutDefaultResponse result = apiInstance.updateIssuer(addIssuerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuersApi#updateIssuer");
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
| **addIssuerRequest** | [**AddIssuerRequest**](AddIssuerRequest.md)| Updates information associated with a certificate&#39;s issuer | |

### Return type

[**LogoutDefaultResponse**](LogoutDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

