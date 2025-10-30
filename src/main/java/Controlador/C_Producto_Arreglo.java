
package Controlador;

import Modelo.Producto;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Estructuras_de_Datos.Arreglo;

/**
 *
 * @author RODRIGO
 */
public class C_Producto_Arreglo implements C_Producto {

    private Arreglo array;

    public C_Producto_Arreglo() {
        array = new Arreglo(new Producto[4]);
    }

    @Override
    public Producto buscarProducto(int id) {
        return array.retornar(id);
    }

    @Override
    public void insertar(Producto producto) {
        array.insertar(producto);
    }

    @Override
    public void remover(Producto producto) {
        System.out.println("Entro al metodo");
        array.eliminar(producto);
    }

    @Override
    public void llenarTabla(JTable tabla) {
        DefaultTableModel dt = (DefaultTableModel) tabla.getModel();
        dt.setRowCount(0);

        for(int i=0 ; i<=array.ultIndice ; i++){
            Object[] datos = new Object[5];
            datos[0] = array.getArreglo()[i].getId();
            datos[1] = array.getArreglo()[i].getNombre();
            datos[2] = array.getArreglo()[i].getCantidad();
            datos[3] = array.getArreglo()[i].getPrecio();
            datos[4] = array.getArreglo()[i].getPrecio() * array.getArreglo()[i].getCantidad();
            dt.addRow(datos);
        }
        
    }
    
    public void reset() {
        if (array != null) {
            array.vaciar();
            System.out.println("Carrito de Arreglo reseteado.");
        }
    }
    
    @Override
    public void generarImporteFinal(JTextField txt) {
        double suma = 0;
        for(int i=0 ; i<=array.ultIndice ; i++){
            suma+=array.getArreglo()[i].getPrecio() * array.getArreglo()[i].getCantidad();
        }
        txt.setText(""+suma);
    }
    
    public Estructuras_de_Datos.Arreglo getArregloInterno() {
        return array;
    }
}
