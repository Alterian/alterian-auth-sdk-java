# AuthenticationApi

All URIs are relative to *http://localhost/auth/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applicationLogin**](AuthenticationApi.md#applicationLogin) | **POST** /ApplicationLogin | this method requests the auth server give you a token for a particular \&quot;application\&quot; |
| [**formsAuthentication**](AuthenticationApi.md#formsAuthentication) | **POST** /FormsAuthentication | Provide a username and SHA1 encoded password to log into the system.  It is always recommended that this method be called via a secured method.              Should be followed by a call to @see(ApplicationLogin) |
| [**getIdentityUrl**](AuthenticationApi.md#getIdentityUrl) | **POST** /GetIdentityUrl |  |
| [**getSiteDetails**](AuthenticationApi.md#getSiteDetails) | **POST** /GetSiteDetails | Returns the details for a particular application.  This is the same information as returned when you call @see(ApplicationLogin) but you will not receive an access token from this method. |
| [**logout**](AuthenticationApi.md#logout) | **POST** /Logout | Logs the requested token out of the authentication system and out of any application for which a call has been made to @see(ApplicationLogin) |
| [**nTLMAuthentication**](AuthenticationApi.md#nTLMAuthentication) | **POST** /NTLMAuthentication | If you have configured NTLM authentication properly, you can use this to get an authentication token.  Please note you must have configured IIS and everything correctly for this method to function. |
| [**openIdAuthentication**](AuthenticationApi.md#openIdAuthentication) | **GET** /OpenIdAuthentication | Use an Open Id Connect token to connect.  Your system must be configured to allow this; please review the documentation. |
| [**sAMLAuthentication**](AuthenticationApi.md#sAMLAuthentication) | **POST** /SAMLAuthentication | Provided a valid SAML [Base64 encoded] token, this will return back an auth server token and application information. |


<a id="applicationLogin"></a>
# **applicationLogin**
> ApplicationLoginDefaultResponse applicationLogin(applicationLoginRequest)

this method requests the auth server give you a token for a particular \&quot;application\&quot;

this method requests the auth server give you a token for a particular \&quot;application\&quot;

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    ApplicationLoginRequest applicationLoginRequest = new ApplicationLoginRequest(); // ApplicationLoginRequest | this method requests the auth server give you a token for a particular \"application\"
    try {
      ApplicationLoginDefaultResponse result = apiInstance.applicationLogin(applicationLoginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#applicationLogin");
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
| **applicationLoginRequest** | [**ApplicationLoginRequest**](ApplicationLoginRequest.md)| this method requests the auth server give you a token for a particular \&quot;application\&quot; | |

### Return type

[**ApplicationLoginDefaultResponse**](ApplicationLoginDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="formsAuthentication"></a>
# **formsAuthentication**
> FormsAuthenticationDefaultResponse formsAuthentication(formsAuthenticationRequest)

Provide a username and SHA1 encoded password to log into the system.  It is always recommended that this method be called via a secured method.              Should be followed by a call to @see(ApplicationLogin)

Provide a username and SHA1 encoded password to log into the system.  It is always recommended that this method be called via a secured method.              Should be followed by a call to @see(ApplicationLogin)

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    FormsAuthenticationRequest formsAuthenticationRequest = new FormsAuthenticationRequest(); // FormsAuthenticationRequest | Provide a username and SHA1 encoded password to log into the system.  It is always recommended that this method be called via a secured method.              Should be followed by a call to @see(ApplicationLogin)
    try {
      FormsAuthenticationDefaultResponse result = apiInstance.formsAuthentication(formsAuthenticationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#formsAuthentication");
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
| **formsAuthenticationRequest** | [**FormsAuthenticationRequest**](FormsAuthenticationRequest.md)| Provide a username and SHA1 encoded password to log into the system.  It is always recommended that this method be called via a secured method.              Should be followed by a call to @see(ApplicationLogin) | |

### Return type

[**FormsAuthenticationDefaultResponse**](FormsAuthenticationDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getIdentityUrl"></a>
# **getIdentityUrl**
> GetIdentityUrlDefaultResponse getIdentityUrl(getIdentityUrlRequest)





### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    GetIdentityUrlRequest getIdentityUrlRequest = new GetIdentityUrlRequest(); // GetIdentityUrlRequest | 
    try {
      GetIdentityUrlDefaultResponse result = apiInstance.getIdentityUrl(getIdentityUrlRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getIdentityUrl");
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
| **getIdentityUrlRequest** | [**GetIdentityUrlRequest**](GetIdentityUrlRequest.md)|  | |

### Return type

[**GetIdentityUrlDefaultResponse**](GetIdentityUrlDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getSiteDetails"></a>
# **getSiteDetails**
> ApplicationLoginDefaultResponse getSiteDetails(getSiteDetailsRequest)

Returns the details for a particular application.  This is the same information as returned when you call @see(ApplicationLogin) but you will not receive an access token from this method.

Returns the details for a particular application.  This is the same information as returned when you call @see(ApplicationLogin) but you will not receive an access token from this method.

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    GetSiteDetailsRequest getSiteDetailsRequest = new GetSiteDetailsRequest(); // GetSiteDetailsRequest | Returns the details for a particular application.  This is the same information as returned when you call @see(ApplicationLogin) but you will not receive an access token from this method.
    try {
      ApplicationLoginDefaultResponse result = apiInstance.getSiteDetails(getSiteDetailsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getSiteDetails");
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
| **getSiteDetailsRequest** | [**GetSiteDetailsRequest**](GetSiteDetailsRequest.md)| Returns the details for a particular application.  This is the same information as returned when you call @see(ApplicationLogin) but you will not receive an access token from this method. | |

### Return type

[**ApplicationLoginDefaultResponse**](ApplicationLoginDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="logout"></a>
# **logout**
> LogoutDefaultResponse logout()

Logs the requested token out of the authentication system and out of any application for which a call has been made to @see(ApplicationLogin)

Logs the requested token out of the authentication system and out of any application for which a call has been made to @see(ApplicationLogin)

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    try {
      LogoutDefaultResponse result = apiInstance.logout();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#logout");
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

[**LogoutDefaultResponse**](LogoutDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="nTLMAuthentication"></a>
# **nTLMAuthentication**
> FormsAuthenticationDefaultResponse nTLMAuthentication()

If you have configured NTLM authentication properly, you can use this to get an authentication token.  Please note you must have configured IIS and everything correctly for this method to function.

If you have configured NTLM authentication properly, you can use this to get an authentication token.  Please note you must have configured IIS and everything correctly for this method to function.

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    try {
      FormsAuthenticationDefaultResponse result = apiInstance.nTLMAuthentication();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#nTLMAuthentication");
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

[**FormsAuthenticationDefaultResponse**](FormsAuthenticationDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="openIdAuthentication"></a>
# **openIdAuthentication**
> Object openIdAuthentication(code, state)

Use an Open Id Connect token to connect.  Your system must be configured to allow this; please review the documentation.

Use an Open Id Connect token to connect.  Your system must be configured to allow this; please review the documentation.

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String code = "code_example"; // String | 
    String state = "state_example"; // String | 
    try {
      Object result = apiInstance.openIdAuthentication(code, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#openIdAuthentication");
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
| **code** | **String**|  | [optional] |
| **state** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="sAMLAuthentication"></a>
# **sAMLAuthentication**
> FormsAuthenticationDefaultResponse sAMLAuthentication(saMLAuthenticationRequest)

Provided a valid SAML [Base64 encoded] token, this will return back an auth server token and application information.

Provided a valid SAML [Base64 encoded] token, this will return back an auth server token and application information.

### Example
```java
// Import classes:
import com.alterian.auth.ApiClient;
import com.alterian.auth.ApiException;
import com.alterian.auth.Configuration;
import com.alterian.auth.auth.*;
import com.alterian.auth.models.*;
import com.alterian.auth.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/auth/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    SAMLAuthenticationRequest saMLAuthenticationRequest = new SAMLAuthenticationRequest(); // SAMLAuthenticationRequest | Provided a valid SAML [Base64 encoded] token, this will return back an auth server token and application information.
    try {
      FormsAuthenticationDefaultResponse result = apiInstance.sAMLAuthentication(saMLAuthenticationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#sAMLAuthentication");
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
| **saMLAuthenticationRequest** | [**SAMLAuthenticationRequest**](SAMLAuthenticationRequest.md)| Provided a valid SAML [Base64 encoded] token, this will return back an auth server token and application information. | |

### Return type

[**FormsAuthenticationDefaultResponse**](FormsAuthenticationDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

