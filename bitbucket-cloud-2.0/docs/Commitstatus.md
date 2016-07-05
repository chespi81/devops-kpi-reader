
# Commitstatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | 
**uuid** | **String** | The commit status&#39; id. |  [optional]
**links** | **Object** |  |  [optional]
**url** | **String** | A URL linking back to the vendor or build system, for providing more information about whatever process produced this status |  [optional]
**description** | **String** | A description of the build (e.g. \&quot;Unit tests in Bamboo\&quot;) |  [optional]
**createdOn** | [**DateTime**](DateTime.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | Provides some indication of the status of this commit |  [optional]
**key** | **String** | An identifier for the status that&#39;s unique to         its type (current \&quot;build\&quot; is the only supported type) and the vendor,         e.g. BB-DEPLOY |  [optional]
**updatedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**name** | **String** | An identifier for the build itself, e.g. BB-DEPLOY-1 |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
SUCCESSFUL | &quot;SUCCESSFUL&quot;
FAILED | &quot;FAILED&quot;
INPROGRESS | &quot;INPROGRESS&quot;



