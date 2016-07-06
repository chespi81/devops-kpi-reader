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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Group
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T23:42:53.141-04:00")
public class Group extends Object  {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("links")
  private Object links = null;

  @JsonProperty("full_slug")
  private String fullSlug = null;

  @JsonProperty("members")
  private Integer members = null;

  @JsonProperty("owner")
  private Account owner = null;

  @JsonProperty("slug")
  private String slug = null;

  public Group type(String type) {
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

  public Group name(String name) {
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

  public Group links(Object links) {
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

  public Group fullSlug(String fullSlug) {
    this.fullSlug = fullSlug;
    return this;
  }

   /**
   * The concatenation of the owner's username and the group's slug, separated with a colon (e.g. `acme:developers`) 
   * @return fullSlug
  **/
  @ApiModelProperty(example = "null", value = "The concatenation of the owner's username and the group's slug, separated with a colon (e.g. `acme:developers`) ")
  public String getFullSlug() {
    return fullSlug;
  }

  public void setFullSlug(String fullSlug) {
    this.fullSlug = fullSlug;
  }

  public Group members(Integer members) {
    this.members = members;
    return this;
  }

   /**
   * The number of members in this group
   * @return members
  **/
  @ApiModelProperty(example = "null", value = "The number of members in this group")
  public Integer getMembers() {
    return members;
  }

  public void setMembers(Integer members) {
    this.members = members;
  }

  public Group owner(Account owner) {
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

  public Group slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * The \"sluggified\" version of the group's name. This contains only ASCII characters and can therefore be slightly different than the name
   * @return slug
  **/
  @ApiModelProperty(example = "null", value = "The \"sluggified\" version of the group's name. This contains only ASCII characters and can therefore be slightly different than the name")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.type, group.type) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.links, group.links) &&
        Objects.equals(this.fullSlug, group.fullSlug) &&
        Objects.equals(this.members, group.members) &&
        Objects.equals(this.owner, group.owner) &&
        Objects.equals(this.slug, group.slug) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, links, fullSlug, members, owner, slug, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    fullSlug: ").append(toIndentedString(fullSlug)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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
