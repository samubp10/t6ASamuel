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
public class SoldadoRaso extends Soldado {

    private int PlusRaso;
    private int aniosAntiguedad;
//GETTER Y SETTERS
    public int getPlusRaso() {
        return PlusRaso;
    }

    public void setPlusRaso(int PlusRaso) {
        this.PlusRaso = PlusRaso;
    }
//Constructor
    public SoldadoRaso(int PlusRaso, int aniosAntiguedad, String arma, int PlusSoldado, int sueldo) {
        super(arma, PlusSoldado, sueldo);
        this.PlusRaso = PlusRaso;
        this.aniosAntiguedad = aniosAntiguedad;
    }
//Método exclusivo de la clase SoldadoRaso
    public void reducirSueldo(int reducir) {

        aniosAntiguedad += reducir;
    }
//Polimorfismo
    @Override
    public void aumentarSueldo(int aumenta) {

        PlusRaso += aumenta;
    }
//GETTER Y SETTERS
    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }
//Polimorfismo
    @Override
    public String toString() {
        return "SoldadoRaso{" + "PlusRaso=" + PlusRaso + ", aniosAntiguedad=" + aniosAntiguedad + '}';
    }
//Polimorfismo
    @Override
    public void MostrarSueldo() {
        System.out.println(PlusRaso);
    }
//Polimorfismo
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.PlusRaso;
        hash = 71 * hash + this.aniosAntiguedad;
        return hash;
    }
//Polimorfismo
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        final SoldadoRaso other = (SoldadoRaso) obj;

        if (this.PlusRaso != other.PlusRaso) {
            return false;
        }
        if (this.aniosAntiguedad != other.aniosAntiguedad) {
            return false;
        }
        return true;
    }

}
