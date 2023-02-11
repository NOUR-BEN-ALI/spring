package com.example.nourbenali1.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long NumMoniteur;
    private String nomM ;
    private String prenomM ;

    @Temporal(TemporalType.DATE)
    private Date dateReçu;

    public Moniteur() {
    }

    public Moniteur(long numMoniteur, String nomM, String prenomM, Date dateReçu) {
        NumMoniteur = numMoniteur;
        this.nomM = nomM;
        this.prenomM = prenomM;
        this.dateReçu = dateReçu;
    }

    public long getNumMoniteur() {
        return NumMoniteur;
    }

    public void setNumMoniteur(long numMoniteur) {
        NumMoniteur = numMoniteur;
    }

    public String getNomM() {
        return nomM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public String getPrenomM() {
        return prenomM;
    }

    public void setPrenomM(String prenomM) {
        this.prenomM = prenomM;
    }

    public Date getDateReçu() {
        return dateReçu;
    }

    public void setDateReçu(Date dateReçu) {
        this.dateReçu = dateReçu;
    }
}
