/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinariosecciona;

/**
 *
 * @author chris
 */
public class Estudiante implements Comparador{
    int numMat;
    String nombre;

    public Estudiante(int numMat, String nombre) {
        this.numMat = numMat;
        this.nombre = nombre;
    }

    public int getNumMat() {
        return numMat;
    }

    public void setNumMat(int numMat) {
        this.numMat = numMat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    

    @Override
    public boolean igualQue(Object q) {
        Estudiante e = (Estudiante)q;
        return this.numMat == e.numMat;
    }

    @Override
    public boolean menorQue(Object q) {
                Estudiante e = (Estudiante)q;
        return this.numMat < e.numMat;}

    @Override
    public boolean mayorQue(Object q) {
                Estudiante e = (Estudiante)q;
        return this.numMat > e.numMat;
        }
}
