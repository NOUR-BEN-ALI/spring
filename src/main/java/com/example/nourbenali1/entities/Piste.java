package com.example.nourbenali1.entities;

import com.sun.org.apache.xpath.internal.objects.XString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste ;
    private String nomPiste ;
    private Couleur couleur ;
    private int longuer ;
    private  int pente ;

    public long getNumPiste() {
        return numPiste;
    }

    public void setNumPiste(long numPiste) {
        this.numPiste = numPiste;
    }

    public String getNomPiste() {
        return nomPiste;
    }

    public void setNomPiste(String nomPiste) {
        this.nomPiste = nomPiste;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public int getLonguer() {
        return longuer;
    }

    public void setLonguer(int longuer) {
        this.longuer = longuer;
    }

    public int getPente() {
        return pente;
    }

    public void setPente(int pente) {
        this.pente = pente;
    }

    public Piste() {
    }

    public Piste(long numPiste, String nomPiste, Couleur couleur, int longuer, int pente) {
        this.numPiste = numPiste;
        this.nomPiste = nomPiste;
        this.couleur = couleur;
        this.longuer = longuer;
        this.pente = pente;
    }
}
