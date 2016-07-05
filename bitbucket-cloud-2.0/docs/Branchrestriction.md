
# Branchrestriction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | 
**kind** | [**KindEnum**](#KindEnum) | The type of restriction that is being applied |  [optional]
**users** | [**List&lt;Account&gt;**](Account.md) |  |  [optional]
**links** | **Object** |  |  [optional]
**value** | **Integer** | Value with kind-specific semantics: \&quot;require_approvals_to_merge\&quot; uses it to require a minimum number of approvals on a PR; \&quot;require_passing_builds_to_merge\&quot; uses it to require a minimum number of passing builds. |  [optional]
**groups** | [**List&lt;Group&gt;**](Group.md) |  |  [optional]
**id** | **Integer** | The branch restriction status&#39; id. |  [optional]


<a name="KindEnum"></a>
## Enum: KindEnum
Name | Value
---- | -----
REQUIRE_TASKS_TO_BE_COMPLETED | &quot;require_tasks_to_be_completed&quot;
REQUIRE_PASSING_BUILDS_TO_MERGE | &quot;require_passing_builds_to_merge&quot;
FORCE | &quot;force&quot;
PUSH | &quot;push&quot;
REQUIRE_APPROVALS_TO_MERGE | &quot;require_approvals_to_merge&quot;
RESTRICT_MERGES | &quot;restrict_merges&quot;
RESET_PULLREQUEST_APPROVALS_ON_CHANGE | &quot;reset_pullrequest_approvals_on_change&quot;
DELETE | &quot;delete&quot;



