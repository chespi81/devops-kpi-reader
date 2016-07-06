package cl.tinet.devops.metrics.gen.bitbucket.api;

import com.sun.jersey.api.client.GenericType;

import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
import cl.tinet.devops.metrics.gen.bitbucket.model.*;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Pair;

import cl.tinet.devops.metrics.gen.bitbucket.model.Error;
import cl.tinet.devops.metrics.gen.bitbucket.model.Component;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedComponents;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedIssues;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedIssueAttachments;
import cl.tinet.devops.metrics.gen.bitbucket.model.Issue;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedMilestones;
import cl.tinet.devops.metrics.gen.bitbucket.model.Milestone;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedVersions;
import cl.tinet.devops.metrics.gen.bitbucket.model.Version;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T23:42:53.141-04:00")
public class IssuetrackerApi {
  private ApiClient apiClient;

  public IssuetrackerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssuetrackerApi(ApiClient apiClient) {
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
   * @param componentId  (required)
   * @param repoSlug  (required)
   * @param componentId2 The component&#39;s id (required)
   * @return Component
   * @throws ApiException if fails to make API call
   */
  public Component repositoriesUsernameRepoSlugComponentsComponentIdGet(String username, String componentId, String repoSlug, Integer componentId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugComponentsComponentIdGet");
    }
    
    // verify the required parameter 'componentId' is set
    if (componentId == null) {
      throw new ApiException(400, "Missing the required parameter 'componentId' when calling repositoriesUsernameRepoSlugComponentsComponentIdGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugComponentsComponentIdGet");
    }
    
    // verify the required parameter 'componentId2' is set
    if (componentId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'componentId2' when calling repositoriesUsernameRepoSlugComponentsComponentIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/components/{component_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "component_id" + "\\}", apiClient.escapeString(componentId.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "component_id" + "\\}", apiClient.escapeString(componentId2.toString()));

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

    GenericType<Component> localVarReturnType = new GenericType<Component>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param repoSlug  (required)
   * @return PaginatedComponents
   * @throws ApiException if fails to make API call
   */
  public PaginatedComponents repositoriesUsernameRepoSlugComponentsGet(String username, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugComponentsGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugComponentsGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/components".replaceAll("\\{format\\}","json")
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

    GenericType<PaginatedComponents> localVarReturnType = new GenericType<PaginatedComponents>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param repoSlug  (required)
   * @return PaginatedIssues
   * @throws ApiException if fails to make API call
   */
  public PaginatedIssues repositoriesUsernameRepoSlugIssuesGet(String username, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugIssuesGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugIssuesGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/issues".replaceAll("\\{format\\}","json")
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

    GenericType<PaginatedIssues> localVarReturnType = new GenericType<PaginatedIssues>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param issueId  (required)
   * @param repoSlug  (required)
   * @param issueId2 The issue&#39;s id (required)
   * @return PaginatedIssueAttachments
   * @throws ApiException if fails to make API call
   */
  public PaginatedIssueAttachments repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsGet(String username, String issueId, String repoSlug, Integer issueId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsGet");
    }
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsGet");
    }
    
    // verify the required parameter 'issueId2' is set
    if (issueId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId2' when calling repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/issues/{issue_id}/attachments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId2.toString()));

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

    GenericType<PaginatedIssueAttachments> localVarReturnType = new GenericType<PaginatedIssueAttachments>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param path  (required)
   * @param issueId  (required)
   * @param repoSlug  (required)
   * @throws ApiException if fails to make API call
   */
  public void repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathDelete(String username, String path, String issueId, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathDelete");
    }
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathDelete");
    }
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathDelete");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathDelete");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/issues/{issue_id}/attachments/{path}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()))
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
   * @param path  (required)
   * @param issueId  (required)
   * @param repoSlug  (required)
   * @throws ApiException if fails to make API call
   */
  public void repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathGet(String username, String path, String issueId, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathGet");
    }
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathGet");
    }
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/issues/{issue_id}/attachments/{path}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()))
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


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param username  (required)
   * @param issueId  (required)
   * @param repoSlug  (required)
   * @param issueId2 The issue&#39;s id (required)
   * @throws ApiException if fails to make API call
   */
  public void repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPost(String username, String issueId, String repoSlug, Integer issueId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPost");
    }
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPost");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPost");
    }
    
    // verify the required parameter 'issueId2' is set
    if (issueId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId2' when calling repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPost");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/issues/{issue_id}/attachments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId2.toString()));

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param username  (required)
   * @param commentId  (required)
   * @param issueId  (required)
   * @param repoSlug  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error repositoriesUsernameRepoSlugIssuesIssueIdCommentsCommentIdGet(String username, String commentId, String issueId, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugIssuesIssueIdCommentsCommentIdGet");
    }
    
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling repositoriesUsernameRepoSlugIssuesIssueIdCommentsCommentIdGet");
    }
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling repositoriesUsernameRepoSlugIssuesIssueIdCommentsCommentIdGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugIssuesIssueIdCommentsCommentIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/issues/{issue_id}/comments/{comment_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "comment_id" + "\\}", apiClient.escapeString(commentId.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()))
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
  /**
   * 
   * 
   * @param username  (required)
   * @param issueId  (required)
   * @param repoSlug  (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error repositoriesUsernameRepoSlugIssuesIssueIdCommentsGet(String username, String issueId, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugIssuesIssueIdCommentsGet");
    }
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling repositoriesUsernameRepoSlugIssuesIssueIdCommentsGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugIssuesIssueIdCommentsGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/issues/{issue_id}/comments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()))
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
  /**
   * 
   * 
   * @param username  (required)
   * @param issueId  (required)
   * @param repoSlug  (required)
   * @return Issue
   * @throws ApiException if fails to make API call
   */
  public Issue repositoriesUsernameRepoSlugIssuesIssueIdDelete(String username, String issueId, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugIssuesIssueIdDelete");
    }
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling repositoriesUsernameRepoSlugIssuesIssueIdDelete");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugIssuesIssueIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/issues/{issue_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()))
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

    GenericType<Issue> localVarReturnType = new GenericType<Issue>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param issueId  (required)
   * @param repoSlug  (required)
   * @return Issue
   * @throws ApiException if fails to make API call
   */
  public Issue repositoriesUsernameRepoSlugIssuesIssueIdGet(String username, String issueId, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugIssuesIssueIdGet");
    }
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling repositoriesUsernameRepoSlugIssuesIssueIdGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugIssuesIssueIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/issues/{issue_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()))
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

    GenericType<Issue> localVarReturnType = new GenericType<Issue>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param issueId  (required)
   * @param repoSlug  (required)
   * @param issueId2 The issue&#39;s id (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error repositoriesUsernameRepoSlugIssuesIssueIdVoteDelete(String username, String issueId, String repoSlug, Integer issueId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugIssuesIssueIdVoteDelete");
    }
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling repositoriesUsernameRepoSlugIssuesIssueIdVoteDelete");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugIssuesIssueIdVoteDelete");
    }
    
    // verify the required parameter 'issueId2' is set
    if (issueId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId2' when calling repositoriesUsernameRepoSlugIssuesIssueIdVoteDelete");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/issues/{issue_id}/vote".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId2.toString()));

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
   * @param issueId  (required)
   * @param repoSlug  (required)
   * @param issueId2 The issue&#39;s id (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error repositoriesUsernameRepoSlugIssuesIssueIdVoteGet(String username, String issueId, String repoSlug, Integer issueId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugIssuesIssueIdVoteGet");
    }
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling repositoriesUsernameRepoSlugIssuesIssueIdVoteGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugIssuesIssueIdVoteGet");
    }
    
    // verify the required parameter 'issueId2' is set
    if (issueId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId2' when calling repositoriesUsernameRepoSlugIssuesIssueIdVoteGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/issues/{issue_id}/vote".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId2.toString()));

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
   * @param issueId  (required)
   * @param repoSlug  (required)
   * @param issueId2 The issue&#39;s id (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error repositoriesUsernameRepoSlugIssuesIssueIdVotePut(String username, String issueId, String repoSlug, Integer issueId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugIssuesIssueIdVotePut");
    }
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling repositoriesUsernameRepoSlugIssuesIssueIdVotePut");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugIssuesIssueIdVotePut");
    }
    
    // verify the required parameter 'issueId2' is set
    if (issueId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId2' when calling repositoriesUsernameRepoSlugIssuesIssueIdVotePut");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/issues/{issue_id}/vote".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId2.toString()));

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
   * @param issueId  (required)
   * @param repoSlug  (required)
   * @param issueId2 The issue&#39;s id (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error repositoriesUsernameRepoSlugIssuesIssueIdWatchDelete(String username, String issueId, String repoSlug, Integer issueId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugIssuesIssueIdWatchDelete");
    }
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling repositoriesUsernameRepoSlugIssuesIssueIdWatchDelete");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugIssuesIssueIdWatchDelete");
    }
    
    // verify the required parameter 'issueId2' is set
    if (issueId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId2' when calling repositoriesUsernameRepoSlugIssuesIssueIdWatchDelete");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/issues/{issue_id}/watch".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId2.toString()));

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
   * @param issueId  (required)
   * @param repoSlug  (required)
   * @param issueId2 The issue&#39;s id (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error repositoriesUsernameRepoSlugIssuesIssueIdWatchGet(String username, String issueId, String repoSlug, Integer issueId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugIssuesIssueIdWatchGet");
    }
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling repositoriesUsernameRepoSlugIssuesIssueIdWatchGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugIssuesIssueIdWatchGet");
    }
    
    // verify the required parameter 'issueId2' is set
    if (issueId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId2' when calling repositoriesUsernameRepoSlugIssuesIssueIdWatchGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/issues/{issue_id}/watch".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId2.toString()));

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
   * @param issueId  (required)
   * @param repoSlug  (required)
   * @param issueId2 The issue&#39;s id (required)
   * @return Error
   * @throws ApiException if fails to make API call
   */
  public Error repositoriesUsernameRepoSlugIssuesIssueIdWatchPut(String username, String issueId, String repoSlug, Integer issueId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugIssuesIssueIdWatchPut");
    }
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling repositoriesUsernameRepoSlugIssuesIssueIdWatchPut");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugIssuesIssueIdWatchPut");
    }
    
    // verify the required parameter 'issueId2' is set
    if (issueId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId2' when calling repositoriesUsernameRepoSlugIssuesIssueIdWatchPut");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/issues/{issue_id}/watch".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId2.toString()));

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
   * @param repoSlug  (required)
   * @param body The new issue. Note that the only required element is &#x60;title&#x60;. All other elements can be omitted from the body. (required)
   * @return Issue
   * @throws ApiException if fails to make API call
   */
  public Issue repositoriesUsernameRepoSlugIssuesPost(String username, String repoSlug, Issue body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugIssuesPost");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugIssuesPost");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling repositoriesUsernameRepoSlugIssuesPost");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/issues".replaceAll("\\{format\\}","json")
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

    GenericType<Issue> localVarReturnType = new GenericType<Issue>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param repoSlug  (required)
   * @return PaginatedMilestones
   * @throws ApiException if fails to make API call
   */
  public PaginatedMilestones repositoriesUsernameRepoSlugMilestonesGet(String username, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugMilestonesGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugMilestonesGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/milestones".replaceAll("\\{format\\}","json")
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

    GenericType<PaginatedMilestones> localVarReturnType = new GenericType<PaginatedMilestones>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param milestoneId  (required)
   * @param repoSlug  (required)
   * @param milestoneId2 The milestone&#39;s id (required)
   * @return Milestone
   * @throws ApiException if fails to make API call
   */
  public Milestone repositoriesUsernameRepoSlugMilestonesMilestoneIdGet(String username, String milestoneId, String repoSlug, Integer milestoneId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugMilestonesMilestoneIdGet");
    }
    
    // verify the required parameter 'milestoneId' is set
    if (milestoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'milestoneId' when calling repositoriesUsernameRepoSlugMilestonesMilestoneIdGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugMilestonesMilestoneIdGet");
    }
    
    // verify the required parameter 'milestoneId2' is set
    if (milestoneId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'milestoneId2' when calling repositoriesUsernameRepoSlugMilestonesMilestoneIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/milestones/{milestone_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "milestone_id" + "\\}", apiClient.escapeString(milestoneId.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "milestone_id" + "\\}", apiClient.escapeString(milestoneId2.toString()));

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

    GenericType<Milestone> localVarReturnType = new GenericType<Milestone>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param repoSlug  (required)
   * @return PaginatedVersions
   * @throws ApiException if fails to make API call
   */
  public PaginatedVersions repositoriesUsernameRepoSlugVersionsGet(String username, String repoSlug) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugVersionsGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugVersionsGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/versions".replaceAll("\\{format\\}","json")
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

    GenericType<PaginatedVersions> localVarReturnType = new GenericType<PaginatedVersions>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param versionId  (required)
   * @param repoSlug  (required)
   * @param versionId2 The version&#39;s id (required)
   * @return Version
   * @throws ApiException if fails to make API call
   */
  public Version repositoriesUsernameRepoSlugVersionsVersionIdGet(String username, String versionId, String repoSlug, Integer versionId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling repositoriesUsernameRepoSlugVersionsVersionIdGet");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling repositoriesUsernameRepoSlugVersionsVersionIdGet");
    }
    
    // verify the required parameter 'repoSlug' is set
    if (repoSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'repoSlug' when calling repositoriesUsernameRepoSlugVersionsVersionIdGet");
    }
    
    // verify the required parameter 'versionId2' is set
    if (versionId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId2' when calling repositoriesUsernameRepoSlugVersionsVersionIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/repositories/{username}/{repo_slug}/versions/{version_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "version_id" + "\\}", apiClient.escapeString(versionId.toString()))
      .replaceAll("\\{" + "repo_slug" + "\\}", apiClient.escapeString(repoSlug.toString()))
      .replaceAll("\\{" + "version_id" + "\\}", apiClient.escapeString(versionId2.toString()));

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

    GenericType<Version> localVarReturnType = new GenericType<Version>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
