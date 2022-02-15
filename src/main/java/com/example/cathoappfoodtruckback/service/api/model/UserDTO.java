package com.example.cathoappfoodtruckback.service.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * un utilisateur
 */
@ApiModel(description = "un utilisateur")

public class UserDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id_user")
  private Integer idUser;

  @JsonProperty("nom")
  private String nom;

  @JsonProperty("prenom")
  private String prenom;

  @JsonProperty("url_image")
  private String urlImage;

  @JsonProperty("solde")
  private Double solde;

  @JsonProperty("formation")
  private String formation;

  @JsonProperty("pseudo")
  private String pseudo;

  @JsonProperty("tocken")
  private String tocken;

  public UserDTO idUser(Integer idUser) {
    this.idUser = idUser;
    return this;
  }

  /**
   * id of the Menu
   * @return idUser
  */
  @ApiModelProperty(readOnly = true, value = "id of the Menu")


  public Integer getIdUser() {
    return idUser;
  }

  public void setIdUser(Integer idUser) {
    this.idUser = idUser;
  }

  public UserDTO nom(String nom) {
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

  public UserDTO prenom(String prenom) {
    this.prenom = prenom;
    return this;
  }

  /**
   * description of the Menu
   * @return prenom
  */
  @ApiModelProperty(readOnly = true, value = "description of the Menu")


  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public UserDTO urlImage(String urlImage) {
    this.urlImage = urlImage;
    return this;
  }

  /**
   * price of the Menu
   * @return urlImage
  */
  @ApiModelProperty(readOnly = true, value = "price of the Menu")


  public String getUrlImage() {
    return urlImage;
  }

  public void setUrlImage(String urlImage) {
    this.urlImage = urlImage;
  }

  public UserDTO solde(Double solde) {
    this.solde = solde;
    return this;
  }

  /**
   * note of the Menu
   * @return solde
  */
  @ApiModelProperty(readOnly = true, value = "note of the Menu")


  public Double getSolde() {
    return solde;
  }

  public void setSolde(Double solde) {
    this.solde = solde;
  }

  public UserDTO formation(String formation) {
    this.formation = formation;
    return this;
  }

  /**
   * the url imagr of the Menu
   * @return formation
  */
  @ApiModelProperty(readOnly = true, value = "the url imagr of the Menu")


  public String getFormation() {
    return formation;
  }

  public void setFormation(String formation) {
    this.formation = formation;
  }

  public UserDTO pseudo(String pseudo) {
    this.pseudo = pseudo;
    return this;
  }

  /**
   * the url imagr of the Menu
   * @return pseudo
  */
  @ApiModelProperty(readOnly = true, value = "the url imagr of the Menu")


  public String getPseudo() {
    return pseudo;
  }

  public void setPseudo(String pseudo) {
    this.pseudo = pseudo;
  }

  public UserDTO tocken(String tocken) {
    this.tocken = tocken;
    return this;
  }

  /**
   * the url imagr of the Menu
   * @return tocken
  */
  @ApiModelProperty(readOnly = true, value = "the url imagr of the Menu")


  public String getTocken() {
    return tocken;
  }

  public void setTocken(String tocken) {
    this.tocken = tocken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDTO userDTO = (UserDTO) o;
    return Objects.equals(this.idUser, userDTO.idUser) &&
        Objects.equals(this.nom, userDTO.nom) &&
        Objects.equals(this.prenom, userDTO.prenom) &&
        Objects.equals(this.urlImage, userDTO.urlImage) &&
        Objects.equals(this.solde, userDTO.solde) &&
        Objects.equals(this.formation, userDTO.formation) &&
        Objects.equals(this.pseudo, userDTO.pseudo) &&
        Objects.equals(this.tocken, userDTO.tocken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUser, nom, prenom, urlImage, solde, formation, pseudo, tocken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDTO {\n");

    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    prenom: ").append(toIndentedString(prenom)).append("\n");
    sb.append("    urlImage: ").append(toIndentedString(urlImage)).append("\n");
    sb.append("    solde: ").append(toIndentedString(solde)).append("\n");
    sb.append("    formation: ").append(toIndentedString(formation)).append("\n");
    sb.append("    pseudo: ").append(toIndentedString(pseudo)).append("\n");
    sb.append("    tocken: ").append(toIndentedString(tocken)).append("\n");
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

