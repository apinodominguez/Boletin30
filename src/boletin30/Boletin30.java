package boletin30;

import java.util.ArrayList;

public class Boletin30 {

    public static void main(String[] args) {
        
        SeleccionFutbol sele = new SeleccionFutbol();
        Futbolista fut = new Futbolista(10, "Delantero", 531887, "Marco", "Polo", 20);
        System.out.println(fut.toString());
        
        
         ArrayList <SeleccionFutbol>l = new ArrayList<>();
        l.add(sele);
        l.add(fut);
        Metodos.amosar(l);
        
        
    }
    
}
