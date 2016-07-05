# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import cl.tinet.devops.metrics.gen.bitbucket.invoker.*;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.auth.*;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.model.*;
import cl.tinet.devops.metrics.gen.bitbucket.api.AddonApi;

import java.io.File;
import java.util.*;

public class AddonApiExample {

    public static void main(String[] args) {
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

        AddonApi apiInstance = new AddonApi();
        String username = "username_example"; // String | 
        String encodedContextId = "encodedContextId_example"; // String | 
        try {
            Error result = apiInstance.accountUsernameAddonsEncodedContextIdDelete(username, encodedContextId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddonApi#accountUsernameAddonsEncodedContextIdDelete");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.bitbucket.org/2.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddonApi* | [**accountUsernameAddonsEncodedContextIdDelete**](docs/AddonApi.md#accountUsernameAddonsEncodedContextIdDelete) | **DELETE** /account/{username}/addons/{encoded_context_id} | 
*AddonApi* | [**accountUsernameAddonsEncodedContextIdGet**](docs/AddonApi.md#accountUsernameAddonsEncodedContextIdGet) | **GET** /account/{username}/addons/{encoded_context_id} | 
*AddonApi* | [**accountUsernameAddonsEncodedContextIdPut**](docs/AddonApi.md#accountUsernameAddonsEncodedContextIdPut) | **PUT** /account/{username}/addons/{encoded_context_id} | 
*AddonApi* | [**accountUsernameAddonsEncodedContextIdRefreshPut**](docs/AddonApi.md#accountUsernameAddonsEncodedContextIdRefreshPut) | **PUT** /account/{username}/addons/{encoded_context_id}/refresh | 
*AddonApi* | [**accountUsernameAddonsGet**](docs/AddonApi.md#accountUsernameAddonsGet) | **GET** /account/{username}/addons | 
*AddonApi* | [**accountUsernameAddonsPost**](docs/AddonApi.md#accountUsernameAddonsPost) | **POST** /account/{username}/addons | 
*AddonApi* | [**addonDelete**](docs/AddonApi.md#addonDelete) | **DELETE** /addon | 
*AddonApi* | [**addonLinkersGet**](docs/AddonApi.md#addonLinkersGet) | **GET** /addon/linkers | 
*AddonApi* | [**addonLinkersLinkerKeyGet**](docs/AddonApi.md#addonLinkersLinkerKeyGet) | **GET** /addon/linkers/{linker_key} | 
*AddonApi* | [**addonLinkersLinkerKeyValuesDelete**](docs/AddonApi.md#addonLinkersLinkerKeyValuesDelete) | **DELETE** /addon/linkers/{linker_key}/values | 
*AddonApi* | [**addonLinkersLinkerKeyValuesDelete_0**](docs/AddonApi.md#addonLinkersLinkerKeyValuesDelete_0) | **DELETE** /addon/linkers/{linker_key}/values/ | 
*AddonApi* | [**addonLinkersLinkerKeyValuesGet**](docs/AddonApi.md#addonLinkersLinkerKeyValuesGet) | **GET** /addon/linkers/{linker_key}/values | 
*AddonApi* | [**addonLinkersLinkerKeyValuesGet_0**](docs/AddonApi.md#addonLinkersLinkerKeyValuesGet_0) | **GET** /addon/linkers/{linker_key}/values/ | 
*AddonApi* | [**addonLinkersLinkerKeyValuesPost**](docs/AddonApi.md#addonLinkersLinkerKeyValuesPost) | **POST** /addon/linkers/{linker_key}/values | 
*AddonApi* | [**addonLinkersLinkerKeyValuesPut**](docs/AddonApi.md#addonLinkersLinkerKeyValuesPut) | **PUT** /addon/linkers/{linker_key}/values | 
*AddonApi* | [**addonPut**](docs/AddonApi.md#addonPut) | **PUT** /addon | 
*BranchrestrictionsApi* | [**repositoriesUsernameRepoSlugBranchRestrictionsGet**](docs/BranchrestrictionsApi.md#repositoriesUsernameRepoSlugBranchRestrictionsGet) | **GET** /repositories/{username}/{repo_slug}/branch-restrictions | 
*BranchrestrictionsApi* | [**repositoriesUsernameRepoSlugBranchRestrictionsIdDelete**](docs/BranchrestrictionsApi.md#repositoriesUsernameRepoSlugBranchRestrictionsIdDelete) | **DELETE** /repositories/{username}/{repo_slug}/branch-restrictions/{id} | 
*BranchrestrictionsApi* | [**repositoriesUsernameRepoSlugBranchRestrictionsIdGet**](docs/BranchrestrictionsApi.md#repositoriesUsernameRepoSlugBranchRestrictionsIdGet) | **GET** /repositories/{username}/{repo_slug}/branch-restrictions/{id} | 
*BranchrestrictionsApi* | [**repositoriesUsernameRepoSlugBranchRestrictionsIdPut**](docs/BranchrestrictionsApi.md#repositoriesUsernameRepoSlugBranchRestrictionsIdPut) | **PUT** /repositories/{username}/{repo_slug}/branch-restrictions/{id} | 
*BranchrestrictionsApi* | [**repositoriesUsernameRepoSlugBranchRestrictionsPost**](docs/BranchrestrictionsApi.md#repositoriesUsernameRepoSlugBranchRestrictionsPost) | **POST** /repositories/{username}/{repo_slug}/branch-restrictions | 
*CommitsApi* | [**repositoriesUsernameRepoSlugCommitNodeApproveDelete**](docs/CommitsApi.md#repositoriesUsernameRepoSlugCommitNodeApproveDelete) | **DELETE** /repositories/{username}/{repo_slug}/commit/{node}/approve | 
*CommitsApi* | [**repositoriesUsernameRepoSlugCommitNodeApprovePost**](docs/CommitsApi.md#repositoriesUsernameRepoSlugCommitNodeApprovePost) | **POST** /repositories/{username}/{repo_slug}/commit/{node}/approve | 
*CommitsApi* | [**repositoriesUsernameRepoSlugCommitRevisionGet**](docs/CommitsApi.md#repositoriesUsernameRepoSlugCommitRevisionGet) | **GET** /repositories/{username}/{repo_slug}/commit/{revision} | 
*CommitsApi* | [**repositoriesUsernameRepoSlugCommitShaCommentsCommentIdGet**](docs/CommitsApi.md#repositoriesUsernameRepoSlugCommitShaCommentsCommentIdGet) | **GET** /repositories/{username}/{repo_slug}/commit/{sha}/comments/{comment_id} | 
*CommitsApi* | [**repositoriesUsernameRepoSlugCommitShaCommentsGet**](docs/CommitsApi.md#repositoriesUsernameRepoSlugCommitShaCommentsGet) | **GET** /repositories/{username}/{repo_slug}/commit/{sha}/comments | 
*CommitsApi* | [**repositoriesUsernameRepoSlugCommitsGet**](docs/CommitsApi.md#repositoriesUsernameRepoSlugCommitsGet) | **GET** /repositories/{username}/{repo_slug}/commits | 
*CommitsApi* | [**repositoriesUsernameRepoSlugCommitsPost**](docs/CommitsApi.md#repositoriesUsernameRepoSlugCommitsPost) | **POST** /repositories/{username}/{repo_slug}/commits | 
*CommitsApi* | [**repositoriesUsernameRepoSlugCommitsRevisionGet**](docs/CommitsApi.md#repositoriesUsernameRepoSlugCommitsRevisionGet) | **GET** /repositories/{username}/{repo_slug}/commits/{revision} | 
*CommitsApi* | [**repositoriesUsernameRepoSlugCommitsRevisionPost**](docs/CommitsApi.md#repositoriesUsernameRepoSlugCommitsRevisionPost) | **POST** /repositories/{username}/{repo_slug}/commits/{revision} | 
*CommitsApi* | [**repositoriesUsernameRepoSlugDiffSpecGet**](docs/CommitsApi.md#repositoriesUsernameRepoSlugDiffSpecGet) | **GET** /repositories/{username}/{repo_slug}/diff/{spec} | 
*CommitsApi* | [**repositoriesUsernameRepoSlugPatchSpecGet**](docs/CommitsApi.md#repositoriesUsernameRepoSlugPatchSpecGet) | **GET** /repositories/{username}/{repo_slug}/patch/{spec} | 
*CommitstatusesApi* | [**repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet**](docs/CommitstatusesApi.md#repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet) | **GET** /repositories/{username}/{repo_slug}/commit/{node}/statuses/build/{key} | 
*CommitstatusesApi* | [**repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut**](docs/CommitstatusesApi.md#repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut) | **PUT** /repositories/{username}/{repo_slug}/commit/{node}/statuses/build/{key} | 
*CommitstatusesApi* | [**repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost**](docs/CommitstatusesApi.md#repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost) | **POST** /repositories/{username}/{repo_slug}/commit/{node}/statuses/build | 
*CommitstatusesApi* | [**repositoriesUsernameRepoSlugCommitNodeStatusesGet**](docs/CommitstatusesApi.md#repositoriesUsernameRepoSlugCommitNodeStatusesGet) | **GET** /repositories/{username}/{repo_slug}/commit/{node}/statuses | 
*CommitstatusesApi* | [**repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet**](docs/CommitstatusesApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/statuses | 
*DownloadsApi* | [**repositoriesUsernameRepoSlugDownloadsFilenameDelete**](docs/DownloadsApi.md#repositoriesUsernameRepoSlugDownloadsFilenameDelete) | **DELETE** /repositories/{username}/{repo_slug}/downloads/{filename} | 
*DownloadsApi* | [**repositoriesUsernameRepoSlugDownloadsFilenameGet**](docs/DownloadsApi.md#repositoriesUsernameRepoSlugDownloadsFilenameGet) | **GET** /repositories/{username}/{repo_slug}/downloads/{filename} | 
*DownloadsApi* | [**repositoriesUsernameRepoSlugDownloadsGet**](docs/DownloadsApi.md#repositoriesUsernameRepoSlugDownloadsGet) | **GET** /repositories/{username}/{repo_slug}/downloads | 
*DownloadsApi* | [**repositoriesUsernameRepoSlugDownloadsPost**](docs/DownloadsApi.md#repositoriesUsernameRepoSlugDownloadsPost) | **POST** /repositories/{username}/{repo_slug}/downloads | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugComponentsComponentIdGet**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugComponentsComponentIdGet) | **GET** /repositories/{username}/{repo_slug}/components/{component_id} | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugComponentsGet**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugComponentsGet) | **GET** /repositories/{username}/{repo_slug}/components | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugIssuesGet**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesGet) | **GET** /repositories/{username}/{repo_slug}/issues | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsGet**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsGet) | **GET** /repositories/{username}/{repo_slug}/issues/{issue_id}/attachments | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathDelete**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathDelete) | **DELETE** /repositories/{username}/{repo_slug}/issues/{issue_id}/attachments/{path} | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathGet**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPathGet) | **GET** /repositories/{username}/{repo_slug}/issues/{issue_id}/attachments/{path} | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPost**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdAttachmentsPost) | **POST** /repositories/{username}/{repo_slug}/issues/{issue_id}/attachments | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugIssuesIssueIdCommentsCommentIdGet**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdCommentsCommentIdGet) | **GET** /repositories/{username}/{repo_slug}/issues/{issue_id}/comments/{comment_id} | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugIssuesIssueIdCommentsGet**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdCommentsGet) | **GET** /repositories/{username}/{repo_slug}/issues/{issue_id}/comments | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugIssuesIssueIdDelete**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdDelete) | **DELETE** /repositories/{username}/{repo_slug}/issues/{issue_id} | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugIssuesIssueIdGet**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdGet) | **GET** /repositories/{username}/{repo_slug}/issues/{issue_id} | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugIssuesIssueIdVoteDelete**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdVoteDelete) | **DELETE** /repositories/{username}/{repo_slug}/issues/{issue_id}/vote | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugIssuesIssueIdVoteGet**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdVoteGet) | **GET** /repositories/{username}/{repo_slug}/issues/{issue_id}/vote | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugIssuesIssueIdVotePut**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdVotePut) | **PUT** /repositories/{username}/{repo_slug}/issues/{issue_id}/vote | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugIssuesIssueIdWatchDelete**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdWatchDelete) | **DELETE** /repositories/{username}/{repo_slug}/issues/{issue_id}/watch | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugIssuesIssueIdWatchGet**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdWatchGet) | **GET** /repositories/{username}/{repo_slug}/issues/{issue_id}/watch | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugIssuesIssueIdWatchPut**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesIssueIdWatchPut) | **PUT** /repositories/{username}/{repo_slug}/issues/{issue_id}/watch | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugIssuesPost**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugIssuesPost) | **POST** /repositories/{username}/{repo_slug}/issues | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugMilestonesGet**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugMilestonesGet) | **GET** /repositories/{username}/{repo_slug}/milestones | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugMilestonesMilestoneIdGet**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugMilestonesMilestoneIdGet) | **GET** /repositories/{username}/{repo_slug}/milestones/{milestone_id} | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugVersionsGet**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugVersionsGet) | **GET** /repositories/{username}/{repo_slug}/versions | 
*IssuetrackerApi* | [**repositoriesUsernameRepoSlugVersionsVersionIdGet**](docs/IssuetrackerApi.md#repositoriesUsernameRepoSlugVersionsVersionIdGet) | **GET** /repositories/{username}/{repo_slug}/versions/{version_id} | 
*ProjectsApi* | [**teamsOwnerProjectsGet**](docs/ProjectsApi.md#teamsOwnerProjectsGet) | **GET** /teams/{owner}/projects/ | 
*ProjectsApi* | [**teamsOwnerProjectsPost**](docs/ProjectsApi.md#teamsOwnerProjectsPost) | **POST** /teams/{owner}/projects/ | 
*ProjectsApi* | [**teamsOwnerProjectsProjectKeyDelete**](docs/ProjectsApi.md#teamsOwnerProjectsProjectKeyDelete) | **DELETE** /teams/{owner}/projects/{project_key} | 
*ProjectsApi* | [**teamsOwnerProjectsProjectKeyGet**](docs/ProjectsApi.md#teamsOwnerProjectsProjectKeyGet) | **GET** /teams/{owner}/projects/{project_key} | 
*ProjectsApi* | [**teamsOwnerProjectsProjectKeyPut**](docs/ProjectsApi.md#teamsOwnerProjectsProjectKeyPut) | **PUT** /teams/{owner}/projects/{project_key} | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugDefaultReviewersGet**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugDefaultReviewersGet) | **GET** /repositories/{username}/{repo_slug}/default-reviewers | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameDelete**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameDelete) | **DELETE** /repositories/{username}/{repo_slug}/default-reviewers/{target_username} | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameGet**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugDefaultReviewersTargetUsernameGet) | **GET** /repositories/{username}/{repo_slug}/default-reviewers/{target_username} | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugDefaultReviewersTargetUsernamePut**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugDefaultReviewersTargetUsernamePut) | **PUT** /repositories/{username}/{repo_slug}/default-reviewers/{target_username} | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugPullrequestsActivityGet**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsActivityGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/activity | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugPullrequestsGet**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugPullrequestsPost**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPost) | **POST** /repositories/{username}/{repo_slug}/pullrequests | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugPullrequestsPullRequestIdActivityGet**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdActivityGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/activity | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugPullrequestsPullRequestIdApproveDelete**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdApproveDelete) | **DELETE** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/approve | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugPullrequestsPullRequestIdApprovePost**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdApprovePost) | **POST** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/approve | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/comments/{comment_id} | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsGet**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommentsGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/comments | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommitsGet**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdCommitsGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/commits | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugPullrequestsPullRequestIdDeclinePost**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdDeclinePost) | **POST** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/decline | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugPullrequestsPullRequestIdDiffGet**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdDiffGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/diff | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugPullrequestsPullRequestIdGet**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id} | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugPullrequestsPullRequestIdMergePost**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdMergePost) | **POST** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/merge | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugPullrequestsPullRequestIdPatchGet**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdPatchGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/patch | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugPullrequestsPullRequestIdPut**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdPut) | **PUT** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id} | 
*PullrequestsApi* | [**repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet**](docs/PullrequestsApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/statuses | 
*RefsApi* | [**repositoriesUsernameRepoSlugRefsBranchesGet**](docs/RefsApi.md#repositoriesUsernameRepoSlugRefsBranchesGet) | **GET** /repositories/{username}/{repo_slug}/refs/branches | 
*RefsApi* | [**repositoriesUsernameRepoSlugRefsBranchesNameGet**](docs/RefsApi.md#repositoriesUsernameRepoSlugRefsBranchesNameGet) | **GET** /repositories/{username}/{repo_slug}/refs/branches/{name} | 
*RefsApi* | [**repositoriesUsernameRepoSlugRefsGet**](docs/RefsApi.md#repositoriesUsernameRepoSlugRefsGet) | **GET** /repositories/{username}/{repo_slug}/refs | 
*RefsApi* | [**repositoriesUsernameRepoSlugRefsTagsGet**](docs/RefsApi.md#repositoriesUsernameRepoSlugRefsTagsGet) | **GET** /repositories/{username}/{repo_slug}/refs/tags | 
*RefsApi* | [**repositoriesUsernameRepoSlugRefsTagsNameGet**](docs/RefsApi.md#repositoriesUsernameRepoSlugRefsTagsNameGet) | **GET** /repositories/{username}/{repo_slug}/refs/tags/{name} | 
*RepositoriesApi* | [**repositoriesGet**](docs/RepositoriesApi.md#repositoriesGet) | **GET** /repositories | 
*RepositoriesApi* | [**repositoriesUsernameGet**](docs/RepositoriesApi.md#repositoriesUsernameGet) | **GET** /repositories/{username} | 
*RepositoriesApi* | [**repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet**](docs/RepositoriesApi.md#repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyGet) | **GET** /repositories/{username}/{repo_slug}/commit/{node}/statuses/build/{key} | 
*RepositoriesApi* | [**repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut**](docs/RepositoriesApi.md#repositoriesUsernameRepoSlugCommitNodeStatusesBuildKeyPut) | **PUT** /repositories/{username}/{repo_slug}/commit/{node}/statuses/build/{key} | 
*RepositoriesApi* | [**repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost**](docs/RepositoriesApi.md#repositoriesUsernameRepoSlugCommitNodeStatusesBuildPost) | **POST** /repositories/{username}/{repo_slug}/commit/{node}/statuses/build | 
*RepositoriesApi* | [**repositoriesUsernameRepoSlugCommitNodeStatusesGet**](docs/RepositoriesApi.md#repositoriesUsernameRepoSlugCommitNodeStatusesGet) | **GET** /repositories/{username}/{repo_slug}/commit/{node}/statuses | 
*RepositoriesApi* | [**repositoriesUsernameRepoSlugDelete**](docs/RepositoriesApi.md#repositoriesUsernameRepoSlugDelete) | **DELETE** /repositories/{username}/{repo_slug} | 
*RepositoriesApi* | [**repositoriesUsernameRepoSlugForksGet**](docs/RepositoriesApi.md#repositoriesUsernameRepoSlugForksGet) | **GET** /repositories/{username}/{repo_slug}/forks | 
*RepositoriesApi* | [**repositoriesUsernameRepoSlugGet**](docs/RepositoriesApi.md#repositoriesUsernameRepoSlugGet) | **GET** /repositories/{username}/{repo_slug} | 
*RepositoriesApi* | [**repositoriesUsernameRepoSlugHooksGet**](docs/RepositoriesApi.md#repositoriesUsernameRepoSlugHooksGet) | **GET** /repositories/{username}/{repo_slug}/hooks | 
*RepositoriesApi* | [**repositoriesUsernameRepoSlugHooksPost**](docs/RepositoriesApi.md#repositoriesUsernameRepoSlugHooksPost) | **POST** /repositories/{username}/{repo_slug}/hooks | 
*RepositoriesApi* | [**repositoriesUsernameRepoSlugHooksUidDelete**](docs/RepositoriesApi.md#repositoriesUsernameRepoSlugHooksUidDelete) | **DELETE** /repositories/{username}/{repo_slug}/hooks/{uid} | 
*RepositoriesApi* | [**repositoriesUsernameRepoSlugHooksUidGet**](docs/RepositoriesApi.md#repositoriesUsernameRepoSlugHooksUidGet) | **GET** /repositories/{username}/{repo_slug}/hooks/{uid} | 
*RepositoriesApi* | [**repositoriesUsernameRepoSlugHooksUidPut**](docs/RepositoriesApi.md#repositoriesUsernameRepoSlugHooksUidPut) | **PUT** /repositories/{username}/{repo_slug}/hooks/{uid} | 
*RepositoriesApi* | [**repositoriesUsernameRepoSlugPost**](docs/RepositoriesApi.md#repositoriesUsernameRepoSlugPost) | **POST** /repositories/{username}/{repo_slug} | 
*RepositoriesApi* | [**repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet**](docs/RepositoriesApi.md#repositoriesUsernameRepoSlugPullrequestsPullRequestIdStatusesGet) | **GET** /repositories/{username}/{repo_slug}/pullrequests/{pull_request_id}/statuses | 
*RepositoriesApi* | [**repositoriesUsernameRepoSlugWatchersGet**](docs/RepositoriesApi.md#repositoriesUsernameRepoSlugWatchersGet) | **GET** /repositories/{username}/{repo_slug}/watchers | 
*SnippetsApi* | [**snippetsGet**](docs/SnippetsApi.md#snippetsGet) | **GET** /snippets | 
*SnippetsApi* | [**snippetsPost**](docs/SnippetsApi.md#snippetsPost) | **POST** /snippets | 
*SnippetsApi* | [**snippetsUsernameEncodedIdCommentsCommentIdDelete**](docs/SnippetsApi.md#snippetsUsernameEncodedIdCommentsCommentIdDelete) | **DELETE** /snippets/{username}/{encoded_id}/comments/{comment_id} | 
*SnippetsApi* | [**snippetsUsernameEncodedIdCommentsCommentIdGet**](docs/SnippetsApi.md#snippetsUsernameEncodedIdCommentsCommentIdGet) | **GET** /snippets/{username}/{encoded_id}/comments/{comment_id} | 
*SnippetsApi* | [**snippetsUsernameEncodedIdCommentsCommentIdPut**](docs/SnippetsApi.md#snippetsUsernameEncodedIdCommentsCommentIdPut) | **PUT** /snippets/{username}/{encoded_id}/comments/{comment_id} | 
*SnippetsApi* | [**snippetsUsernameEncodedIdCommentsGet**](docs/SnippetsApi.md#snippetsUsernameEncodedIdCommentsGet) | **GET** /snippets/{username}/{encoded_id}/comments | 
*SnippetsApi* | [**snippetsUsernameEncodedIdCommentsPost**](docs/SnippetsApi.md#snippetsUsernameEncodedIdCommentsPost) | **POST** /snippets/{username}/{encoded_id}/comments | 
*SnippetsApi* | [**snippetsUsernameEncodedIdCommitsGet**](docs/SnippetsApi.md#snippetsUsernameEncodedIdCommitsGet) | **GET** /snippets/{username}/{encoded_id}/commits | 
*SnippetsApi* | [**snippetsUsernameEncodedIdCommitsRevisionGet**](docs/SnippetsApi.md#snippetsUsernameEncodedIdCommitsRevisionGet) | **GET** /snippets/{username}/{encoded_id}/commits/{revision} | 
*SnippetsApi* | [**snippetsUsernameEncodedIdDelete**](docs/SnippetsApi.md#snippetsUsernameEncodedIdDelete) | **DELETE** /snippets/{username}/{encoded_id} | 
*SnippetsApi* | [**snippetsUsernameEncodedIdGet**](docs/SnippetsApi.md#snippetsUsernameEncodedIdGet) | **GET** /snippets/{username}/{encoded_id} | 
*SnippetsApi* | [**snippetsUsernameEncodedIdNodeIdDelete**](docs/SnippetsApi.md#snippetsUsernameEncodedIdNodeIdDelete) | **DELETE** /snippets/{username}/{encoded_id}/{node_id} | 
*SnippetsApi* | [**snippetsUsernameEncodedIdNodeIdFilesPathGet**](docs/SnippetsApi.md#snippetsUsernameEncodedIdNodeIdFilesPathGet) | **GET** /snippets/{username}/{encoded_id}/{node_id}/files/{path} | 
*SnippetsApi* | [**snippetsUsernameEncodedIdNodeIdGet**](docs/SnippetsApi.md#snippetsUsernameEncodedIdNodeIdGet) | **GET** /snippets/{username}/{encoded_id}/{node_id} | 
*SnippetsApi* | [**snippetsUsernameEncodedIdNodeIdPut**](docs/SnippetsApi.md#snippetsUsernameEncodedIdNodeIdPut) | **PUT** /snippets/{username}/{encoded_id}/{node_id} | 
*SnippetsApi* | [**snippetsUsernameEncodedIdPut**](docs/SnippetsApi.md#snippetsUsernameEncodedIdPut) | **PUT** /snippets/{username}/{encoded_id} | 
*SnippetsApi* | [**snippetsUsernameEncodedIdRevisionDiffGet**](docs/SnippetsApi.md#snippetsUsernameEncodedIdRevisionDiffGet) | **GET** /snippets/{username}/{encoded_id}/{revision}/diff | 
*SnippetsApi* | [**snippetsUsernameEncodedIdRevisionPatchGet**](docs/SnippetsApi.md#snippetsUsernameEncodedIdRevisionPatchGet) | **GET** /snippets/{username}/{encoded_id}/{revision}/patch | 
*SnippetsApi* | [**snippetsUsernameEncodedIdWatchDelete**](docs/SnippetsApi.md#snippetsUsernameEncodedIdWatchDelete) | **DELETE** /snippets/{username}/{encoded_id}/watch | 
*SnippetsApi* | [**snippetsUsernameEncodedIdWatchGet**](docs/SnippetsApi.md#snippetsUsernameEncodedIdWatchGet) | **GET** /snippets/{username}/{encoded_id}/watch | 
*SnippetsApi* | [**snippetsUsernameEncodedIdWatchPut**](docs/SnippetsApi.md#snippetsUsernameEncodedIdWatchPut) | **PUT** /snippets/{username}/{encoded_id}/watch | 
*SnippetsApi* | [**snippetsUsernameEncodedIdWatchersGet**](docs/SnippetsApi.md#snippetsUsernameEncodedIdWatchersGet) | **GET** /snippets/{username}/{encoded_id}/watchers | 
*SnippetsApi* | [**snippetsUsernameGet**](docs/SnippetsApi.md#snippetsUsernameGet) | **GET** /snippets/{username} | 
*SnippetsApi* | [**snippetsUsernamePost**](docs/SnippetsApi.md#snippetsUsernamePost) | **POST** /snippets/{username} | 
*TeamsApi* | [**teamsGet**](docs/TeamsApi.md#teamsGet) | **GET** /teams | 
*TeamsApi* | [**teamsUsernameFollowersGet**](docs/TeamsApi.md#teamsUsernameFollowersGet) | **GET** /teams/{username}/followers | 
*TeamsApi* | [**teamsUsernameFollowingGet**](docs/TeamsApi.md#teamsUsernameFollowingGet) | **GET** /teams/{username}/following | 
*TeamsApi* | [**teamsUsernameGet**](docs/TeamsApi.md#teamsUsernameGet) | **GET** /teams/{username} | 
*TeamsApi* | [**teamsUsernameHooksGet**](docs/TeamsApi.md#teamsUsernameHooksGet) | **GET** /teams/{username}/hooks | 
*TeamsApi* | [**teamsUsernameHooksPost**](docs/TeamsApi.md#teamsUsernameHooksPost) | **POST** /teams/{username}/hooks | 
*TeamsApi* | [**teamsUsernameHooksUidDelete**](docs/TeamsApi.md#teamsUsernameHooksUidDelete) | **DELETE** /teams/{username}/hooks/{uid} | 
*TeamsApi* | [**teamsUsernameHooksUidGet**](docs/TeamsApi.md#teamsUsernameHooksUidGet) | **GET** /teams/{username}/hooks/{uid} | 
*TeamsApi* | [**teamsUsernameHooksUidPut**](docs/TeamsApi.md#teamsUsernameHooksUidPut) | **PUT** /teams/{username}/hooks/{uid} | 
*TeamsApi* | [**teamsUsernameMembersGet**](docs/TeamsApi.md#teamsUsernameMembersGet) | **GET** /teams/{username}/members | 
*TeamsApi* | [**teamsUsernameRepositoriesGet**](docs/TeamsApi.md#teamsUsernameRepositoriesGet) | **GET** /teams/{username}/repositories | 
*TeamsApi* | [**usersUsernameRepositoriesGet**](docs/TeamsApi.md#usersUsernameRepositoriesGet) | **GET** /users/{username}/repositories | 
*UsersApi* | [**teamsUsernameRepositoriesGet**](docs/UsersApi.md#teamsUsernameRepositoriesGet) | **GET** /teams/{username}/repositories | 
*UsersApi* | [**userEmailsEmailGet**](docs/UsersApi.md#userEmailsEmailGet) | **GET** /user/emails/{email} | 
*UsersApi* | [**userEmailsGet**](docs/UsersApi.md#userEmailsGet) | **GET** /user/emails | 
*UsersApi* | [**userGet**](docs/UsersApi.md#userGet) | **GET** /user | 
*UsersApi* | [**usersUsernameFollowersGet**](docs/UsersApi.md#usersUsernameFollowersGet) | **GET** /users/{username}/followers | 
*UsersApi* | [**usersUsernameFollowingGet**](docs/UsersApi.md#usersUsernameFollowingGet) | **GET** /users/{username}/following | 
*UsersApi* | [**usersUsernameGet**](docs/UsersApi.md#usersUsernameGet) | **GET** /users/{username} | 
*UsersApi* | [**usersUsernameHooksGet**](docs/UsersApi.md#usersUsernameHooksGet) | **GET** /users/{username}/hooks | 
*UsersApi* | [**usersUsernameHooksPost**](docs/UsersApi.md#usersUsernameHooksPost) | **POST** /users/{username}/hooks | 
*UsersApi* | [**usersUsernameHooksUidDelete**](docs/UsersApi.md#usersUsernameHooksUidDelete) | **DELETE** /users/{username}/hooks/{uid} | 
*UsersApi* | [**usersUsernameHooksUidGet**](docs/UsersApi.md#usersUsernameHooksUidGet) | **GET** /users/{username}/hooks/{uid} | 
*UsersApi* | [**usersUsernameHooksUidPut**](docs/UsersApi.md#usersUsernameHooksUidPut) | **PUT** /users/{username}/hooks/{uid} | 
*UsersApi* | [**usersUsernameRepositoriesGet**](docs/UsersApi.md#usersUsernameRepositoriesGet) | **GET** /users/{username}/repositories | 
*WebhooksApi* | [**hookEventsGet**](docs/WebhooksApi.md#hookEventsGet) | **GET** /hook_events | 
*WebhooksApi* | [**hookEventsSubjectTypeGet**](docs/WebhooksApi.md#hookEventsSubjectTypeGet) | **GET** /hook_events/{subject_type} | 
*WebhooksApi* | [**repositoriesUsernameRepoSlugHooksGet**](docs/WebhooksApi.md#repositoriesUsernameRepoSlugHooksGet) | **GET** /repositories/{username}/{repo_slug}/hooks | 
*WebhooksApi* | [**repositoriesUsernameRepoSlugHooksPost**](docs/WebhooksApi.md#repositoriesUsernameRepoSlugHooksPost) | **POST** /repositories/{username}/{repo_slug}/hooks | 
*WebhooksApi* | [**repositoriesUsernameRepoSlugHooksUidDelete**](docs/WebhooksApi.md#repositoriesUsernameRepoSlugHooksUidDelete) | **DELETE** /repositories/{username}/{repo_slug}/hooks/{uid} | 
*WebhooksApi* | [**repositoriesUsernameRepoSlugHooksUidGet**](docs/WebhooksApi.md#repositoriesUsernameRepoSlugHooksUidGet) | **GET** /repositories/{username}/{repo_slug}/hooks/{uid} | 
*WebhooksApi* | [**repositoriesUsernameRepoSlugHooksUidPut**](docs/WebhooksApi.md#repositoriesUsernameRepoSlugHooksUidPut) | **PUT** /repositories/{username}/{repo_slug}/hooks/{uid} | 
*WebhooksApi* | [**teamsUsernameHooksGet**](docs/WebhooksApi.md#teamsUsernameHooksGet) | **GET** /teams/{username}/hooks | 
*WebhooksApi* | [**teamsUsernameHooksPost**](docs/WebhooksApi.md#teamsUsernameHooksPost) | **POST** /teams/{username}/hooks | 
*WebhooksApi* | [**teamsUsernameHooksUidDelete**](docs/WebhooksApi.md#teamsUsernameHooksUidDelete) | **DELETE** /teams/{username}/hooks/{uid} | 
*WebhooksApi* | [**teamsUsernameHooksUidGet**](docs/WebhooksApi.md#teamsUsernameHooksUidGet) | **GET** /teams/{username}/hooks/{uid} | 
*WebhooksApi* | [**teamsUsernameHooksUidPut**](docs/WebhooksApi.md#teamsUsernameHooksUidPut) | **PUT** /teams/{username}/hooks/{uid} | 
*WebhooksApi* | [**usersUsernameHooksGet**](docs/WebhooksApi.md#usersUsernameHooksGet) | **GET** /users/{username}/hooks | 
*WebhooksApi* | [**usersUsernameHooksPost**](docs/WebhooksApi.md#usersUsernameHooksPost) | **POST** /users/{username}/hooks | 
*WebhooksApi* | [**usersUsernameHooksUidDelete**](docs/WebhooksApi.md#usersUsernameHooksUidDelete) | **DELETE** /users/{username}/hooks/{uid} | 
*WebhooksApi* | [**usersUsernameHooksUidGet**](docs/WebhooksApi.md#usersUsernameHooksUidGet) | **GET** /users/{username}/hooks/{uid} | 
*WebhooksApi* | [**usersUsernameHooksUidPut**](docs/WebhooksApi.md#usersUsernameHooksUidPut) | **PUT** /users/{username}/hooks/{uid} | 


## Documentation for Models

 - [Account](docs/Account.md)
 - [BaseCommit](docs/BaseCommit.md)
 - [Branchrestriction](docs/Branchrestriction.md)
 - [Commit](docs/Commit.md)
 - [Commitstatus](docs/Commitstatus.md)
 - [Component](docs/Component.md)
 - [Error](docs/Error.md)
 - [ErrorError](docs/ErrorError.md)
 - [Group](docs/Group.md)
 - [HookEvent](docs/HookEvent.md)
 - [Issue](docs/Issue.md)
 - [IssueAttachment](docs/IssueAttachment.md)
 - [Milestone](docs/Milestone.md)
 - [Object](docs/Object.md)
 - [Page](docs/Page.md)
 - [PaginatedBranchrestrictions](docs/PaginatedBranchrestrictions.md)
 - [PaginatedCommitstatuses](docs/PaginatedCommitstatuses.md)
 - [PaginatedComponents](docs/PaginatedComponents.md)
 - [PaginatedHookEvents](docs/PaginatedHookEvents.md)
 - [PaginatedIssueAttachments](docs/PaginatedIssueAttachments.md)
 - [PaginatedIssues](docs/PaginatedIssues.md)
 - [PaginatedMilestones](docs/PaginatedMilestones.md)
 - [PaginatedProjects](docs/PaginatedProjects.md)
 - [PaginatedRepositories](docs/PaginatedRepositories.md)
 - [PaginatedSnippetComments](docs/PaginatedSnippetComments.md)
 - [PaginatedSnippetCommit](docs/PaginatedSnippetCommit.md)
 - [PaginatedSnippets](docs/PaginatedSnippets.md)
 - [PaginatedTeams](docs/PaginatedTeams.md)
 - [PaginatedUsers](docs/PaginatedUsers.md)
 - [PaginatedVersions](docs/PaginatedVersions.md)
 - [PaginatedWebhookSubscriptions](docs/PaginatedWebhookSubscriptions.md)
 - [Participant](docs/Participant.md)
 - [Project](docs/Project.md)
 - [Pullrequest](docs/Pullrequest.md)
 - [Repository](docs/Repository.md)
 - [Snippet](docs/Snippet.md)
 - [SnippetComment](docs/SnippetComment.md)
 - [SnippetCommit](docs/SnippetCommit.md)
 - [SubjectTypes](docs/SubjectTypes.md)
 - [SubjectTypesUser](docs/SubjectTypesUser.md)
 - [SubjectTypesUserEvents](docs/SubjectTypesUserEvents.md)
 - [Team](docs/Team.md)
 - [User](docs/User.md)
 - [Version](docs/Version.md)
 - [WebhookSubscription](docs/WebhookSubscription.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

### oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorizatoin URL**: https://bitbucket.org/site/oauth2/authorize
- **Scopes**: 
  - wiki: Read and modify your repositories&#39; wikis
  - pullrequest:write: Read and modify your repositories and their pull requests
  - pipeline:variable: Access your repositories&#39; build pipelines and configure their variables
  - project:write: Read and modify your team&#39;s project settings, and read and transfer repositories within your team&#39;s projects
  - pipeline:write: Access and rerun your repositories&#39; build pipelines
  - snippet: Read your snippets
  - repository:delete: Delete your repositories
  - repository:write: Read and modify your repositories
  - issue: Read your repositories&#39; issues
  - email: Read your account&#39;s primary email address
  - repository: Read your repositories
  - issue:write: Read and modify your repositories&#39; issues
  - webhook: Read and modify your repositories&#39; webhooks
  - pipeline: Access your repositories&#39; build pipelines
  - snippet:write: Read and modify your snippets
  - account: Read your account information
  - repository:admin: Administer your repositories
  - pullrequest: Read your repositories and their pull requests
  - project: Read your team&#39;s project settings and read repositories contained within your team&#39;s projects
  - team: Read your team membership information
  - team:write: Read and modify your team membership information
  - account:write: Read and modify your account information

### basic

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

support@bitbucket.org

