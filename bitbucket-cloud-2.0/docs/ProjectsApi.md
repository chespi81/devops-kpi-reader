# ProjectsApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**teamsOwnerProjectsGet**](ProjectsApi.md#teamsOwnerProjectsGet) | **GET** /teams/{owner}/projects/ | 
[**teamsOwnerProjectsPost**](ProjectsApi.md#teamsOwnerProjectsPost) | **POST** /teams/{owner}/projects/ | 
[**teamsOwnerProjectsProjectKeyDelete**](ProjectsApi.md#teamsOwnerProjectsProjectKeyDelete) | **DELETE** /teams/{owner}/projects/{project_key} | 
[**teamsOwnerProjectsProjectKeyGet**](ProjectsApi.md#teamsOwnerProjectsProjectKeyGet) | **GET** /teams/{owner}/projects/{project_key} | 
[**teamsOwnerProjectsProjectKeyPut**](ProjectsApi.md#teamsOwnerProjectsProjectKeyPut) | **PUT** /teams/{owner}/projects/{project_key} | 


<a name="teamsOwnerProjectsGet"></a>
# **teamsOwnerProjectsGet**
> PaginatedProjects teamsOwnerProjectsGet(owner)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.ProjectsApi;

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

ProjectsApi apiInstance = new ProjectsApi();
String owner = "owner_example"; // String | The team which owns the project. This can either be the `username` of the team or the `UUID` of the team (surrounded by curly-braces (`{}`)). 
try {
    PaginatedProjects result = apiInstance.teamsOwnerProjectsGet(owner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#teamsOwnerProjectsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| The team which owns the project. This can either be the &#x60;username&#x60; of the team or the &#x60;UUID&#x60; of the team (surrounded by curly-braces (&#x60;{}&#x60;)).  |

### Return type

[**PaginatedProjects**](PaginatedProjects.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsOwnerProjectsPost"></a>
# **teamsOwnerProjectsPost**
> Project teamsOwnerProjectsPost(owner, body)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.ProjectsApi;

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

ProjectsApi apiInstance = new ProjectsApi();
String owner = "owner_example"; // String | The team which owns the project. This can either be the `username` of the team or the `UUID` of the team (surrounded by curly-braces (`{}`)). 
Project body = new Project(); // Project | 
try {
    Project result = apiInstance.teamsOwnerProjectsPost(owner, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#teamsOwnerProjectsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| The team which owns the project. This can either be the &#x60;username&#x60; of the team or the &#x60;UUID&#x60; of the team (surrounded by curly-braces (&#x60;{}&#x60;)).  |
 **body** | [**Project**](Project.md)|  |

### Return type

[**Project**](Project.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsOwnerProjectsProjectKeyDelete"></a>
# **teamsOwnerProjectsProjectKeyDelete**
> teamsOwnerProjectsProjectKeyDelete(owner, projectKey)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.ProjectsApi;

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

ProjectsApi apiInstance = new ProjectsApi();
String owner = "owner_example"; // String | The team which owns the project. This can either be the `username` of the team or the `UUID` of the team (surrounded by curly-braces (`{}`)). 
String projectKey = "projectKey_example"; // String | The project in question. This can either be the actual `key` assigned to the project or the `UUID` (surrounded by curly-braces (`{}`)). 
try {
    apiInstance.teamsOwnerProjectsProjectKeyDelete(owner, projectKey);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#teamsOwnerProjectsProjectKeyDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| The team which owns the project. This can either be the &#x60;username&#x60; of the team or the &#x60;UUID&#x60; of the team (surrounded by curly-braces (&#x60;{}&#x60;)).  |
 **projectKey** | **String**| The project in question. This can either be the actual &#x60;key&#x60; assigned to the project or the &#x60;UUID&#x60; (surrounded by curly-braces (&#x60;{}&#x60;)).  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsOwnerProjectsProjectKeyGet"></a>
# **teamsOwnerProjectsProjectKeyGet**
> Project teamsOwnerProjectsProjectKeyGet(owner, projectKey)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.ProjectsApi;

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

ProjectsApi apiInstance = new ProjectsApi();
String owner = "owner_example"; // String | The team which owns the project. This can either be the `username` of the team or the `UUID` of the team (surrounded by curly-braces (`{}`)). 
String projectKey = "projectKey_example"; // String | The project in question. This can either be the actual `key` assigned to the project or the `UUID` (surrounded by curly-braces (`{}`)). 
try {
    Project result = apiInstance.teamsOwnerProjectsProjectKeyGet(owner, projectKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#teamsOwnerProjectsProjectKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| The team which owns the project. This can either be the &#x60;username&#x60; of the team or the &#x60;UUID&#x60; of the team (surrounded by curly-braces (&#x60;{}&#x60;)).  |
 **projectKey** | **String**| The project in question. This can either be the actual &#x60;key&#x60; assigned to the project or the &#x60;UUID&#x60; (surrounded by curly-braces (&#x60;{}&#x60;)).  |

### Return type

[**Project**](Project.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsOwnerProjectsProjectKeyPut"></a>
# **teamsOwnerProjectsProjectKeyPut**
> Project teamsOwnerProjectsProjectKeyPut(owner, projectKey, body)





### Example
```java
// Import classes:
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
//import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
//import cl.tinet.devops.metrics.gen.bitbucket.api.ProjectsApi;

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

ProjectsApi apiInstance = new ProjectsApi();
String owner = "owner_example"; // String | The team which owns the project. This can either be the `username` of the team or the `UUID` of the team (surrounded by curly-braces (`{}`)). 
String projectKey = "projectKey_example"; // String | The project in question. This can either be the actual `key` assigned to the project or the `UUID` (surrounded by curly-braces (`{}`)). 
Project body = new Project(); // Project | 
try {
    Project result = apiInstance.teamsOwnerProjectsProjectKeyPut(owner, projectKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#teamsOwnerProjectsProjectKeyPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| The team which owns the project. This can either be the &#x60;username&#x60; of the team or the &#x60;UUID&#x60; of the team (surrounded by curly-braces (&#x60;{}&#x60;)).  |
 **projectKey** | **String**| The project in question. This can either be the actual &#x60;key&#x60; assigned to the project or the &#x60;UUID&#x60; (surrounded by curly-braces (&#x60;{}&#x60;)).  |
 **body** | [**Project**](Project.md)|  |

### Return type

[**Project**](Project.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

