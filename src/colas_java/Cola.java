/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas_java;


public class Cola {
   public Nodo inicio,fin;
   public int tam;

    public Cola() {
        this.inicio = null;
        this.fin = null;
        this.tam = 0;
    }
    //Método estaVacia
   public boolean estaVacia(){
       return inicio == null;
   }
   
   //Método insertar
   public void insertar(int elem){
     Nodo nodo = new Nodo(elem);
     if(estaVacia()){
        inicio = nodo; 
     }else{
         fin.sig = nodo;   
     }
         fin = nodo;
         tam++;
   }
   
   //Método eliminar
   public int eliminar(){
       int aux = inicio.dato;
       inicio = inicio.sig;
       tam--;
       return aux;
   }
   
   //Método inicio Cola
   public int inicioCola(){
       return inicio.dato;
   }
   
   //Método tamaño Cola
   public int tamañoCola(){
       return tam;
   }
    
}
