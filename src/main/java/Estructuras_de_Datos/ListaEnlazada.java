package Estructuras_de_Datos;

/**
 *
 * @author RODRIGO
 */
import Modelo.Producto;

public class ListaEnlazada {

    private Nodo inicio;
    private Nodo p;
    
    public int longitud=0;
    
    public void insertarInicio(Producto producto) {
        Nodo nuevo = new Nodo(producto);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        longitud++;
    }

    public void insertarUltimo(Producto producto) {
        Nodo nuevo = new Nodo(producto);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            p = inicio;
            while (p.getSiguiente() != null) {
                p = p.getSiguiente();
            }
            p.setSiguiente(nuevo);
        }
        longitud++;
    }

    public void insertarDespues(Producto producto, Producto des) {
        Nodo nuevo = new Nodo(producto);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            p = inicio;
            while (p.getSiguiente() != null && !p.getProducto().equals(des)) {
                p = p.getSiguiente();
            }
            if (p.getProducto().equals(des)) {
                nuevo.setSiguiente(p.getSiguiente());
                p.setSiguiente(nuevo);
            }
        }
        longitud++;
    }

    public void eliminarPrincipio() {
        if (inicio != null) {
            inicio = inicio.getSiguiente();
            longitud--;
        }
    }

    public void eliminarUltimo() {
        if (inicio != null) {
            if (inicio.getSiguiente() == null) {
                inicio = null;
            } else {
                p = inicio;
                while (p.getSiguiente().getSiguiente() != null) {
                    p = p.getSiguiente();
                }
                p.setSiguiente(null);

            }
            longitud--;
        }
    }

    public void eliminar(Producto producto) {
        if (inicio != null) {
            if (inicio.getProducto().equals(producto)) {
                inicio = inicio.getSiguiente();
                longitud--;
            } else {
                p = inicio;
                while (p.getSiguiente() != null && !p.getSiguiente().getProducto().equals(producto)) {
                    p = p.getSiguiente();
                }
                if(p.getSiguiente() != null && p.getSiguiente().getProducto().equals(producto)){
                    p.setSiguiente(p.getSiguiente().getSiguiente());
                    longitud--;
                }
            }
        }
    }
    
    public boolean existe(Producto producto){
        boolean val = false;
        if(inicio != null){
            p = inicio;
            while(p.getSiguiente()!= null && !p.getProducto().equals(producto)){
                p = p.getSiguiente();
            }
            if(p.getProducto().equals(producto)){
                val = true;
            }
        }
        return val;
    }

    public Producto retornar(int i){
        Producto producto = null;
        if(inicio != null && i<longitud){
            p = inicio;
            int contador = 0;
            while(contador<i){
                p = p.getSiguiente();
                contador++;
            }
            producto = p.getProducto();
        }
        return producto;
    }
    
    public String mostrar() {
        String cadena = "";

        p = inicio;
        while (p != null) {
            cadena += p.getProducto() + "\n";
            p = p.getSiguiente();
        }

        return cadena;
    }

}
