# IssuetrackerApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repositoriesUsernameRepoSlugComponentsComponentIdGet**](IssuetrackerApi.md#repositoriesUsernameRepoSlugComponentsComponentIdGet) | **GET** /repositories/{username}/{repo_slug}/components/{component_id} | 
[**repositoriesUsernameRepoSlugComponentsGet**](IssuetrackerApi.md#repositoriesUsernameRepoSlugComponentsGet) | **GET** /repositories/{username}/{repo_slug}/components | 
[**repositoriesUsernameRepoSlugIssuesGet**](IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesGet) | **GET** /repositories/{username}/{repo_slug}/issues | 
[**repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsGet**](IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsGet) | **GET** /repositories/{username}/{repo_slug}/issues/{issue_id}/attachments | 
[**repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathDelete**](IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathDelete) | **DELETE** /repositories/{username}/{repo_slug}/issues/{issue_id}/attachments/{path} | 
[**repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathGet**](IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathGet) | **GET** /repositories/{username}/{repo_slug}/issues/{issue_id}/attachments/{path} | 
[**repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPost**](IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPost) | **POST** /repositories/{username}/{repo_slug}/issues/{issue_id}/attachments | 
[**repositoriesUsernameRepoSlugIssuesIssueIdCommentsCommentIdGet**](IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdCommentsCommentIdGet) | **GET** /repositories/{username}/{repo_slug}/issues/{issue_id}/comments/{comment_id} | 
[**repositoriesUsernameRepoSlugIssuesIssueIdCommentsGet**](IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdCommentsGet) | **GET** /repositories/{username}/{repo_slug}/issues/{issue_id}/comments | 
[**repositoriesUsernameRepoSlugIssuesIssueIdDelete**](IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdDelete) | **DELETE** /repositories/{username}/{repo_slug}/issues/{issue_id} | 
[**repositoriesUsernameRepoSlugIssuesIssueIdGet**](IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdGet) | **GET** /repositories/{username}/{repo_slug}/issues/{issue_id} | 
[**repositoriesUsernameRepoSlugIssuesIssueIdVoteDelete**](IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdVoteDelete) | **DELETE** /repositories/{username}/{repo_slug}/issues/{issue_id}/vote | 
[**repositoriesUsernameRepoSlugIssuesIssueIdVoteGet**](IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdVoteGet) | **GET** /repositories/{username}/{repo_slug}/issues/{issue_id}/vote | 
[**repositoriesUsernameRepoSlugIssuesIssueIdVotePut**](IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdVotePut) | **PUT** /repositories/{username}/{repo_slug}/issues/{issue_id}/vote | 
[**repositoriesUsernameRepoSlugIssuesIssueIdWatchDelete**](IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdWatchDelete) | **DELETE** /repositories/{username}/{repo_slug}/issues/{issue_id}/watch | 
[**repositoriesUsernameRepoSlugIssuesIssueIdWatchGet**](IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdWatchGet) | **GET** /repositories/{username}/{repo_slug}/issues/{issue_id}/watch | 
[**repositoriesUsernameRepoSlugIssuesIssueIdWatchPut**](IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdWatchPut) | **PUT** /repositories/{username}/{repo_slug}/issues/{issue_id}/watch | 
[**repositoriesUsernameRepoSlugIssuesPost**](IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesPost) | **POST** /repositories/{username}/{repo_slug}/issues | 
[**repositoriesUsernameRepoSlugMilestonesGet**](IssuetrackerApi.md#repositoriesUsernameRepoSlugMilestonesGet) | **GET** /repositories/{username}/{repo_slug}/milestones | 
[**repositoriesUsernameRepoSlugMilestonesMilestoneIdGet**](IssuetrackerApi.md#repositoriesUsernameRepoSlugMilestonesMilestoneIdGet) | **GET** /repositories/{username}/{repo_slug}/milestones/{milestone_id} | 
[**repositoriesUsernameRepoSlugVersionsGet**](IssuetrackerApi.md#repositoriesUsernameRepoSlugVersionsGet) | **GET** /repositories/{username}/{repo_slug}/versions | 
[**repositoriesUsernameRepoSlugVersionsVersionIdGet**](IssuetrackerApi.md#repositoriesUsernameRepoSlugVersionsVersionIdGet) | **GET** /repositories/{username}/{repo_slug}/versions/{version_id} | 


<a name="repositoriesUsernameRepoSlugComponentsComponentIdGet"></a>
# **repositoriesUsernameRepoSlugComponentsComponentIdGet**
> Component repositoriesUsernameRepoSlugComponentsComponentIdGet(username, componentId, repoSlug, componentId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String componentId = "componentId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Integer componentId2 = 56; // Integer | The component's id
try {
    Component result = apiInstance.repositoriesUsernameRepoSlugComponentsComponentIdGet(username, componentId, repoSlug, componentId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugComponentsComponentIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **componentId** | **String**|  |
 **repoSlug** | **String**|  |
 **componentId2** | **Integer**| The component&#39;s id |

### Return type

[**Component**](Component.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugComponentsGet"></a>
# **repositoriesUsernameRepoSlugComponentsGet**
> PaginatedComponents repositoriesUsernameRepoSlugComponentsGet(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    PaginatedComponents result = apiInstance.repositoriesUsernameRepoSlugComponentsGet(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugComponentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**PaginatedComponents**](PaginatedComponents.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugIssuesGet"></a>
# **repositoriesUsernameRepoSlugIssuesGet**
> PaginatedIssues repositoriesUsernameRepoSlugIssuesGet(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    PaginatedIssues result = apiInstance.repositoriesUsernameRepoSlugIssuesGet(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugIssuesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**PaginatedIssues**](PaginatedIssues.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsGet"></a>
# **repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsGet**
> PaginatedIssueAttachments repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsGet(username, issueId, repoSlug, issueId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String issueId = "issueId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Integer issueId2 = 56; // Integer | The issue's id
try {
    PaginatedIssueAttachments result = apiInstance.repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsGet(username, issueId, repoSlug, issueId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **issueId** | **String**|  |
 **repoSlug** | **String**|  |
 **issueId2** | **Integer**| The issue&#39;s id |

### Return type

[**PaginatedIssueAttachments**](PaginatedIssueAttachments.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathDelete"></a>
# **repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathDelete**
> repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathDelete(username, path, issueId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String path = "path_example"; // String | 
String issueId = "issueId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    apiInstance.repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathDelete(username, path, issueId, repoSlug);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **path** | **String**|  |
 **issueId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathGet"></a>
# **repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathGet**
> repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathGet(username, path, issueId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String path = "path_example"; // String | 
String issueId = "issueId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    apiInstance.repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathGet(username, path, issueId, repoSlug);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **path** | **String**|  |
 **issueId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPost"></a>
# **repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPost**
> repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPost(username, issueId, repoSlug, issueId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String issueId = "issueId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Integer issueId2 = 56; // Integer | The issue's id
try {
    apiInstance.repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPost(username, issueId, repoSlug, issueId2);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **issueId** | **String**|  |
 **repoSlug** | **String**|  |
 **issueId2** | **Integer**| The issue&#39;s id |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugIssuesIssueIdCommentsCommentIdGet"></a>
# **repositoriesUsernameRepoSlugIssuesIssueIdCommentsCommentIdGet**
> Error repositoriesUsernameRepoSlugIssuesIssueIdCommentsCommentIdGet(username, commentId, issueId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String commentId = "commentId_example"; // String | 
String issueId = "issueId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugIssuesIssueIdCommentsCommentIdGet(username, commentId, issueId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugIssuesIssueIdCommentsCommentIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **commentId** | **String**|  |
 **issueId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugIssuesIssueIdCommentsGet"></a>
# **repositoriesUsernameRepoSlugIssuesIssueIdCommentsGet**
> Error repositoriesUsernameRepoSlugIssuesIssueIdCommentsGet(username, issueId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String issueId = "issueId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugIssuesIssueIdCommentsGet(username, issueId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugIssuesIssueIdCommentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **issueId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugIssuesIssueIdDelete"></a>
# **repositoriesUsernameRepoSlugIssuesIssueIdDelete**
> Issue repositoriesUsernameRepoSlugIssuesIssueIdDelete(username, issueId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String issueId = "issueId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Issue result = apiInstance.repositoriesUsernameRepoSlugIssuesIssueIdDelete(username, issueId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugIssuesIssueIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **issueId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Issue**](Issue.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugIssuesIssueIdGet"></a>
# **repositoriesUsernameRepoSlugIssuesIssueIdGet**
> Issue repositoriesUsernameRepoSlugIssuesIssueIdGet(username, issueId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String issueId = "issueId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Issue result = apiInstance.repositoriesUsernameRepoSlugIssuesIssueIdGet(username, issueId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugIssuesIssueIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **issueId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Issue**](Issue.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugIssuesIssueIdVoteDelete"></a>
# **repositoriesUsernameRepoSlugIssuesIssueIdVoteDelete**
> Error repositoriesUsernameRepoSlugIssuesIssueIdVoteDelete(username, issueId, repoSlug, issueId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String issueId = "issueId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Integer issueId2 = 56; // Integer | The issue's id
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugIssuesIssueIdVoteDelete(username, issueId, repoSlug, issueId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugIssuesIssueIdVoteDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **issueId** | **String**|  |
 **repoSlug** | **String**|  |
 **issueId2** | **Integer**| The issue&#39;s id |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugIssuesIssueIdVoteGet"></a>
# **repositoriesUsernameRepoSlugIssuesIssueIdVoteGet**
> Error repositoriesUsernameRepoSlugIssuesIssueIdVoteGet(username, issueId, repoSlug, issueId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String issueId = "issueId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Integer issueId2 = 56; // Integer | The issue's id
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugIssuesIssueIdVoteGet(username, issueId, repoSlug, issueId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugIssuesIssueIdVoteGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **issueId** | **String**|  |
 **repoSlug** | **String**|  |
 **issueId2** | **Integer**| The issue&#39;s id |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugIssuesIssueIdVotePut"></a>
# **repositoriesUsernameRepoSlugIssuesIssueIdVotePut**
> Error repositoriesUsernameRepoSlugIssuesIssueIdVotePut(username, issueId, repoSlug, issueId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String issueId = "issueId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Integer issueId2 = 56; // Integer | The issue's id
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugIssuesIssueIdVotePut(username, issueId, repoSlug, issueId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugIssuesIssueIdVotePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **issueId** | **String**|  |
 **repoSlug** | **String**|  |
 **issueId2** | **Integer**| The issue&#39;s id |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugIssuesIssueIdWatchDelete"></a>
# **repositoriesUsernameRepoSlugIssuesIssueIdWatchDelete**
> Error repositoriesUsernameRepoSlugIssuesIssueIdWatchDelete(username, issueId, repoSlug, issueId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String issueId = "issueId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Integer issueId2 = 56; // Integer | The issue's id
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugIssuesIssueIdWatchDelete(username, issueId, repoSlug, issueId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugIssuesIssueIdWatchDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **issueId** | **String**|  |
 **repoSlug** | **String**|  |
 **issueId2** | **Integer**| The issue&#39;s id |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugIssuesIssueIdWatchGet"></a>
# **repositoriesUsernameRepoSlugIssuesIssueIdWatchGet**
> Error repositoriesUsernameRepoSlugIssuesIssueIdWatchGet(username, issueId, repoSlug, issueId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String issueId = "issueId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Integer issueId2 = 56; // Integer | The issue's id
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugIssuesIssueIdWatchGet(username, issueId, repoSlug, issueId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugIssuesIssueIdWatchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **issueId** | **String**|  |
 **repoSlug** | **String**|  |
 **issueId2** | **Integer**| The issue&#39;s id |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugIssuesIssueIdWatchPut"></a>
# **repositoriesUsernameRepoSlugIssuesIssueIdWatchPut**
> Error repositoriesUsernameRepoSlugIssuesIssueIdWatchPut(username, issueId, repoSlug, issueId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String issueId = "issueId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Integer issueId2 = 56; // Integer | The issue's id
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugIssuesIssueIdWatchPut(username, issueId, repoSlug, issueId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugIssuesIssueIdWatchPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **issueId** | **String**|  |
 **repoSlug** | **String**|  |
 **issueId2** | **Integer**| The issue&#39;s id |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugIssuesPost"></a>
# **repositoriesUsernameRepoSlugIssuesPost**
> Issue repositoriesUsernameRepoSlugIssuesPost(username, repoSlug, body)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Issue body = new Issue(); // Issue | The new issue. Note that the only required element is `title`. All other elements can be omitted from the body.
try {
    Issue result = apiInstance.repositoriesUsernameRepoSlugIssuesPost(username, repoSlug, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugIssuesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |
 **body** | [**Issue**](Issue.md)| The new issue. Note that the only required element is &#x60;title&#x60;. All other elements can be omitted from the body. |

### Return type

[**Issue**](Issue.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugMilestonesGet"></a>
# **repositoriesUsernameRepoSlugMilestonesGet**
> PaginatedMilestones repositoriesUsernameRepoSlugMilestonesGet(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    PaginatedMilestones result = apiInstance.repositoriesUsernameRepoSlugMilestonesGet(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugMilestonesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**PaginatedMilestones**](PaginatedMilestones.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugMilestonesMilestoneIdGet"></a>
# **repositoriesUsernameRepoSlugMilestonesMilestoneIdGet**
> Milestone repositoriesUsernameRepoSlugMilestonesMilestoneIdGet(username, milestoneId, repoSlug, milestoneId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String milestoneId = "milestoneId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Integer milestoneId2 = 56; // Integer | The milestone's id
try {
    Milestone result = apiInstance.repositoriesUsernameRepoSlugMilestonesMilestoneIdGet(username, milestoneId, repoSlug, milestoneId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugMilestonesMilestoneIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **milestoneId** | **String**|  |
 **repoSlug** | **String**|  |
 **milestoneId2** | **Integer**| The milestone&#39;s id |

### Return type

[**Milestone**](Milestone.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugVersionsGet"></a>
# **repositoriesUsernameRepoSlugVersionsGet**
> PaginatedVersions repositoriesUsernameRepoSlugVersionsGet(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    PaginatedVersions result = apiInstance.repositoriesUsernameRepoSlugVersionsGet(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugVersionsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**PaginatedVersions**](PaginatedVersions.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugVersionsVersionIdGet"></a>
# **repositoriesUsernameRepoSlugVersionsVersionIdGet**
> Version repositoriesUsernameRepoSlugVersionsVersionIdGet(username, versionId, repoSlug, versionId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.IssuetrackerApi;

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

IssuetrackerApi apiInstance = new IssuetrackerApi();
String username = "username_example"; // String | 
String versionId = "versionId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Integer versionId2 = 56; // Integer | The version's id
try {
    Version result = apiInstance.repositoriesUsernameRepoSlugVersionsVersionIdGet(username, versionId, repoSlug, versionId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuetrackerApi#repositoriesUsernameRepoSlugVersionsVersionIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **versionId** | **String**|  |
 **repoSlug** | **String**|  |
 **versionId2** | **Integer**| The version&#39;s id |

### Return type

[**Version**](Version.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

