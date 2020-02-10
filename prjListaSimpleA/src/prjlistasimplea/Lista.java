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
public class Lista {
    public int cantidad;
    public Nodo inicio;
    public Nodo fin;
    public Nodo actual;
    
    Lista(){
        inicio=null;
        fin=null;
        cantidad=0;
    }
    
    public void agregar(Object valor){
        //1. instanciar el objeto Nodo
        actual = new Nodo(valor);
        //2. verificar si la lista esta vacia
        if(inicio==null){
        //2.1 escenario lista vacia
            inicio=actual;
            fin=actual;
        }else{
        //2.2 escenario lista NO vacia
            fin.setSiguiente(actual);
            fin=actual;
        }
        //3 incrementar la cantidad
        cantidad++;
    }
    
    public void mostrar(){
        actual = inicio;
        System.out.println("Cantidad: "+cantidad);
        while (actual != null) {
            System.out.print(actual.getDato() + " => ");
            actual = actual.getSiguiente();
        }
        System.out.println("");
        System.out.println("=============");
    }
}
