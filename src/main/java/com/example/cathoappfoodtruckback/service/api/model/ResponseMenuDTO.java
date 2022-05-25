package com.example.cathoappfoodtruckback.service.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * une reponse ResponseMenuDTO
 */
@ApiModel(description = "une reponse ResponseMenuDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ResponseMenuDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("data")
  @Valid
  private List<MenuDTO> data = null;

  public ResponseMenuDTO data(List<MenuDTO> data) {
    this.data = data;
    return this;
  }

  public ResponseMenuDTO addDataItem(MenuDTO dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<MenuDTO>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * id of the Menu
   * @return data
  */
  @ApiModelProperty(readOnly = true, value = "id of the Menu")

  @Valid

  public List<MenuDTO> getData() {
    return data;
  }

  public void setData(List<MenuDTO> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseMenuDTO responseMenuDTO = (ResponseMenuDTO) o;
    return Objects.equals(this.data, responseMenuDTO.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseMenuDTO {\n");

    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

