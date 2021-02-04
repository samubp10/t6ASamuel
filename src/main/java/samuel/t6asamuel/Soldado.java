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
public class Soldado extends Trabajador {

    private String arma;

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return super.toString()+" \nSoldado{" + "arma=" + arma + '}';
    }

    public Soldado(String arma, int sueldo) {
        super(sueldo);
        this.arma = arma;
    }
    
    @Override
    public void aumentarSueldo(int aumenta){
        
         super.getSueldo() += aumenta;
    }
}
