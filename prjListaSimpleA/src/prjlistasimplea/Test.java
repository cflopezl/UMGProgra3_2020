/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjlistasimplea;

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
        Lista listaNumeros = new Lista();
        listaNumeros.agregar(10);
        listaNumeros.mostrar();
        listaNumeros.agregar(75);
        listaNumeros.mostrar();
        listaNumeros.agregar(90);
        listaNumeros.mostrar();
        listaNumeros.agregar(1);
        listaNumeros.mostrar();
    }
    
}
