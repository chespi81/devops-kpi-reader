package cl.tinet.devops.metrics.gen.bitbucket.api;

import com.sun.jersey.api.client.GenericType;

import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
import cl.tinet.devops.metrics.gen.bitbucket.model.*;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Pair;

import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedSnippets;
import cl.tinet.devops.metrics.gen.bitbucket.model.Error;
import cl.tinet.devops.metrics.gen.bitbucket.model.Snippet;
import cl.tinet.devops.metrics.gen.bitbucket.model.SnippetComment;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedSnippetComments;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedSnippetCommit;
import cl.tinet.devops.metrics.gen.bitbucket.model.SnippetCommit;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedUsers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T23:42:53.141-04:00")
public class SnippetsApi {
  private ApiClient apiClient;

  public SnippetsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SnippetsApi(ApiClient apiClient) {
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
   * @param role Filter down the result based on the authenticated user&#39;s role (&#x60;owner&#x60;, &#x60;contributor&#x60;, or &#x60;member&#x60;). (optional)
   * @return PaginatedSnippets
   * @throws ApiException if fails to make API call
   */
  public PaginatedSnippets snippetsGet(String role) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/snippets".replaceAll("\\{format\\}","json");

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

    GenericType<PaginatedSnippets> localVarReturnType = new GenericType<PaginatedSnippets>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param body The new snippet object. (required)
   * @return Snippet
   * @throws ApiException if fails to make API call
   */
  public Snippet snippetsPost(Snippet body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling snippetsPost");
    }
    
    // create path and map variables
    String localVarPath = "/snippets".replaceAll("\\{format\\}","json");

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

    GenericType<Snippet> localVarReturnType = new GenericType<Snippet>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param commentId  (required)
   * @param encodedId  (required)
   * @throws ApiException if fails to make API call
   */
  public void snippetsUsernameEncodedIdCommentsCommentIdDelete(String username, String commentId, String encodedId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdCommentsCommentIdDelete");
    }
    
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling snippetsUsernameEncodedIdCommentsCommentIdDelete");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdCommentsCommentIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/comments/{comment_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "comment_id" + "\\}", apiClient.escapeString(commentId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()));

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
   * @param commentId  (required)
   * @param encodedId  (required)
   * @return SnippetComment
   * @throws ApiException if fails to make API call
   */
  public SnippetComment snippetsUsernameEncodedIdCommentsCommentIdGet(String username, String commentId, String encodedId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdCommentsCommentIdGet");
    }
    
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling snippetsUsernameEncodedIdCommentsCommentIdGet");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdCommentsCommentIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/comments/{comment_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "comment_id" + "\\}", apiClient.escapeString(commentId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()));

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

    GenericType<SnippetComment> localVarReturnType = new GenericType<SnippetComment>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param commentId  (required)
   * @param encodedId  (required)
   * @throws ApiException if fails to make API call
   */
  public void snippetsUsernameEncodedIdCommentsCommentIdPut(String username, String commentId, String encodedId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdCommentsCommentIdPut");
    }
    
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling snippetsUsernameEncodedIdCommentsCommentIdPut");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdCommentsCommentIdPut");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/comments/{comment_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "comment_id" + "\\}", apiClient.escapeString(commentId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()));

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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param username  (required)
   * @param encodedId  (required)
   * @return PaginatedSnippetComments
   * @throws ApiException if fails to make API call
   */
  public PaginatedSnippetComments snippetsUsernameEncodedIdCommentsGet(String username, String encodedId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdCommentsGet");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdCommentsGet");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/comments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()));

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

    GenericType<PaginatedSnippetComments> localVarReturnType = new GenericType<PaginatedSnippetComments>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param encodedId  (required)
   * @param body The contents of the new comment. (required)
   * @return Snippet
   * @throws ApiException if fails to make API call
   */
  public Snippet snippetsUsernameEncodedIdCommentsPost(String username, String encodedId, Snippet body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdCommentsPost");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdCommentsPost");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling snippetsUsernameEncodedIdCommentsPost");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/comments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()));

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

    GenericType<Snippet> localVarReturnType = new GenericType<Snippet>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param encodedId  (required)
   * @return PaginatedSnippetCommit
   * @throws ApiException if fails to make API call
   */
  public PaginatedSnippetCommit snippetsUsernameEncodedIdCommitsGet(String username, String encodedId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdCommitsGet");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdCommitsGet");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/commits".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()));

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

    GenericType<PaginatedSnippetCommit> localVarReturnType = new GenericType<PaginatedSnippetCommit>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param encodedId  (required)
   * @param revision  (required)
   * @return SnippetCommit
   * @throws ApiException if fails to make API call
   */
  public SnippetCommit snippetsUsernameEncodedIdCommitsRevisionGet(String username, String encodedId, String revision) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdCommitsRevisionGet");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdCommitsRevisionGet");
    }
    
    // verify the required parameter 'revision' is set
    if (revision == null) {
      throw new ApiException(400, "Missing the required parameter 'revision' when calling snippetsUsernameEncodedIdCommitsRevisionGet");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/commits/{revision}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()))
      .replaceAll("\\{" + "revision" + "\\}", apiClient.escapeString(revision.toString()));

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

    GenericType<SnippetCommit> localVarReturnType = new GenericType<SnippetCommit>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param encodedId  (required)
   * @param encodedId2 The snippet&#39;s id. (required)
   * @throws ApiException if fails to make API call
   */
  public void snippetsUsernameEncodedIdDelete(String username, String encodedId, String encodedId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdDelete");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdDelete");
    }
    
    // verify the required parameter 'encodedId2' is set
    if (encodedId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId2' when calling snippetsUsernameEncodedIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId2.toString()));

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
   * @param encodedId  (required)
   * @param encodedId2 The snippet&#39;s id. (required)
   * @return Snippet
   * @throws ApiException if fails to make API call
   */
  public Snippet snippetsUsernameEncodedIdGet(String username, String encodedId, String encodedId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdGet");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdGet");
    }
    
    // verify the required parameter 'encodedId2' is set
    if (encodedId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId2' when calling snippetsUsernameEncodedIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId2.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json", "multipart/related", "multipart/form-data"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Snippet> localVarReturnType = new GenericType<Snippet>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param nodeId  (required)
   * @param encodedId  (required)
   * @param encodedId2 The snippet&#39;s id. (required)
   * @throws ApiException if fails to make API call
   */
  public void snippetsUsernameEncodedIdNodeIdDelete(String username, String nodeId, String encodedId, String encodedId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdNodeIdDelete");
    }
    
    // verify the required parameter 'nodeId' is set
    if (nodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeId' when calling snippetsUsernameEncodedIdNodeIdDelete");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdNodeIdDelete");
    }
    
    // verify the required parameter 'encodedId2' is set
    if (encodedId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId2' when calling snippetsUsernameEncodedIdNodeIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/{node_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "node_id" + "\\}", apiClient.escapeString(nodeId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId2.toString()));

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
   * @param nodeId  (required)
   * @param encodedId  (required)
   * @throws ApiException if fails to make API call
   */
  public void snippetsUsernameEncodedIdNodeIdFilesPathGet(String username, String path, String nodeId, String encodedId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdNodeIdFilesPathGet");
    }
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling snippetsUsernameEncodedIdNodeIdFilesPathGet");
    }
    
    // verify the required parameter 'nodeId' is set
    if (nodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeId' when calling snippetsUsernameEncodedIdNodeIdFilesPathGet");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdNodeIdFilesPathGet");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/{node_id}/files/{path}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()))
      .replaceAll("\\{" + "node_id" + "\\}", apiClient.escapeString(nodeId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()));

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
   * @param nodeId  (required)
   * @param encodedId  (required)
   * @param encodedId2 The snippet&#39;s id. (required)
   * @param nodeId2 A commit revision (SHA1). (required)
   * @return Snippet
   * @throws ApiException if fails to make API call
   */
  public Snippet snippetsUsernameEncodedIdNodeIdGet(String username, String nodeId, String encodedId, String encodedId2, String nodeId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdNodeIdGet");
    }
    
    // verify the required parameter 'nodeId' is set
    if (nodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeId' when calling snippetsUsernameEncodedIdNodeIdGet");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdNodeIdGet");
    }
    
    // verify the required parameter 'encodedId2' is set
    if (encodedId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId2' when calling snippetsUsernameEncodedIdNodeIdGet");
    }
    
    // verify the required parameter 'nodeId2' is set
    if (nodeId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeId2' when calling snippetsUsernameEncodedIdNodeIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/{node_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "node_id" + "\\}", apiClient.escapeString(nodeId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId2.toString()))
      .replaceAll("\\{" + "node_id" + "\\}", apiClient.escapeString(nodeId2.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json", "multipart/related", "multipart/form-data"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Snippet> localVarReturnType = new GenericType<Snippet>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param nodeId  (required)
   * @param encodedId  (required)
   * @param encodedId2 The snippet&#39;s id. (required)
   * @param nodeId2 A commit revision (SHA1). (required)
   * @return Snippet
   * @throws ApiException if fails to make API call
   */
  public Snippet snippetsUsernameEncodedIdNodeIdPut(String username, String nodeId, String encodedId, String encodedId2, String nodeId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdNodeIdPut");
    }
    
    // verify the required parameter 'nodeId' is set
    if (nodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeId' when calling snippetsUsernameEncodedIdNodeIdPut");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdNodeIdPut");
    }
    
    // verify the required parameter 'encodedId2' is set
    if (encodedId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId2' when calling snippetsUsernameEncodedIdNodeIdPut");
    }
    
    // verify the required parameter 'nodeId2' is set
    if (nodeId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeId2' when calling snippetsUsernameEncodedIdNodeIdPut");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/{node_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "node_id" + "\\}", apiClient.escapeString(nodeId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId2.toString()))
      .replaceAll("\\{" + "node_id" + "\\}", apiClient.escapeString(nodeId2.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json", "multipart/related", "multipart/form-data"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "multipart/related", "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Snippet> localVarReturnType = new GenericType<Snippet>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param encodedId  (required)
   * @param encodedId2 The snippet&#39;s id. (required)
   * @return Snippet
   * @throws ApiException if fails to make API call
   */
  public Snippet snippetsUsernameEncodedIdPut(String username, String encodedId, String encodedId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdPut");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdPut");
    }
    
    // verify the required parameter 'encodedId2' is set
    if (encodedId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId2' when calling snippetsUsernameEncodedIdPut");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId2.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json", "multipart/related", "multipart/form-data"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "multipart/related", "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "oauth2", "basic" };

    GenericType<Snippet> localVarReturnType = new GenericType<Snippet>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param encodedId  (required)
   * @param revision  (required)
   * @param encodedId2 The snippet id. (required)
   * @param revision2 A revspec expression. This can simply be a commit SHA1, a ref name, or a compare expression like &#x60;staging..production&#x60;. (required)
   * @param path When used, only one the diff of the specified file will be returned. (optional)
   * @throws ApiException if fails to make API call
   */
  public void snippetsUsernameEncodedIdRevisionDiffGet(String username, String encodedId, String revision, String encodedId2, String revision2, String path) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdRevisionDiffGet");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdRevisionDiffGet");
    }
    
    // verify the required parameter 'revision' is set
    if (revision == null) {
      throw new ApiException(400, "Missing the required parameter 'revision' when calling snippetsUsernameEncodedIdRevisionDiffGet");
    }
    
    // verify the required parameter 'encodedId2' is set
    if (encodedId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId2' when calling snippetsUsernameEncodedIdRevisionDiffGet");
    }
    
    // verify the required parameter 'revision2' is set
    if (revision2 == null) {
      throw new ApiException(400, "Missing the required parameter 'revision2' when calling snippetsUsernameEncodedIdRevisionDiffGet");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/{revision}/diff".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()))
      .replaceAll("\\{" + "revision" + "\\}", apiClient.escapeString(revision.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId2.toString()))
      .replaceAll("\\{" + "revision" + "\\}", apiClient.escapeString(revision2.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "path", path));

    
    
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
   * @param encodedId  (required)
   * @param revision  (required)
   * @param encodedId2 The snippet id. (required)
   * @param revision2 A revspec expression. This can simply be a commit SHA1, a ref name, or a compare expression like &#x60;staging..production&#x60;. (required)
   * @throws ApiException if fails to make API call
   */
  public void snippetsUsernameEncodedIdRevisionPatchGet(String username, String encodedId, String revision, String encodedId2, String revision2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdRevisionPatchGet");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdRevisionPatchGet");
    }
    
    // verify the required parameter 'revision' is set
    if (revision == null) {
      throw new ApiException(400, "Missing the required parameter 'revision' when calling snippetsUsernameEncodedIdRevisionPatchGet");
    }
    
    // verify the required parameter 'encodedId2' is set
    if (encodedId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId2' when calling snippetsUsernameEncodedIdRevisionPatchGet");
    }
    
    // verify the required parameter 'revision2' is set
    if (revision2 == null) {
      throw new ApiException(400, "Missing the required parameter 'revision2' when calling snippetsUsernameEncodedIdRevisionPatchGet");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/{revision}/patch".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()))
      .replaceAll("\\{" + "revision" + "\\}", apiClient.escapeString(revision.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId2.toString()))
      .replaceAll("\\{" + "revision" + "\\}", apiClient.escapeString(revision2.toString()));

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
   * @param encodedId  (required)
   * @param encodedId2 The snippet id. (required)
   * @return PaginatedUsers
   * @throws ApiException if fails to make API call
   */
  public PaginatedUsers snippetsUsernameEncodedIdWatchDelete(String username, String encodedId, String encodedId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdWatchDelete");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdWatchDelete");
    }
    
    // verify the required parameter 'encodedId2' is set
    if (encodedId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId2' when calling snippetsUsernameEncodedIdWatchDelete");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/watch".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId2.toString()));

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
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param encodedId  (required)
   * @param encodedId2 The snippet id. (required)
   * @return PaginatedUsers
   * @throws ApiException if fails to make API call
   */
  public PaginatedUsers snippetsUsernameEncodedIdWatchGet(String username, String encodedId, String encodedId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdWatchGet");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdWatchGet");
    }
    
    // verify the required parameter 'encodedId2' is set
    if (encodedId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId2' when calling snippetsUsernameEncodedIdWatchGet");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/watch".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId2.toString()));

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
   * @param encodedId  (required)
   * @param encodedId2 The snippet id. (required)
   * @return PaginatedUsers
   * @throws ApiException if fails to make API call
   */
  public PaginatedUsers snippetsUsernameEncodedIdWatchPut(String username, String encodedId, String encodedId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdWatchPut");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdWatchPut");
    }
    
    // verify the required parameter 'encodedId2' is set
    if (encodedId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId2' when calling snippetsUsernameEncodedIdWatchPut");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/watch".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId2.toString()));

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
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param encodedId  (required)
   * @param encodedId2 The snippet id. (required)
   * @return PaginatedUsers
   * @throws ApiException if fails to make API call
   */
  public PaginatedUsers snippetsUsernameEncodedIdWatchersGet(String username, String encodedId, String encodedId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameEncodedIdWatchersGet");
    }
    
    // verify the required parameter 'encodedId' is set
    if (encodedId == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId' when calling snippetsUsernameEncodedIdWatchersGet");
    }
    
    // verify the required parameter 'encodedId2' is set
    if (encodedId2 == null) {
      throw new ApiException(400, "Missing the required parameter 'encodedId2' when calling snippetsUsernameEncodedIdWatchersGet");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}/{encoded_id}/watchers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId.toString()))
      .replaceAll("\\{" + "encoded_id" + "\\}", apiClient.escapeString(encodedId2.toString()));

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
   * @param username2 Limits the result to snippets owned by this user. (required)
   * @param role Filter down the result based on the authenticated user&#39;s role (&#x60;owner&#x60;, &#x60;contributor&#x60;, or &#x60;member&#x60;). (optional)
   * @return PaginatedSnippets
   * @throws ApiException if fails to make API call
   */
  public PaginatedSnippets snippetsUsernameGet(String username, String username2, String role) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernameGet");
    }
    
    // verify the required parameter 'username2' is set
    if (username2 == null) {
      throw new ApiException(400, "Missing the required parameter 'username2' when calling snippetsUsernameGet");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username2.toString()));

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

    GenericType<PaginatedSnippets> localVarReturnType = new GenericType<PaginatedSnippets>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param username  (required)
   * @param body The new snippet object. (required)
   * @return Snippet
   * @throws ApiException if fails to make API call
   */
  public Snippet snippetsUsernamePost(String username, Snippet body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling snippetsUsernamePost");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling snippetsUsernamePost");
    }
    
    // create path and map variables
    String localVarPath = "/snippets/{username}".replaceAll("\\{format\\}","json")
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

    GenericType<Snippet> localVarReturnType = new GenericType<Snippet>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
