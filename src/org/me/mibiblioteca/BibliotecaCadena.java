/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.mibiblioteca;

/**
 *
 * @author juanpab Metodos para el manejo de cadenas
 */
public class BibliotecaCadena {
    public static String aTitulo(String cad){
        String []  aux =  cad.split("[ \t]+");
        cad="";
        int ciclo=0;
        while(ciclo<aux.length){
            try {
                cad += aux[ciclo].substring(0, 1).toUpperCase();
                cad += aux[ciclo].substring(1).toLowerCase();
                cad += " ";      
                
            } catch(IndexOutOfBoundsException e){
                //No hacer nada
            }
            ciclo++;
        }
        return cad.trim();
    }
    
}
