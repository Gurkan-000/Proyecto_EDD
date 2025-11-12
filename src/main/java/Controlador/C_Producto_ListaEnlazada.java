
package Controlador;

import Modelo.Producto;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Estructuras_de_Datos.ListaEnlazada.ListaEnlazada;

/**
 *
 * @author RODRIGO
 */
public class C_Producto_ListaEnlazada implements C_Producto{
    
    private ListaEnlazada listProducto;
    
    public C_Producto_ListaEnlazada(){
        listProducto = new ListaEnlazada();
        llenarListaEnlazada();    
    }
    
    private void llenarListaEnlazada(){
        insertar(new Producto(3,"Rust",1,25.0));
        insertar(new Producto(1,"Deep Rock",2,33.0));
        insertar(new Producto(5,"R.E.P.O",1,15.0));
    }

    @Override
    public Producto buscarProducto(int id){
        return listProducto.buscar(id);
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
    
    
}
