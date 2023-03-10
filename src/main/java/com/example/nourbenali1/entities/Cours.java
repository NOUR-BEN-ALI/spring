package com.example.nourbenali1.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCours ;
    private int niveau ;

    @Enumerated(EnumType.STRING)
    private TypeCours typeCours ;

    @Enumerated(EnumType.STRING)
    private Support support ;
    private  float prix ;
    private  int creneau ;

    public long getNumCours() {
        return numCours;
    }

    public void setNumCours(long numCours) {
        this.numCours = numCours;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public TypeCours getTypeCours() {
        return typeCours;
    }

    public void setTypeCours(TypeCours typeCours) {
        this.typeCours = typeCours;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getCreneau() {
        return creneau;
    }

    public void setCreneau(int creneau) {
        this.creneau = creneau;
    }

    public Cours() {
    }

    public Cours(long numCours, int niveau, TypeCours typeCours, Support support, float prix, int creneau) {
        this.numCours = numCours;
        this.niveau = niveau;
        this.typeCours = typeCours;
        this.support = support;
        this.prix = prix;
        this.creneau = creneau;
    }
}
