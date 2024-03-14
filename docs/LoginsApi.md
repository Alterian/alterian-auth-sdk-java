# LoginsApi

All URIs are relative to *http://localhost/auth/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addLogin**](LoginsApi.md#addLogin) | **POST** /AddLogin | Add a login into the system |
| [**disableLogin**](LoginsApi.md#disableLogin) | **POST** /DisableLogin | Flag a login as disabled |
| [**enableLogin**](LoginsApi.md#enableLogin) | **POST** /EnableLogin | Flag a login as enabled.  If a login has been expired due to inactivity, this will enable it to be logged into again |
| [**getCurrentLogin**](LoginsApi.md#getCurrentLogin) | **POST** /GetCurrentLogin | Returns back info on the current login |
| [**getLogin**](LoginsApi.md#getLogin) | **POST** /GetLogin | Return back info on a single login |
| [**getLogins**](LoginsApi.md#getLogins) | **POST** /GetLogins | Query the login list by setting values, optionally including or excluding logins.  If you leave the settings value empty, you can query just by login id |
| [**renameLogin**](LoginsApi.md#renameLogin) | **POST** /RenameLogin | Renames a login |
| [**updateLogin**](LoginsApi.md#updateLogin) | **POST** /UpdateLogin | Update a login |
| [**updateLoginEx**](LoginsApi.md#updateLoginEx) | **POST** /UpdateLoginEx | Updates pieces of a login |


<a id="addLogin"></a>
# **addLogin**
> AddLoginDefaultResponse addLogin(addLoginRequest)

Add a login into the system

Add a login into the system

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.LoginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    LoginsApi apiInstance = new LoginsApi(defaultClient);
    AddLoginRequest addLoginRequest = new AddLoginRequest(); // AddLoginRequest | Add a login into the system
    try {
      AddLoginDefaultResponse result = apiInstance.addLogin(addLoginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoginsApi#addLogin");
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
| **addLoginRequest** | [**AddLoginRequest**](AddLoginRequest.md)| Add a login into the system | |

### Return type

[**AddLoginDefaultResponse**](AddLoginDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="disableLogin"></a>
# **disableLogin**
> LogoutDefaultResponse disableLogin(disableLoginRequest)

Flag a login as disabled

Flag a login as disabled

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.LoginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    LoginsApi apiInstance = new LoginsApi(defaultClient);
    DisableLoginRequest disableLoginRequest = new DisableLoginRequest(); // DisableLoginRequest | Flag a login as disabled
    try {
      LogoutDefaultResponse result = apiInstance.disableLogin(disableLoginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoginsApi#disableLogin");
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
| **disableLoginRequest** | [**DisableLoginRequest**](DisableLoginRequest.md)| Flag a login as disabled | |

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

<a id="enableLogin"></a>
# **enableLogin**
> LogoutDefaultResponse enableLogin(enableLoginRequest)

Flag a login as enabled.  If a login has been expired due to inactivity, this will enable it to be logged into again

Flag a login as enabled.  If a login has been expired due to inactivity, this will enable it to be logged into again

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.LoginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    LoginsApi apiInstance = new LoginsApi(defaultClient);
    EnableLoginRequest enableLoginRequest = new EnableLoginRequest(); // EnableLoginRequest | Flag a login as enabled.  If a login has been expired due to inactivity, this will enable it to be logged into again
    try {
      LogoutDefaultResponse result = apiInstance.enableLogin(enableLoginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoginsApi#enableLogin");
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
| **enableLoginRequest** | [**EnableLoginRequest**](EnableLoginRequest.md)| Flag a login as enabled.  If a login has been expired due to inactivity, this will enable it to be logged into again | |

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

<a id="getCurrentLogin"></a>
# **getCurrentLogin**
> GetCurrentLoginDefaultResponse getCurrentLogin()

Returns back info on the current login

Returns back info on the current login

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.LoginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    LoginsApi apiInstance = new LoginsApi(defaultClient);
    try {
      GetCurrentLoginDefaultResponse result = apiInstance.getCurrentLogin();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoginsApi#getCurrentLogin");
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

[**GetCurrentLoginDefaultResponse**](GetCurrentLoginDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getLogin"></a>
# **getLogin**
> GetCurrentLoginDefaultResponse getLogin(getLoginRequest)

Return back info on a single login

Return back info on a single login

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.LoginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    LoginsApi apiInstance = new LoginsApi(defaultClient);
    GetLoginRequest getLoginRequest = new GetLoginRequest(); // GetLoginRequest | Return back info on a single login
    try {
      GetCurrentLoginDefaultResponse result = apiInstance.getLogin(getLoginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoginsApi#getLogin");
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
| **getLoginRequest** | [**GetLoginRequest**](GetLoginRequest.md)| Return back info on a single login | |

### Return type

[**GetCurrentLoginDefaultResponse**](GetCurrentLoginDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getLogins"></a>
# **getLogins**
> GetLoginsDefaultResponse getLogins(getLoginsRequest)

Query the login list by setting values, optionally including or excluding logins.  If you leave the settings value empty, you can query just by login id

Query the login list by setting values, optionally including or excluding logins.  If you leave the settings value empty, you can query just by login id

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.LoginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    LoginsApi apiInstance = new LoginsApi(defaultClient);
    GetLoginsRequest getLoginsRequest = new GetLoginsRequest(); // GetLoginsRequest | Query the login list by setting values, optionally including or excluding logins.  If you leave the settings value empty, you can query just by login id
    try {
      GetLoginsDefaultResponse result = apiInstance.getLogins(getLoginsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoginsApi#getLogins");
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
| **getLoginsRequest** | [**GetLoginsRequest**](GetLoginsRequest.md)| Query the login list by setting values, optionally including or excluding logins.  If you leave the settings value empty, you can query just by login id | |

### Return type

[**GetLoginsDefaultResponse**](GetLoginsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="renameLogin"></a>
# **renameLogin**
> LogoutDefaultResponse renameLogin(renameLoginRequest)

Renames a login

Renames a login

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.LoginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    LoginsApi apiInstance = new LoginsApi(defaultClient);
    RenameLoginRequest renameLoginRequest = new RenameLoginRequest(); // RenameLoginRequest | Renames a login
    try {
      LogoutDefaultResponse result = apiInstance.renameLogin(renameLoginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoginsApi#renameLogin");
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
| **renameLoginRequest** | [**RenameLoginRequest**](RenameLoginRequest.md)| Renames a login | |

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

<a id="updateLogin"></a>
# **updateLogin**
> LogoutDefaultResponse updateLogin(addLoginRequest)

Update a login

Update a login

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.LoginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    LoginsApi apiInstance = new LoginsApi(defaultClient);
    AddLoginRequest addLoginRequest = new AddLoginRequest(); // AddLoginRequest | Update a login
    try {
      LogoutDefaultResponse result = apiInstance.updateLogin(addLoginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoginsApi#updateLogin");
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
| **addLoginRequest** | [**AddLoginRequest**](AddLoginRequest.md)| Update a login | |

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

<a id="updateLoginEx"></a>
# **updateLoginEx**
> LogoutDefaultResponse updateLoginEx(updateLoginExRequest)

Updates pieces of a login

Updates pieces of a login

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.LoginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    LoginsApi apiInstance = new LoginsApi(defaultClient);
    UpdateLoginExRequest updateLoginExRequest = new UpdateLoginExRequest(); // UpdateLoginExRequest | Updates pieces of a login
    try {
      LogoutDefaultResponse result = apiInstance.updateLoginEx(updateLoginExRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoginsApi#updateLoginEx");
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
| **updateLoginExRequest** | [**UpdateLoginExRequest**](UpdateLoginExRequest.md)| Updates pieces of a login | |

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

