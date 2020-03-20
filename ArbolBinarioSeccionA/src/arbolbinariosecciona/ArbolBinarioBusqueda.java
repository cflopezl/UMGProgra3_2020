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
public class ArbolBinarioBusqueda extends ArbolBinario{
    public ArbolBinarioBusqueda() {
        super();
    }

    public ArbolBinarioBusqueda(Nodo raiz) {
        super(raiz);
    }
    
    public void agregarNodo(Object valor)throws Exception{
        Comparador dato = (Comparador) valor;
        raiz = insertar(raiz, dato);
    }
    
    //método interno para realizar la operación de inserción
        /*       
        //1. si la raiz es nula crear el nuevo elemento como raiz
        //2. Sino validamos si es menor o mayor para conocer su ubicación
        //2.1 Es menor => el nodo de la rama izquierda es la nueva raiz y regresamos al paso 1
        //2.2 es mayor => el nodo de la rama derecha es la nueva raiz y regresamos al paso 1
    }*/
    protected Nodo insertar(Nodo raizSub, Comparador dato) throws Exception
    {
        if (raizSub == null)
            raizSub = new Nodo(dato);
        else if (dato.menorQue(raizSub.valorNodo()))
        {
            Nodo iz;
            iz = insertar(raizSub.subarbolIzdo(), dato);
            raizSub.ramaIzdo(iz);
        }
        else if (dato.mayorQue(raizSub.valorNodo()))
        {
            Nodo dr;
            dr = insertar(raizSub.subarbolDcho(), dato);
            raizSub.ramaDcho(dr);
        }
        else throw new Exception("Nodo duplicado");
        return raizSub;
    }
}
