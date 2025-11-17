package Controlador;

import Modelo.Producto;
import Estructuras_de_Datos.Cola.Cola;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class C_Producto_Cola implements C_Producto {

    private Cola cola;

    public C_Producto_Cola() {
        cola = new Cola(100);
    }
    
    @Override
    public Producto buscarProducto(int id) {
        return cola.buscarPorId(id);
    }

    @Override
    public void insertar(Producto producto) {
        cola.incluir(producto);
    }

    @Override
    public void remover(Producto producto) {

        cola.eliminar();
    }

    @Override
    public void llenarTabla(JTable tabla) {
        DefaultTableModel dt = (DefaultTableModel) tabla.getModel();
        dt.setRowCount(0);

        if (!cola.estaVaciaA()) {
            Producto[] productosA = cola.getColaA();
            for (int i = cola.getFirstA(); i <= cola.getLastA(); i++) {
                Object[] datos = new Object[5];
                datos[0] = productosA[i].getId();
                datos[1] = productosA[i].getNombre();
                datos[2] = productosA[i].getPrecio();
                datos[3] = productosA[i].getCantidad();
                datos[4] = productosA[i].getCantidad() * productosA[i].getPrecio();
                dt.addRow(datos);
            }
        }

        if (!cola.estaVaciaB()) {
            Producto[] productosB = cola.getColaB();
            for (int i = cola.getFirstB(); i <= cola.getLastB(); i++) {
                Object[] datos = new Object[5];
                datos[0] = productosB[i].getId();
                datos[1] = productosB[i].getNombre();
                datos[2] = productosB[i].getPrecio();
                datos[3] = productosB[i].getCantidad();
                datos[4] = productosB[i].getCantidad() * productosB[i].getPrecio();
                dt.addRow(datos);
            }
        }
    }

    @Override
    public void generarImporteFinal(JTextField txt) {
        double suma = 0;

        if (!cola.estaVaciaA()) {
            Producto[] productosA = cola.getColaA();
            for (int i = cola.getFirstA(); i <= cola.getLastA(); i++) {
                suma += productosA[i].getCantidad() * productosA[i].getPrecio();
            }
        }

        if (!cola.estaVaciaB()) {
            Producto[] productosB = cola.getColaB();
            for (int i = cola.getFirstB(); i <= cola.getLastB(); i++) {
                suma += productosB[i].getCantidad() * productosB[i].getPrecio();
            }
        }

        txt.setText("" + suma);
    }
}