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
public class ArbolBinario {
    protected Nodo raiz;
    
    public ArbolBinario()
    {
    raiz = null;
    }
    
    public ArbolBinario(Nodo raiz)
    {
    this.raiz = raiz;
    }
    
    public Nodo raizArbol()
    {
    return raiz;
    }
    
    // Comprueba el estatus del árbol
    boolean esVacio()
    {
    return raiz == null;
    }
    
    public static Nodo nuevoArbol(
    Nodo ramaIzqda, Object dato, Nodo ramaDrcha)
    {
    return new Nodo(ramaIzqda, dato, ramaDrcha);
    }
    
    public void preorden(Nodo nodo){
        if(nodo!=null){
            System.out.print(nodo.valorNodo()+",");
            if(nodo.izdo!=null)
                preorden(nodo.izdo);
            if(nodo.dcho!=null)
                preorden(nodo.dcho);
        }
    }
    
        public void inorden(Nodo nodo){
        if(nodo!=null){
            
            if(nodo.izdo!=null)
                inorden(nodo.izdo);
            System.out.print(nodo.valorNodo()+",");
            if(nodo.dcho!=null)
                inorden(nodo.dcho);
        }
    }
        
        
                public void postorden(Nodo nodo){
        if(nodo!=null){
            
            if(nodo.izdo!=null)
                postorden(nodo.izdo);
            
            if(nodo.dcho!=null)
                postorden(nodo.dcho);
            
            System.out.print(nodo.valorNodo()+",");
        }
       } 
}
