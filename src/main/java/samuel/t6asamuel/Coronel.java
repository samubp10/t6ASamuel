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
public class Coronel extends Soldado {

    private int PlusCoronel;
    private int aniosAntiguedad;

    public Coronel(int PlusCoronel, int aniosAntiguedad, String arma, int PlusSoldado, int sueldo) {
        super(arma, PlusSoldado, sueldo);
        this.PlusCoronel = PlusCoronel;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public int getPlusCoronel() {
        return PlusCoronel;
    }

    public void setPlusCoronel(int PlusCoronel) {
        this.PlusCoronel = PlusCoronel;
    }

  

    public void anadirAnioAntiguedad(int aniosMas) {
        aniosAntiguedad =+ aniosMas;
    }

    

    @Override
    public String toString() {
        return "Coronel{" + "PlusCoronel=" + PlusCoronel + ", aniosAntiguedad=" + aniosAntiguedad + '}';
    }

    @Override

    public void aumentarSueldo(int aumenta) {

        PlusCoronel += aumenta;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.PlusCoronel;
        hash = 37 * hash + this.aniosAntiguedad;
        return hash;
    }

    @Override
    public void MostrarSueldo() {
        System.out.println(PlusCoronel);
    }
    
    @Override
    public boolean equals(Object obj) {
       if (!super.equals(obj)){
            return false;
        }
    
        final Coronel other = (Coronel) obj;
        
        if (this.PlusCoronel != other.PlusCoronel) {
            return false;
        }
        if (this.aniosAntiguedad != other.aniosAntiguedad) {
            return false;
        }
        return true;
    }
    
    
}
