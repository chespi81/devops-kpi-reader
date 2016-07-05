package cl.tinet.devops.metrics.gen.bitbucket.api;

import com.sun.jersey.api.client.GenericType;

import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
import cl.tinet.devops.metrics.gen.bitbucket.model.*;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Pair;

import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedRepositories;
import cl.tinet.devops.metrics.gen.bitbucket.model.Error;
import cl.tinet.devops.metrics.gen.bitbucket.model.Commitstatus;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedCommitstatuses;
import cl.tinet.devops.metrics.gen.bitbucket.model.Repository;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedWebhookSubscriptions;
import cl.tinet.devops.metrics.gen.bitbucket.model.WebhookSubscription;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T23:42:53.141-04:00")
public class RepositoriesApi {
  private ApiClient apiClient;

  public RepositoriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RepositoriesApi(ApiClient apiClient) {
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
   * @return PaginatedRepositories
   * @throws ApiException if fails to make API call
   */
  public PaginatedRepositories repositoriesGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/repositories".replaceAll("\\{format\\}","json");

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

    GenericType<PaginatedRepositories> localVarReturnType = new GenericType<PaginatedRepositories>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param role  Filters the result based on the authenticated user&#39;s role on each repository.  * **member**: returns repositories to which the user has explicit read access * **contributor**: returns repositories to which the user has explicit write access * **admin**: returns repositories to which the user has explicit administrator access * **owner**: returns all repositories owned by the current user  (optional)
   * @return PaginatedRepositories
   * @throws ApiException if fails to make API call
   */
  public PaginatedRepositories repositoriesUsernameGet(String username, String role) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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

    GenericType<PaginatedRepositories> localVarReturnType = new GenericType<PaginatedRepositories>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param node  (required)
   * @param key  (required)
   * @param repoSlug  (required)
   * @param node2 The commit&#39;s SHA1 (required)
   * @param key2 The build status&#39; unique key (required)
   * @return Commitstatus
   * @throws ApiException if fails to make API call
   */
  public Commitstatus repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet(String username, String node, String key, String repoSlug, String node2, String key2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet");
    }
    
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet");
    }
    
    // verify the required parameter 'node2' is set
    if (node2 == null) {
      throw new ApiException(400, "Missing the required parameter 'node2' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet");
    }
    
    // verify the required parameter 'key2' is set
    if (key2 == null) {
      throw new ApiException(400, "Missing the required parameter 'key2' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/commit/{node}/statuses/build/{key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node2.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key2.toString()));

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

    GenericType<Commitstatus> localVarReturnType = new GenericType<Commitstatus>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param node  (required)
   * @param key  (required)
   * @param repoSlug  (required)
   * @param node2 The commit&#39;s SHA1 (required)
   * @param key2 The commit status&#39; unique key (required)
   * @param body The updated build status object (optional)
   * @return Commitstatus
   * @throws ApiException if fails to make API call
   */
  public Commitstatus repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut(String username, String node, String key, String repoSlug, String node2, String key2, Commitstatus body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut");
    }
    
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut");
    }
    
    // verify the required parameter 'node2' is set
    if (node2 == null) {
      throw new ApiException(400, "Missing the required parameter 'node2' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut");
    }
    
    // verify the required parameter 'key2' is set
    if (key2 == null) {
      throw new ApiException(400, "Missing the required parameter 'key2' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/commit/{node}/statuses/build/{key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node2.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key2.toString()));

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

    GenericType<Commitstatus> localVarReturnType = new GenericType<Commitstatus>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param node  (required)
   * @param repoSlug  (required)
   * @param node2 The commit&#39;s SHA1 (required)
   * @param key The commit status&#39; unique key (required)
   * @param body The new commit status object. (optional)
   * @return Commitstatus
   * @throws ApiException if fails to make API call
   */
  public Commitstatus repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost(String username, String node, String repoSlug, String node2, String key, Commitstatus body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost");
    }
    
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost");
    }
    
    // verify the required parameter 'node2' is set
    if (node2 == null) {
      throw new ApiException(400, "Missing the required parameter 'node2' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/commit/{node}/statuses/build".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node2.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    GenericType<Commitstatus> localVarReturnType = new GenericType<Commitstatus>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param node  (required)
   * @param repoSlug  (required)
   * @param node2 The commit&#39;s SHA1 (required)
   * @return PaginatedCommitstatuses
   * @throws ApiException if fails to make API call
   */
  public PaginatedCommitstatuses repositoriesUsernameRepoSlugCommitNodeStatusesGet(String username, String node, String repoSlug, String node2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugCommitNodeStatusesGet");
    }
    
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling repositoriesUsernameRepoSlugCommitNodeStatusesGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugCommitNodeStatusesGet");
    }
    
    // verify the required parameter 'node2' is set
    if (node2 == null) {
      throw new ApiException(400, "Missing the required parameter 'node2' when calling repositoriesUsernameRepoSlugCommitNodeStatusesGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/commit/{node}/statuses".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node2.toString()));

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

    GenericType<PaginatedCommitstatuses> localVarReturnType = new GenericType<PaginatedCommitstatuses>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param repoSlug  (required)
   * @throws ApiException if fails to make API call
   */
  public void repositoriesUsernameRepoSlugDelete(String username, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugDelete");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugDelete");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}".replaceAll("\\{format\\}","json")
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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param username  (required)
   * @param repoSlug  (required)
   * @return PaginatedRepositories
   * @throws ApiException if fails to make API call
   */
  public PaginatedRepositories repositoriesUsernameRepoSlugForksGet(String username, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugForksGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugForksGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/forks".replaceAll("\\{format\\}","json")
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

    GenericType<PaginatedRepositories> localVarReturnType = new GenericType<PaginatedRepositories>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param repoSlug  (required)
   * @return Repository
   * @throws ApiException if fails to make API call
   */
  public Repository repositoriesUsernameRepoSlugGet(String username, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}".replaceAll("\\{format\\}","json")
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

    GenericType<Repository> localVarReturnType = new GenericType<Repository>() {};
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
   * @param repoSlug  (required)
   * @param body The repository that is to be created. Note that most object elements are optional. Elements \&quot;owner\&quot; and \&quot;full_name\&quot; are ignored as the URL implies them. (optional)
   * @return Repository
   * @throws ApiException if fails to make API call
   */
  public Repository repositoriesUsernameRepoSlugPost(String username, String repoSlug, Repository body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugPost");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugPost");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}".replaceAll("\\{format\\}","json")
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

    GenericType<Repository> localVarReturnType = new GenericType<Repository>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param pullRequestId  (required)
   * @param repoSlug  (required)
   * @param pullRequestId2 The pull request&#39;s id (required)
   * @return PaginatedCommitstatuses
   * @throws ApiException if fails to make API call
   */
  public PaginatedCommitstatuses repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet(String username, String pullRequestId, String repoSlug, Integer pullRequestId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet");
    }
    
    // verify the required parameter 'pullRequestId2' is set
    if (pullRequestId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId2' when calling repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/statuses".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "pull_request_id" + "\\}", apiClient.escapeString(pullRequestId.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "pull_request_id" + "\\}", apiClient.escapeString(pullRequestId2.toString()));

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

    GenericType<PaginatedCommitstatuses> localVarReturnType = new GenericType<PaginatedCommitstatuses>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param repoSlug  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error repositoriesUsernameRepoSlugWatchersGet(String username, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugWatchersGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugWatchersGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/watchers".replaceAll("\\{format\\}","json")
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

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
