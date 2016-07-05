
# HookEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **String** | The category this event belongs to. |  [optional]
**event** | [**EventEnum**](#EventEnum) | The event identifier. |  [optional]
**description** | **String** | More detailed description of the webhook event type. |  [optional]
**label** | **String** | Summary of the webhook event type. |  [optional]


<a name="EventEnum"></a>
## Enum: EventEnum
Name | Value
---- | -----
PULLREQUEST_UPDATED | &quot;pullrequest:updated&quot;
REPO_COMMIT_STATUS_CREATED | &quot;repo:commit_status_created&quot;
REPO_UPDATED | &quot;repo:updated&quot;
ISSUE_COMMENT_CREATED | &quot;issue:comment_created&quot;
PROJECT_UPDATED | &quot;project:updated&quot;
PULLREQUEST_REJECTED | &quot;pullrequest:rejected&quot;
PULLREQUEST_FULFILLED | &quot;pullrequest:fulfilled&quot;
REPO_IMPORTED | &quot;repo:imported&quot;
REPO_DELETED | &quot;repo:deleted&quot;
PULLREQUEST_COMMENT_CREATED | &quot;pullrequest:comment_created&quot;
PULLREQUEST_COMMENT_DELETED | &quot;pullrequest:comment_deleted&quot;
REPO_FORK | &quot;repo:fork&quot;
ISSUE_CREATED | &quot;issue:created&quot;
REPO_COMMIT_COMMENT_CREATED | &quot;repo:commit_comment_created&quot;
PULLREQUEST_APPROVED | &quot;pullrequest:approved&quot;
REPO_COMMIT_STATUS_UPDATED | &quot;repo:commit_status_updated&quot;
PULLREQUEST_COMMENT_UPDATED | &quot;pullrequest:comment_updated&quot;
ISSUE_UPDATED | &quot;issue:updated&quot;
PULLREQUEST_UNAPPROVED | &quot;pullrequest:unapproved&quot;
PULLREQUEST_CREATED | &quot;pullrequest:created&quot;
REPO_PUSH | &quot;repo:push&quot;



