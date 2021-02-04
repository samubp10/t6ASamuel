/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.t6asamuel;

import java.util.Objects;

/**
 *
 * @author Samuel
 */
public class Soldado extends Trabajador {

    private String arma;
    private int PlusSoldado;

    @Override
    public String toString() {
        return super.toString() + " \nSoldado{" + "arma=" + arma + '}';
    }

    
    public void MostrarSueldo() {
        System.out.println(PlusSoldado);
    }

    public Soldado(String arma, int PlusSoldado, int sueldo) {
        super(sueldo);
        this.arma = arma;
        this.PlusSoldado = PlusSoldado;
    }

    public void cambiarPistola() {
        arma = "Glock";
        System.out.println("Su pistola ha cambiado, ahora es una glock");
    }

    @Override
    public void aumentarSueldo(int aumenta) {

        PlusSoldado += aumenta;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getPlusSoldado() {
        return PlusSoldado;
    }

    public void setPlusSoldado(int sueldoSoldado) {
        this.PlusSoldado = sueldoSoldado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.arma);
        hash = 47 * hash + this.PlusSoldado;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)){
            return false;
        }
    
        final Soldado other = (Soldado) obj;
        
        if (this.arma != other.arma) {
            return false;
        }
        
        if (this.PlusSoldado != other.PlusSoldado) {
            return false;
        }
        return true;
    }

}
