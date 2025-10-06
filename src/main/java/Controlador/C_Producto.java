
package Controlador;

import Modelo.Producto;
import Util.ListaEnlazada;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RODRIGO
 */
public class C_Producto {
    
    private ListaEnlazada listProducto;
    
    public C_Producto(){
        listProducto = new ListaEnlazada();
    }
    
    public Producto buscarProducto(int id){
        int i = 0;
        while(i<listProducto.longitud && listProducto.get(i).getId() != id){
            i++;
        }
        return listProducto.get(i);
    }
    
    public void insertar(Producto producto){
        listProducto.insertarUltimo(producto);
    }
    
    public void remover(Producto producto){
        listProducto.eliminar(producto);
    }
    
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
    
}
