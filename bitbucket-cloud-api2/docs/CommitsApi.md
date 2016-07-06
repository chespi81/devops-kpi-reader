# CommitsApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repositoriesUsernameRepoSlugCommitNodeApproveDelete**](CommitsApi.md#repositoriesUsernameRepoSlugCommitNodeApproveDelete) | **DELETE** /repositories/{username}/{repo_slug}/commit/{node}/approve | 
[**repositoriesUsernameRepoSlugCommitNodeApprovePost**](CommitsApi.md#repositoriesUsernameRepoSlugCommitNodeApprovePost) | **POST** /repositories/{username}/{repo_slug}/commit/{node}/approve | 
[**repositoriesUsernameRepoSlugCommitRevisionGet**](CommitsApi.md#repositoriesUsernameRepoSlugCommitRevisionGet) | **GET** /repositories/{username}/{repo_slug}/commit/{revision} | 
[**repositoriesUsernameRepoSlugCommitShaCommentsCommentIdGet**](CommitsApi.md#repositoriesUsernameRepoSlugCommitShaCommentsCommentIdGet) | **GET** /repositories/{username}/{repo_slug}/commit/{sha}/comments/{comment_id} | 
[**repositoriesUsernameRepoSlugCommitShaCommentsGet**](CommitsApi.md#repositoriesUsernameRepoSlugCommitShaCommentsGet) | **GET** /repositories/{username}/{repo_slug}/commit/{sha}/comments | 
[**repositoriesUsernameRepoSlugCommitsGet**](CommitsApi.md#repositoriesUsernameRepoSlugCommitsGet) | **GET** /repositories/{username}/{repo_slug}/commits | 
[**repositoriesUsernameRepoSlugCommitsPost**](CommitsApi.md#repositoriesUsernameRepoSlugCommitsPost) | **POST** /repositories/{username}/{repo_slug}/commits | 
[**repositoriesUsernameRepoSlugCommitsRevisionGet**](CommitsApi.md#repositoriesUsernameRepoSlugCommitsRevisionGet) | **GET** /repositories/{username}/{repo_slug}/commits/{revision} | 
[**repositoriesUsernameRepoSlugCommitsRevisionPost**](CommitsApi.md#repositoriesUsernameRepoSlugCommitsRevisionPost) | **POST** /repositories/{username}/{repo_slug}/commits/{revision} | 
[**repositoriesUsernameRepoSlugDiffSpecGet**](CommitsApi.md#repositoriesUsernameRepoSlugDiffSpecGet) | **GET** /repositories/{username}/{repo_slug}/diff/{spec} | 
[**repositoriesUsernameRepoSlugPatchSpecGet**](CommitsApi.md#repositoriesUsernameRepoSlugPatchSpecGet) | **GET** /repositories/{username}/{repo_slug}/patch/{spec} | 


<a name="repositoriesUsernameRepoSlugCommitNodeApproveDelete"></a>
# **repositoriesUsernameRepoSlugCommitNodeApproveDelete**
> repositoriesUsernameRepoSlugCommitNodeApproveDelete(username, node, repoSlug, node2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | 
String node = "node_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
String node2 = "node_example"; // String | The commit's SHA1.
try {
    apiInstance.repositoriesUsernameRepoSlugCommitNodeApproveDelete(username, node, repoSlug, node2);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesUsernameRepoSlugCommitNodeApproveDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **node** | **String**|  |
 **repoSlug** | **String**|  |
 **node2** | **String**| The commit&#39;s SHA1. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugCommitNodeApprovePost"></a>
# **repositoriesUsernameRepoSlugCommitNodeApprovePost**
> Participant repositoriesUsernameRepoSlugCommitNodeApprovePost(username, node, repoSlug, node2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | 
String node = "node_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
String node2 = "node_example"; // String | The commit's SHA1.
try {
    Participant result = apiInstance.repositoriesUsernameRepoSlugCommitNodeApprovePost(username, node, repoSlug, node2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesUsernameRepoSlugCommitNodeApprovePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **node** | **String**|  |
 **repoSlug** | **String**|  |
 **node2** | **String**| The commit&#39;s SHA1. |

### Return type

[**Participant**](Participant.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugCommitRevisionGet"></a>
# **repositoriesUsernameRepoSlugCommitRevisionGet**
> Commit repositoriesUsernameRepoSlugCommitRevisionGet(username, revision, repoSlug, revision2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | 
String revision = "revision_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
String revision2 = "revision_example"; // String | The commit's SHA1.
try {
    Commit result = apiInstance.repositoriesUsernameRepoSlugCommitRevisionGet(username, revision, repoSlug, revision2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesUsernameRepoSlugCommitRevisionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **revision** | **String**|  |
 **repoSlug** | **String**|  |
 **revision2** | **String**| The commit&#39;s SHA1. |

### Return type

[**Commit**](Commit.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugCommitShaCommentsCommentIdGet"></a>
# **repositoriesUsernameRepoSlugCommitShaCommentsCommentIdGet**
> Error repositoriesUsernameRepoSlugCommitShaCommentsCommentIdGet(username, sha, commentId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | 
String sha = "sha_example"; // String | 
String commentId = "commentId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugCommitShaCommentsCommentIdGet(username, sha, commentId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesUsernameRepoSlugCommitShaCommentsCommentIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **sha** | **String**|  |
 **commentId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugCommitShaCommentsGet"></a>
# **repositoriesUsernameRepoSlugCommitShaCommentsGet**
> Error repositoriesUsernameRepoSlugCommitShaCommentsGet(username, sha, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | 
String sha = "sha_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugCommitShaCommentsGet(username, sha, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesUsernameRepoSlugCommitShaCommentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **sha** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugCommitsGet"></a>
# **repositoriesUsernameRepoSlugCommitsGet**
> Error repositoriesUsernameRepoSlugCommitsGet(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugCommitsGet(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesUsernameRepoSlugCommitsGet");
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

<a name="repositoriesUsernameRepoSlugCommitsPost"></a>
# **repositoriesUsernameRepoSlugCommitsPost**
> Error repositoriesUsernameRepoSlugCommitsPost(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugCommitsPost(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesUsernameRepoSlugCommitsPost");
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

<a name="repositoriesUsernameRepoSlugCommitsRevisionGet"></a>
# **repositoriesUsernameRepoSlugCommitsRevisionGet**
> Error repositoriesUsernameRepoSlugCommitsRevisionGet(username, revision, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | 
String revision = "revision_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugCommitsRevisionGet(username, revision, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesUsernameRepoSlugCommitsRevisionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **revision** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugCommitsRevisionPost"></a>
# **repositoriesUsernameRepoSlugCommitsRevisionPost**
> Error repositoriesUsernameRepoSlugCommitsRevisionPost(username, revision, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | 
String revision = "revision_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugCommitsRevisionPost(username, revision, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesUsernameRepoSlugCommitsRevisionPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **revision** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugDiffSpecGet"></a>
# **repositoriesUsernameRepoSlugDiffSpecGet**
> repositoriesUsernameRepoSlugDiffSpecGet(username, spec, repoSlug, context, path)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | 
String spec = "spec_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Integer context = 56; // Integer | Generate diffs with <n> lines of context instead of the usual three
String path = "path_example"; // String | Limit the diff to a single file
try {
    apiInstance.repositoriesUsernameRepoSlugDiffSpecGet(username, spec, repoSlug, context, path);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesUsernameRepoSlugDiffSpecGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **spec** | **String**|  |
 **repoSlug** | **String**|  |
 **context** | **Integer**| Generate diffs with &lt;n&gt; lines of context instead of the usual three | [optional]
 **path** | **String**| Limit the diff to a single file | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPatchSpecGet"></a>
# **repositoriesUsernameRepoSlugPatchSpecGet**
> repositoriesUsernameRepoSlugPatchSpecGet(username, spec, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | 
String spec = "spec_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    apiInstance.repositoriesUsernameRepoSlugPatchSpecGet(username, spec, repoSlug);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesUsernameRepoSlugPatchSpecGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **spec** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

