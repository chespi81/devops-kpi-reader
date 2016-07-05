package cl.tinet.devops.metrics.gen.bitbucket.api;

import com.sun.jersey.api.client.GenericType;

import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
import cl.tinet.devops.metrics.gen.bitbucket.model.*;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Pair;

import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedBranchrestrictions;
import cl.tinet.devops.metrics.gen.bitbucket.model.Error;
import cl.tinet.devops.metrics.gen.bitbucket.model.Branchrestriction;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T23:42:53.141-04:00")
public class BranchrestrictionsApi {
  private ApiClient apiClient;

  public BranchrestrictionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BranchrestrictionsApi(ApiClient apiClient) {
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
   * @param repoSlug  (required)
   * @return PaginatedBranchrestrictions
   * @throws ApiException if fails to make API call
   */
  public PaginatedBranchrestrictions repositoriesUsernameRepoSlugBranchRestrictionsGet(String username, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugBranchRestrictionsGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugBranchRestrictionsGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/branch-restrictions".replaceAll("\\{format\\}","json")
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

    GenericType<PaginatedBranchrestrictions> localVarReturnType = new GenericType<PaginatedBranchrestrictions>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param id  (required)
   * @param repoSlug  (required)
   * @param id2 The restriction rule&#39;s id (required)
   * @throws ApiException if fails to make API call
   */
  public void repositoriesUsernameRepoSlugBranchRestrictionsIdDelete(String username, String id, String repoSlug, String id2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugBranchRestrictionsIdDelete");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling repositoriesUsernameRepoSlugBranchRestrictionsIdDelete");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugBranchRestrictionsIdDelete");
    }
    
    // verify the required parameter 'id2' is set
    if (id2 == null) {
      throw new ApiException(400, "Missing the required parameter 'id2' when calling repositoriesUsernameRepoSlugBranchRestrictionsIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/branch-restrictions/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id2.toString()));

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
   * @param id  (required)
   * @param repoSlug  (required)
   * @param id2 The restriction rule&#39;s id (required)
   * @return Branchrestriction
   * @throws ApiException if fails to make API call
   */
  public Branchrestriction repositoriesUsernameRepoSlugBranchRestrictionsIdGet(String username, String id, String repoSlug, String id2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugBranchRestrictionsIdGet");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling repositoriesUsernameRepoSlugBranchRestrictionsIdGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugBranchRestrictionsIdGet");
    }
    
    // verify the required parameter 'id2' is set
    if (id2 == null) {
      throw new ApiException(400, "Missing the required parameter 'id2' when calling repositoriesUsernameRepoSlugBranchRestrictionsIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/branch-restrictions/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id2.toString()));

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

    GenericType<Branchrestriction> localVarReturnType = new GenericType<Branchrestriction>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param id  (required)
   * @param repoSlug  (required)
   * @param id2 The restriction rule&#39;s id (required)
   * @param body The new version of the existing rule (required)
   * @return Branchrestriction
   * @throws ApiException if fails to make API call
   */
  public Branchrestriction repositoriesUsernameRepoSlugBranchRestrictionsIdPut(String username, String id, String repoSlug, String id2, Branchrestriction body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugBranchRestrictionsIdPut");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling repositoriesUsernameRepoSlugBranchRestrictionsIdPut");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugBranchRestrictionsIdPut");
    }
    
    // verify the required parameter 'id2' is set
    if (id2 == null) {
      throw new ApiException(400, "Missing the required parameter 'id2' when calling repositoriesUsernameRepoSlugBranchRestrictionsIdPut");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling repositoriesUsernameRepoSlugBranchRestrictionsIdPut");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/branch-restrictions/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id2.toString()));

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

    GenericType<Branchrestriction> localVarReturnType = new GenericType<Branchrestriction>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param repoSlug  (required)
   * @param body The new rule (required)
   * @return Branchrestriction
   * @throws ApiException if fails to make API call
   */
  public Branchrestriction repositoriesUsernameRepoSlugBranchRestrictionsPost(String username, String repoSlug, Branchrestriction body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugBranchRestrictionsPost");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugBranchRestrictionsPost");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling repositoriesUsernameRepoSlugBranchRestrictionsPost");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/branch-restrictions".replaceAll("\\{format\\}","json")
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

    GenericType<Branchrestriction> localVarReturnType = new GenericType<Branchrestriction>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
