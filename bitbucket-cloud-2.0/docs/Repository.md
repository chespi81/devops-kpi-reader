
# Repository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | 
**scm** | [**ScmEnum**](#ScmEnum) |  |  [optional]
**hasWiki** | **Boolean** |  |  [optional]
**uuid** | **String** | The repository&#39;s immutable id. This can be used as a substitute for the slug segment in URLs. Doing this guarantees your URLs will survive renaming of the repository by its owner, or even transfer of the repository to a different user. |  [optional]
**links** | **Object** |  |  [optional]
**forkPolicy** | [**ForkPolicyEnum**](#ForkPolicyEnum) |  Controls the rules for forking this repository.  * **allow_forks**: unrestricted forking * **no_public_forks**: restrict forking to private forks (forks cannot   be made public later) * **no_forks**: deny all forking  |  [optional]
**description** | **String** |  |  [optional]
**project** | [**Project**](Project.md) |  |  [optional]
**language** | **String** |  |  [optional]
**createdOn** | [**DateTime**](DateTime.md) |  |  [optional]
**parent** | [**Repository**](Repository.md) |  |  [optional]
**fullName** | **String** | The concatenation of the repository owner&#39;s username and the slugified name, e.g. \&quot;evzijst/interruptingcow\&quot;. This is the same string used in Bitbucket URLs. |  [optional]
**hasIssues** | **Boolean** |  |  [optional]
**owner** | [**Account**](Account.md) |  |  [optional]
**updatedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**size** | **Integer** |  |  [optional]
**isPrivate** | **Boolean** |  |  [optional]
**name** | **String** |  |  [optional]


<a name="ScmEnum"></a>
## Enum: ScmEnum
Name | Value
---- | -----
HG | &quot;hg&quot;
GIT | &quot;git&quot;


<a name="ForkPolicyEnum"></a>
## Enum: ForkPolicyEnum
Name | Value
---- | -----
ALLOW_FORKS | &quot;allow_forks&quot;
NO_PUBLIC_FORKS | &quot;no_public_forks&quot;
NO_FORKS | &quot;no_forks&quot;



