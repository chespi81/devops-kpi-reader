package cl.tinet.devops.metrics.gen.bitbucket.api;

import com.sun.jersey.api.client.GenericType;

import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
import cl.tinet.devops.metrics.gen.bitbucket.model.*;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Pair;

import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedTeams;
import cl.tinet.devops.metrics.gen.bitbucket.model.Error;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedUsers;
import cl.tinet.devops.metrics.gen.bitbucket.model.Team;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedWebhookSubscriptions;
import cl.tinet.devops.metrics.gen.bitbucket.model.WebhookSubscription;
import cl.tinet.devops.metrics.gen.bitbucket.model.User;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T23:42:53.141-04:00")
public class TeamsApi {
  private ApiClient apiClient;

  public TeamsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TeamsApi(ApiClient apiClient) {
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
   * @param role  Filters the teams based on the authenticated user&#39;s role on each team.  * **member**: returns a list of all the teams which the caller is a member of   at least one team group or repository owned by the team * **contributor**: returns a list of teams which the caller has write access   to at least one repository owned by the team * **admin**: returns a list teams which the caller has team administrator access  (optional)
   * @return PaginatedTeams
   * @throws ApiException if fails to make API call
   */
  public PaginatedTeams teamsGet(String role) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/teams".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role", role));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<PaginatedTeams> localVarReturnType = new GenericType<PaginatedTeams>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param username2 The team&#39;s username (required)
   * @return PaginatedUsers
   * @throws ApiException if fails to make API call
   */
  public PaginatedUsers teamsUsernameFollowersGet(String username, String username2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling teamsUsernameFollowersGet");
    }
    
    // verify the required parameter 'username2' is set
    if (username2 == null) {
      throw new ApiException(400, "Missing the required parameter 'username2' when calling teamsUsernameFollowersGet");
    }
    
    // create path and map variables
    String localVarPath = "/teams/{username}/followers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username2.toString()));

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

    GenericType<PaginatedUsers> localVarReturnType = new GenericType<PaginatedUsers>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param username2 The team&#39;s username (required)
   * @return PaginatedUsers
   * @throws ApiException if fails to make API call
   */
  public PaginatedUsers teamsUsernameFollowingGet(String username, String username2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling teamsUsernameFollowingGet");
    }
    
    // verify the required parameter 'username2' is set
    if (username2 == null) {
      throw new ApiException(400, "Missing the required parameter 'username2' when calling teamsUsernameFollowingGet");
    }
    
    // create path and map variables
    String localVarPath = "/teams/{username}/following".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username2.toString()));

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

    GenericType<PaginatedUsers> localVarReturnType = new GenericType<PaginatedUsers>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param username2 The team&#39;s username or UUID. (required)
   * @return Team
   * @throws ApiException if fails to make API call
   */
  public Team teamsUsernameGet(String username, String username2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling teamsUsernameGet");
    }
    
    // verify the required parameter 'username2' is set
    if (username2 == null) {
      throw new ApiException(400, "Missing the required parameter 'username2' when calling teamsUsernameGet");
    }
    
    // create path and map variables
    String localVarPath = "/teams/{username}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username2.toString()));

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

    GenericType<Team> localVarReturnType = new GenericType<Team>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User teamsUsernameMembersGet(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling teamsUsernameMembersGet");
    }
    
    // create path and map variables
    String localVarPath = "/teams/{username}/members".replaceAll("\\{format\\}","json")
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

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error teamsUsernameRepositoriesGet(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling teamsUsernameRepositoriesGet");
    }
    
    // create path and map variables
    String localVarPath = "/teams/{username}/repositories".replaceAll("\\{format\\}","json")
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
  public Error usersUsernameRepositoriesGet(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling usersUsernameRepositoriesGet");
    }
    
    // create path and map variables
    String localVarPath = "/users/{username}/repositories".replaceAll("\\{format\\}","json")
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
}
