/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duplicados;

/**
 *
 * @author mafer
 */
public class Funciones {
    private Nodo cima;
    int tamaño;
   
    public Funciones(){
        cima = null;
        tamaño = 0;
    }
   
    public boolean isEmpty(){
        return cima == null;
    }
   
    public void push(String dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamaño++;
    }
   
    public String pop(){
        String aux = cima.dato;
        cima=cima.siguiente;
        tamaño--;
        return aux;
    }
   
    public String cima(){
        return cima.dato;
    }
   
    public int size(){
        return tamaño;
    }
   
    public void limpiar(){
        while(!isEmpty()){
            pop();
        }
    }
    
}
