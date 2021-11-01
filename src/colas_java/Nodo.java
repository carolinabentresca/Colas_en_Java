/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas_java;


public class Nodo {
    public int dato;
    public  Nodo sig;

    public Nodo(int dato) {
        this.dato = dato;
        sig = null;
    } 

    public int getDato() {
        return dato;
    }

    public Nodo getSig() {
        return sig;
    }
    
    
}
