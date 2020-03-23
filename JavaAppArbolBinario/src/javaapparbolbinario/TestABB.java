/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapparbolbinario;

/**
 *
 * @author chris
 */
public class TestABB {
    public static void main(String[] args) {
        ArbolBinarioBusqueda a = new ArbolBinarioBusqueda();
        try{
            a.insertar(new Estudiante(50,"Juan"));
            a.insertar(new Estudiante(25,"Pedro"));
            a.insertar(new Estudiante(17,"Pablo"));
            a.insertar(new Estudiante(75,"Augusto"));
            a.insertar(new Estudiante(81,"Maria"));
            a.insertar(new Estudiante(55,"Karen"));
            a.mostrarArbol(a.raiz, "");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
