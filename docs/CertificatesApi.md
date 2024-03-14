# CertificatesApi

All URIs are relative to *http://localhost/auth/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCertificate**](CertificatesApi.md#addCertificate) | **POST** /AddCertificate | Adds a certificate for use with single sign on |
| [**deleteCertificate**](CertificatesApi.md#deleteCertificate) | **POST** /DeleteCertificate | Deletes the specified certificate |
| [**getCertificate**](CertificatesApi.md#getCertificate) | **POST** /GetCertificate | Gets the specified certificate |
| [**getCertificates**](CertificatesApi.md#getCertificates) | **POST** /GetCertificates | Gets a list of available certificates |
| [**updateCertificate**](CertificatesApi.md#updateCertificate) | **POST** /UpdateCertificate | Updates information associated with a certificate |


<a id="addCertificate"></a>
# **addCertificate**
> AddCertificateDefaultResponse addCertificate(addCertificateRequest)

Adds a certificate for use with single sign on

Adds a certificate for use with single sign on

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    AddCertificateRequest addCertificateRequest = new AddCertificateRequest(); // AddCertificateRequest | Adds a certificate for use with single sign on
    try {
      AddCertificateDefaultResponse result = apiInstance.addCertificate(addCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#addCertificate");
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
| **addCertificateRequest** | [**AddCertificateRequest**](AddCertificateRequest.md)| Adds a certificate for use with single sign on | |

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

<a id="deleteCertificate"></a>
# **deleteCertificate**
> LogoutDefaultResponse deleteCertificate(deleteCertificateRequest)

Deletes the specified certificate

Deletes the specified certificate

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    DeleteCertificateRequest deleteCertificateRequest = new DeleteCertificateRequest(); // DeleteCertificateRequest | Deletes the specified certificate
    try {
      LogoutDefaultResponse result = apiInstance.deleteCertificate(deleteCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#deleteCertificate");
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
| **deleteCertificateRequest** | [**DeleteCertificateRequest**](DeleteCertificateRequest.md)| Deletes the specified certificate | |

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

<a id="getCertificate"></a>
# **getCertificate**
> GetCertificateDefaultResponse getCertificate(getCertificateRequest)

Gets the specified certificate

Gets the specified certificate

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    GetCertificateRequest getCertificateRequest = new GetCertificateRequest(); // GetCertificateRequest | Gets the specified certificate
    try {
      GetCertificateDefaultResponse result = apiInstance.getCertificate(getCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#getCertificate");
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
| **getCertificateRequest** | [**GetCertificateRequest**](GetCertificateRequest.md)| Gets the specified certificate | |

### Return type

[**GetCertificateDefaultResponse**](GetCertificateDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getCertificates"></a>
# **getCertificates**
> GetCertificatesDefaultResponse getCertificates(getCertificatesRequest)

Gets a list of available certificates

Gets a list of available certificates

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    GetCertificatesRequest getCertificatesRequest = new GetCertificatesRequest(); // GetCertificatesRequest | Gets a list of available certificates
    try {
      GetCertificatesDefaultResponse result = apiInstance.getCertificates(getCertificatesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#getCertificates");
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
| **getCertificatesRequest** | [**GetCertificatesRequest**](GetCertificatesRequest.md)| Gets a list of available certificates | |

### Return type

[**GetCertificatesDefaultResponse**](GetCertificatesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="updateCertificate"></a>
# **updateCertificate**
> LogoutDefaultResponse updateCertificate(updateCertificateRequest)

Updates information associated with a certificate

Updates information associated with a certificate

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    UpdateCertificateRequest updateCertificateRequest = new UpdateCertificateRequest(); // UpdateCertificateRequest | Updates information associated with a certificate
    try {
      LogoutDefaultResponse result = apiInstance.updateCertificate(updateCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#updateCertificate");
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
| **updateCertificateRequest** | [**UpdateCertificateRequest**](UpdateCertificateRequest.md)| Updates information associated with a certificate | |

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

