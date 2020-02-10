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
public class ListaEnlazada {
    
    public Nodo inicio;
    public Nodo fin;
    public Nodo anterior;
    public Nodo actual;
    public int cantidad;
    
    
    public ListaEnlazada(){
        inicio=null;
        fin=null;
        cantidad=0;
    }
    
    public void insertar(Object valor){
        //1. Definir el objeto Nodo
        actual = new Nodo(valor);
        //2. Validar el inicio
        if(inicio==null){//2.1 escenario
            inicio=actual;
            fin=actual;
        }else{//2.2 escenario
            fin.setSiguiente(actual);
            fin=actual;
        }
        cantidad++;
    }
    
    public void mostrar(){
        actual = inicio;
        System.out.println("La cantidad de nodos de la lista es: " + cantidad);
                
        while(actual!=null){
            //1. mostra el dato
            System.out.print(actual.getDato()+" -> ");
            //2. mover el apuntador actual al siguiente elemento de la lista
            actual=actual.getSiguiente();
        }
        System.out.println("--------------------------------------------------------");
    }
}
