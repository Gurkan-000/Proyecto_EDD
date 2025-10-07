
package Controlador;

import Modelo.Producto;
import Estructuras_de_Datos.ListaEnlazada;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RODRIGO
 */
public class C_Producto_ListaEnlazada implements C_Producto{
    
    private ListaEnlazada listProducto;
    
    public C_Producto_ListaEnlazada(){
        listProducto = new ListaEnlazada();
    }
    
    @Override
    public Producto buscarProducto(int id){
        int i = 0;
        while(i<listProducto.longitud && listProducto.get(i).getId() != id){
            i++;
        }
        return listProducto.get(i);
    }
    
    @Override
    public void insertar(Producto producto){
        listProducto.insertarUltimo(producto);
    }
    
    @Override
    public void remover(Producto producto){
        listProducto.eliminar(producto);
    }
    
    @Override
    public void llenarTabla(JTable tabla){
        DefaultTableModel dt = (DefaultTableModel) tabla.getModel();
        dt.setRowCount(0);
        
        for(int i=0 ; i<listProducto.longitud ; i++){
            Object[] datos = new Object[5];
            datos[0] = listProducto.get(i).getId();
            datos[1] = listProducto.get(i).getNombre();
            datos[2] = listProducto.get(i).getPrecio();
            datos[3] = listProducto.get(i).getCantidad();
            datos[4] = listProducto.get(i).getCantidad()*listProducto.get(i).getPrecio();
            
            dt.addRow(datos);
        }
        
    }
    
    @Override
    public void generarImporteFinal(JTextField txt){
        double suma = 0;
        for(int i=0 ; i<listProducto.longitud; i++){
            suma+=listProducto.get(i).getCantidad()*listProducto.get(i).getPrecio();
        }
        txt.setText(""+suma);
    }
    
    
}
