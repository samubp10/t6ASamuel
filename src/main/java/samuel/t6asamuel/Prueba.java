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
        //Creo los objetos de la clase trabajador
        Trabajador trabajador1 = new Trabajador(150);
        Trabajador trabajador2 = new Trabajador(1500);
        //Creo el arraylist de la superclase Trbajador
        ArrayList<Trabajador> Trabajadores = new ArrayList<>();
        //Creo los objetos de la clase Soldado
        Soldado soldado1 = new Soldado("Fusil", 200, 150);
        Soldado soldado2 = new Soldado("Francotirador", 500, 80);
       //Creo los objetos de la clase SoldadoRaso
        SoldadoRaso raso1 = new SoldadoRaso(20, 500, "Fusil", 40, 100);
        SoldadoRaso raso2 = new SoldadoRaso(40, 600, "Pistola", 40, 100);
        //Creo los objetos de la clase Coronel
        Coronel Coronel1 = new Coronel(50, 30, "Lanzacohetes", 80, 1000);
        Coronel Coronel2 = new Coronel(70, 50, "Mortero", 30, 10000);
        //Añado todos los objetos a Trabajadores
        Trabajadores.add(trabajador1);
        Trabajadores.add(trabajador2);
        //conversiones implícitas
        Trabajadores.add(soldado1);
        Trabajadores.add(soldado2);
        Trabajadores.add(raso1);
        Trabajadores.add(raso2);
        Trabajadores.add(Coronel1);
        Trabajadores.add(Coronel2);
        
        //Recorro Trabajadores haciendo conversiones explícitas, implícitas y ejemcutando
        //los métodos de los diferentes objetos
        for (Trabajador t : Trabajadores) {
            t.aumentarSueldo(50);
            //Conversiones explícitas
            if (t instanceof Soldado) {
                ((Soldado) t).MostrarSueldo();
            }
            if (t instanceof SoldadoRaso) {
                ((SoldadoRaso) t).cambiarPistola();
            }
            if (t instanceof Coronel) {
                ((Coronel) t).anadirAnioAntiguedad(5);
            }
        }
        System.out.println(Trabajadores.indexOf(raso2));
        
        System.out.println(Trabajadores.contains(raso1));
        Trabajadores.remove(Coronel1);
        
        
    }
    
}
