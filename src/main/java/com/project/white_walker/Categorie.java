package com.project.white_walker;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Categorie {
    private String nom;
    private int heuresNormalesParSemaine;
    private double salaireParSemaine;

    public Categorie(String nom, int heuresNormalesParSemaine, double salaireParSemaine) {
        this.nom = nom;
        this.heuresNormalesParSemaine = heuresNormalesParSemaine;
        this.salaireParSemaine = salaireParSemaine;
    }

    public double getTauxHoraire() {
        return salaireParSemaine / heuresNormalesParSemaine;
    }
}

