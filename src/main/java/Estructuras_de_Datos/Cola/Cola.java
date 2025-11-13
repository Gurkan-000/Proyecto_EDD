package Estructuras_de_Datos.Cola;

import Modelo.Producto;

public class Cola {
   
    private Producto colaA[]; 
    private Producto colaB[]; 
    
    
    private int firstA, lastA;
    private int firstB, lastB;
    
    private int tamaño; 

    public Cola(int n) {
        tamaño = n;
        colaA = new Producto[n];
        colaB = new Producto[n];
        colaVacia(); 
    }

    public void colaVacia() {
        firstA = -1;
        lastA = -1;
        firstB = -1;
        lastB = -1;
    }

    public boolean estaVaciaA() {
        return firstA == -1;
    }

    public boolean estaVaciaB() {
        return firstB == -1;
    }

   
    public boolean estaVacia() {
        return estaVaciaA() && estaVaciaB();
    }

    public boolean estaLlenaA() {
        return lastA == tamaño - 1;
    }

    public boolean estaLlenaB() {
        return lastB == tamaño - 1;
    }

   
    public Producto[] getColaA() {
        return colaA;
    }
    public Producto[] getColaB() {
        return colaB;
    }
    public int getFirstA() {
        return firstA;
    }
    public int getLastA() {
        return lastA;
    }
    public int getFirstB() {
        return firstB;
    }
    public int getLastB() {
        return lastB;
    }

  
    public void incluir(Producto producto) {
        if (producto.getPrecio() > 30) {
           
            if (!estaLlenaA()) {
                lastA++;
                colaA[lastA] = producto;
                if (firstA == -1) { 
                    firstA = 0;
                }
            } else {
                System.out.println("La cola de Alta Prioridad está llena.");
            }
        } else {
            
            if (!estaLlenaB()) {
                lastB++;
                colaB[lastB] = producto;
                if (firstB == -1) {
                    firstB = 0;
                }
            } else {
                System.out.println("La cola de Baja Prioridad está llena.");
            }
        }
    }

   
    public Producto eliminar() {
        Producto valor = null;
        
        if (!estaVaciaA()) {
           
            valor = colaA[firstA];
            firstA++;
            if (firstA > lastA) { 
                colaVaciaA();
            }
        } else if (!estaVaciaB()) {
          
            valor = colaB[firstB];
            firstB++;
            if (firstB > lastB) { 
                colaVaciaB();
            }
        } else {
            System.out.println("Ambas colas están vacías.");
        }
        return valor;
    }

   
    private void colaVaciaA() {
        firstA = -1;
        lastA = -1;
    }
    
    
    private void colaVaciaB() {
        firstB = -1;
        lastB = -1;
    }

   
    public Producto buscarPorId(int id) {
        Producto encontrado = null;
        
       
        if (!estaVaciaA()) {
            for (int i = firstA; i <= lastA; i++) {
                if (colaA[i].getId() == id) {
                    encontrado = colaA[i];
                    return encontrado; 
                }
            }
        }

      
        if (encontrado == null && !estaVaciaB()) {
            for (int i = firstB; i <= lastB; i++) {
                if (colaB[i].getId() == id) {
                    encontrado = colaB[i];
                    return encontrado; 
                }
            }
        }

        return encontrado;
    }
}