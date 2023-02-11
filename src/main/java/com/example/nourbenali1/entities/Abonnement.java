package com.example.nourbenali1.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Date;

@Entity
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numAbon ;
    @Temporal(TemporalType.DATE)
    private Date dateDebut ;
    @Temporal(TemporalType.DATE)
    private Date dateFin ;
    private float prixAbon ;
    private TypeAbonnement typeAbon ;

    public Abonnement() {
    }

    public Abonnement(long numAbon, Date dateDebut, Date dateFin, float prixAbon, TypeAbonnement typeAbon) {
        this.numAbon = numAbon;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prixAbon = prixAbon;
        this.typeAbon = typeAbon;
    }

    public long getNumAbon() {
        return numAbon;
    }

    public void setNumAbon(long numAbon) {
        this.numAbon = numAbon;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public float getPrixAbon() {
        return prixAbon;
    }

    public void setPrixAbon(float prixAbon) {
        this.prixAbon = prixAbon;
    }

    public TypeAbonnement getTypeAbon() {
        return typeAbon;
    }

    public void setTypeAbon(TypeAbonnement typeAbon) {
        this.typeAbon = typeAbon;
    }
}
