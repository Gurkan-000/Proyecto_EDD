
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
        while(i<listProducto.longitud && listProducto.retornar(i).getId() != id){
            i++;
        }
        return listProducto.retornar(i);
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
            datos[0] = listProducto.retornar(i).getId();
            datos[1] = listProducto.retornar(i).getNombre();
            datos[2] = listProducto.retornar(i).getPrecio();
            datos[3] = listProducto.retornar(i).getCantidad();
            datos[4] = listProducto.retornar(i).getCantidad()*listProducto.retornar(i).getPrecio();
            
            dt.addRow(datos);
        }
        
    }
    
    @Override
    public void generarImporteFinal(JTextField txt){
        double suma = 0;
        for(int i=0 ; i<listProducto.longitud; i++){
            suma+=listProducto.retornar(i).getCantidad()*listProducto.retornar(i).getPrecio();
        }
        txt.setText(""+suma);
    }
    
    public void reset() {
        if (listProducto != null) {
            listProducto.vaciar();
            System.out.println("Carrito de Lista Enlazada reseteado.");
        }
    }
    
    public Estructuras_de_Datos.ListaEnlazada getListaInterna() {
        return listProducto;
    }
    
}
