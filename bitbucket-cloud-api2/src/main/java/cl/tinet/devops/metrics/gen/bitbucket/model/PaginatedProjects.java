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
import cl.tinet.devops.metrics.gen.bitbucket.model.Project;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * A paginated list of projects
 */
@ApiModel(description = "A paginated list of projects")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T23:42:53.141-04:00")
public class PaginatedProjects   {
  @JsonProperty("next")
  private String next = null;

  @JsonProperty("values")
  private List<Project> values = new ArrayList<Project>();

  @JsonProperty("pagelen")
  private Integer pagelen = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("previous")
  private String previous = null;

  public PaginatedProjects next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Link to the next page if it exists. The last page of a collection does not have this value. Use this link to navigate the result set and refrain from constructing your own URLs.
   * @return next
  **/
  @ApiModelProperty(example = "null", value = "Link to the next page if it exists. The last page of a collection does not have this value. Use this link to navigate the result set and refrain from constructing your own URLs.")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public PaginatedProjects values(List<Project> values) {
    this.values = values;
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Project> getValues() {
    return values;
  }

  public void setValues(List<Project> values) {
    this.values = values;
  }

  public PaginatedProjects pagelen(Integer pagelen) {
    this.pagelen = pagelen;
    return this;
  }

   /**
   * Current number of objects on the existing page. The default value is 10 with 100 being the maximum allowed value. Individual APIs may enforce different values.
   * minimum: 1.0
   * @return pagelen
  **/
  @ApiModelProperty(example = "null", value = "Current number of objects on the existing page. The default value is 10 with 100 being the maximum allowed value. Individual APIs may enforce different values.")
  public Integer getPagelen() {
    return pagelen;
  }

  public void setPagelen(Integer pagelen) {
    this.pagelen = pagelen;
  }

  public PaginatedProjects size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Total number of objects in the response. This is an optional element that is not provided in all responses, as it can be expensive to compute.
   * minimum: 0.0
   * @return size
  **/
  @ApiModelProperty(example = "null", value = "Total number of objects in the response. This is an optional element that is not provided in all responses, as it can be expensive to compute.")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PaginatedProjects page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Page number of the current results. This is an optional element that is not provided in all responses.
   * minimum: 1.0
   * @return page
  **/
  @ApiModelProperty(example = "null", value = "Page number of the current results. This is an optional element that is not provided in all responses.")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public PaginatedProjects previous(String previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Link to previous page if it exists. A collections first page does not have this value. This is an optional element that is not provided in all responses. Some result sets strictly support forward navigation and never provide previous links. Clients must anticipate that backwards navigation is not always available. Use this link to navigate the result set and refrain from constructing your own URLs.
   * @return previous
  **/
  @ApiModelProperty(example = "null", value = "Link to previous page if it exists. A collections first page does not have this value. This is an optional element that is not provided in all responses. Some result sets strictly support forward navigation and never provide previous links. Clients must anticipate that backwards navigation is not always available. Use this link to navigate the result set and refrain from constructing your own URLs.")
  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedProjects paginatedProjects = (PaginatedProjects) o;
    return Objects.equals(this.next, paginatedProjects.next) &&
        Objects.equals(this.values, paginatedProjects.values) &&
        Objects.equals(this.pagelen, paginatedProjects.pagelen) &&
        Objects.equals(this.size, paginatedProjects.size) &&
        Objects.equals(this.page, paginatedProjects.page) &&
        Objects.equals(this.previous, paginatedProjects.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, values, pagelen, size, page, previous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedProjects {\n");
    
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    pagelen: ").append(toIndentedString(pagelen)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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

