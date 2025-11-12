package Controlador;

import Modelo.Producto;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Estructuras_de_Datos.Cola.Cola;

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

        if (cola.estaVacia())
            return;

        Producto[] productos = cola.getCola();
        for (int i = cola.getFirst(); i <= cola.getLast(); i++) {
            Object[] datos = new Object[5];
            datos[0] = productos[i].getId();
            datos[1] = productos[i].getNombre();
            datos[2] = productos[i].getPrecio(); // Precio/u
            datos[3] = productos[i].getCantidad();
            datos[4] = productos[i].getCantidad() * productos[i].getPrecio();
            dt.addRow(datos);
        }
    }

    @Override
    public void generarImporteFinal(JTextField txt) {
        double suma = 0;
        Producto[] productos = cola.getCola();
        for (int i = cola.getFirst(); i <= cola.getLast(); i++) {
            suma += productos[i].getCantidad() * productos[i].getPrecio();
        }
        txt.setText("" + suma);
    }
}