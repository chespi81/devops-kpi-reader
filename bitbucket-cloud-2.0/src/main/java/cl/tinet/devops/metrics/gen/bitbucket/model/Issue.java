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
import cl.tinet.devops.metrics.gen.bitbucket.model.Component;
import cl.tinet.devops.metrics.gen.bitbucket.model.Milestone;
import cl.tinet.devops.metrics.gen.bitbucket.model.Repository;
import cl.tinet.devops.metrics.gen.bitbucket.model.User;
import cl.tinet.devops.metrics.gen.bitbucket.model.Version;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * Issue
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T23:42:53.141-04:00")
public class Issue extends Object  {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("content")
  private Object content = null;

  /**
   * Gets or Sets kind
   */
  public enum KindEnum {
    BUG("bug"),
    
    ENHANCEMENT("enhancement"),
    
    PROPOSAL("proposal"),
    
    TASK("task");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("kind")
  private KindEnum kind = null;

  @JsonProperty("repository")
  private Repository repository = null;

  @JsonProperty("links")
  private Object links = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("reporter")
  private User reporter = null;

  @JsonProperty("component")
  private Component component = null;

  @JsonProperty("votes")
  private Integer votes = null;

  /**
   * Gets or Sets priority
   */
  public enum PriorityEnum {
    TRIVIAL("trivial"),
    
    MINOR("minor"),
    
    MAJOR("major"),
    
    CRITICAL("critical"),
    
    BLOCKER("blocker");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("priority")
  private PriorityEnum priority = null;

  @JsonProperty("assignee")
  private User assignee = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    NEW("new"),
    
    OPEN("open"),
    
    RESOLVED("resolved"),
    
    ON_HOLD("on hold"),
    
    INVALID("invalid"),
    
    DUPLICATE("duplicate"),
    
    WONTFIX("wontfix"),
    
    CLOSED("closed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("version")
  private Version version = null;

  @JsonProperty("edited_on")
  private DateTime editedOn = null;

  @JsonProperty("created_on")
  private DateTime createdOn = null;

  @JsonProperty("milestone")
  private Milestone milestone = null;

  @JsonProperty("updated_on")
  private DateTime updatedOn = null;

  @JsonProperty("id")
  private Integer id = null;

  public Issue type(String type) {
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

  public Issue content(Object content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(example = "null", value = "")
  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
  }

  public Issue kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(example = "null", value = "")
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  public Issue repository(Repository repository) {
    this.repository = repository;
    return this;
  }

   /**
   * Get repository
   * @return repository
  **/
  @ApiModelProperty(example = "null", value = "")
  public Repository getRepository() {
    return repository;
  }

  public void setRepository(Repository repository) {
    this.repository = repository;
  }

  public Issue links(Object links) {
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

  public Issue title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Issue reporter(User reporter) {
    this.reporter = reporter;
    return this;
  }

   /**
   * Get reporter
   * @return reporter
  **/
  @ApiModelProperty(example = "null", value = "")
  public User getReporter() {
    return reporter;
  }

  public void setReporter(User reporter) {
    this.reporter = reporter;
  }

  public Issue component(Component component) {
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @ApiModelProperty(example = "null", value = "")
  public Component getComponent() {
    return component;
  }

  public void setComponent(Component component) {
    this.component = component;
  }

  public Issue votes(Integer votes) {
    this.votes = votes;
    return this;
  }

   /**
   * Get votes
   * @return votes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getVotes() {
    return votes;
  }

  public void setVotes(Integer votes) {
    this.votes = votes;
  }

  public Issue priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(example = "null", value = "")
  public PriorityEnum getPriority() {
    return priority;
  }

  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }

  public Issue assignee(User assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @ApiModelProperty(example = "null", value = "")
  public User getAssignee() {
    return assignee;
  }

  public void setAssignee(User assignee) {
    this.assignee = assignee;
  }

  public Issue state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Issue version(Version version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "null", value = "")
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
    this.version = version;
  }

  public Issue editedOn(DateTime editedOn) {
    this.editedOn = editedOn;
    return this;
  }

   /**
   * Get editedOn
   * @return editedOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getEditedOn() {
    return editedOn;
  }

  public void setEditedOn(DateTime editedOn) {
    this.editedOn = editedOn;
  }

  public Issue createdOn(DateTime createdOn) {
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

  public Issue milestone(Milestone milestone) {
    this.milestone = milestone;
    return this;
  }

   /**
   * Get milestone
   * @return milestone
  **/
  @ApiModelProperty(example = "null", value = "")
  public Milestone getMilestone() {
    return milestone;
  }

  public void setMilestone(Milestone milestone) {
    this.milestone = milestone;
  }

  public Issue updatedOn(DateTime updatedOn) {
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

  public Issue id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Issue issue = (Issue) o;
    return Objects.equals(this.type, issue.type) &&
        Objects.equals(this.content, issue.content) &&
        Objects.equals(this.kind, issue.kind) &&
        Objects.equals(this.repository, issue.repository) &&
        Objects.equals(this.links, issue.links) &&
        Objects.equals(this.title, issue.title) &&
        Objects.equals(this.reporter, issue.reporter) &&
        Objects.equals(this.component, issue.component) &&
        Objects.equals(this.votes, issue.votes) &&
        Objects.equals(this.priority, issue.priority) &&
        Objects.equals(this.assignee, issue.assignee) &&
        Objects.equals(this.state, issue.state) &&
        Objects.equals(this.version, issue.version) &&
        Objects.equals(this.editedOn, issue.editedOn) &&
        Objects.equals(this.createdOn, issue.createdOn) &&
        Objects.equals(this.milestone, issue.milestone) &&
        Objects.equals(this.updatedOn, issue.updatedOn) &&
        Objects.equals(this.id, issue.id) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, content, kind, repository, links, title, reporter, component, votes, priority, assignee, state, version, editedOn, createdOn, milestone, updatedOn, id, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Issue {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    editedOn: ").append(toIndentedString(editedOn)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

