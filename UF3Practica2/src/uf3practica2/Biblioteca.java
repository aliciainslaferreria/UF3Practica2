package uf3practica2;


import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Copia> llibres;

    private ArrayList<Lector> lectors;

    private String nom;

    public Biblioteca(String nom) {
    }

    public void afegirLector(Lector lector) {
        lectors.add(lector);
    }

    public void afegirCopia(Copia copia) {
        llibres.add(copia);
    }

    public Copia veureCopia(int id) {
        for(Copia copia : llibres){
            if(copia.getId() == id){
                return copia;
            }
        }
        return null;
    }

    public Lector veureLector(int id) {
        for(Lector lector : lectors){
            if(lector.getId() == id){
                return lector;
            }
        }
        return null;
    }
}
