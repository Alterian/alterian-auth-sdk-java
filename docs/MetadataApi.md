# MetadataApi

All URIs are relative to *http://localhost/auth/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAPIMetadata**](MetadataApi.md#getAPIMetadata) | **POST** /GetAPIMetadata | Returns back a list of @see(APIMetadata) objects from the system. This allows the caller to discover all the methods and class types of this API, including validation rules. |


<a id="getAPIMetadata"></a>
# **getAPIMetadata**
> GetAPIMetadataDefaultResponse getAPIMetadata(getAPIMetadataRequest)

Returns back a list of @see(APIMetadata) objects from the system. This allows the caller to discover all the methods and class types of this API, including validation rules.

Returns back a list of @see(APIMetadata) objects from the system. This allows the caller to discover all the methods and class types of this API, including validation rules.

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.MetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    MetadataApi apiInstance = new MetadataApi(defaultClient);
    GetAPIMetadataRequest getAPIMetadataRequest = new GetAPIMetadataRequest(); // GetAPIMetadataRequest | Returns back a list of @see(APIMetadata) objects from the system. This allows the caller to discover all the methods and class types of this API, including validation rules.
    try {
      GetAPIMetadataDefaultResponse result = apiInstance.getAPIMetadata(getAPIMetadataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getAPIMetadata");
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
| **getAPIMetadataRequest** | [**GetAPIMetadataRequest**](GetAPIMetadataRequest.md)| Returns back a list of @see(APIMetadata) objects from the system. This allows the caller to discover all the methods and class types of this API, including validation rules. | |

### Return type

[**GetAPIMetadataDefaultResponse**](GetAPIMetadataDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

