package com.project.white_walker;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Employe {
    private String nom;
    private String prenom;
    private String numeroMatricule;
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;
    private LocalDate dateFinContrat;
    private double salaireBrut;
    private double salaireNet;
    private Categorie categorie;

    public Employe(String nom, String prenom, String numeroMatricule, LocalDate dateNaissance, LocalDate dateEmbauche, LocalDate dateFinContrat, double salaireBrut, Categorie categorie) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroMatricule = numeroMatricule;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.dateFinContrat = dateFinContrat;
        this.salaireBrut = salaireBrut;
        this.salaireNet = salaireBrut * 0.8;
        this.categorie = categorie;
    }


    public void setSalaireBrut(double salaireBrut) {
        this.salaireBrut = salaireBrut;
        this.salaireNet = salaireBrut * 0.8;
    }
}

