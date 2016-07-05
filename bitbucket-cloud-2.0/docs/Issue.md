
# Issue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | 
**content** | **Object** |  |  [optional]
**kind** | [**KindEnum**](#KindEnum) |  |  [optional]
**repository** | [**Repository**](Repository.md) |  |  [optional]
**links** | **Object** |  |  [optional]
**title** | **String** |  |  [optional]
**reporter** | [**User**](User.md) |  |  [optional]
**component** | [**Component**](Component.md) |  |  [optional]
**votes** | **Integer** |  |  [optional]
**priority** | [**PriorityEnum**](#PriorityEnum) |  |  [optional]
**assignee** | [**User**](User.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**version** | [**Version**](Version.md) |  |  [optional]
**editedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**createdOn** | [**DateTime**](DateTime.md) |  |  [optional]
**milestone** | [**Milestone**](Milestone.md) |  |  [optional]
**updatedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**id** | **Integer** |  |  [optional]


<a name="KindEnum"></a>
## Enum: KindEnum
Name | Value
---- | -----
BUG | &quot;bug&quot;
ENHANCEMENT | &quot;enhancement&quot;
PROPOSAL | &quot;proposal&quot;
TASK | &quot;task&quot;


<a name="PriorityEnum"></a>
## Enum: PriorityEnum
Name | Value
---- | -----
TRIVIAL | &quot;trivial&quot;
MINOR | &quot;minor&quot;
MAJOR | &quot;major&quot;
CRITICAL | &quot;critical&quot;
BLOCKER | &quot;blocker&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
NEW | &quot;new&quot;
OPEN | &quot;open&quot;
RESOLVED | &quot;resolved&quot;
ON_HOLD | &quot;on hold&quot;
INVALID | &quot;invalid&quot;
DUPLICATE | &quot;duplicate&quot;
WONTFIX | &quot;wontfix&quot;
CLOSED | &quot;closed&quot;



