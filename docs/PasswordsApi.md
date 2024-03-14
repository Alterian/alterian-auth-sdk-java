# PasswordsApi

All URIs are relative to *http://localhost/auth/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changePassword**](PasswordsApi.md#changePassword) | **POST** /ChangePassword | Changes a login&#39;s password |
| [**expirePassword**](PasswordsApi.md#expirePassword) | **POST** /ExpirePassword | Flags a login has having an expired password.  This forces the login to change their password upon their next attempt to log in. |
| [**getPasswordComplexityRules**](PasswordsApi.md#getPasswordComplexityRules) | **POST** /GetPasswordComplexityRules | Returns back the password complexity rules for use in a GUI.  These rules are also applied on the backend. |


<a id="changePassword"></a>
# **changePassword**
> LogoutDefaultResponse changePassword(changePasswordRequest)

Changes a login&#39;s password

Changes a login&#39;s password

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.PasswordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PasswordsApi apiInstance = new PasswordsApi(defaultClient);
    ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest(); // ChangePasswordRequest | Changes a login's password
    try {
      LogoutDefaultResponse result = apiInstance.changePassword(changePasswordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordsApi#changePassword");
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
| **changePasswordRequest** | [**ChangePasswordRequest**](ChangePasswordRequest.md)| Changes a login&#39;s password | |

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

<a id="expirePassword"></a>
# **expirePassword**
> LogoutDefaultResponse expirePassword(expirePasswordRequest)

Flags a login has having an expired password.  This forces the login to change their password upon their next attempt to log in.

Flags a login has having an expired password.  This forces the login to change their password upon their next attempt to log in.

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.PasswordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PasswordsApi apiInstance = new PasswordsApi(defaultClient);
    ExpirePasswordRequest expirePasswordRequest = new ExpirePasswordRequest(); // ExpirePasswordRequest | Flags a login has having an expired password.  This forces the login to change their password upon their next attempt to log in.
    try {
      LogoutDefaultResponse result = apiInstance.expirePassword(expirePasswordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordsApi#expirePassword");
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
| **expirePasswordRequest** | [**ExpirePasswordRequest**](ExpirePasswordRequest.md)| Flags a login has having an expired password.  This forces the login to change their password upon their next attempt to log in. | |

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

<a id="getPasswordComplexityRules"></a>
# **getPasswordComplexityRules**
> GetPasswordComplexityRulesDefaultResponse getPasswordComplexityRules()

Returns back the password complexity rules for use in a GUI.  These rules are also applied on the backend.

Returns back the password complexity rules for use in a GUI.  These rules are also applied on the backend.

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.PasswordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PasswordsApi apiInstance = new PasswordsApi(defaultClient);
    try {
      GetPasswordComplexityRulesDefaultResponse result = apiInstance.getPasswordComplexityRules();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordsApi#getPasswordComplexityRules");
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

[**GetPasswordComplexityRulesDefaultResponse**](GetPasswordComplexityRulesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

