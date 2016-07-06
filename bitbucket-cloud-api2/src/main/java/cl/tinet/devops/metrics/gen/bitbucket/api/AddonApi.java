package cl.tinet.devops.metrics.gen.bitbucket.api;

import com.sun.jersey.api.client.GenericType;

import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
import cl.tinet.devops.metrics.gen.bitbucket.model.*;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Pair;

import cl.tinet.devops.metrics.gen.bitbucket.model.Error;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T23:42:53.141-04:00")
public class AddonApi {
  private ApiClient apiClient;

  public AddonApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AddonApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param username  (required)
   * @param encodedContextId  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error accountUsernameAddonsEncodedContextIdDelete(String username, String encodedContextId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling accountUsernameAddonsEncodedContextIdDelete");
    }
    
    // verify the required parameter 'encodedContextId' is set
    if (encodedContextId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedContextId' when calling accountUsernameAddonsEncodedContextIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/account/{username}/addons/{encoded_context_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_context_id" + "\\}", apiClient.escapeString(encodedContextId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param encodedContextId  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error accountUsernameAddonsEncodedContextIdGet(String username, String encodedContextId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling accountUsernameAddonsEncodedContextIdGet");
    }
    
    // verify the required parameter 'encodedContextId' is set
    if (encodedContextId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedContextId' when calling accountUsernameAddonsEncodedContextIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/account/{username}/addons/{encoded_context_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_context_id" + "\\}", apiClient.escapeString(encodedContextId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param encodedContextId  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error accountUsernameAddonsEncodedContextIdPut(String username, String encodedContextId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling accountUsernameAddonsEncodedContextIdPut");
    }
    
    // verify the required parameter 'encodedContextId' is set
    if (encodedContextId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedContextId' when calling accountUsernameAddonsEncodedContextIdPut");
    }
    
    // create path and map variables
    String localVarPath = "/account/{username}/addons/{encoded_context_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_context_id" + "\\}", apiClient.escapeString(encodedContextId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param encodedContextId  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error accountUsernameAddonsEncodedContextIdRefreshPut(String username, String encodedContextId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling accountUsernameAddonsEncodedContextIdRefreshPut");
    }
    
    // verify the required parameter 'encodedContextId' is set
    if (encodedContextId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedContextId' when calling accountUsernameAddonsEncodedContextIdRefreshPut");
    }
    
    // create path and map variables
    String localVarPath = "/account/{username}/addons/{encoded_context_id}/refresh".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_context_id" + "\\}", apiClient.escapeString(encodedContextId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error accountUsernameAddonsGet(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling accountUsernameAddonsGet");
    }
    
    // create path and map variables
    String localVarPath = "/account/{username}/addons".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error accountUsernameAddonsPost(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling accountUsernameAddonsPost");
    }
    
    // create path and map variables
    String localVarPath = "/account/{username}/addons".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error addonDelete() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/addon".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error addonLinkersGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/addon/linkers".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param linkerKey  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error addonLinkersLinkerKeyGet(String linkerKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'linkerKey' is set
    if (linkerKey == null) {
      throw new ApiException(400, "Missing the required parameter 'linkerKey' when calling addonLinkersLinkerKeyGet");
    }
    
    // create path and map variables
    String localVarPath = "/addon/linkers/{linker_key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "linker_key" + "\\}", apiClient.escapeString(linkerKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param linkerKey  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error addonLinkersLinkerKeyValuesDelete(String linkerKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'linkerKey' is set
    if (linkerKey == null) {
      throw new ApiException(400, "Missing the required parameter 'linkerKey' when calling addonLinkersLinkerKeyValuesDelete");
    }
    
    // create path and map variables
    String localVarPath = "/addon/linkers/{linker_key}/values".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "linker_key" + "\\}", apiClient.escapeString(linkerKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param linkerKey  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error addonLinkersLinkerKeyValuesDelete_0(String linkerKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'linkerKey' is set
    if (linkerKey == null) {
      throw new ApiException(400, "Missing the required parameter 'linkerKey' when calling addonLinkersLinkerKeyValuesDelete_0");
    }
    
    // create path and map variables
    String localVarPath = "/addon/linkers/{linker_key}/values/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "linker_key" + "\\}", apiClient.escapeString(linkerKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param linkerKey  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error addonLinkersLinkerKeyValuesGet(String linkerKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'linkerKey' is set
    if (linkerKey == null) {
      throw new ApiException(400, "Missing the required parameter 'linkerKey' when calling addonLinkersLinkerKeyValuesGet");
    }
    
    // create path and map variables
    String localVarPath = "/addon/linkers/{linker_key}/values".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "linker_key" + "\\}", apiClient.escapeString(linkerKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param linkerKey  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error addonLinkersLinkerKeyValuesGet_0(String linkerKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'linkerKey' is set
    if (linkerKey == null) {
      throw new ApiException(400, "Missing the required parameter 'linkerKey' when calling addonLinkersLinkerKeyValuesGet_0");
    }
    
    // create path and map variables
    String localVarPath = "/addon/linkers/{linker_key}/values/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "linker_key" + "\\}", apiClient.escapeString(linkerKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param linkerKey  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error addonLinkersLinkerKeyValuesPost(String linkerKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'linkerKey' is set
    if (linkerKey == null) {
      throw new ApiException(400, "Missing the required parameter 'linkerKey' when calling addonLinkersLinkerKeyValuesPost");
    }
    
    // create path and map variables
    String localVarPath = "/addon/linkers/{linker_key}/values".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "linker_key" + "\\}", apiClient.escapeString(linkerKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param linkerKey  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error addonLinkersLinkerKeyValuesPut(String linkerKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'linkerKey' is set
    if (linkerKey == null) {
      throw new ApiException(400, "Missing the required parameter 'linkerKey' when calling addonLinkersLinkerKeyValuesPut");
    }
    
    // create path and map variables
    String localVarPath = "/addon/linkers/{linker_key}/values".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "linker_key" + "\\}", apiClient.escapeString(linkerKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error addonPut() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/addon".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
