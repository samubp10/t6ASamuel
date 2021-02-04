/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.t6asamuel;

import java.util.ArrayList;

/**
 *
 * @author Samuel
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trabajador trabajador1 = new Trabajador(150);
        Trabajador trabajador2 = new Trabajador(1500);
        ArrayList <Trabajador> Trabajadores = new ArrayList<>();
        Soldado soldado1 = new Soldado("Fusil", 200, 150);
        Soldado soldado2 = new Soldado("Francotirador", 500, 80);
        SoldadoRaso raso1 = new SoldadoRaso(20, 500, "Fusil", 40, 100);
        SoldadoRaso raso2 = new SoldadoRaso(40, 600, "Pistola", 40, 100);
        Coronel Coronel1 = new Coronel(50, 30, "Lanzacohetes", 80, 1000);
        Coronel Coronel2 = new Coronel(70, 50, "Mortero", 30, 10000);
    }
    
}
