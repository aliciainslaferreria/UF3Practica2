package uf3practica2;


import java.util.ArrayList;
import java.util.Date;

public class Autor {

    private String nom;

    private String nacionalitat;

    private Date naixement;

    public Autor(String nom, String nacionalitat, Date naixement) {
        this.nom = nom;
        this.nacionalitat = nacionalitat;
        this.naixement = naixement;
    }

    public String getNom() {
        return nom;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public Date getNaixement() {
        return naixement;
    }

    @Override
    public String toString() {
        return nom + " " + nacionalitat + " " + naixement;
    }
}
