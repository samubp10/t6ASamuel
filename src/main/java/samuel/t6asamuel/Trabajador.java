/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.t6asamuel;

/**
 *
 * @author Samuel
 */
public class Trabajador {
    private int sueldoBase;

    public Trabajador(int sueldo) {
        this.sueldoBase = sueldo;
    }
    //Método A
    public void aumentarSueldo(int aumenta){
        
         sueldoBase += aumenta;
    }

    public int getSueldo() {
        return sueldoBase;
    }

    public void setSueldo(int sueldo) {
        this.sueldoBase = sueldo;
    }
//Polimorfismos
    @Override
    public String toString() {
        return "Trabajador{" + "sueldoBase=" + sueldoBase + '}';
    }
//Polimorfismos
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.sueldoBase;
        return hash;
    }
//Polimorfismos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trabajador other = (Trabajador) obj;
        if (this.sueldoBase != other.sueldoBase) {
            return false;
        }
        return true;
    }

   
    
}
