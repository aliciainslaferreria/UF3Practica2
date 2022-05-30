package uf3practica2;


import uf3practica2.Copia;
import java.util.ArrayList;

public class Lector {

    private final int ID;

    private ArrayList<Copia> llibresPrestats = new ArrayList();

    public Lector(int id) {
        this.ID = id;
    }

    public void demanarLlibre(Copia llibre) {
        if(llibresPrestats.size() < 3){
        llibresPrestats.add(llibre);
    } else {
            System.out.println("No pots demanar més llibres");
        }
    }

    public void tornarLlibre(Copia llibre) {
        llibresPrestats.remove(llibre);
    }

    public int getId() {
        return ID;
    }

    public String getLlibresPrestats() {
        return llibresPrestats.toString();
    }
}
