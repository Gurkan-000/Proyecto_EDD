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
            if (estaVacia()) {
                first = 0;
                last = 0;
                cola[0] = producto;
            } else {

                int i;
                for (i = last; i >= first && cola[i].getPrecio() <= producto.getPrecio(); i--) {
                    cola[i + 1] = cola[i];
                }
                cola[i + 1] = producto;
                last++;
            }

        } else {
            System.out.println("La cola está llena.");
        }
        
    }

    public Producto eliminar() {
        Producto valor = null;
        if (!estaVacia()) {
            valor = cola[first];
            first++;
            if (first > last)
                colaVacia();
        }
        return valor;
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