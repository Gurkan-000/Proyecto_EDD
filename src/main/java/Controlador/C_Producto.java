/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Producto;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author RODRIGO
 */
public interface C_Producto {
    
    public Producto buscarProducto(int id);
    
    public void insertar(Producto producto);
    
    public void remover(Producto producto);
    
    public void llenarTabla(JTable tabla);
    
    public void generarImporteFinal(JTextField txt);
    
}
