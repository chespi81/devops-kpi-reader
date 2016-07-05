# PullrequestsApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repositoriesUsernameRepoSlugDefaultReviewersGet**](PullrequestsApi.md#repositoriesUsernameRepoSlugDefaultReviewersGet) | **GET** /repositories/{username}/{repo_slug}/default-reviewers | 
[**repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameDelete**](PullrequestsApi.md#repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameDelete) | **DELETE** /repositories/{username}/{repo_slug}/default-reviewers/{target_username} | 
[**repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameGet**](PullrequestsApi.md#repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameGet) | **GET** /repositories/{username}/{repo_slug}/default-reviewers/{target_username} | 
[**repositoriesUsernameRepoSlugDefaultReviewersTargetUsernamePut**](PullrequestsApi.md#repositoriesUsernameRepoSlugDefaultReviewersTargetUsernamePut) | **PUT** /repositories/{username}/{repo_slug}/default-reviewers/{target_username} | 
[**repositoriesUsernameRepoSlugPullrequestsActivityGet**](PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsActivityGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/activity | 
[**repositoriesUsernameRepoSlugPullrequestsGet**](PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests | 
[**repositoriesUsernameRepoSlugPullrequestsPost**](PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPost) | **POST** /repositories/{username}/{repo_slug}/pullrequests | 
[**repositoriesUsernameRepoSlugPullrequestsPullRequestIdActivityGet**](PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdActivityGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/activity | 
[**repositoriesUsernameRepoSlugPullrequestsPullRequestIdApproveDelete**](PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdApproveDelete) | **DELETE** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/approve | 
[**repositoriesUsernameRepoSlugPullrequestsPullRequestIdApprovePost**](PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdApprovePost) | **POST** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/approve | 
[**repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet**](PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/comments/{comment_id} | 
[**repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsGet**](PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/comments | 
[**repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommitsGet**](PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommitsGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/commits | 
[**repositoriesUsernameRepoSlugPullrequestsPullRequestIdDeclinePost**](PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdDeclinePost) | **POST** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/decline | 
[**repositoriesUsernameRepoSlugPullrequestsPullRequestIdDiffGet**](PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdDiffGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/diff | 
[**repositoriesUsernameRepoSlugPullrequestsPullRequestIdGet**](PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id} | 
[**repositoriesUsernameRepoSlugPullrequestsPullRequestIdMergePost**](PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdMergePost) | **POST** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/merge | 
[**repositoriesUsernameRepoSlugPullrequestsPullRequestIdPatchGet**](PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdPatchGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/patch | 
[**repositoriesUsernameRepoSlugPullrequestsPullRequestIdPut**](PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdPut) | **PUT** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id} | 
[**repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet**](PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/statuses | 


<a name="repositoriesUsernameRepoSlugDefaultReviewersGet"></a>
# **repositoriesUsernameRepoSlugDefaultReviewersGet**
> repositoriesUsernameRepoSlugDefaultReviewersGet(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    apiInstance.repositoriesUsernameRepoSlugDefaultReviewersGet(username, repoSlug);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugDefaultReviewersGet");
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

<a name="repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameDelete"></a>
# **repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameDelete**
> Error repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameDelete(username, targetUsername, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String targetUsername = "targetUsername_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameDelete(username, targetUsername, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **targetUsername** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameGet"></a>
# **repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameGet**
> Error repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameGet(username, targetUsername, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String targetUsername = "targetUsername_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameGet(username, targetUsername, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **targetUsername** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugDefaultReviewersTargetUsernamePut"></a>
# **repositoriesUsernameRepoSlugDefaultReviewersTargetUsernamePut**
> Error repositoriesUsernameRepoSlugDefaultReviewersTargetUsernamePut(username, targetUsername, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String targetUsername = "targetUsername_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugDefaultReviewersTargetUsernamePut(username, targetUsername, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugDefaultReviewersTargetUsernamePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **targetUsername** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPullrequestsActivityGet"></a>
# **repositoriesUsernameRepoSlugPullrequestsActivityGet**
> Error repositoriesUsernameRepoSlugPullrequestsActivityGet(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugPullrequestsActivityGet(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugPullrequestsActivityGet");
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

<a name="repositoriesUsernameRepoSlugPullrequestsGet"></a>
# **repositoriesUsernameRepoSlugPullrequestsGet**
> Error repositoriesUsernameRepoSlugPullrequestsGet(username, repoSlug, state)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
String state = "state_example"; // String | Only return pull requests that in this state. This parameter can be repeated.
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugPullrequestsGet(username, repoSlug, state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugPullrequestsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |
 **state** | **String**| Only return pull requests that in this state. This parameter can be repeated. | [optional] [enum: MERGED, SUPERSEDED, OPEN, DECLINED]

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPullrequestsPost"></a>
# **repositoriesUsernameRepoSlugPullrequestsPost**
> Pullrequest repositoriesUsernameRepoSlugPullrequestsPost(username, repoSlug, body)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Pullrequest body = new Pullrequest(); // Pullrequest | The new pull request.  The request URL you POST to becomes the destination repository URL. For this reason, you must specify an explicit source repository in the request object if you want to pull from a different repository (fork).  Since not all elements are required or even mutable, you only need to include the elements you want to initialize, such as the source branch and the title.
try {
    Pullrequest result = apiInstance.repositoriesUsernameRepoSlugPullrequestsPost(username, repoSlug, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugPullrequestsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |
 **body** | [**Pullrequest**](Pullrequest.md)| The new pull request.  The request URL you POST to becomes the destination repository URL. For this reason, you must specify an explicit source repository in the request object if you want to pull from a different repository (fork).  Since not all elements are required or even mutable, you only need to include the elements you want to initialize, such as the source branch and the title. | [optional]

### Return type

[**Pullrequest**](Pullrequest.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPullrequestsPullRequestIdActivityGet"></a>
# **repositoriesUsernameRepoSlugPullrequestsPullRequestIdActivityGet**
> Error repositoriesUsernameRepoSlugPullrequestsPullRequestIdActivityGet(username, pullRequestId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String pullRequestId = "pullRequestId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugPullrequestsPullRequestIdActivityGet(username, pullRequestId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugPullrequestsPullRequestIdActivityGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **pullRequestId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPullrequestsPullRequestIdApproveDelete"></a>
# **repositoriesUsernameRepoSlugPullrequestsPullRequestIdApproveDelete**
> Error repositoriesUsernameRepoSlugPullrequestsPullRequestIdApproveDelete(username, pullRequestId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String pullRequestId = "pullRequestId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugPullrequestsPullRequestIdApproveDelete(username, pullRequestId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugPullrequestsPullRequestIdApproveDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **pullRequestId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPullrequestsPullRequestIdApprovePost"></a>
# **repositoriesUsernameRepoSlugPullrequestsPullRequestIdApprovePost**
> Error repositoriesUsernameRepoSlugPullrequestsPullRequestIdApprovePost(username, pullRequestId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String pullRequestId = "pullRequestId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugPullrequestsPullRequestIdApprovePost(username, pullRequestId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugPullrequestsPullRequestIdApprovePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **pullRequestId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet"></a>
# **repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet**
> Error repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet(username, pullRequestId, commentId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String pullRequestId = "pullRequestId_example"; // String | 
String commentId = "commentId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet(username, pullRequestId, commentId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **pullRequestId** | **String**|  |
 **commentId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsGet"></a>
# **repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsGet**
> Error repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsGet(username, pullRequestId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String pullRequestId = "pullRequestId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsGet(username, pullRequestId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **pullRequestId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommitsGet"></a>
# **repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommitsGet**
> Error repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommitsGet(username, pullRequestId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String pullRequestId = "pullRequestId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommitsGet(username, pullRequestId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommitsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **pullRequestId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPullrequestsPullRequestIdDeclinePost"></a>
# **repositoriesUsernameRepoSlugPullrequestsPullRequestIdDeclinePost**
> Pullrequest repositoriesUsernameRepoSlugPullrequestsPullRequestIdDeclinePost(username, pullRequestId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String pullRequestId = "pullRequestId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Pullrequest result = apiInstance.repositoriesUsernameRepoSlugPullrequestsPullRequestIdDeclinePost(username, pullRequestId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugPullrequestsPullRequestIdDeclinePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **pullRequestId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Pullrequest**](Pullrequest.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPullrequestsPullRequestIdDiffGet"></a>
# **repositoriesUsernameRepoSlugPullrequestsPullRequestIdDiffGet**
> Error repositoriesUsernameRepoSlugPullrequestsPullRequestIdDiffGet(username, pullRequestId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String pullRequestId = "pullRequestId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugPullrequestsPullRequestIdDiffGet(username, pullRequestId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugPullrequestsPullRequestIdDiffGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **pullRequestId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPullrequestsPullRequestIdGet"></a>
# **repositoriesUsernameRepoSlugPullrequestsPullRequestIdGet**
> Pullrequest repositoriesUsernameRepoSlugPullrequestsPullRequestIdGet(username, pullRequestId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String pullRequestId = "pullRequestId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Pullrequest result = apiInstance.repositoriesUsernameRepoSlugPullrequestsPullRequestIdGet(username, pullRequestId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugPullrequestsPullRequestIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **pullRequestId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Pullrequest**](Pullrequest.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPullrequestsPullRequestIdMergePost"></a>
# **repositoriesUsernameRepoSlugPullrequestsPullRequestIdMergePost**
> Pullrequest repositoriesUsernameRepoSlugPullrequestsPullRequestIdMergePost(username, pullRequestId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String pullRequestId = "pullRequestId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Pullrequest result = apiInstance.repositoriesUsernameRepoSlugPullrequestsPullRequestIdMergePost(username, pullRequestId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugPullrequestsPullRequestIdMergePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **pullRequestId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Pullrequest**](Pullrequest.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPullrequestsPullRequestIdPatchGet"></a>
# **repositoriesUsernameRepoSlugPullrequestsPullRequestIdPatchGet**
> Error repositoriesUsernameRepoSlugPullrequestsPullRequestIdPatchGet(username, pullRequestId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String pullRequestId = "pullRequestId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugPullrequestsPullRequestIdPatchGet(username, pullRequestId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugPullrequestsPullRequestIdPatchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **pullRequestId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugPullrequestsPullRequestIdPut"></a>
# **repositoriesUsernameRepoSlugPullrequestsPullRequestIdPut**
> Error repositoriesUsernameRepoSlugPullrequestsPullRequestIdPut(username, pullRequestId, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String pullRequestId = "pullRequestId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    Error result = apiInstance.repositoriesUsernameRepoSlugPullrequestsPullRequestIdPut(username, pullRequestId, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugPullrequestsPullRequestIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **pullRequestId** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**Error**](Error.md)

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
//import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | 
String pullRequestId = "pullRequestId_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Integer pullRequestId2 = 56; // Integer | The pull request's id
try {
    PaginatedCommitstatuses result = apiInstance.repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet(username, pullRequestId, repoSlug, pullRequestId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet");
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

