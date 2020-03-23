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
public class TestABB {
        public static void main(String []args){
        ArbolBinarioBusqueda a = new ArbolBinarioBusqueda();   
        Nodo n;
        try{
            
            a.agregarNodo(new Estudiante(50,"Juan"));
            a.agregarNodo(new Estudiante(25,"Pedro"));            
            a.agregarNodo(new Estudiante(17,"Pablo"));
            a.agregarNodo(new Estudiante(75,"Augusto"));            
            a.agregarNodo(new Estudiante(81,"Maria"));            
            a.agregarNodo(new Estudiante(55,"Karen"));            
            a.mostrarArbol(a.raiz, "");
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
