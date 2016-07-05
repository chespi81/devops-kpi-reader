package cl.tinet.devops.metrics.gen.bitbucket.api;

import com.sun.jersey.api.client.GenericType;

import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
import cl.tinet.devops.metrics.gen.bitbucket.model.*;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Pair;

import cl.tinet.devops.metrics.gen.bitbucket.model.Commitstatus;
import cl.tinet.devops.metrics.gen.bitbucket.model.Error;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedCommitstatuses;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T23:42:53.141-04:00")
public class CommitstatusesApi {
  private ApiClient apiClient;

  public CommitstatusesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CommitstatusesApi(ApiClient apiClient) {
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
}
