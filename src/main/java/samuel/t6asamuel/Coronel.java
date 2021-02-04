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
public class Coronel extends Soldado{
    private int aumentoSueldoRango;
    private int aniosAntiguedad;
    
    public Coronel(int aumentoSueldoRango, int aniosAntiguedad, String arma, int sueldo) {
        super(arma, sueldo);
        this.aumentoSueldoRango = aumentoSueldoRango;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public int getAumentoSueldoRango() {
        return aumentoSueldoRango;
    }

    public void setAumentoSueldoRango(int aumentoSueldoRango) {
        this.aumentoSueldoRango = aumentoSueldoRango;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    @Override
    public String toString() {
        return super.toString()+" SoldadoRaso{" + "aumentoSueldoRango=" + aumentoSueldoRango + ", aniosAntiguedad=" + aniosAntiguedad + '}';
    }
}
