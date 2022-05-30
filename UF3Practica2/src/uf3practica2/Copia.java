package uf3practica2;


import uf3practica2.Autor;

public class Copia extends Llibre {

    private final int ID;

    private String estat;

    public Copia(String nom, String tipus, String editorial, int any, Autor autor, int id, String estat) {        
        super(nom, tipus, editorial, any, autor);
        this.ID = id;
        this.estat = estat;        
    }
        
    public void setEstat(String estat) {
        this.estat = estat;
    }

    public int getId() {
        return ID;
    }

    public String getEstat() {
        return estat;
    }

    public String toString() {
        return ID + " " + estat + " " + super.toString();
    }
}
