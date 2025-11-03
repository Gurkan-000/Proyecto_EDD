
package Estructuras_de_Datos;

import Modelo.Producto;

public class Pilas {
    private Producto[] arrPilas;
    private int tope;
    private int indMax;
    
    public Pilas(Producto[] arrProductos){
        arrPilas = arrProductos;
        indMax = arrProductos.length-1;
        pilaVacia();
    }
    public int getTope(){
        return tope;
    }
    public void pilaVacia(){
        tope = -1;
    }
    
    public void insertar(Producto producto){
        if(tope<indMax){
            tope++;
            arrPilas[tope] = producto;
        }
    }
    public void eliminar(){
        if(tope>-1){
            arrPilas[tope] = null;
            tope--;
        }
    }
    public Producto[] getPilas(){
        return arrPilas;
    }
    public Producto retornar(){
        Producto producto = new Producto(0, "", 0, 0.0);
        if(tope>-1){
            producto = arrPilas[tope];
        }
        return producto;
    }
    
    public Producto buscar(int id){
        int i=0;
        boolean val = true;
        Producto producto = null;

        while (i<=tope && val) {
            if(arrPilas[i].getId() == id){
                producto = arrPilas[i];
                val = false;
            }
            i++;
        }
        return producto;
    }
    
    public String muestraArreglo(){
        String cadena = "Pila Vacia";
        if (tope > -1) {
            cadena = "";
            for (int i = 0; i <=tope; i++) {
                cadena = cadena + arrPilas[i] + "\n";
            }
        }
        return cadena;
    }
    
}
