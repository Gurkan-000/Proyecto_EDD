
package Estructuras_de_Datos.ABB;

/**
 *
 * @author RODRIGO
 */

import Modelo.Producto;

public class Nodo {
    
    private Producto producto;
    
    private Nodo siguiente;
    
    private Nodo izquierda, derecha;
    
    public Nodo (Producto producto){
        this.producto = producto;
    }
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    
}
