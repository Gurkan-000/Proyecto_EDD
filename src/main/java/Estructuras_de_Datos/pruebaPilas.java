/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras_de_Datos;

import Modelo.Producto;

/**
 *
 * @author marcooo
 */
public class pruebaPilas {

    public static void main(String[] args) {
        Producto[] ArrProductos = new Producto[4];

        Pilas pilas = new Pilas(ArrProductos);

        Producto pro1 = new Producto(0, "Dota", 1, 15.0);
        Producto pro2 = new Producto(1, "Dota", 1, 15.0);
        Producto pro3 = new Producto(2, "Dota", 1, 15.0);
        Producto pro4 = new Producto(3, "Dota", 1, 15.0);
        Producto pro5 = new Producto(4, "Dota", 1, 15.0);
        Producto pro6 = new Producto(5, "Dota", 1, 15.0);
        Producto pro7 = new Producto(6, "Dota", 1, 15.0);
        Producto pro8 = new Producto(7, "Dota", 1, 15.0);

        pilas.insertar(pro1);
        pilas.insertar(pro2);
        pilas.insertar(pro3);
        pilas.insertar(pro4);
        pilas.insertar(pro5);
        pilas.insertar(pro6);
        pilas.insertar(pro7);
        pilas.insertar(pro8);
        System.out.println(pilas.retornar());
        

        System.out.println(pilas.muestraArreglo());
        
        pilas.eliminar();
        
        System.out.println(pilas.muestraArreglo());
        
        System.out.println(pilas.retornar());

    }
}
