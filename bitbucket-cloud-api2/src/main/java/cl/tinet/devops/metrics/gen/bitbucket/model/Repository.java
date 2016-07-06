/**
 * Bitbucket API
 * Code against the Bitbucket API to automate simple tasks, embed Bitbucket data into your own site, build mobile or desktop apps, or even add custom UI add-ons into Bitbucket itself using the Connect framework.
 *
 * OpenAPI spec version: 2.0
 * Contact: support@bitbucket.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package cl.tinet.devops.metrics.gen.bitbucket.model;

import java.util.Objects;
import cl.tinet.devops.metrics.gen.bitbucket.model.Account;
import cl.tinet.devops.metrics.gen.bitbucket.model.Project;
import cl.tinet.devops.metrics.gen.bitbucket.model.Repository;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * Repository
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T23:42:53.141-04:00")
public class Repository extends Object  {
  @JsonProperty("type")
  private String type = null;

  /**
   * Gets or Sets scm
   */
  public enum ScmEnum {
    HG("hg"),
    
    GIT("git");

    private String value;

    ScmEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("scm")
  private ScmEnum scm = null;

  @JsonProperty("has_wiki")
  private Boolean hasWiki = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("links")
  private Object links = null;

  /**
   *  Controls the rules for forking this repository.  * **allow_forks**: unrestricted forking * **no_public_forks**: restrict forking to private forks (forks cannot   be made public later) * **no_forks**: deny all forking 
   */
  public enum ForkPolicyEnum {
    ALLOW_FORKS("allow_forks"),
    
    NO_PUBLIC_FORKS("no_public_forks"),
    
    NO_FORKS("no_forks");

    private String value;

    ForkPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("fork_policy")
  private ForkPolicyEnum forkPolicy = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("project")
  private Project project = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("created_on")
  private DateTime createdOn = null;

  @JsonProperty("parent")
  private Repository parent = null;

  @JsonProperty("full_name")
  private String fullName = null;

  @JsonProperty("has_issues")
  private Boolean hasIssues = null;

  @JsonProperty("owner")
  private Account owner = null;

  @JsonProperty("updated_on")
  private DateTime updatedOn = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("is_private")
  private Boolean isPrivate = null;

  @JsonProperty("name")
  private String name = null;

  public Repository type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Repository scm(ScmEnum scm) {
    this.scm = scm;
    return this;
  }

   /**
   * Get scm
   * @return scm
  **/
  @ApiModelProperty(example = "null", value = "")
  public ScmEnum getScm() {
    return scm;
  }

  public void setScm(ScmEnum scm) {
    this.scm = scm;
  }

  public Repository hasWiki(Boolean hasWiki) {
    this.hasWiki = hasWiki;
    return this;
  }

   /**
   * Get hasWiki
   * @return hasWiki
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getHasWiki() {
    return hasWiki;
  }

  public void setHasWiki(Boolean hasWiki) {
    this.hasWiki = hasWiki;
  }

  public Repository uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The repository's immutable id. This can be used as a substitute for the slug segment in URLs. Doing this guarantees your URLs will survive renaming of the repository by its owner, or even transfer of the repository to a different user.
   * @return uuid
  **/
  @ApiModelProperty(example = "null", value = "The repository's immutable id. This can be used as a substitute for the slug segment in URLs. Doing this guarantees your URLs will survive renaming of the repository by its owner, or even transfer of the repository to a different user.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Repository links(Object links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public Object getLinks() {
    return links;
  }

  public void setLinks(Object links) {
    this.links = links;
  }

  public Repository forkPolicy(ForkPolicyEnum forkPolicy) {
    this.forkPolicy = forkPolicy;
    return this;
  }

   /**
   *  Controls the rules for forking this repository.  * **allow_forks**: unrestricted forking * **no_public_forks**: restrict forking to private forks (forks cannot   be made public later) * **no_forks**: deny all forking 
   * @return forkPolicy
  **/
  @ApiModelProperty(example = "null", value = " Controls the rules for forking this repository.  * **allow_forks**: unrestricted forking * **no_public_forks**: restrict forking to private forks (forks cannot   be made public later) * **no_forks**: deny all forking ")
  public ForkPolicyEnum getForkPolicy() {
    return forkPolicy;
  }

  public void setForkPolicy(ForkPolicyEnum forkPolicy) {
    this.forkPolicy = forkPolicy;
  }

  public Repository description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Repository project(Project project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(example = "null", value = "")
  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public Repository language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Repository createdOn(DateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(DateTime createdOn) {
    this.createdOn = createdOn;
  }

  public Repository parent(Repository parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(example = "null", value = "")
  public Repository getParent() {
    return parent;
  }

  public void setParent(Repository parent) {
    this.parent = parent;
  }

  public Repository fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * The concatenation of the repository owner's username and the slugified name, e.g. \"evzijst/interruptingcow\". This is the same string used in Bitbucket URLs.
   * @return fullName
  **/
  @ApiModelProperty(example = "null", value = "The concatenation of the repository owner's username and the slugified name, e.g. \"evzijst/interruptingcow\". This is the same string used in Bitbucket URLs.")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Repository hasIssues(Boolean hasIssues) {
    this.hasIssues = hasIssues;
    return this;
  }

   /**
   * Get hasIssues
   * @return hasIssues
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getHasIssues() {
    return hasIssues;
  }

  public void setHasIssues(Boolean hasIssues) {
    this.hasIssues = hasIssues;
  }

  public Repository owner(Account owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(example = "null", value = "")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Repository updatedOn(DateTime updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * Get updatedOn
   * @return updatedOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(DateTime updatedOn) {
    this.updatedOn = updatedOn;
  }

  public Repository size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Repository isPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
    return this;
  }

   /**
   * Get isPrivate
   * @return isPrivate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsPrivate() {
    return isPrivate;
  }

  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }

  public Repository name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Repository repository = (Repository) o;
    return Objects.equals(this.type, repository.type) &&
        Objects.equals(this.scm, repository.scm) &&
        Objects.equals(this.hasWiki, repository.hasWiki) &&
        Objects.equals(this.uuid, repository.uuid) &&
        Objects.equals(this.links, repository.links) &&
        Objects.equals(this.forkPolicy, repository.forkPolicy) &&
        Objects.equals(this.description, repository.description) &&
        Objects.equals(this.project, repository.project) &&
        Objects.equals(this.language, repository.language) &&
        Objects.equals(this.createdOn, repository.createdOn) &&
        Objects.equals(this.parent, repository.parent) &&
        Objects.equals(this.fullName, repository.fullName) &&
        Objects.equals(this.hasIssues, repository.hasIssues) &&
        Objects.equals(this.owner, repository.owner) &&
        Objects.equals(this.updatedOn, repository.updatedOn) &&
        Objects.equals(this.size, repository.size) &&
        Objects.equals(this.isPrivate, repository.isPrivate) &&
        Objects.equals(this.name, repository.name) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, scm, hasWiki, uuid, links, forkPolicy, description, project, language, createdOn, parent, fullName, hasIssues, owner, updatedOn, size, isPrivate, name, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repository {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scm: ").append(toIndentedString(scm)).append("\n");
    sb.append("    hasWiki: ").append(toIndentedString(hasWiki)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    forkPolicy: ").append(toIndentedString(forkPolicy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    hasIssues: ").append(toIndentedString(hasIssues)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
