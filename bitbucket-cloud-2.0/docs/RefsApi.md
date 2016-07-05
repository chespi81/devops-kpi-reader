# RefsApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repositoriesUsernameRepoSlugRefsBranchesGet**](RefsApi.md#repositoriesUsernameRepoSlugRefsBranchesGet) | **GET** /repositories/{username}/{repo_slug}/refs/branches | 
[**repositoriesUsernameRepoSlugRefsBranchesNameGet**](RefsApi.md#repositoriesUsernameRepoSlugRefsBranchesNameGet) | **GET** /repositories/{username}/{repo_slug}/refs/branches/{name} | 
[**repositoriesUsernameRepoSlugRefsGet**](RefsApi.md#repositoriesUsernameRepoSlugRefsGet) | **GET** /repositories/{username}/{repo_slug}/refs | 
[**repositoriesUsernameRepoSlugRefsTagsGet**](RefsApi.md#repositoriesUsernameRepoSlugRefsTagsGet) | **GET** /repositories/{username}/{repo_slug}/refs/tags | 
[**repositoriesUsernameRepoSlugRefsTagsNameGet**](RefsApi.md#repositoriesUsernameRepoSlugRefsTagsNameGet) | **GET** /repositories/{username}/{repo_slug}/refs/tags/{name} | 


<a name="repositoriesUsernameRepoSlugRefsBranchesGet"></a>
# **repositoriesUsernameRepoSlugRefsBranchesGet**
> Error repositoriesUsernameRepoSlugRefsBranchesGet(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RefsApi;

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

RefsApi apiInstance = new RefsApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugRefsBranchesGet(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefsApi#repositoriesUsernameRepoSlugRefsBranchesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugRefsBranchesNameGet"></a>
# **repositoriesUsernameRepoSlugRefsBranchesNameGet**
> Error repositoriesUsernameRepoSlugRefsBranchesNameGet(username, name, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RefsApi;

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

RefsApi apiInstance = new RefsApi();
String username = "username_example"; // String | 
String name = "name_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugRefsBranchesNameGet(username, name, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefsApi#repositoriesUsernameRepoSlugRefsBranchesNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **name** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugRefsGet"></a>
# **repositoriesUsernameRepoSlugRefsGet**
> Error repositoriesUsernameRepoSlugRefsGet(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RefsApi;

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

RefsApi apiInstance = new RefsApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugRefsGet(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefsApi#repositoriesUsernameRepoSlugRefsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugRefsTagsGet"></a>
# **repositoriesUsernameRepoSlugRefsTagsGet**
> Error repositoriesUsernameRepoSlugRefsTagsGet(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RefsApi;

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

RefsApi apiInstance = new RefsApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugRefsTagsGet(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefsApi#repositoriesUsernameRepoSlugRefsTagsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugRefsTagsNameGet"></a>
# **repositoriesUsernameRepoSlugRefsTagsNameGet**
> Error repositoriesUsernameRepoSlugRefsTagsNameGet(username, name, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RefsApi;

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

RefsApi apiInstance = new RefsApi();
String username = "username_example"; // String | 
String name = "name_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugRefsTagsNameGet(username, name, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefsApi#repositoriesUsernameRepoSlugRefsTagsNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **name** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

