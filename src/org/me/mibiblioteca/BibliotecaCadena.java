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

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    private int getAltura() {
        return altura;
    }

    public BibliotecaCadena() {
    }

    /**
     * @param altura the altura to set
     */
    private void setAltura(int altura) {
        this.altura = altura;
    }
    
     public int altura;
    
    
     private int peso;
     
    /**
        * Funcion que normaliza una cadena, quitando los blancos y/o utilizando tabulaciones del conocimiento y del final 
        * reemplazando el exceso de los mismos entre paalabras por un unico blanco. Si recibiera null devuelve una cadena vacia 
        * @param cad Cadena a normalizar
        * @return Cadena normalizada       
    */
     
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
