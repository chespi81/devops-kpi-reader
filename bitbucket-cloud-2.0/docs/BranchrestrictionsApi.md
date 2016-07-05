# BranchrestrictionsApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repositoriesUsernameRepoSlugBranchRestrictionsGet**](BranchrestrictionsApi.md#repositoriesUsernameRepoSlugBranchRestrictionsGet) | **GET** /repositories/{username}/{repo_slug}/branch-restrictions | 
[**repositoriesUsernameRepoSlugBranchRestrictionsIdDelete**](BranchrestrictionsApi.md#repositoriesUsernameRepoSlugBranchRestrictionsIdDelete) | **DELETE** /repositories/{username}/{repo_slug}/branch-restrictions/{id} | 
[**repositoriesUsernameRepoSlugBranchRestrictionsIdGet**](BranchrestrictionsApi.md#repositoriesUsernameRepoSlugBranchRestrictionsIdGet) | **GET** /repositories/{username}/{repo_slug}/branch-restrictions/{id} | 
[**repositoriesUsernameRepoSlugBranchRestrictionsIdPut**](BranchrestrictionsApi.md#repositoriesUsernameRepoSlugBranchRestrictionsIdPut) | **PUT** /repositories/{username}/{repo_slug}/branch-restrictions/{id} | 
[**repositoriesUsernameRepoSlugBranchRestrictionsPost**](BranchrestrictionsApi.md#repositoriesUsernameRepoSlugBranchRestrictionsPost) | **POST** /repositories/{username}/{repo_slug}/branch-restrictions | 


<a name="repositoriesUsernameRepoSlugBranchRestrictionsGet"></a>
# **repositoriesUsernameRepoSlugBranchRestrictionsGet**
> PaginatedBranchrestrictions repositoriesUsernameRepoSlugBranchRestrictionsGet(username, repoSlug)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.BranchrestrictionsApi;

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

BranchrestrictionsApi apiInstance = new BranchrestrictionsApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
try {
    PaginatedBranchrestrictions result = apiInstance.repositoriesUsernameRepoSlugBranchRestrictionsGet(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchrestrictionsApi#repositoriesUsernameRepoSlugBranchRestrictionsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |

### Return type

[**PaginatedBranchrestrictions**](PaginatedBranchrestrictions.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugBranchRestrictionsIdDelete"></a>
# **repositoriesUsernameRepoSlugBranchRestrictionsIdDelete**
> repositoriesUsernameRepoSlugBranchRestrictionsIdDelete(username, id, repoSlug, id2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.BranchrestrictionsApi;

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

BranchrestrictionsApi apiInstance = new BranchrestrictionsApi();
String username = "username_example"; // String | 
String id = "id_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
String id2 = "id_example"; // String | The restriction rule's id
try {
    apiInstance.repositoriesUsernameRepoSlugBranchRestrictionsIdDelete(username, id, repoSlug, id2);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchrestrictionsApi#repositoriesUsernameRepoSlugBranchRestrictionsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **id** | **String**|  |
 **repoSlug** | **String**|  |
 **id2** | **String**| The restriction rule&#39;s id |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugBranchRestrictionsIdGet"></a>
# **repositoriesUsernameRepoSlugBranchRestrictionsIdGet**
> Branchrestriction repositoriesUsernameRepoSlugBranchRestrictionsIdGet(username, id, repoSlug, id2)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.BranchrestrictionsApi;

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

BranchrestrictionsApi apiInstance = new BranchrestrictionsApi();
String username = "username_example"; // String | 
String id = "id_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
String id2 = "id_example"; // String | The restriction rule's id
try {
    Branchrestriction result = apiInstance.repositoriesUsernameRepoSlugBranchRestrictionsIdGet(username, id, repoSlug, id2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchrestrictionsApi#repositoriesUsernameRepoSlugBranchRestrictionsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **id** | **String**|  |
 **repoSlug** | **String**|  |
 **id2** | **String**| The restriction rule&#39;s id |

### Return type

[**Branchrestriction**](Branchrestriction.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugBranchRestrictionsIdPut"></a>
# **repositoriesUsernameRepoSlugBranchRestrictionsIdPut**
> Branchrestriction repositoriesUsernameRepoSlugBranchRestrictionsIdPut(username, id, repoSlug, id2, body)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.BranchrestrictionsApi;

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

BranchrestrictionsApi apiInstance = new BranchrestrictionsApi();
String username = "username_example"; // String | 
String id = "id_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
String id2 = "id_example"; // String | The restriction rule's id
Branchrestriction body = new Branchrestriction(); // Branchrestriction | The new version of the existing rule
try {
    Branchrestriction result = apiInstance.repositoriesUsernameRepoSlugBranchRestrictionsIdPut(username, id, repoSlug, id2, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchrestrictionsApi#repositoriesUsernameRepoSlugBranchRestrictionsIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **id** | **String**|  |
 **repoSlug** | **String**|  |
 **id2** | **String**| The restriction rule&#39;s id |
 **body** | [**Branchrestriction**](Branchrestriction.md)| The new version of the existing rule |

### Return type

[**Branchrestriction**](Branchrestriction.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesUsernameRepoSlugBranchRestrictionsPost"></a>
# **repositoriesUsernameRepoSlugBranchRestrictionsPost**
> Branchrestriction repositoriesUsernameRepoSlugBranchRestrictionsPost(username, repoSlug, body)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.BranchrestrictionsApi;

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

BranchrestrictionsApi apiInstance = new BranchrestrictionsApi();
String username = "username_example"; // String | 
String repoSlug = "repoSlug_example"; // String | 
Branchrestriction body = new Branchrestriction(); // Branchrestriction | The new rule
try {
    Branchrestriction result = apiInstance.repositoriesUsernameRepoSlugBranchRestrictionsPost(username, repoSlug, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchrestrictionsApi#repositoriesUsernameRepoSlugBranchRestrictionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **repoSlug** | **String**|  |
 **body** | [**Branchrestriction**](Branchrestriction.md)| The new rule |

### Return type

[**Branchrestriction**](Branchrestriction.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

