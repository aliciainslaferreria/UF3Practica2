package uf3practica2;


import uf3practica2.Autor;

public abstract class Llibre {

    private String nom;

    private String tipus;

    private String editorial;

    private int any;

    private Autor autor;
    
    public Llibre(String nom, String tipus, String editorial, int any, Autor autor){
        this.nom = nom;
        this.tipus = tipus;
        this.editorial = editorial;
        this.any = any;
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAny() {
        return any;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getTipus() {
        return tipus;
    }

    public String getNom() {
        return nom;
    }
    
    @Override
    public String toString(){
        return nom + " " + tipus + " " + editorial + " " + any + " " + autor;
    }
}
