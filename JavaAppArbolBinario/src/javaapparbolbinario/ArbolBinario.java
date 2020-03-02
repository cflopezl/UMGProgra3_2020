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
    
    public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha)
    {
        return new Nodo(ramaIzqda, dato, ramaDrcha);
    }
    
    public void preorden(Nodo raiz){
        //1. visitar la raiz
        if(raiz!=null){
            System.out.print(raiz.valorNodo()+",");
        //2. recorrer en preorden la rama izquierda
        preorden(raiz.subarbolIzdo());
        //3. recorrer en preorden la rama derecha
        preorden(raiz.subarbolDcho());
        }
    }
}
