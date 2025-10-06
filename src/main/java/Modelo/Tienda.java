/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author RODRIGO
 */
public class Tienda {
    
    private int indice;
    private String[] juego = {"Deep Rock","Counter Strike","Rust","Sky"};
    private double[] precio = {33.0,5.0,25.0,44.0};

    public String getJuego(){
        return juego[indice];
    }
    
    public double getPrecio(){
        return precio[indice];
    }
    
    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
}
