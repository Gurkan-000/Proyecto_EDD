/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras_de_Datos.ABB;

import Modelo.Producto;

/**
 *
 * @author JOSE
 */
public class ABB {

    private Nodo raiz, p;

    public ABB() {
        raiz = null;
    }

    public void insertarNodo(Producto producto) {
        Nodo nuevo = new Nodo(producto);
        if (raiz == null)
            raiz = nuevo;
        else {
            p = raiz;
            insertarNodoR(p, nuevo);
        }
    }

    public void insertarNodoR(Nodo p, Nodo nuevo) {
        if (p == null)
            p = nuevo;
        else {
            int idNuevo = nuevo.getProducto().getId();
            int idActual = p.getProducto().getId();
            if (idNuevo < idActual) {
                if (p.getIzquierda() == null)
                    p.setIzquierda(nuevo);
                else
                    insertarNodoR(p.getIzquierda(), nuevo);
            } else {
                if (p.getDerecha() == null)
                    p.setDerecha(nuevo);
                else
                    insertarNodoR(p.getDerecha(), nuevo);
            }
        }
    }

    public Nodo buscar(int id) {
        return buscarR(raiz, id);
    }

    private Nodo buscarR(Nodo p, int id) {
        Nodo resultado = null;

        if (p != null) {
            int idActual = p.getProducto().getId();

            if (id == idActual) {
                resultado = p;
            } else if (id < idActual) {
                resultado = buscarR(p.getIzquierda(), id);
            } else {
                resultado = buscarR(p.getDerecha(), id);
            }
        }
        return resultado;
    }

    public void eliminar(int id) {
        raiz = eliminarR(raiz, id);
    }

    private Nodo eliminarR(Nodo p, int id) {

        if (p != null) {
            int idActual = p.getProducto().getId();

            if (id < idActual) {
                p.setIzquierda(eliminarR(p.getIzquierda(), id));
            } else if (id > idActual) {
                p.setDerecha(eliminarR(p.getDerecha(), id));
            } else {

                if (p.getIzquierda() == null && p.getDerecha() == null) {
                    p = null;
                } else if (p.getIzquierda() == null) {
                    p = p.getDerecha();
                } else if (p.getDerecha() == null) {
                    p = p.getIzquierda();
                } else {
                    Nodo sucesor = encontrarMinimo(p.getDerecha());
                    p.setProducto(sucesor.getProducto());
                    p.setDerecha(eliminarR(p.getDerecha(), sucesor.getProducto().getId()));
                }
            }
        }

        return p;
    }

    private Nodo encontrarMinimo(Nodo p) {
        while (p.getIzquierda() != null){
            p = p.getIzquierda();
        }
        return p;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getP() {
        return p;
    }

    public void setP(Nodo p) {
        this.p = p;
    }

}
