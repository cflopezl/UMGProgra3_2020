/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohash;

/**
 *
 * @author chris
 */
public class EjemploHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Un arreglo para almacenar la información de una Tabla Hash
        //Ejemplo
        Catedratico.tamanio=35;
        Catedratico []arrCat = new Catedratico[Catedratico.tamanio];
        
        Catedratico c = new Catedratico(10925,"Christian Lopez");
        arrCat[c.hashCode()]=c;
        c = new Catedratico(3500,"Alfredo Ochoa");
        arrCat[c.hashCode()]=c;
        c = new Catedratico(9300,"Armando Rivera");
        arrCat[c.hashCode()]=c;
        
        //---------------------------------------------------
        //Ejemplo para almacenar otro objeto
        Alumno.tamanio=101;
        Alumno []arrAlumno = new Alumno[Alumno.tamanio];
        Alumno a = new Alumno("2010-7690-123456", "Walter Garcia");
        System.out.println(a.hashCode());
        a = new Alumno("2018-7690-1456", "Juan Juarez");
        System.out.println(a.hashCode());
        a = new Alumno("2014-7690-98754", "Paty Navas");
        System.out.println(a.hashCode());
        
        
    }
    
}
