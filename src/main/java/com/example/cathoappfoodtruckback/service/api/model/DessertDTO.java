package com.example.cathoappfoodtruckback.service.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * un Dessert
 */
@ApiModel(description = "un Dessert")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DessertDTO  implements Serializable {
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

  public DessertDTO idBoisson(Integer idBoisson) {
    this.idBoisson = idBoisson;
    return this;
  }

  /**
   * id of the Dessert
   * @return idBoisson
  */
  @ApiModelProperty(readOnly = true, value = "id of the Dessert")


  public Integer getIdBoisson() {
    return idBoisson;
  }

  public void setIdBoisson(Integer idBoisson) {
    this.idBoisson = idBoisson;
  }

  public DessertDTO nom(String nom) {
    this.nom = nom;
    return this;
  }

  /**
   * name of the Dessert
   * @return nom
  */
  @ApiModelProperty(readOnly = true, value = "name of the Dessert")


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public DessertDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of the Dessert
   * @return description
  */
  @ApiModelProperty(readOnly = true, value = "description of the Dessert")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DessertDTO prix(Integer prix) {
    this.prix = prix;
    return this;
  }

  /**
   * price of the Dessert
   * @return prix
  */
  @ApiModelProperty(readOnly = true, value = "price of the Dessert")


  public Integer getPrix() {
    return prix;
  }

  public void setPrix(Integer prix) {
    this.prix = prix;
  }

  public DessertDTO note(Integer note) {
    this.note = note;
    return this;
  }

  /**
   * note of the Dessert
   * @return note
  */
  @ApiModelProperty(readOnly = true, value = "note of the Dessert")


  public Integer getNote() {
    return note;
  }

  public void setNote(Integer note) {
    this.note = note;
  }

  public DessertDTO urlImage(String urlImage) {
    this.urlImage = urlImage;
    return this;
  }

  /**
   * the url imagr of the Dessert
   * @return urlImage
  */
  @ApiModelProperty(readOnly = true, value = "the url imagr of the Dessert")


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
    DessertDTO dessertDTO = (DessertDTO) o;
    return Objects.equals(this.idBoisson, dessertDTO.idBoisson) &&
        Objects.equals(this.nom, dessertDTO.nom) &&
        Objects.equals(this.description, dessertDTO.description) &&
        Objects.equals(this.prix, dessertDTO.prix) &&
        Objects.equals(this.note, dessertDTO.note) &&
        Objects.equals(this.urlImage, dessertDTO.urlImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idBoisson, nom, description, prix, note, urlImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DessertDTO {\n");

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

