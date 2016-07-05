# DownloadsApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repositoriesUsernameRepoSlugDownloadsFilenameDelete**](DownloadsApi.md#repositoriesUsernameRepoSlugDownloadsFilenameDelete) | **DELETE** /repositories/{username}/{repo_slug}/downloads/{filename} | 
[**repositoriesUsernameRepoSlugDownloadsFilenameGet**](DownloadsApi.md#repositoriesUsernameRepoSlugDownloadsFilenameGet) | **GET** /repositories/{username}/{repo_slug}/downloads/{filename} | 
[**repositoriesUsernameRepoSlugDownloadsGet**](DownloadsApi.md#repositoriesUsernameRepoSlugDownloadsGet) | **GET** /repositories/{username}/{repo_slug}/downloads | 
[**repositoriesUsernameRepoSlugDownloadsPost**](DownloadsApi.md#repositoriesUsernameRepoSlugDownloadsPost) | **POST** /repositories/{username}/{repo_slug}/downloads | 


<a name="repositoriesUsernameRepoSlugDownloadsFilenameDelete"></a>
# **repositoriesUsernameRepoSlugDownloadsFilenameDelete**
> Error repositoriesUsernameRepoSlugDownloadsFilenameDelete(username, filename, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.DownloadsApi;

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

DownloadsApi apiInstance = new DownloadsApi();
String username = "username_example"; // String | 
String filename = "filename_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugDownloadsFilenameDelete(username, filename, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DownloadsApi#repositoriesUsernameRepoSlugDownloadsFilenameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **filename** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugDownloadsFilenameGet"></a>
# **repositoriesUsernameRepoSlugDownloadsFilenameGet**
> Error repositoriesUsernameRepoSlugDownloadsFilenameGet(username, filename, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.DownloadsApi;

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

DownloadsApi apiInstance = new DownloadsApi();
String username = "username_example"; // String | 
String filename = "filename_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugDownloadsFilenameGet(username, filename, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DownloadsApi#repositoriesUsernameRepoSlugDownloadsFilenameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **filename** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugDownloadsGet"></a>
# **repositoriesUsernameRepoSlugDownloadsGet**
> Error repositoriesUsernameRepoSlugDownloadsGet(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.DownloadsApi;

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

DownloadsApi apiInstance = new DownloadsApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugDownloadsGet(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DownloadsApi#repositoriesUsernameRepoSlugDownloadsGet");
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

<a name="repositoriesUsernameRepoSlugDownloadsPost"></a>
# **repositoriesUsernameRepoSlugDownloadsPost**
> Error repositoriesUsernameRepoSlugDownloadsPost(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.DownloadsApi;

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

DownloadsApi apiInstance = new DownloadsApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugDownloadsPost(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DownloadsApi#repositoriesUsernameRepoSlugDownloadsPost");
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

