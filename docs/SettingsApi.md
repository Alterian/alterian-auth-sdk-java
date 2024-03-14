# SettingsApi

All URIs are relative to *http://localhost/auth/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSetting**](SettingsApi.md#addSetting) | **POST** /AddSetting | Adds in a setting which can then be mapped to an issuer for the purposes of claims authentication. |
| [**deleteSetting**](SettingsApi.md#deleteSetting) | **POST** /DeleteSetting | Deletes a setting |
| [**getSetting**](SettingsApi.md#getSetting) | **POST** /GetSetting | Read a setting |
| [**getSettings**](SettingsApi.md#getSettings) | **POST** /GetSettings | Reads a list of settings |
| [**getSettingsValues**](SettingsApi.md#getSettingsValues) | **POST** /GetSettingsValues | Reads settings and their values |
| [**setEMServiceURL**](SettingsApi.md#setEMServiceURL) | **POST** /SetEMServiceURL | Updates the EM service URL |
| [**updateSetting**](SettingsApi.md#updateSetting) | **POST** /UpdateSetting | Updates a setting |


<a id="addSetting"></a>
# **addSetting**
> AddCertificateDefaultResponse addSetting(addSettingRequest)

Adds in a setting which can then be mapped to an issuer for the purposes of claims authentication.

Adds in a setting which can then be mapped to an issuer for the purposes of claims authentication.

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.SettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    AddSettingRequest addSettingRequest = new AddSettingRequest(); // AddSettingRequest | Adds in a setting which can then be mapped to an issuer for the purposes of claims authentication.
    try {
      AddCertificateDefaultResponse result = apiInstance.addSetting(addSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#addSetting");
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
| **addSettingRequest** | [**AddSettingRequest**](AddSettingRequest.md)| Adds in a setting which can then be mapped to an issuer for the purposes of claims authentication. | |

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

<a id="deleteSetting"></a>
# **deleteSetting**
> LogoutDefaultResponse deleteSetting(deleteSettingRequest)

Deletes a setting

Deletes a setting

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.SettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    DeleteSettingRequest deleteSettingRequest = new DeleteSettingRequest(); // DeleteSettingRequest | Deletes a setting
    try {
      LogoutDefaultResponse result = apiInstance.deleteSetting(deleteSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#deleteSetting");
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
| **deleteSettingRequest** | [**DeleteSettingRequest**](DeleteSettingRequest.md)| Deletes a setting | |

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

<a id="getSetting"></a>
# **getSetting**
> GetSettingDefaultResponse getSetting(getSettingRequest)

Read a setting

Read a setting

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.SettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    GetSettingRequest getSettingRequest = new GetSettingRequest(); // GetSettingRequest | Read a setting
    try {
      GetSettingDefaultResponse result = apiInstance.getSetting(getSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#getSetting");
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
| **getSettingRequest** | [**GetSettingRequest**](GetSettingRequest.md)| Read a setting | |

### Return type

[**GetSettingDefaultResponse**](GetSettingDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getSettings"></a>
# **getSettings**
> GetSettingsDefaultResponse getSettings(getSettingsRequest)

Reads a list of settings

Reads a list of settings

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.SettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    GetSettingsRequest getSettingsRequest = new GetSettingsRequest(); // GetSettingsRequest | Reads a list of settings
    try {
      GetSettingsDefaultResponse result = apiInstance.getSettings(getSettingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#getSettings");
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
| **getSettingsRequest** | [**GetSettingsRequest**](GetSettingsRequest.md)| Reads a list of settings | |

### Return type

[**GetSettingsDefaultResponse**](GetSettingsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getSettingsValues"></a>
# **getSettingsValues**
> GetSettingsDefaultResponse getSettingsValues(getSettingsValuesRequest)

Reads settings and their values

Reads settings and their values

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.SettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    GetSettingsValuesRequest getSettingsValuesRequest = new GetSettingsValuesRequest(); // GetSettingsValuesRequest | Reads settings and their values
    try {
      GetSettingsDefaultResponse result = apiInstance.getSettingsValues(getSettingsValuesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#getSettingsValues");
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
| **getSettingsValuesRequest** | [**GetSettingsValuesRequest**](GetSettingsValuesRequest.md)| Reads settings and their values | |

### Return type

[**GetSettingsDefaultResponse**](GetSettingsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="setEMServiceURL"></a>
# **setEMServiceURL**
> LogoutDefaultResponse setEMServiceURL(setEMServiceURLRequest)

Updates the EM service URL

Updates the EM service URL

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.SettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    SetEMServiceURLRequest setEMServiceURLRequest = new SetEMServiceURLRequest(); // SetEMServiceURLRequest | Updates the EM service URL
    try {
      LogoutDefaultResponse result = apiInstance.setEMServiceURL(setEMServiceURLRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#setEMServiceURL");
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
| **setEMServiceURLRequest** | [**SetEMServiceURLRequest**](SetEMServiceURLRequest.md)| Updates the EM service URL | |

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

<a id="updateSetting"></a>
# **updateSetting**
> LogoutDefaultResponse updateSetting(addSettingRequest)

Updates a setting

Updates a setting

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.SettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    AddSettingRequest addSettingRequest = new AddSettingRequest(); // AddSettingRequest | Updates a setting
    try {
      LogoutDefaultResponse result = apiInstance.updateSetting(addSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#updateSetting");
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
| **addSettingRequest** | [**AddSettingRequest**](AddSettingRequest.md)| Updates a setting | |

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

