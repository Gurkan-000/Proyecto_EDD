package Controlador;

import Modelo.Producto;
import Estructuras_de_Datos.ColaDePrioridad;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

// Esta clase implementa la interfaz C_Producto original (con voids)
public class C_Producto_ColaPrioridad implements C_Producto {

    private ColaDePrioridad cola = new ColaDePrioridad(100);

   @Override
    public void insertar(Producto producto) {
        cola.incluir(producto);
    }

    @Override
    public Producto buscarProducto(int id) {
        return cola.buscarPorId(id);
    }

    @Override
    public void remover(Producto producto) {
        cola.removerEspecifico(producto);
    }

    @Override
    public void llenarTabla(JTable tabla) {
        DefaultTableModel dt = (DefaultTableModel) tabla.getModel();
        dt.setRowCount(0);

        if (cola.estaVacia()) {
        }

        Producto[] productos = cola.getCola();

        for (int i = cola.getFirst(); i <= cola.getLast(); i++) {
            Object[] datos = new Object[5];
            datos[0] = productos[i].getId();
            datos[1] = productos[i].getNombre();
            datos[2] = productos[i].getPrecio();
            datos[3] = productos[i].getCantidad();
            // (Opcional: puedes mostrar productos[i].getPrioridad() en la tabla)
            datos[4] = productos[i].getCantidad() * productos[i].getPrecio();
            dt.addRow(datos);
        }
    }

    @Override
    public void generarImporteFinal(JTextField txt) {
        double suma = 0;

        if (cola.estaVacia()) {
            txt.setText("0.0");
        }

        Producto[] productos = cola.getCola();
        for (int i = cola.getFirst(); i <= cola.getLast(); i++) {
            suma += productos[i].getCantidad() * productos[i].getPrecio();
        }
        txt.setText("" + suma);
    }
    
    // --- MÉTODOS NUEVOS PARA EXPONER LA COLA INTERNA ---

    public boolean estaVacia() {
        return cola.estaVacia();
    }

    public Producto[] getCola() {
        return cola.getCola();
    }

    public int getFirst() {
        return cola.getFirst();
    }

    public int getLast() {
        return cola.getLast();
    }
}