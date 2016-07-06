# RepositoriesApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repositoriesGet**](RepositoriesApi.md#repositoriesGet) | **GET** /repositories | 
[**repositoriesUsernameGet**](RepositoriesApi.md#repositoriesUsernameGet) | **GET** /repositories/{username} | 
[**repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet**](RepositoriesApi.md#repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet) | **GET** /repositories/{username}/{repo_slug}/commit/{node}/statuses/build/{key} | 
[**repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut**](RepositoriesApi.md#repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut) | **PUT** /repositories/{username}/{repo_slug}/commit/{node}/statuses/build/{key} | 
[**repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost**](RepositoriesApi.md#repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost) | **POST** /repositories/{username}/{repo_slug}/commit/{node}/statuses/build | 
[**repositoriesUsernameRepoSlugCommitNodeStatusesGet**](RepositoriesApi.md#repositoriesUsernameRepoSlugCommitNodeStatusesGet) | **GET** /repositories/{username}/{repo_slug}/commit/{node}/statuses | 
[**repositoriesUsernameRepoSlugDelete**](RepositoriesApi.md#repositoriesUsernameRepoSlugDelete) | **DELETE** /repositories/{username}/{repo_slug} | 
[**repositoriesUsernameRepoSlugForksGet**](RepositoriesApi.md#repositoriesUsernameRepoSlugForksGet) | **GET** /repositories/{username}/{repo_slug}/forks | 
[**repositoriesUsernameRepoSlugGet**](RepositoriesApi.md#repositoriesUsernameRepoSlugGet) | **GET** /repositories/{username}/{repo_slug} | 
[**repositoriesUsernameRepoSlugHooksGet**](RepositoriesApi.md#repositoriesUsernameRepoSlugHooksGet) | **GET** /repositories/{username}/{repo_slug}/hooks | 
[**repositoriesUsernameRepoSlugHooksPost**](RepositoriesApi.md#repositoriesUsernameRepoSlugHooksPost) | **POST** /repositories/{username}/{repo_slug}/hooks | 
[**repositoriesUsernameRepoSlugHooksUidDelete**](RepositoriesApi.md#repositoriesUsernameRepoSlugHooksUidDelete) | **DELETE** /repositories/{username}/{repo_slug}/hooks/{uid} | 
[**repositoriesUsernameRepoSlugHooksUidGet**](RepositoriesApi.md#repositoriesUsernameRepoSlugHooksUidGet) | **GET** /repositories/{username}/{repo_slug}/hooks/{uid} | 
[**repositoriesUsernameRepoSlugHooksUidPut**](RepositoriesApi.md#repositoriesUsernameRepoSlugHooksUidPut) | **PUT** /repositories/{username}/{repo_slug}/hooks/{uid} | 
[**repositoriesUsernameRepoSlugPost**](RepositoriesApi.md#repositoriesUsernameRepoSlugPost) | **POST** /repositories/{username}/{repo_slug} | 
[**repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet**](RepositoriesApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/statuses | 
[**repositoriesUsernameRepoSlugWatchersGet**](RepositoriesApi.md#repositoriesUsernameRepoSlugWatchersGet) | **GET** /repositories/{username}/{repo_slug}/watchers | 


<a name="repositoriesGet"></a>
# **repositoriesGet**
> PaginatedRepositories repositoriesGet()





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
try {
    PaginatedRepositories result = apiInstance.repositoriesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#repositoriesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PaginatedRepositories**](PaginatedRepositories.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameGet"></a>
# **repositoriesUsernameGet**
> PaginatedRepositories repositoriesUsernameGet(username, role)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
String username = "username_example"; // String | 
String role = "role_example"; // String |  Filters the result based on the authenticated user's role on each repository.  * **member**: returns repositories to which the user has explicit read access * **contributor**: returns repositories to which the user has explicit write access * **admin**: returns repositories to which the user has explicit administrator access * **owner**: returns all repositories owned by the current user 
try {
    PaginatedRepositories result = apiInstance.repositoriesUsernameGet(username, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#repositoriesUsernameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **role** | **String**|  Filters the result based on the authenticated user&#39;s role on each repository.  * **member**: returns repositories to which the user has explicit read access * **contributor**: returns repositories to which the user has explicit write access * **admin**: returns repositories to which the user has explicit administrator access * **owner**: returns all repositories owned by the current user  | [optional] [enum: admin, contributor, member, owner]

### Return type

[**PaginatedRepositories**](PaginatedRepositories.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
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
    System.err.println("Exception when calling RepositoriesApi#repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet");
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
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
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
    System.err.println("Exception when calling RepositoriesApi#repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut");
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
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
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
    System.err.println("Exception when calling RepositoriesApi#repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost");
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
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
String username = "username_example"; // String | 
String node = "node_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
String node2 = "node_example"; // String | The commit's SHA1
try {
    PaginatedCommitstatuses result = apiInstance.repositoriesUsernameRepoSlugCommitNodeStatusesGet(username, node, repoSlug, node2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#repositoriesUsernameRepoSlugCommitNodeStatusesGet");
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

<a name="repositoriesUsernameRepoSlugDelete"></a>
# **repositoriesUsernameRepoSlugDelete**
> repositoriesUsernameRepoSlugDelete(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    apiInstance.repositoriesUsernameRepoSlugDelete(username, repoSlug);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#repositoriesUsernameRepoSlugDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugForksGet"></a>
# **repositoriesUsernameRepoSlugForksGet**
> PaginatedRepositories repositoriesUsernameRepoSlugForksGet(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    PaginatedRepositories result = apiInstance.repositoriesUsernameRepoSlugForksGet(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#repositoriesUsernameRepoSlugForksGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**PaginatedRepositories**](PaginatedRepositories.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugGet"></a>
# **repositoriesUsernameRepoSlugGet**
> Repository repositoriesUsernameRepoSlugGet(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Repository result = apiInstance.repositoriesUsernameRepoSlugGet(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#repositoriesUsernameRepoSlugGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Repository**](Repository.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugHooksGet"></a>
# **repositoriesUsernameRepoSlugHooksGet**
> PaginatedWebhookSubscriptions repositoriesUsernameRepoSlugHooksGet(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    PaginatedWebhookSubscriptions result = apiInstance.repositoriesUsernameRepoSlugHooksGet(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#repositoriesUsernameRepoSlugHooksGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**PaginatedWebhookSubscriptions**](PaginatedWebhookSubscriptions.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugHooksPost"></a>
# **repositoriesUsernameRepoSlugHooksPost**
> WebhookSubscription repositoriesUsernameRepoSlugHooksPost(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    WebhookSubscription result = apiInstance.repositoriesUsernameRepoSlugHooksPost(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#repositoriesUsernameRepoSlugHooksPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugHooksUidDelete"></a>
# **repositoriesUsernameRepoSlugHooksUidDelete**
> repositoriesUsernameRepoSlugHooksUidDelete(username, uid, repoSlug, uid2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
String username = "username_example"; // String | 
String uid = "uid_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
String uid2 = "uid_example"; // String | The installed webhook's id
try {
    apiInstance.repositoriesUsernameRepoSlugHooksUidDelete(username, uid, repoSlug, uid2);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#repositoriesUsernameRepoSlugHooksUidDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **uid** | **String**|  |
 **repoSlug** | **String**|  |
 **uid2** | **String**| The installed webhook&#39;s id |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugHooksUidGet"></a>
# **repositoriesUsernameRepoSlugHooksUidGet**
> WebhookSubscription repositoriesUsernameRepoSlugHooksUidGet(username, uid, repoSlug, uid2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
String username = "username_example"; // String | 
String uid = "uid_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
String uid2 = "uid_example"; // String | The installed webhook's id.
try {
    WebhookSubscription result = apiInstance.repositoriesUsernameRepoSlugHooksUidGet(username, uid, repoSlug, uid2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#repositoriesUsernameRepoSlugHooksUidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **uid** | **String**|  |
 **repoSlug** | **String**|  |
 **uid2** | **String**| The installed webhook&#39;s id. |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugHooksUidPut"></a>
# **repositoriesUsernameRepoSlugHooksUidPut**
> WebhookSubscription repositoriesUsernameRepoSlugHooksUidPut(username, uid, repoSlug, uid2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
String username = "username_example"; // String | 
String uid = "uid_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
String uid2 = "uid_example"; // String | The installed webhook's id
try {
    WebhookSubscription result = apiInstance.repositoriesUsernameRepoSlugHooksUidPut(username, uid, repoSlug, uid2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#repositoriesUsernameRepoSlugHooksUidPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **uid** | **String**|  |
 **repoSlug** | **String**|  |
 **uid2** | **String**| The installed webhook&#39;s id |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPost"></a>
# **repositoriesUsernameRepoSlugPost**
> Repository repositoriesUsernameRepoSlugPost(username, repoSlug, body)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Repository body = new Repository(); // Repository | The repository that is to be created. Note that most object elements are optional. Elements \"owner\" and \"full_name\" are ignored as the URL implies them.
try {
    Repository result = apiInstance.repositoriesUsernameRepoSlugPost(username, repoSlug, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#repositoriesUsernameRepoSlugPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |
 **body** | [**Repository**](Repository.md)| The repository that is to be created. Note that most object elements are optional. Elements \&quot;owner\&quot; and \&quot;full_name\&quot; are ignored as the URL implies them. | [optional]

### Return type

[**Repository**](Repository.md)

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
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
String username = "username_example"; // String | 
String pullRequestId = "pullRequestId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Integer pullRequestId2 = 56; // Integer | The pull request's id
try {
    PaginatedCommitstatuses result = apiInstance.repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet(username, pullRequestId, repoSlug, pullRequestId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet");
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

<a name="repositoriesUsernameRepoSlugWatchersGet"></a>
# **repositoriesUsernameRepoSlugWatchersGet**
> Error repositoriesUsernameRepoSlugWatchersGet(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;

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

RepositoriesApi apiInstance = new RepositoriesApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugWatchersGet(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#repositoriesUsernameRepoSlugWatchersGet");
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

