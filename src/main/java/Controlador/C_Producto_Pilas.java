
package Controlador;

import Modelo.Producto;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Estructuras_de_Datos.Pila.Pilas;
import javax.swing.JButton;

public class C_Producto_Pilas implements C_Producto {
    
    private Pilas arrPilas;

    public C_Producto_Pilas() {
        this.arrPilas = new Pilas(new Producto[4]);
        llenarPilas();
    }

    private void llenarPilas(){
        insertar(new Producto(3,"Rust",1,25.0));
        insertar(new Producto(1,"Deep Rock",2,33.0));
        insertar(new Producto(5,"R.E.P.O",1,15.0));
    }

    @Override
    public Producto buscarProducto(int id) {
        return null;
    }

    @Override
    public void insertar(Producto producto) {
        arrPilas.insertar(producto);
    }

    @Override
    public void remover(Producto producto) {
        arrPilas.eliminar();
    }

    @Override
    public void llenarTabla(JTable tabla) {
        DefaultTableModel dt = (DefaultTableModel) tabla.getModel();
        dt.setRowCount(0);

        for(int i=0 ; i<=arrPilas.getTope() ; i++){
            Object[] datos = new Object[5];
            datos[0] = arrPilas.getPilas()[i].getId();
            datos[1] = arrPilas.getPilas()[i].getNombre();
            datos[2] = arrPilas.getPilas()[i].getPrecio();
            datos[3] = arrPilas.getPilas()[i].getCantidad();
            datos[4] = arrPilas.getPilas()[i].getPrecio() * arrPilas.getPilas()[i].getCantidad();
            dt.addRow(datos);
        }
    }

    @Override
    public void generarImporteFinal(JTextField txt) {
        double suma = 0;
        for(int i=0 ; i<=arrPilas.getTope() ; i++){
            suma+=arrPilas.getPilas()[i].getPrecio() * arrPilas.getPilas()[i].getCantidad();
        }
        txt.setText(""+suma);
    }
    
    @Override
    public void visibilidadBttEliminarActualizar(JButton bttEliminar, JButton bttActualizar, boolean v){
        bttEliminar.setVisible(true);
        bttActualizar.setVisible(false);
    }
    
}
