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
public class Nodo {
    private Object dato;
    private Nodo siguiente;
    
    Nodo(Object dato){
        this.dato=dato;
        this.siguiente=null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
