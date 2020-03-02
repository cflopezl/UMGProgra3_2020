/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapparbolbinario;

import java.util.Stack;

/**
 *
 * @author chris
 */
public class TestArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario arbol;
        Nodo a1, a2, a;
        Stack pila = new Stack();
        
        a1 = ArbolBinario.nuevoArbol(null,"Maria",null);
        a2 = ArbolBinario.nuevoArbol(null,"Rodrigo",null);
        a = ArbolBinario.nuevoArbol(a1, "Esperanza", a2);
        pila.push(a);
        a1 = ArbolBinario.nuevoArbol(null,"Anyora",null);
        a2 = ArbolBinario.nuevoArbol(null,"Abel",null);
        a = ArbolBinario.nuevoArbol(a1, "M Jesus", a2);
        pila.push(a);
        
        a2=(Nodo)pila.pop();
        a1=(Nodo)pila.pop();
        a = ArbolBinario.nuevoArbol(a1, "Esperanza", a2);
        
        arbol = new ArbolBinario(a);
        arbol.preorden(arbol.raiz);
    }
   

}
