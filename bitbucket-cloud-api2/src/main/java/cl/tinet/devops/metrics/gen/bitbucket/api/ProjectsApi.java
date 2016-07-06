package cl.tinet.devops.metrics.gen.bitbucket.api;

import com.sun.jersey.api.client.GenericType;

import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Configuration;
import cl.tinet.devops.metrics.gen.bitbucket.model.*;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.Pair;

import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedProjects;
import cl.tinet.devops.metrics.gen.bitbucket.model.Error;
import cl.tinet.devops.metrics.gen.bitbucket.model.Project;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T23:42:53.141-04:00")
public class ProjectsApi {
  private ApiClient apiClient;

  public ProjectsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectsApi(ApiClient apiClient) {
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
   * @param owner The team which owns the project. This can either be the &#x60;username&#x60; of the team or the &#x60;UUID&#x60; of the team (surrounded by curly-braces (&#x60;{}&#x60;)).  (required)
   * @return PaginatedProjects
   * @throws ApiException if fails to make API call
   */
  public PaginatedProjects teamsOwnerProjectsGet(String owner) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'owner' is set
    if (owner == null) {
      throw new ApiException(400, "Missing the required parameter 'owner' when calling teamsOwnerProjectsGet");
    }
    
    // create path and map variables
    String localVarPath = "/teams/{owner}/projects/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "owner" + "\\}", apiClient.escapeString(owner.toString()));

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

    GenericType<PaginatedProjects> localVarReturnType = new GenericType<PaginatedProjects>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param owner The team which owns the project. This can either be the &#x60;username&#x60; of the team or the &#x60;UUID&#x60; of the team (surrounded by curly-braces (&#x60;{}&#x60;)).  (required)
   * @param body  (required)
   * @return Project
   * @throws ApiException if fails to make API call
   */
  public Project teamsOwnerProjectsPost(String owner, Project body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'owner' is set
    if (owner == null) {
      throw new ApiException(400, "Missing the required parameter 'owner' when calling teamsOwnerProjectsPost");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling teamsOwnerProjectsPost");
    }
    
    // create path and map variables
    String localVarPath = "/teams/{owner}/projects/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "owner" + "\\}", apiClient.escapeString(owner.toString()));

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

    GenericType<Project> localVarReturnType = new GenericType<Project>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param owner The team which owns the project. This can either be the &#x60;username&#x60; of the team or the &#x60;UUID&#x60; of the team (surrounded by curly-braces (&#x60;{}&#x60;)).  (required)
   * @param projectKey The project in question. This can either be the actual &#x60;key&#x60; assigned to the project or the &#x60;UUID&#x60; (surrounded by curly-braces (&#x60;{}&#x60;)).  (required)
   * @throws ApiException if fails to make API call
   */
  public void teamsOwnerProjectsProjectKeyDelete(String owner, String projectKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'owner' is set
    if (owner == null) {
      throw new ApiException(400, "Missing the required parameter 'owner' when calling teamsOwnerProjectsProjectKeyDelete");
    }
    
    // verify the required parameter 'projectKey' is set
    if (projectKey == null) {
      throw new ApiException(400, "Missing the required parameter 'projectKey' when calling teamsOwnerProjectsProjectKeyDelete");
    }
    
    // create path and map variables
    String localVarPath = "/teams/{owner}/projects/{project_key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "owner" + "\\}", apiClient.escapeString(owner.toString()))
      .replaceAll("\\{" + "project_key" + "\\}", apiClient.escapeString(projectKey.toString()));

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
   * @param owner The team which owns the project. This can either be the &#x60;username&#x60; of the team or the &#x60;UUID&#x60; of the team (surrounded by curly-braces (&#x60;{}&#x60;)).  (required)
   * @param projectKey The project in question. This can either be the actual &#x60;key&#x60; assigned to the project or the &#x60;UUID&#x60; (surrounded by curly-braces (&#x60;{}&#x60;)).  (required)
   * @return Project
   * @throws ApiException if fails to make API call
   */
  public Project teamsOwnerProjectsProjectKeyGet(String owner, String projectKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'owner' is set
    if (owner == null) {
      throw new ApiException(400, "Missing the required parameter 'owner' when calling teamsOwnerProjectsProjectKeyGet");
    }
    
    // verify the required parameter 'projectKey' is set
    if (projectKey == null) {
      throw new ApiException(400, "Missing the required parameter 'projectKey' when calling teamsOwnerProjectsProjectKeyGet");
    }
    
    // create path and map variables
    String localVarPath = "/teams/{owner}/projects/{project_key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "owner" + "\\}", apiClient.escapeString(owner.toString()))
      .replaceAll("\\{" + "project_key" + "\\}", apiClient.escapeString(projectKey.toString()));

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

    GenericType<Project> localVarReturnType = new GenericType<Project>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param owner The team which owns the project. This can either be the &#x60;username&#x60; of the team or the &#x60;UUID&#x60; of the team (surrounded by curly-braces (&#x60;{}&#x60;)).  (required)
   * @param projectKey The project in question. This can either be the actual &#x60;key&#x60; assigned to the project or the &#x60;UUID&#x60; (surrounded by curly-braces (&#x60;{}&#x60;)).  (required)
   * @param body  (required)
   * @return Project
   * @throws ApiException if fails to make API call
   */
  public Project teamsOwnerProjectsProjectKeyPut(String owner, String projectKey, Project body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'owner' is set
    if (owner == null) {
      throw new ApiException(400, "Missing the required parameter 'owner' when calling teamsOwnerProjectsProjectKeyPut");
    }
    
    // verify the required parameter 'projectKey' is set
    if (projectKey == null) {
      throw new ApiException(400, "Missing the required parameter 'projectKey' when calling teamsOwnerProjectsProjectKeyPut");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling teamsOwnerProjectsProjectKeyPut");
    }
    
    // create path and map variables
    String localVarPath = "/teams/{owner}/projects/{project_key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "owner" + "\\}", apiClient.escapeString(owner.toString()))
      .replaceAll("\\{" + "project_key" + "\\}", apiClient.escapeString(projectKey.toString()));

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

    GenericType<Project> localVarReturnType = new GenericType<Project>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
