/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohash;

import java.util.Objects;

/**
 *
 * @author chris
 */
public class Alumno {
    private String carne;
    private String nombre;
    public static int tamanio;

    public Alumno(String carne, String nombre) {
        this.carne = carne;
        this.nombre = nombre;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        long hash = carne.hashCode()+nombre.hashCode();        
        return (int)hash % tamanio;
    }    
    
}
