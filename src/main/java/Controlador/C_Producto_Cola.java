package Controlador;

import Modelo.Producto;
import Estructuras_de_Datos.Cola; // Importa la nueva clase Cola
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class C_Producto_Cola implements C_Producto {

    private Cola cola;

    public C_Producto_Cola() {
        cola = new Cola(100); // Creamos una cola con 100 espacios
    }

    @Override
    public Producto buscarProducto(int id) {
        return cola.buscarPorId(id);
    }

    @Override
    public void insertar(Producto producto) {
        cola.incluir(producto); // Inserta al final (FIFO)
    }

    /**
     * MÉTODO MODIFICADO:
     * ¡Ignora el producto seleccionado y elimina por prioridad!
     * El botón "X" del carrito llamará a este método.
     */
    @Override
    public void remover(Producto producto) {
        // Ignoramos el 'producto' que nos pasan (que sería el 'buscado')
        // y llamamos al método especial de la cola.
        System.out.println("Removiendo por prioridad (Precio/u más alto)...");
        cola.eliminarPorPrioridad();
    }

    @Override
    public void llenarTabla(JTable tabla) {
        DefaultTableModel dt = (DefaultTableModel) tabla.getModel();
        dt.setRowCount(0);

        if (cola.estaVacia()) return;

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