
package Estructuras_de_Datos.Arreglo;

import Modelo.Producto;

/**
 *
 * @author RODRIGO
 */
public class Arreglo {

    private Producto[] array;
    public int ultIndice; 

    public Arreglo(Producto[] array) {
        this.array = array;
        ultIndice = -1;
    }

    public Producto[] getArreglo(){
        return array;
    }

    public void insertar(Producto producto) {
        if (ultIndice < array.length-1) {
            array[ultIndice+1] = producto;
            ultIndice++;
        }
    }

    public Producto buscar(int id){
        int i=0;
        boolean val = true;
        Producto producto = null;

        while (i<=ultIndice && val) {
            if(array[i].getId() == id){
                producto = array[i];
                val = false;
            }
            i++;
        }
        return producto;
    }

    public void eliminar(Producto producto){
        boolean val = false;
        if(ultIndice == 0){
            val = true;
        }else{
            for(int i=0 ; i<ultIndice; i++){
                val = array[i].equals(producto) ? true : val;
                if(val){
                    array[i] = array[i+1];
                    val = true;
                }
            }
            if(array[ultIndice].equals(producto)){
                val = true;
            }
        }

        if(val){ // True si se llego a eliminar un elemento
            array[ultIndice] = null; //Establece null en el indice que esta fuera del rango del arreglo dinamico
            ultIndice--;
        }
    }

    public void vaciar() {
        ultIndice = -1;
    }
    public String mostrar(){
        String cadena = "";
        for(int i=0 ; i<=ultIndice ; i++){
            cadena+=array[i]+"\n";
        }
        return cadena;
    }

    // public static void main(String[] args) {
        
    //     Producto p1 = new Producto(1, "Pepe", 1, 1);
    //     Producto p2 = new Producto(2, "Toto", 1, 1);
    //     Producto p3 = new Producto(3, "Tita", 1, 1);
    //     Producto p4 = new Producto(4, "Tito", 1, 1);
    //     Producto p5 = new Producto(5, "Titi", 1, 1);
    //     Producto p6 = new Producto(5, "Tula", 1, 1);

    //     Producto[] array = new Producto[5];

    //     Arreglo arreglo = new Arreglo(array);

    //     arreglo.insertar(p1);
    //     // arreglo.insertar(p2);
    //     // arreglo.insertar(p3);
    //     // arreglo.insertar(p4);
    //     // arreglo.insertar(p5);
    //     // arreglo.insertar(p6);

    //     System.out.println(arreglo.mostrar());

    //     arreglo.eliminar(p1);

    //     System.out.println(arreglo.mostrar());

    // }
}
