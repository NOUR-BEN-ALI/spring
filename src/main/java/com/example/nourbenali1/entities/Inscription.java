package com.example.nourbenali1.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Inscription implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long NumInscription;
    public int NumSemaine ;

    public Inscription() {
    }

    public Inscription(Long numInscription, Integer numSemaine) {
        NumInscription = numInscription;
        NumSemaine = numSemaine;
    }

    public Long getNumInscription() {
        return NumInscription;
    }

    public void setNumInscription(Long numInscription) {
        NumInscription = numInscription;
    }

    public Integer getNumSemaine() {
        return NumSemaine;
    }

    public void setNumSemaine(Integer numSemaine) {
        NumSemaine = numSemaine;
    }

}
