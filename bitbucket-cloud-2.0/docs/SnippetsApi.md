# SnippetsApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**snippetsGet**](SnippetsApi.md#snippetsGet) | **GET** /snippets | 
[**snippetsPost**](SnippetsApi.md#snippetsPost) | **POST** /snippets | 
[**snippetsUsernameEncodedIdCommentsCommentIdDelete**](SnippetsApi.md#snippetsUsernameEncodedIdCommentsCommentIdDelete) | **DELETE** /snippets/{username}/{encoded_id}/comments/{comment_id} | 
[**snippetsUsernameEncodedIdCommentsCommentIdGet**](SnippetsApi.md#snippetsUsernameEncodedIdCommentsCommentIdGet) | **GET** /snippets/{username}/{encoded_id}/comments/{comment_id} | 
[**snippetsUsernameEncodedIdCommentsCommentIdPut**](SnippetsApi.md#snippetsUsernameEncodedIdCommentsCommentIdPut) | **PUT** /snippets/{username}/{encoded_id}/comments/{comment_id} | 
[**snippetsUsernameEncodedIdCommentsGet**](SnippetsApi.md#snippetsUsernameEncodedIdCommentsGet) | **GET** /snippets/{username}/{encoded_id}/comments | 
[**snippetsUsernameEncodedIdCommentsPost**](SnippetsApi.md#snippetsUsernameEncodedIdCommentsPost) | **POST** /snippets/{username}/{encoded_id}/comments | 
[**snippetsUsernameEncodedIdCommitsGet**](SnippetsApi.md#snippetsUsernameEncodedIdCommitsGet) | **GET** /snippets/{username}/{encoded_id}/commits | 
[**snippetsUsernameEncodedIdCommitsRevisionGet**](SnippetsApi.md#snippetsUsernameEncodedIdCommitsRevisionGet) | **GET** /snippets/{username}/{encoded_id}/commits/{revision} | 
[**snippetsUsernameEncodedIdDelete**](SnippetsApi.md#snippetsUsernameEncodedIdDelete) | **DELETE** /snippets/{username}/{encoded_id} | 
[**snippetsUsernameEncodedIdGet**](SnippetsApi.md#snippetsUsernameEncodedIdGet) | **GET** /snippets/{username}/{encoded_id} | 
[**snippetsUsernameEncodedIdNodeIdDelete**](SnippetsApi.md#snippetsUsernameEncodedIdNodeIdDelete) | **DELETE** /snippets/{username}/{encoded_id}/{node_id} | 
[**snippetsUsernameEncodedIdNodeIdFilesPathGet**](SnippetsApi.md#snippetsUsernameEncodedIdNodeIdFilesPathGet) | **GET** /snippets/{username}/{encoded_id}/{node_id}/files/{path} | 
[**snippetsUsernameEncodedIdNodeIdGet**](SnippetsApi.md#snippetsUsernameEncodedIdNodeIdGet) | **GET** /snippets/{username}/{encoded_id}/{node_id} | 
[**snippetsUsernameEncodedIdNodeIdPut**](SnippetsApi.md#snippetsUsernameEncodedIdNodeIdPut) | **PUT** /snippets/{username}/{encoded_id}/{node_id} | 
[**snippetsUsernameEncodedIdPut**](SnippetsApi.md#snippetsUsernameEncodedIdPut) | **PUT** /snippets/{username}/{encoded_id} | 
[**snippetsUsernameEncodedIdRevisionDiffGet**](SnippetsApi.md#snippetsUsernameEncodedIdRevisionDiffGet) | **GET** /snippets/{username}/{encoded_id}/{revision}/diff | 
[**snippetsUsernameEncodedIdRevisionPatchGet**](SnippetsApi.md#snippetsUsernameEncodedIdRevisionPatchGet) | **GET** /snippets/{username}/{encoded_id}/{revision}/patch | 
[**snippetsUsernameEncodedIdWatchDelete**](SnippetsApi.md#snippetsUsernameEncodedIdWatchDelete) | **DELETE** /snippets/{username}/{encoded_id}/watch | 
[**snippetsUsernameEncodedIdWatchGet**](SnippetsApi.md#snippetsUsernameEncodedIdWatchGet) | **GET** /snippets/{username}/{encoded_id}/watch | 
[**snippetsUsernameEncodedIdWatchPut**](SnippetsApi.md#snippetsUsernameEncodedIdWatchPut) | **PUT** /snippets/{username}/{encoded_id}/watch | 
[**snippetsUsernameEncodedIdWatchersGet**](SnippetsApi.md#snippetsUsernameEncodedIdWatchersGet) | **GET** /snippets/{username}/{encoded_id}/watchers | 
[**snippetsUsernameGet**](SnippetsApi.md#snippetsUsernameGet) | **GET** /snippets/{username} | 
[**snippetsUsernamePost**](SnippetsApi.md#snippetsUsernamePost) | **POST** /snippets/{username} | 


<a name="snippetsGet"></a>
# **snippetsGet**
> PaginatedSnippets snippetsGet(role)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String role = "role_example"; // String | Filter down the result based on the authenticated user's role (`owner`, `contributor`, or `member`).
try {
    PaginatedSnippets result = apiInstance.snippetsGet(role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**| Filter down the result based on the authenticated user&#39;s role (&#x60;owner&#x60;, &#x60;contributor&#x60;, or &#x60;member&#x60;). | [optional] [enum: owner, contributor, member]

### Return type

[**PaginatedSnippets**](PaginatedSnippets.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsPost"></a>
# **snippetsPost**
> Snippet snippetsPost(body)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
Snippet body = new Snippet(); // Snippet | The new snippet object.
try {
    Snippet result = apiInstance.snippetsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Snippet**](Snippet.md)| The new snippet object. |

### Return type

[**Snippet**](Snippet.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameEncodedIdCommentsCommentIdDelete"></a>
# **snippetsUsernameEncodedIdCommentsCommentIdDelete**
> snippetsUsernameEncodedIdCommentsCommentIdDelete(username, commentId, encodedId)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String commentId = "commentId_example"; // String | 
String encodedId = "encodedId_example"; // String | 
try {
    apiInstance.snippetsUsernameEncodedIdCommentsCommentIdDelete(username, commentId, encodedId);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdCommentsCommentIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **commentId** | **String**|  |
 **encodedId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameEncodedIdCommentsCommentIdGet"></a>
# **snippetsUsernameEncodedIdCommentsCommentIdGet**
> SnippetComment snippetsUsernameEncodedIdCommentsCommentIdGet(username, commentId, encodedId)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String commentId = "commentId_example"; // String | 
String encodedId = "encodedId_example"; // String | 
try {
    SnippetComment result = apiInstance.snippetsUsernameEncodedIdCommentsCommentIdGet(username, commentId, encodedId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdCommentsCommentIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **commentId** | **String**|  |
 **encodedId** | **String**|  |

### Return type

[**SnippetComment**](SnippetComment.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameEncodedIdCommentsCommentIdPut"></a>
# **snippetsUsernameEncodedIdCommentsCommentIdPut**
> snippetsUsernameEncodedIdCommentsCommentIdPut(username, commentId, encodedId)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String commentId = "commentId_example"; // String | 
String encodedId = "encodedId_example"; // String | 
try {
    apiInstance.snippetsUsernameEncodedIdCommentsCommentIdPut(username, commentId, encodedId);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdCommentsCommentIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **commentId** | **String**|  |
 **encodedId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameEncodedIdCommentsGet"></a>
# **snippetsUsernameEncodedIdCommentsGet**
> PaginatedSnippetComments snippetsUsernameEncodedIdCommentsGet(username, encodedId)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String encodedId = "encodedId_example"; // String | 
try {
    PaginatedSnippetComments result = apiInstance.snippetsUsernameEncodedIdCommentsGet(username, encodedId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdCommentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedId** | **String**|  |

### Return type

[**PaginatedSnippetComments**](PaginatedSnippetComments.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameEncodedIdCommentsPost"></a>
# **snippetsUsernameEncodedIdCommentsPost**
> Snippet snippetsUsernameEncodedIdCommentsPost(username, encodedId, body)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String encodedId = "encodedId_example"; // String | 
Snippet body = new Snippet(); // Snippet | The contents of the new comment.
try {
    Snippet result = apiInstance.snippetsUsernameEncodedIdCommentsPost(username, encodedId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdCommentsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedId** | **String**|  |
 **body** | [**Snippet**](Snippet.md)| The contents of the new comment. |

### Return type

[**Snippet**](Snippet.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameEncodedIdCommitsGet"></a>
# **snippetsUsernameEncodedIdCommitsGet**
> PaginatedSnippetCommit snippetsUsernameEncodedIdCommitsGet(username, encodedId)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String encodedId = "encodedId_example"; // String | 
try {
    PaginatedSnippetCommit result = apiInstance.snippetsUsernameEncodedIdCommitsGet(username, encodedId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdCommitsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedId** | **String**|  |

### Return type

[**PaginatedSnippetCommit**](PaginatedSnippetCommit.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameEncodedIdCommitsRevisionGet"></a>
# **snippetsUsernameEncodedIdCommitsRevisionGet**
> SnippetCommit snippetsUsernameEncodedIdCommitsRevisionGet(username, encodedId, revision)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String encodedId = "encodedId_example"; // String | 
String revision = "revision_example"; // String | 
try {
    SnippetCommit result = apiInstance.snippetsUsernameEncodedIdCommitsRevisionGet(username, encodedId, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdCommitsRevisionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedId** | **String**|  |
 **revision** | **String**|  |

### Return type

[**SnippetCommit**](SnippetCommit.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameEncodedIdDelete"></a>
# **snippetsUsernameEncodedIdDelete**
> snippetsUsernameEncodedIdDelete(username, encodedId, encodedId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String encodedId = "encodedId_example"; // String | 
String encodedId2 = "encodedId_example"; // String | The snippet's id.
try {
    apiInstance.snippetsUsernameEncodedIdDelete(username, encodedId, encodedId2);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedId** | **String**|  |
 **encodedId2** | **String**| The snippet&#39;s id. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameEncodedIdGet"></a>
# **snippetsUsernameEncodedIdGet**
> Snippet snippetsUsernameEncodedIdGet(username, encodedId, encodedId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String encodedId = "encodedId_example"; // String | 
String encodedId2 = "encodedId_example"; // String | The snippet's id.
try {
    Snippet result = apiInstance.snippetsUsernameEncodedIdGet(username, encodedId, encodedId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedId** | **String**|  |
 **encodedId2** | **String**| The snippet&#39;s id. |

### Return type

[**Snippet**](Snippet.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, multipart/related, multipart/form-data

<a name="snippetsUsernameEncodedIdNodeIdDelete"></a>
# **snippetsUsernameEncodedIdNodeIdDelete**
> snippetsUsernameEncodedIdNodeIdDelete(username, nodeId, encodedId, encodedId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String nodeId = "nodeId_example"; // String | 
String encodedId = "encodedId_example"; // String | 
String encodedId2 = "encodedId_example"; // String | The snippet's id.
try {
    apiInstance.snippetsUsernameEncodedIdNodeIdDelete(username, nodeId, encodedId, encodedId2);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdNodeIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **nodeId** | **String**|  |
 **encodedId** | **String**|  |
 **encodedId2** | **String**| The snippet&#39;s id. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameEncodedIdNodeIdFilesPathGet"></a>
# **snippetsUsernameEncodedIdNodeIdFilesPathGet**
> snippetsUsernameEncodedIdNodeIdFilesPathGet(username, path, nodeId, encodedId)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String path = "path_example"; // String | 
String nodeId = "nodeId_example"; // String | 
String encodedId = "encodedId_example"; // String | 
try {
    apiInstance.snippetsUsernameEncodedIdNodeIdFilesPathGet(username, path, nodeId, encodedId);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdNodeIdFilesPathGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **path** | **String**|  |
 **nodeId** | **String**|  |
 **encodedId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameEncodedIdNodeIdGet"></a>
# **snippetsUsernameEncodedIdNodeIdGet**
> Snippet snippetsUsernameEncodedIdNodeIdGet(username, nodeId, encodedId, encodedId2, nodeId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String nodeId = "nodeId_example"; // String | 
String encodedId = "encodedId_example"; // String | 
String encodedId2 = "encodedId_example"; // String | The snippet's id.
String nodeId2 = "nodeId_example"; // String | A commit revision (SHA1).
try {
    Snippet result = apiInstance.snippetsUsernameEncodedIdNodeIdGet(username, nodeId, encodedId, encodedId2, nodeId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdNodeIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **nodeId** | **String**|  |
 **encodedId** | **String**|  |
 **encodedId2** | **String**| The snippet&#39;s id. |
 **nodeId2** | **String**| A commit revision (SHA1). |

### Return type

[**Snippet**](Snippet.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, multipart/related, multipart/form-data

<a name="snippetsUsernameEncodedIdNodeIdPut"></a>
# **snippetsUsernameEncodedIdNodeIdPut**
> Snippet snippetsUsernameEncodedIdNodeIdPut(username, nodeId, encodedId, encodedId2, nodeId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String nodeId = "nodeId_example"; // String | 
String encodedId = "encodedId_example"; // String | 
String encodedId2 = "encodedId_example"; // String | The snippet's id.
String nodeId2 = "nodeId_example"; // String | A commit revision (SHA1).
try {
    Snippet result = apiInstance.snippetsUsernameEncodedIdNodeIdPut(username, nodeId, encodedId, encodedId2, nodeId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdNodeIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **nodeId** | **String**|  |
 **encodedId** | **String**|  |
 **encodedId2** | **String**| The snippet&#39;s id. |
 **nodeId2** | **String**| A commit revision (SHA1). |

### Return type

[**Snippet**](Snippet.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json, multipart/related, multipart/form-data
 - **Accept**: application/json, multipart/related, multipart/form-data

<a name="snippetsUsernameEncodedIdPut"></a>
# **snippetsUsernameEncodedIdPut**
> Snippet snippetsUsernameEncodedIdPut(username, encodedId, encodedId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String encodedId = "encodedId_example"; // String | 
String encodedId2 = "encodedId_example"; // String | The snippet's id.
try {
    Snippet result = apiInstance.snippetsUsernameEncodedIdPut(username, encodedId, encodedId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedId** | **String**|  |
 **encodedId2** | **String**| The snippet&#39;s id. |

### Return type

[**Snippet**](Snippet.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json, multipart/related, multipart/form-data
 - **Accept**: application/json, multipart/related, multipart/form-data

<a name="snippetsUsernameEncodedIdRevisionDiffGet"></a>
# **snippetsUsernameEncodedIdRevisionDiffGet**
> snippetsUsernameEncodedIdRevisionDiffGet(username, encodedId, revision, encodedId2, revision2, path)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String encodedId = "encodedId_example"; // String | 
String revision = "revision_example"; // String | 
String encodedId2 = "encodedId_example"; // String | The snippet id.
String revision2 = "revision_example"; // String | A revspec expression. This can simply be a commit SHA1, a ref name, or a compare expression like `staging..production`.
String path = "path_example"; // String | When used, only one the diff of the specified file will be returned.
try {
    apiInstance.snippetsUsernameEncodedIdRevisionDiffGet(username, encodedId, revision, encodedId2, revision2, path);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdRevisionDiffGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedId** | **String**|  |
 **revision** | **String**|  |
 **encodedId2** | **String**| The snippet id. |
 **revision2** | **String**| A revspec expression. This can simply be a commit SHA1, a ref name, or a compare expression like &#x60;staging..production&#x60;. |
 **path** | **String**| When used, only one the diff of the specified file will be returned. | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameEncodedIdRevisionPatchGet"></a>
# **snippetsUsernameEncodedIdRevisionPatchGet**
> snippetsUsernameEncodedIdRevisionPatchGet(username, encodedId, revision, encodedId2, revision2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String encodedId = "encodedId_example"; // String | 
String revision = "revision_example"; // String | 
String encodedId2 = "encodedId_example"; // String | The snippet id.
String revision2 = "revision_example"; // String | A revspec expression. This can simply be a commit SHA1, a ref name, or a compare expression like `staging..production`.
try {
    apiInstance.snippetsUsernameEncodedIdRevisionPatchGet(username, encodedId, revision, encodedId2, revision2);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdRevisionPatchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedId** | **String**|  |
 **revision** | **String**|  |
 **encodedId2** | **String**| The snippet id. |
 **revision2** | **String**| A revspec expression. This can simply be a commit SHA1, a ref name, or a compare expression like &#x60;staging..production&#x60;. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameEncodedIdWatchDelete"></a>
# **snippetsUsernameEncodedIdWatchDelete**
> PaginatedUsers snippetsUsernameEncodedIdWatchDelete(username, encodedId, encodedId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String encodedId = "encodedId_example"; // String | 
String encodedId2 = "encodedId_example"; // String | The snippet id.
try {
    PaginatedUsers result = apiInstance.snippetsUsernameEncodedIdWatchDelete(username, encodedId, encodedId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdWatchDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedId** | **String**|  |
 **encodedId2** | **String**| The snippet id. |

### Return type

[**PaginatedUsers**](PaginatedUsers.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameEncodedIdWatchGet"></a>
# **snippetsUsernameEncodedIdWatchGet**
> PaginatedUsers snippetsUsernameEncodedIdWatchGet(username, encodedId, encodedId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String encodedId = "encodedId_example"; // String | 
String encodedId2 = "encodedId_example"; // String | The snippet id.
try {
    PaginatedUsers result = apiInstance.snippetsUsernameEncodedIdWatchGet(username, encodedId, encodedId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdWatchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedId** | **String**|  |
 **encodedId2** | **String**| The snippet id. |

### Return type

[**PaginatedUsers**](PaginatedUsers.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameEncodedIdWatchPut"></a>
# **snippetsUsernameEncodedIdWatchPut**
> PaginatedUsers snippetsUsernameEncodedIdWatchPut(username, encodedId, encodedId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String encodedId = "encodedId_example"; // String | 
String encodedId2 = "encodedId_example"; // String | The snippet id.
try {
    PaginatedUsers result = apiInstance.snippetsUsernameEncodedIdWatchPut(username, encodedId, encodedId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdWatchPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedId** | **String**|  |
 **encodedId2** | **String**| The snippet id. |

### Return type

[**PaginatedUsers**](PaginatedUsers.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameEncodedIdWatchersGet"></a>
# **snippetsUsernameEncodedIdWatchersGet**
> PaginatedUsers snippetsUsernameEncodedIdWatchersGet(username, encodedId, encodedId2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String encodedId = "encodedId_example"; // String | 
String encodedId2 = "encodedId_example"; // String | The snippet id.
try {
    PaginatedUsers result = apiInstance.snippetsUsernameEncodedIdWatchersGet(username, encodedId, encodedId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameEncodedIdWatchersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **encodedId** | **String**|  |
 **encodedId2** | **String**| The snippet id. |

### Return type

[**PaginatedUsers**](PaginatedUsers.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernameGet"></a>
# **snippetsUsernameGet**
> PaginatedSnippets snippetsUsernameGet(username, username2, role)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
String username2 = "username_example"; // String | Limits the result to snippets owned by this user.
String role = "role_example"; // String | Filter down the result based on the authenticated user's role (`owner`, `contributor`, or `member`).
try {
    PaginatedSnippets result = apiInstance.snippetsUsernameGet(username, username2, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **username2** | **String**| Limits the result to snippets owned by this user. |
 **role** | **String**| Filter down the result based on the authenticated user&#39;s role (&#x60;owner&#x60;, &#x60;contributor&#x60;, or &#x60;member&#x60;). | [optional] [enum: owner, contributor, member]

### Return type

[**PaginatedSnippets**](PaginatedSnippets.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsUsernamePost"></a>
# **snippetsUsernamePost**
> Snippet snippetsUsernamePost(username, body)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String username = "username_example"; // String | 
Snippet body = new Snippet(); // Snippet | The new snippet object.
try {
    Snippet result = apiInstance.snippetsUsernamePost(username, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsUsernamePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **body** | [**Snippet**](Snippet.md)| The new snippet object. |

### Return type

[**Snippet**](Snippet.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

