package com.example.cathoappfoodtruckback.service.client.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "boissons")
public class Boisson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_boisson", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "nom")
    @Type(type = "org.hibernate.type.TextType")
    private String nom;

    @Lob
    @Column(name = "url_image")
    @Type(type = "org.hibernate.type.TextType")
    private String urlImage;

    @Lob
    @Column(name = "description")
    @Type(type = "org.hibernate.type.TextType")
    private String description;

    @Column(name = "prix")
    private Integer prix;

    @Column(name = "note")
    private Integer note;

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
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
