package com.example.cathoappfoodtruckback.service.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * une boisson
 */
@ApiModel(description = "une boisson")

public class BoissonDTO  implements Serializable {
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

  public BoissonDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * id of the drink
   * @return idBoisson
  */
  @ApiModelProperty(readOnly = true, value = "id of the drink")


  public Integer getIdBoisson() {
    return id;
  }

  public void setIdBoisson(Integer idBoisson) {
    this.id = idBoisson;
  }

  public BoissonDTO nom(String nom) {
    this.nom = nom;
    return this;
  }

  /**
   * name of the drink
   * @return nom
  */
  @ApiModelProperty(readOnly = true, value = "name of the drink")


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public BoissonDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of the drink
   * @return description
  */
  @ApiModelProperty(readOnly = true, value = "description of the drink")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BoissonDTO prix(Integer prix) {
    this.prix = prix;
    return this;
  }

  /**
   * price of the drink
   * @return prix
  */
  @ApiModelProperty(readOnly = true, value = "price of the drink")


  public Integer getPrix() {
    return prix;
  }

  public void setPrix(Integer prix) {
    this.prix = prix;
  }

  public BoissonDTO note(Integer note) {
    this.note = note;
    return this;
  }

  /**
   * note of the drink
   * @return note
  */
  @ApiModelProperty(readOnly = true, value = "note of the drink")


  public Integer getNote() {
    return note;
  }

  public void setNote(Integer note) {
    this.note = note;
  }

  public BoissonDTO urlImage(String urlImage) {
    this.urlImage = urlImage;
    return this;
  }

  /**
   * the url imagr of the drink
   * @return urlImage
  */
  @ApiModelProperty(readOnly = true, value = "the url imagr of the drink")


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
    BoissonDTO boissonDTO = (BoissonDTO) o;
    return Objects.equals(this.id, boissonDTO.id) &&
        Objects.equals(this.nom, boissonDTO.nom) &&
        Objects.equals(this.description, boissonDTO.description) &&
        Objects.equals(this.prix, boissonDTO.prix) &&
        Objects.equals(this.note, boissonDTO.note) &&
        Objects.equals(this.urlImage, boissonDTO.urlImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nom, description, prix, note, urlImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoissonDTO {\n");

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

