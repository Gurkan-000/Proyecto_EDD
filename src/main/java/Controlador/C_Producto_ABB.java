/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Estructuras_de_Datos.ABB.ABB;
import Estructuras_de_Datos.ABB.Nodo;
import Modelo.Producto;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * comentario
 * 
 * @author JOSE
 */
public class C_Producto_ABB implements C_Producto {

    private ABB arbol;

    public C_Producto_ABB() {
        arbol = new ABB();
        llenarArbol();
    }

    private void llenarArbol(){
        insertar(new Producto(3,"Rust",1,25.0));
        insertar(new Producto(1,"Deep Rock",2,33.0));
        insertar(new Producto(5,"R.E.P.O",1,15.0));
    }

    @Override
    public Producto buscarProducto(int id) {
        Nodo nodo = arbol.buscar(id);
        return (nodo != null) ? nodo.getProducto() : null;
    }

    @Override
    public void insertar(Producto producto) {
        arbol.insertarNodo(producto);
    }

    @Override
    public void remover(Producto producto) {
        if (producto != null) {
            arbol.eliminar(producto.getId());
        }
    }

    @Override
    public void llenarTabla(JTable tabla) {
        DefaultTableModel dt = (DefaultTableModel) tabla.getModel();
        dt.setRowCount(0);
        llenarTablaInOrden(dt, arbol.getRaiz());
    }

    private void llenarTablaInOrden(DefaultTableModel dt, Nodo p) {
        if (p != null) {
            llenarTablaInOrden(dt, p.getIzquierda());

            Producto prod = p.getProducto();
            Object[] datos = new Object[5];
            datos[0] = prod.getId();
            datos[1] = prod.getNombre();
            datos[2] = prod.getPrecio();
            datos[3] = prod.getCantidad();
            datos[4] = prod.getCantidad() * prod.getPrecio();
            dt.addRow(datos);

            llenarTablaInOrden(dt, p.getDerecha());
        }
    }

    @Override
    public void generarImporteFinal(JTextField txt) {
        double[] suma = new double[1];
        calcularImporte(arbol.getRaiz(), suma);
        txt.setText(String.valueOf(suma[0]));
    }

    private void calcularImporte(Nodo p, double[] suma) {
        if (p != null) {
            calcularImporte(p.getIzquierda(), suma);
            Producto prod = p.getProducto();
            suma[0] += prod.getPrecio() * prod.getCantidad();
            calcularImporte(p.getDerecha(), suma);
        }
    }
    
    @Override
    public void visibilidadBttEliminarActualizar(JButton bttEliminar, JButton bttActualizar, boolean v){
        bttEliminar.setVisible(v);
        bttActualizar.setVisible(v);
    }
    
}
