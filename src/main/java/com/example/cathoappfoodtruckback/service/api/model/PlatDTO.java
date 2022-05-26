package com.example.cathoappfoodtruckback.service.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * un Plat
 */
@ApiModel(description = "un Plat")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PlatDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("nom")
  private String nom;

  @JsonProperty("description")
  private String description;

  @JsonProperty("prix")
  private Integer prix;

  @JsonProperty("note")
  private Integer note;

  @JsonProperty("url_image")
  private String urlImage;

  public PlatDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * id of the Plat
   * @return id
  */
  @ApiModelProperty(readOnly = true, value = "id of the Plat")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PlatDTO nom(String nom) {
    this.nom = nom;
    return this;
  }

  /**
   * name of the Plat
   * @return nom
  */
  @ApiModelProperty(readOnly = true, value = "name of the Plat")


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public PlatDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of the Plat
   * @return description
  */
  @ApiModelProperty(readOnly = true, value = "description of the Plat")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PlatDTO prix(Integer prix) {
    this.prix = prix;
    return this;
  }

  /**
   * price of the Plat
   * @return prix
  */
  @ApiModelProperty(readOnly = true, value = "price of the Plat")


  public Integer getPrix() {
    return prix;
  }

  public void setPrix(Integer prix) {
    this.prix = prix;
  }

  public PlatDTO note(Integer note) {
    this.note = note;
    return this;
  }

  /**
   * note of the Plat
   * @return note
  */
  @ApiModelProperty(readOnly = true, value = "note of the Plat")


  public Integer getNote() {
    return note;
  }

  public void setNote(Integer note) {
    this.note = note;
  }

  public PlatDTO urlImage(String urlImage) {
    this.urlImage = urlImage;
    return this;
  }

  /**
   * the url imagr of the Plat
   * @return urlImage
  */
  @ApiModelProperty(readOnly = true, value = "the url imagr of the Plat")


  public String getUrlImage() {
    return urlImage;
  }

  public void setUrlImage(String urlImage) {
    this.urlImage = urlImage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatDTO platDTO = (PlatDTO) o;
    return Objects.equals(this.id, platDTO.id) &&
        Objects.equals(this.nom, platDTO.nom) &&
        Objects.equals(this.description, platDTO.description) &&
        Objects.equals(this.prix, platDTO.prix) &&
        Objects.equals(this.note, platDTO.note) &&
        Objects.equals(this.urlImage, platDTO.urlImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nom, description, prix, note, urlImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    prix: ").append(toIndentedString(prix)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    urlImage: ").append(toIndentedString(urlImage)).append("\n");
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

