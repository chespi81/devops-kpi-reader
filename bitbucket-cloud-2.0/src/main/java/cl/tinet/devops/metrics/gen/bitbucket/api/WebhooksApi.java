package cl.tinet.devops.metrics.gen.bitbucket.api;

import com.sun.jersey.api.client.GenericType;

import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
import cl.tinet.devops.metrics.gen.bitbucket.model.*;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Pair;

import cl.tinet.devops.metrics.gen.bitbucket.model.SubjectTypes;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedHookEvents;
import cl.tinet.devops.metrics.gen.bitbucket.model.Error;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedWebhookSubscriptions;
import cl.tinet.devops.metrics.gen.bitbucket.model.WebhookSubscription;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T23:42:53.141-04:00")
public class WebhooksApi {
  private ApiClient apiClient;

  public WebhooksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebhooksApi(ApiClient apiClient) {
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
   * @return SubjectTypes
   * @throws ApiException if fails to make API call
   */
  public SubjectTypes hookEventsGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/hook_events".replaceAll("\\{format\\}","json");

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

    GenericType<SubjectTypes> localVarReturnType = new GenericType<SubjectTypes>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param subjectType  (required)
   * @param subjectType2 A resource or subject type. (required)
   * @return PaginatedHookEvents
   * @throws ApiException if fails to make API call
   */
  public PaginatedHookEvents hookEventsSubjectTypeGet(String subjectType, String subjectType2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'subjectType' is set
    if (subjectType == null) {
      throw new ApiException(400, "Missing the required parameter 'subjectType' when calling hookEventsSubjectTypeGet");
    }
    
    // verify the required parameter 'subjectType2' is set
    if (subjectType2 == null) {
      throw new ApiException(400, "Missing the required parameter 'subjectType2' when calling hookEventsSubjectTypeGet");
    }
    
    // create path and map variables
    String localVarPath = "/hook_events/{subject_type}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "subject_type" + "\\}", apiClient.escapeString(subjectType.toString()))
      .replaceAll("\\{" + "subject_type" + "\\}", apiClient.escapeString(subjectType2.toString()));

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

    GenericType<PaginatedHookEvents> localVarReturnType = new GenericType<PaginatedHookEvents>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param repoSlug  (required)
   * @return PaginatedWebhookSubscriptions
   * @throws ApiException if fails to make API call
   */
  public PaginatedWebhookSubscriptions repositoriesUsernameRepoSlugHooksGet(String username, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugHooksGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugHooksGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/hooks".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()));

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

    GenericType<PaginatedWebhookSubscriptions> localVarReturnType = new GenericType<PaginatedWebhookSubscriptions>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param repoSlug  (required)
   * @return WebhookSubscription
   * @throws ApiException if fails to make API call
   */
  public WebhookSubscription repositoriesUsernameRepoSlugHooksPost(String username, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugHooksPost");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugHooksPost");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/hooks".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()));

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

    GenericType<WebhookSubscription> localVarReturnType = new GenericType<WebhookSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param uid  (required)
   * @param repoSlug  (required)
   * @param uid2 The installed webhook&#39;s id (required)
   * @throws ApiException if fails to make API call
   */
  public void repositoriesUsernameRepoSlugHooksUidDelete(String username, String uid, String repoSlug, String uid2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugHooksUidDelete");
    }
    
    // verify the required parameter 'uid' is set
    if (uid == null) {
      throw new ApiException(400, "Missing the required parameter 'uid' when calling repositoriesUsernameRepoSlugHooksUidDelete");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugHooksUidDelete");
    }
    
    // verify the required parameter 'uid2' is set
    if (uid2 == null) {
      throw new ApiException(400, "Missing the required parameter 'uid2' when calling repositoriesUsernameRepoSlugHooksUidDelete");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/hooks/{uid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid2.toString()));

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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param username  (required)
   * @param uid  (required)
   * @param repoSlug  (required)
   * @param uid2 The installed webhook&#39;s id. (required)
   * @return WebhookSubscription
   * @throws ApiException if fails to make API call
   */
  public WebhookSubscription repositoriesUsernameRepoSlugHooksUidGet(String username, String uid, String repoSlug, String uid2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugHooksUidGet");
    }
    
    // verify the required parameter 'uid' is set
    if (uid == null) {
      throw new ApiException(400, "Missing the required parameter 'uid' when calling repositoriesUsernameRepoSlugHooksUidGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugHooksUidGet");
    }
    
    // verify the required parameter 'uid2' is set
    if (uid2 == null) {
      throw new ApiException(400, "Missing the required parameter 'uid2' when calling repositoriesUsernameRepoSlugHooksUidGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/hooks/{uid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid2.toString()));

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

    GenericType<WebhookSubscription> localVarReturnType = new GenericType<WebhookSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param uid  (required)
   * @param repoSlug  (required)
   * @param uid2 The installed webhook&#39;s id (required)
   * @return WebhookSubscription
   * @throws ApiException if fails to make API call
   */
  public WebhookSubscription repositoriesUsernameRepoSlugHooksUidPut(String username, String uid, String repoSlug, String uid2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugHooksUidPut");
    }
    
    // verify the required parameter 'uid' is set
    if (uid == null) {
      throw new ApiException(400, "Missing the required parameter 'uid' when calling repositoriesUsernameRepoSlugHooksUidPut");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugHooksUidPut");
    }
    
    // verify the required parameter 'uid2' is set
    if (uid2 == null) {
      throw new ApiException(400, "Missing the required parameter 'uid2' when calling repositoriesUsernameRepoSlugHooksUidPut");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/hooks/{uid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid2.toString()));

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

    GenericType<WebhookSubscription> localVarReturnType = new GenericType<WebhookSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @return PaginatedWebhookSubscriptions
   * @throws ApiException if fails to make API call
   */
  public PaginatedWebhookSubscriptions teamsUsernameHooksGet(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling teamsUsernameHooksGet");
    }
    
    // create path and map variables
    String localVarPath = "/teams/{username}/hooks".replaceAll("\\{format\\}","json")
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

    GenericType<PaginatedWebhookSubscriptions> localVarReturnType = new GenericType<PaginatedWebhookSubscriptions>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @return WebhookSubscription
   * @throws ApiException if fails to make API call
   */
  public WebhookSubscription teamsUsernameHooksPost(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling teamsUsernameHooksPost");
    }
    
    // create path and map variables
    String localVarPath = "/teams/{username}/hooks".replaceAll("\\{format\\}","json")
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

    GenericType<WebhookSubscription> localVarReturnType = new GenericType<WebhookSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param uid  (required)
   * @param uid2 The installed webhook&#39;s id (required)
   * @throws ApiException if fails to make API call
   */
  public void teamsUsernameHooksUidDelete(String username, String uid, String uid2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling teamsUsernameHooksUidDelete");
    }
    
    // verify the required parameter 'uid' is set
    if (uid == null) {
      throw new ApiException(400, "Missing the required parameter 'uid' when calling teamsUsernameHooksUidDelete");
    }
    
    // verify the required parameter 'uid2' is set
    if (uid2 == null) {
      throw new ApiException(400, "Missing the required parameter 'uid2' when calling teamsUsernameHooksUidDelete");
    }
    
    // create path and map variables
    String localVarPath = "/teams/{username}/hooks/{uid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid2.toString()));

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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param username  (required)
   * @param uid  (required)
   * @param uid2 The installed webhook&#39;s id. (required)
   * @return WebhookSubscription
   * @throws ApiException if fails to make API call
   */
  public WebhookSubscription teamsUsernameHooksUidGet(String username, String uid, String uid2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling teamsUsernameHooksUidGet");
    }
    
    // verify the required parameter 'uid' is set
    if (uid == null) {
      throw new ApiException(400, "Missing the required parameter 'uid' when calling teamsUsernameHooksUidGet");
    }
    
    // verify the required parameter 'uid2' is set
    if (uid2 == null) {
      throw new ApiException(400, "Missing the required parameter 'uid2' when calling teamsUsernameHooksUidGet");
    }
    
    // create path and map variables
    String localVarPath = "/teams/{username}/hooks/{uid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid2.toString()));

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

    GenericType<WebhookSubscription> localVarReturnType = new GenericType<WebhookSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param uid  (required)
   * @param uid2 The installed webhook&#39;s id (required)
   * @return WebhookSubscription
   * @throws ApiException if fails to make API call
   */
  public WebhookSubscription teamsUsernameHooksUidPut(String username, String uid, String uid2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling teamsUsernameHooksUidPut");
    }
    
    // verify the required parameter 'uid' is set
    if (uid == null) {
      throw new ApiException(400, "Missing the required parameter 'uid' when calling teamsUsernameHooksUidPut");
    }
    
    // verify the required parameter 'uid2' is set
    if (uid2 == null) {
      throw new ApiException(400, "Missing the required parameter 'uid2' when calling teamsUsernameHooksUidPut");
    }
    
    // create path and map variables
    String localVarPath = "/teams/{username}/hooks/{uid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid2.toString()));

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

    GenericType<WebhookSubscription> localVarReturnType = new GenericType<WebhookSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @return PaginatedWebhookSubscriptions
   * @throws ApiException if fails to make API call
   */
  public PaginatedWebhookSubscriptions usersUsernameHooksGet(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling usersUsernameHooksGet");
    }
    
    // create path and map variables
    String localVarPath = "/users/{username}/hooks".replaceAll("\\{format\\}","json")
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

    GenericType<PaginatedWebhookSubscriptions> localVarReturnType = new GenericType<PaginatedWebhookSubscriptions>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @return WebhookSubscription
   * @throws ApiException if fails to make API call
   */
  public WebhookSubscription usersUsernameHooksPost(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling usersUsernameHooksPost");
    }
    
    // create path and map variables
    String localVarPath = "/users/{username}/hooks".replaceAll("\\{format\\}","json")
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

    GenericType<WebhookSubscription> localVarReturnType = new GenericType<WebhookSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param uid  (required)
   * @param uid2 The installed webhook&#39;s id (required)
   * @throws ApiException if fails to make API call
   */
  public void usersUsernameHooksUidDelete(String username, String uid, String uid2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling usersUsernameHooksUidDelete");
    }
    
    // verify the required parameter 'uid' is set
    if (uid == null) {
      throw new ApiException(400, "Missing the required parameter 'uid' when calling usersUsernameHooksUidDelete");
    }
    
    // verify the required parameter 'uid2' is set
    if (uid2 == null) {
      throw new ApiException(400, "Missing the required parameter 'uid2' when calling usersUsernameHooksUidDelete");
    }
    
    // create path and map variables
    String localVarPath = "/users/{username}/hooks/{uid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid2.toString()));

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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param username  (required)
   * @param uid  (required)
   * @param uid2 The installed webhook&#39;s id. (required)
   * @return WebhookSubscription
   * @throws ApiException if fails to make API call
   */
  public WebhookSubscription usersUsernameHooksUidGet(String username, String uid, String uid2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling usersUsernameHooksUidGet");
    }
    
    // verify the required parameter 'uid' is set
    if (uid == null) {
      throw new ApiException(400, "Missing the required parameter 'uid' when calling usersUsernameHooksUidGet");
    }
    
    // verify the required parameter 'uid2' is set
    if (uid2 == null) {
      throw new ApiException(400, "Missing the required parameter 'uid2' when calling usersUsernameHooksUidGet");
    }
    
    // create path and map variables
    String localVarPath = "/users/{username}/hooks/{uid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid2.toString()));

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

    GenericType<WebhookSubscription> localVarReturnType = new GenericType<WebhookSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param uid  (required)
   * @param uid2 The installed webhook&#39;s id (required)
   * @return WebhookSubscription
   * @throws ApiException if fails to make API call
   */
  public WebhookSubscription usersUsernameHooksUidPut(String username, String uid, String uid2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling usersUsernameHooksUidPut");
    }
    
    // verify the required parameter 'uid' is set
    if (uid == null) {
      throw new ApiException(400, "Missing the required parameter 'uid' when calling usersUsernameHooksUidPut");
    }
    
    // verify the required parameter 'uid2' is set
    if (uid2 == null) {
      throw new ApiException(400, "Missing the required parameter 'uid2' when calling usersUsernameHooksUidPut");
    }
    
    // create path and map variables
    String localVarPath = "/users/{username}/hooks/{uid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid.toString()))
      .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid2.toString()));

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

    GenericType<WebhookSubscription> localVarReturnType = new GenericType<WebhookSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
