package com.example.cathoappfoodtruckback.service.client.entity;

import javax.persistence.*;

@Entity
@Table(name = "plats")
public class Plat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plat", nullable = false)
    private Integer id;

    @Column(name = "nom", length = 150)
    private String nom;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "note")
    private Integer note;

    @Column(name = "url_image", length = 150)
    private String urlImage;

    @Column(name = "prix")
    private Integer prix;

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

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
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
