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
 * une reponse boissonDTO
 */
@ApiModel(description = "une reponse boissonDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ResponseDessertDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("data")
  @Valid
  private List<DessertDTO> data = null;

  public ResponseDessertDTO data(List<DessertDTO> data) {
    this.data = data;
    return this;
  }

  public ResponseDessertDTO addDataItem(DessertDTO dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<DessertDTO>();
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

  public List<DessertDTO> getData() {
    return data;
  }

  public void setData(List<DessertDTO> data) {
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
    ResponseDessertDTO responseDessertDTO = (ResponseDessertDTO) o;
    return Objects.equals(this.data, responseDessertDTO.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDessertDTO {\n");

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

