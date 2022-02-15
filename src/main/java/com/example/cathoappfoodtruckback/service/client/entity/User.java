package com.example.cathoappfoodtruckback.service.client.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "nom")
    @Type(type = "org.hibernate.type.TextType")
    private String nom;

    @Lob
    @Column(name = "prenom")
    @Type(type = "org.hibernate.type.TextType")
    private String prenom;

    @Lob
    @Column(name = "url_image")
    @Type(type = "org.hibernate.type.TextType")
    private String urlImage;

    @Column(name = "solde")
    private Double solde;

    @Lob
    @Column(name = "formation")
    @Type(type = "org.hibernate.type.TextType")
    private String formation;

    @Lob
    @Column(name = "pseudo")
    @Type(type = "org.hibernate.type.TextType")
    private String pseudo;

    @Lob
    @Column(name = "mdp")
    @Type(type = "org.hibernate.type.TextType")
    private String mdp;

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
