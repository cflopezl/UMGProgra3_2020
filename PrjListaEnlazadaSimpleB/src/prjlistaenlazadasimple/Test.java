/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjlistaenlazadasimple;

/**
 *
 * @author chris
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertar(new Integer(50));
        lista.mostrar();
        lista.insertar(new Integer(100));
        lista.mostrar();
        lista.insertar(new Integer(75));
        lista.mostrar();
        lista.insertar(new Integer(1));
        lista.mostrar();
    }
    
}
