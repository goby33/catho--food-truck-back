package com.example.cathoappfoodtruckback.service.client.entity;

import javax.persistence.*;

@Entity
@Table(name = "plats")
public class Plat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plat", nullable = false)
    private Integer id;

    @Column(name = "nom")
    private Integer nom;

    @Column(name = "description")
    private Integer description;

    @Column(name = "note")
    private Integer note;

    @Column(name = "url_image")
    private Integer urlImage;

    @Column(name = "prix")
    private Integer prix;

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Integer getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(Integer urlImage) {
        this.urlImage = urlImage;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public Integer getDescription() {
        return description;
    }

    public void setDescription(Integer description) {
        this.description = description;
    }

    public Integer getNom() {
        return nom;
    }

    public void setNom(Integer nom) {
        this.nom = nom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
