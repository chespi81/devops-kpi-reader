
# WebhookSubscription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | 
**subjectType** | [**SubjectTypeEnum**](#SubjectTypeEnum) | The type of entity, which is &#x60;repository&#x60; in the case of webhook subscriptions on repositories. |  [optional]
**uuid** | **String** | The webhook&#39;s id |  [optional]
**url** | **String** | The URL events get delivered to. |  [optional]
**createdAt** | [**DateTime**](DateTime.md) |  |  [optional]
**description** | **String** | A user-defined description of the webhook. |  [optional]
**active** | **Boolean** |  |  [optional]
**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | The events this webhook is subscribed to. |  [optional]
**subject** | **Object** |  |  [optional]


<a name="SubjectTypeEnum"></a>
## Enum: SubjectTypeEnum
Name | Value
---- | -----
USER | &quot;user&quot;
REPOSITORY | &quot;repository&quot;
TEAM | &quot;team&quot;


<a name="List<EventsEnum>"></a>
## Enum: List&lt;EventsEnum&gt;
Name | Value
---- | -----



