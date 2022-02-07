package com.example.cathoappfoodtruckback.service.client.entity;

import javax.persistence.*;

@Entity
@Table(name = "desserts")
public class Dessert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dessert", nullable = false)
    private Integer id;

    @Column(name = "nom", length = 11)
    private String nom;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "url_image", length = 200)
    private String urlImage;

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

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
