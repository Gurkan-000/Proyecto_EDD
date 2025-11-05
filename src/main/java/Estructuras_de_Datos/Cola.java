package Estructuras_de_Datos;

import Modelo.Producto;

public class Cola {
    private Producto cola[];
    private int first, last;
    private int tamaño;

    public Cola(int n) {
        cola = new Producto[n];
        tamaño = n;
        colaVacia();
    }

    public void colaVacia() {
        first = -1;
        last = -1;
    }

    public boolean estaVacia() {
        return first == -1;
    }

    public boolean estaLlena() {
        return last == tamaño - 1;
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
   
    public void incluir(Producto producto) {
        if (!estaLlena()) {
            last++;
            cola[last] = producto;
            if (first == -1) {
                first = 0;
            }
        } else {
            System.out.println("La cola está llena.");
        }
    }

    public Producto eliminarFIFO() {
        Producto valor = null;
        if (!estaVacia()) {
            valor = cola[first];
            first++;
            if (first > last)
                colaVacia();
        }
        return valor;
    }

    public Producto eliminarPorPrioridad() {
        Producto productoEliminado = null; 

        if (!estaVacia()) {
            int indiceMax = first;
            double precioMax = cola[first].getPrecio();

            for (int i = first + 1; i <= last; i++) {
                if (cola[i].getPrecio() > precioMax) {
                    precioMax = cola[i].getPrecio();
                    indiceMax = i;
                }
            }

            productoEliminado = cola[indiceMax]; 

          
            for (int i = indiceMax; i < last; i++) {
                cola[i] = cola[i + 1];
            }

            
            cola[last] = null;
            last--;

         
            if (last < first) {
                colaVacia();
            }
        }

        return productoEliminado; 
    }

    public Producto buscarPorId(int id) {
        Producto encontrado = null; 
        if (!estaVacia()) {
            boolean seguirBuscando = true;
            int i = first;

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
}