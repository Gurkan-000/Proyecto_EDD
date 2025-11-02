package Estructuras_de_Datos;

import Modelo.Producto;

public class ColaDePrioridad {

    private Producto cola[];
    private int first, last;
    private int tamaño;

    public ColaDePrioridad(int n) {
        this.tamaño = n;
        this.cola = new Producto[tamaño];
        colaVacia();
    }

    public void colaVacia() {
        first = -1;
        last = -1;
    }

    public Producto[] getCola() {
        return cola;
    }

    public int getFirst() {
        return first;
    }

    public int getLast() {
        return last;
    }

    public boolean estaLlena() {
        return last == tamaño - 1;
    }

    public boolean estaVacia() {
        return first == -1;
    }

    public void incluir(Producto producto) {
     if (estaLlena()) {
            System.out.println("Error: La cola de prioridad está llena.");
        } else if (estaVacia()) {
            first = 0;
            last = 0;
            cola[0] = producto;
        } else {
            int i = last;
            double importeNuevo = producto.getCantidad() * producto.getPrecio();
            
            boolean seguirComparando = true; 

            while (i >= first && seguirComparando) {
                double importeActual = cola[i].getCantidad() * cola[i].getPrecio();
                boolean mover = false; 

                if (importeNuevo > importeActual) {
                    mover = true;
                }
                else if (importeNuevo == importeActual && producto.getId() < cola[i].getId()) {
                    mover = true;
                }

                if (mover) {
                    cola[i + 1] = cola[i]; 
                    i--; 
                } else {
                    seguirComparando = false; 
                }
            }
            cola[i + 1] = producto;
            last++; 
        }
    }

    public Producto eliminar() {
        Producto valor = null;
        if (!estaVacia()) {
            valor = cola[first];
            first++;
            if (first > last) {
                colaVacia();
            }
        }
        return valor;
    }

    public Producto acceso() {
        Producto valor = null;
        if (!estaVacia()) {
            valor = cola[first];
        }
        return valor;
    }

    public Producto buscarPorId(int id) {
        Producto encontrado = null;
        if (!estaVacia()) {
            int i = first;
            boolean seguirBuscando = true;
            
            while (i <= last && seguirBuscando) {
                if (cola[i].getId() == id) {
                    encontrado = cola[i];
                    seguirBuscando = false;
                }
                i++;
            }
        }
        return encontrado;
    }

    public void removerEspecifico(Producto producto) {
        if (!estaVacia()) {
            int i = first;
            boolean encontrado = false;

            while (i <= last) {
                if (!encontrado && cola[i].equals(producto)) {
                    encontrado = true;
                }

                if (encontrado && i < last) {
                    cola[i] = cola[i + 1];
                }
                i++;
            }

            if (encontrado) {
                cola[last] = null;
                last--;
                if (last < first) {
                    colaVacia();
                }
            }
        }
    }
}