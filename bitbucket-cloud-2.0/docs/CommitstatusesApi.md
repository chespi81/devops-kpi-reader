# CommitstatusesApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet**](CommitstatusesApi.md#repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet) | **GET** /repositories/{username}/{repo_slug}/commit/{node}/statuses/build/{key} | 
[**repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut**](CommitstatusesApi.md#repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut) | **PUT** /repositories/{username}/{repo_slug}/commit/{node}/statuses/build/{key} | 
[**repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost**](CommitstatusesApi.md#repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost) | **POST** /repositories/{username}/{repo_slug}/commit/{node}/statuses/build | 
[**repositoriesUsernameRepoSlugCommitNodeStatusesGet**](CommitstatusesApi.md#repositoriesUsernameRepoSlugCommitNodeStatusesGet) | **GET** /repositories/{username}/{repo_slug}/commit/{node}/statuses | 
[**repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet**](CommitstatusesApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/statuses | 


<a name="repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet"></a>
# **repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet**
> Commitstatus repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet(username, node, key, repoSlug, node2, key2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.CommitstatusesApi;

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

CommitstatusesApi apiInstance = new CommitstatusesApi();
String username = "username_example"; // String | 
String node = "node_example"; // String | 
String key = "key_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
String node2 = "node_example"; // String | The commit's SHA1
String key2 = "key_example"; // String | The build status' unique key
try {
    Commitstatus result = apiInstance.repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet(username, node, key, repoSlug, node2, key2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitstatusesApi#repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **node** | **String**|  |
 **key** | **String**|  |
 **repoSlug** | **String**|  |
 **node2** | **String**| The commit&#39;s SHA1 |
 **key2** | **String**| The build status&#39; unique key |

### Return type

[**Commitstatus**](Commitstatus.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut"></a>
# **repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut**
> Commitstatus repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut(username, node, key, repoSlug, node2, key2, body)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.CommitstatusesApi;

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

CommitstatusesApi apiInstance = new CommitstatusesApi();
String username = "username_example"; // String | 
String node = "node_example"; // String | 
String key = "key_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
String node2 = "node_example"; // String | The commit's SHA1
String key2 = "key_example"; // String | The commit status' unique key
Commitstatus body = new Commitstatus(); // Commitstatus | The updated build status object
try {
    Commitstatus result = apiInstance.repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut(username, node, key, repoSlug, node2, key2, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitstatusesApi#repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **node** | **String**|  |
 **key** | **String**|  |
 **repoSlug** | **String**|  |
 **node2** | **String**| The commit&#39;s SHA1 |
 **key2** | **String**| The commit status&#39; unique key |
 **body** | [**Commitstatus**](Commitstatus.md)| The updated build status object | [optional]

### Return type

[**Commitstatus**](Commitstatus.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost"></a>
# **repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost**
> Commitstatus repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost(username, node, repoSlug, node2, key, body)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.CommitstatusesApi;

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

CommitstatusesApi apiInstance = new CommitstatusesApi();
String username = "username_example"; // String | 
String node = "node_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
String node2 = "node_example"; // String | The commit's SHA1
String key = "key_example"; // String | The commit status' unique key
Commitstatus body = new Commitstatus(); // Commitstatus | The new commit status object.
try {
    Commitstatus result = apiInstance.repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost(username, node, repoSlug, node2, key, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitstatusesApi#repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **node** | **String**|  |
 **repoSlug** | **String**|  |
 **node2** | **String**| The commit&#39;s SHA1 |
 **key** | **String**| The commit status&#39; unique key |
 **body** | [**Commitstatus**](Commitstatus.md)| The new commit status object. | [optional]

### Return type

[**Commitstatus**](Commitstatus.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugCommitNodeStatusesGet"></a>
# **repositoriesUsernameRepoSlugCommitNodeStatusesGet**
> PaginatedCommitstatuses repositoriesUsernameRepoSlugCommitNodeStatusesGet(username, node, repoSlug, node2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.CommitstatusesApi;

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

CommitstatusesApi apiInstance = new CommitstatusesApi();
String username = "username_example"; // String | 
String node = "node_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
String node2 = "node_example"; // String | The commit's SHA1
try {
    PaginatedCommitstatuses result = apiInstance.repositoriesUsernameRepoSlugCommitNodeStatusesGet(username, node, repoSlug, node2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitstatusesApi#repositoriesUsernameRepoSlugCommitNodeStatusesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **node** | **String**|  |
 **repoSlug** | **String**|  |
 **node2** | **String**| The commit&#39;s SHA1 |

### Return type

[**PaginatedCommitstatuses**](PaginatedCommitstatuses.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet"></a>
# **repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet**
> PaginatedCommitstatuses repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet(username, pullRequestId, repoSlug, pullRequestId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.CommitstatusesApi;

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

CommitstatusesApi apiInstance = new CommitstatusesApi();
String username = "username_example"; // String | 
String pullRequestId = "pullRequestId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Integer pullRequestId2 = 56; // Integer | The pull request's id
try {
    PaginatedCommitstatuses result = apiInstance.repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet(username, pullRequestId, repoSlug, pullRequestId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitstatusesApi#repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **pullRequestId** | **String**|  |
 **repoSlug** | **String**|  |
 **pullRequestId2** | **Integer**| The pull request&#39;s id |

### Return type

[**PaginatedCommitstatuses**](PaginatedCommitstatuses.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

