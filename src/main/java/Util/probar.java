/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Util;

import Modelo.Producto;

/**
 *
 * @author RODRIGO
 */
public class probar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ListaEnlazada list = new ListaEnlazada();

        list.insertarUltimo(new Producto(1, "Pepe", 1, 1));
        list.insertarUltimo(new Producto(2, "Toto", 1, 1));
        list.insertarUltimo(new Producto(3, "Tita", 1, 1));
        list.insertarUltimo(new Producto(4, "Tito", 1, 1));
        list.insertarUltimo(new Producto(5, "Pepi", 1, 1));
        list.insertarUltimo(new Producto(6, "Pepin", 1, 1));
        list.insertarUltimo(new Producto(7, "Pepote", 1, 1));

        //System.out.println(list.mostrar());
        //list.eliminarUltimo();
        //System.out.println();
        //System.out.println(list.mostrar());
        //list.insertarDespues(p,a);
        //System.out.println();
        //System.out.println(list.mostrar());
        System.out.println();
        System.out.println(list.mostrar());
        System.out.println();

        int i = 0;
        while(i<list.longitud && list.get(i).getId() != 0){
            i++;
        }
        
        System.out.println(list.get(i));
        
    }

}
