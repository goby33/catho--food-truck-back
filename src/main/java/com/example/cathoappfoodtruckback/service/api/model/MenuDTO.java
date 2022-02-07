package com.example.cathoappfoodtruckback.service.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * un Menu
 */
@ApiModel(description = "un Menu")

public class MenuDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id_boisson")
  private Integer idBoisson;

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

  public MenuDTO idBoisson(Integer idBoisson) {
    this.idBoisson = idBoisson;
    return this;
  }

  /**
   * id of the Menu
   * @return idBoisson
  */
  @ApiModelProperty(readOnly = true, value = "id of the Menu")


  public Integer getIdBoisson() {
    return idBoisson;
  }

  public void setIdBoisson(Integer idBoisson) {
    this.idBoisson = idBoisson;
  }

  public MenuDTO nom(String nom) {
    this.nom = nom;
    return this;
  }

  /**
   * name of the Menu
   * @return nom
  */
  @ApiModelProperty(readOnly = true, value = "name of the Menu")


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public MenuDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of the Menu
   * @return description
  */
  @ApiModelProperty(readOnly = true, value = "description of the Menu")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MenuDTO prix(Integer prix) {
    this.prix = prix;
    return this;
  }

  /**
   * price of the Menu
   * @return prix
  */
  @ApiModelProperty(readOnly = true, value = "price of the Menu")


  public Integer getPrix() {
    return prix;
  }

  public void setPrix(Integer prix) {
    this.prix = prix;
  }

  public MenuDTO note(Integer note) {
    this.note = note;
    return this;
  }

  /**
   * note of the Menu
   * @return note
  */
  @ApiModelProperty(readOnly = true, value = "note of the Menu")


  public Integer getNote() {
    return note;
  }

  public void setNote(Integer note) {
    this.note = note;
  }

  public MenuDTO urlImage(String urlImage) {
    this.urlImage = urlImage;
    return this;
  }

  /**
   * the url imagr of the Menu
   * @return urlImage
  */
  @ApiModelProperty(readOnly = true, value = "the url imagr of the Menu")


  public String getUrlImage() {
    return urlImage;
  }

  public void setUrlImage(String urlImage) {
    this.urlImage = urlImage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuDTO menuDTO = (MenuDTO) o;
    return Objects.equals(this.idBoisson, menuDTO.idBoisson) &&
        Objects.equals(this.nom, menuDTO.nom) &&
        Objects.equals(this.description, menuDTO.description) &&
        Objects.equals(this.prix, menuDTO.prix) &&
        Objects.equals(this.note, menuDTO.note) &&
        Objects.equals(this.urlImage, menuDTO.urlImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idBoisson, nom, description, prix, note, urlImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuDTO {\n");

    sb.append("    idBoisson: ").append(toIndentedString(idBoisson)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

