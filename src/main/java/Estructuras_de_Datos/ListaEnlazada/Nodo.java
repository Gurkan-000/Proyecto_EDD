
package Estructuras_de_Datos.ListaEnlazada;

/**
 *
 * @author RODRIGO
 */

import Modelo.Producto;

public class Nodo {
    
    private Producto producto;
    
    private Nodo siguiente;
    
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
    
}
