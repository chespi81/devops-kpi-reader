# AddonApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountUsernameAddonsEncodedContextIdDelete**](AddonApi.md#accountUsernameAddonsEncodedContextIdDelete) | **DELETE** /account/{username}/addons/{encoded_context_id} | 
[**accountUsernameAddonsEncodedContextIdGet**](AddonApi.md#accountUsernameAddonsEncodedContextIdGet) | **GET** /account/{username}/addons/{encoded_context_id} | 
[**accountUsernameAddonsEncodedContextIdPut**](AddonApi.md#accountUsernameAddonsEncodedContextIdPut) | **PUT** /account/{username}/addons/{encoded_context_id} | 
[**accountUsernameAddonsEncodedContextIdRefreshPut**](AddonApi.md#accountUsernameAddonsEncodedContextIdRefreshPut) | **PUT** /account/{username}/addons/{encoded_context_id}/refresh | 
[**accountUsernameAddonsGet**](AddonApi.md#accountUsernameAddonsGet) | **GET** /account/{username}/addons | 
[**accountUsernameAddonsPost**](AddonApi.md#accountUsernameAddonsPost) | **POST** /account/{username}/addons | 
[**addonDelete**](AddonApi.md#addonDelete) | **DELETE** /addon | 
[**addonLinkersGet**](AddonApi.md#addonLinkersGet) | **GET** /addon/linkers | 
[**addonLinkersLinkerKeyGet**](AddonApi.md#addonLinkersLinkerKeyGet) | **GET** /addon/linkers/{linker_key} | 
[**addonLinkersLinkerKeyValuesDelete**](AddonApi.md#addonLinkersLinkerKeyValuesDelete) | **DELETE** /addon/linkers/{linker_key}/values | 
[**addonLinkersLinkerKeyValuesDelete_0**](AddonApi.md#addonLinkersLinkerKeyValuesDelete_0) | **DELETE** /addon/linkers/{linker_key}/values/ | 
[**addonLinkersLinkerKeyValuesGet**](AddonApi.md#addonLinkersLinkerKeyValuesGet) | **GET** /addon/linkers/{linker_key}/values | 
[**addonLinkersLinkerKeyValuesGet_0**](AddonApi.md#addonLinkersLinkerKeyValuesGet_0) | **GET** /addon/linkers/{linker_key}/values/ | 
[**addonLinkersLinkerKeyValuesPost**](AddonApi.md#addonLinkersLinkerKeyValuesPost) | **POST** /addon/linkers/{linker_key}/values | 
[**addonLinkersLinkerKeyValuesPut**](AddonApi.md#addonLinkersLinkerKeyValuesPut) | **PUT** /addon/linkers/{linker_key}/values | 
[**addonPut**](AddonApi.md#addonPut) | **PUT** /addon | 


<a name="accountUsernameAddonsEncodedContextIdDelete"></a>
# **accountUsernameAddonsEncodedContextIdDelete**
> Error accountUsernameAddonsEncodedContextIdDelete(username, encodedContextId)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AddonApi apiInstance = new AddonApi();
String username = "username_example"; // String | 
String encodedContextId = "encodedContextId_example"; // String | 
try {
    Error result = apiInstance.accountUsernameAddonsEncodedContextIdDelete(username, encodedContextId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#accountUsernameAddonsEncodedContextIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedContextId** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUsernameAddonsEncodedContextIdGet"></a>
# **accountUsernameAddonsEncodedContextIdGet**
> Error accountUsernameAddonsEncodedContextIdGet(username, encodedContextId)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AddonApi apiInstance = new AddonApi();
String username = "username_example"; // String | 
String encodedContextId = "encodedContextId_example"; // String | 
try {
    Error result = apiInstance.accountUsernameAddonsEncodedContextIdGet(username, encodedContextId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#accountUsernameAddonsEncodedContextIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedContextId** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUsernameAddonsEncodedContextIdPut"></a>
# **accountUsernameAddonsEncodedContextIdPut**
> Error accountUsernameAddonsEncodedContextIdPut(username, encodedContextId)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AddonApi apiInstance = new AddonApi();
String username = "username_example"; // String | 
String encodedContextId = "encodedContextId_example"; // String | 
try {
    Error result = apiInstance.accountUsernameAddonsEncodedContextIdPut(username, encodedContextId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#accountUsernameAddonsEncodedContextIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedContextId** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUsernameAddonsEncodedContextIdRefreshPut"></a>
# **accountUsernameAddonsEncodedContextIdRefreshPut**
> Error accountUsernameAddonsEncodedContextIdRefreshPut(username, encodedContextId)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AddonApi apiInstance = new AddonApi();
String username = "username_example"; // String | 
String encodedContextId = "encodedContextId_example"; // String | 
try {
    Error result = apiInstance.accountUsernameAddonsEncodedContextIdRefreshPut(username, encodedContextId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#accountUsernameAddonsEncodedContextIdRefreshPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedContextId** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUsernameAddonsGet"></a>
# **accountUsernameAddonsGet**
> Error accountUsernameAddonsGet(username)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AddonApi apiInstance = new AddonApi();
String username = "username_example"; // String | 
try {
    Error result = apiInstance.accountUsernameAddonsGet(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#accountUsernameAddonsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUsernameAddonsPost"></a>
# **accountUsernameAddonsPost**
> Error accountUsernameAddonsPost(username)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AddonApi apiInstance = new AddonApi();
String username = "username_example"; // String | 
try {
    Error result = apiInstance.accountUsernameAddonsPost(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#accountUsernameAddonsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addonDelete"></a>
# **addonDelete**
> Error addonDelete()





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AddonApi apiInstance = new AddonApi();
try {
    Error result = apiInstance.addonDelete();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonDelete");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addonLinkersGet"></a>
# **addonLinkersGet**
> Error addonLinkersGet()





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AddonApi apiInstance = new AddonApi();
try {
    Error result = apiInstance.addonLinkersGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonLinkersGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addonLinkersLinkerKeyGet"></a>
# **addonLinkersLinkerKeyGet**
> Error addonLinkersLinkerKeyGet(linkerKey)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AddonApi apiInstance = new AddonApi();
String linkerKey = "linkerKey_example"; // String | 
try {
    Error result = apiInstance.addonLinkersLinkerKeyGet(linkerKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonLinkersLinkerKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkerKey** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addonLinkersLinkerKeyValuesDelete"></a>
# **addonLinkersLinkerKeyValuesDelete**
> Error addonLinkersLinkerKeyValuesDelete(linkerKey)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AddonApi apiInstance = new AddonApi();
String linkerKey = "linkerKey_example"; // String | 
try {
    Error result = apiInstance.addonLinkersLinkerKeyValuesDelete(linkerKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonLinkersLinkerKeyValuesDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkerKey** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addonLinkersLinkerKeyValuesDelete_0"></a>
# **addonLinkersLinkerKeyValuesDelete_0**
> Error addonLinkersLinkerKeyValuesDelete_0(linkerKey)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AddonApi apiInstance = new AddonApi();
String linkerKey = "linkerKey_example"; // String | 
try {
    Error result = apiInstance.addonLinkersLinkerKeyValuesDelete_0(linkerKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonLinkersLinkerKeyValuesDelete_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkerKey** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addonLinkersLinkerKeyValuesGet"></a>
# **addonLinkersLinkerKeyValuesGet**
> Error addonLinkersLinkerKeyValuesGet(linkerKey)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AddonApi apiInstance = new AddonApi();
String linkerKey = "linkerKey_example"; // String | 
try {
    Error result = apiInstance.addonLinkersLinkerKeyValuesGet(linkerKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonLinkersLinkerKeyValuesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkerKey** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addonLinkersLinkerKeyValuesGet_0"></a>
# **addonLinkersLinkerKeyValuesGet_0**
> Error addonLinkersLinkerKeyValuesGet_0(linkerKey)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AddonApi apiInstance = new AddonApi();
String linkerKey = "linkerKey_example"; // String | 
try {
    Error result = apiInstance.addonLinkersLinkerKeyValuesGet_0(linkerKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonLinkersLinkerKeyValuesGet_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkerKey** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addonLinkersLinkerKeyValuesPost"></a>
# **addonLinkersLinkerKeyValuesPost**
> Error addonLinkersLinkerKeyValuesPost(linkerKey)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AddonApi apiInstance = new AddonApi();
String linkerKey = "linkerKey_example"; // String | 
try {
    Error result = apiInstance.addonLinkersLinkerKeyValuesPost(linkerKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonLinkersLinkerKeyValuesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkerKey** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addonLinkersLinkerKeyValuesPut"></a>
# **addonLinkersLinkerKeyValuesPut**
> Error addonLinkersLinkerKeyValuesPut(linkerKey)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AddonApi apiInstance = new AddonApi();
String linkerKey = "linkerKey_example"; // String | 
try {
    Error result = apiInstance.addonLinkersLinkerKeyValuesPut(linkerKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonLinkersLinkerKeyValuesPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkerKey** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addonPut"></a>
# **addonPut**
> Error addonPut()





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AddonApi apiInstance = new AddonApi();
try {
    Error result = apiInstance.addonPut();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonPut");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

