
package Vista;

/**
 *
 * @author RODRIGO
 */

import Vista.JDialog_CantidadProducto;
import Vista.Formulario_Compra;
import Controlador.C_Producto;
import Modelo.Producto;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class JDialog_ListCompra extends JDialog {
    
    private C_Producto c_producto;
    private Producto buscado;
    
    private JFrame frame_principal;
    
    public JDialog_ListCompra(JFrame frame_principal, C_Producto c_producto) {
        super(frame_principal, DEFAULT_MODALITY_TYPE);
        initComponents();
        this.c_producto = c_producto;
        this.frame_principal = frame_principal;
        ponerImagen(BttRegresar, "/flecha.png",50,31);
        ponerImagen(BttActualizar, "/imagen_editar.png",30,30);
        ponerImagen(BttEliminar, "/eliminar.png",30,30);
        visibilidadComp1(false);
        visibilidadComp2(false);
        c_producto.llenarTabla(tabla_info);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Principal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BttRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_info = new javax.swing.JTable();
        label_importe = new javax.swing.JLabel();
        txtImporteTotal = new javax.swing.JTextField();
        BttComprar = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        BttEliminar = new javax.swing.JButton();
        BttActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        Panel_Principal.setBackground(new java.awt.Color(23, 29, 37));
        Panel_Principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(14, 52, 80));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BttRegresar.setBackground(new java.awt.Color(14, 52, 80));
        BttRegresar.setBorder(null);
        BttRegresar.setBorderPainted(false);
        BttRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BttRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(BttRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BttRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel_Principal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 818, 60));

        tabla_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio/u", "Cantidad", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_infoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_info);

        Panel_Principal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 156, 680, 255));

        label_importe.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        label_importe.setForeground(new java.awt.Color(255, 255, 255));
        label_importe.setText("Importe total :");
        Panel_Principal.add(label_importe, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 423, -1, 30));

        txtImporteTotal.setEnabled(false);
        txtImporteTotal.setFocusable(false);
        Panel_Principal.add(txtImporteTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 423, 165, 35));

        BttComprar.setBackground(new java.awt.Color(50, 134, 227));
        BttComprar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BttComprar.setForeground(new java.awt.Color(255, 255, 255));
        BttComprar.setText("Continuar con el pago");
        BttComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BttComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttComprarActionPerformed(evt);
            }
        });
        Panel_Principal.add(BttComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 200, 40));

        labelTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Tu carrito de compra");
        Panel_Principal.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 88, 290, 40));

        BttEliminar.setBorder(null);
        BttEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BttEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttEliminarActionPerformed(evt);
            }
        });
        Panel_Principal.add(BttEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 30, 30));

        BttActualizar.setBorder(null);
        BttActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BttActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttActualizarActionPerformed(evt);
            }
        });
        Panel_Principal.add(BttActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ponerImagen(JButton label, String URL, int ancho, int altura) {
        ImageIcon icon = new ImageIcon(getClass().getResource(URL));
        Image image = icon.getImage().getScaledInstance(ancho, altura, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(image));
    }
    
    private void visibilidadComp1(boolean v){
        BttEliminar.setVisible(v);
        BttActualizar.setVisible(v);
    }
    
    private void visibilidadComp2(boolean v){
        label_importe.setVisible(v);
        txtImporteTotal.setVisible(v);
        BttComprar.setVisible(!v);
    }
   
    private void BttRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BttRegresarActionPerformed

    private void BttComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttComprarActionPerformed
        visibilidadComp2(true);
        c_producto.generarImporteFinal(txtImporteTotal);
        visibilidadComp2(true);
    }//GEN-LAST:event_BttComprarActionPerformed

    private void BttEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttEliminarActionPerformed
        c_producto.remover(buscado);
        c_producto.llenarTabla(tabla_info);
        visibilidadComp1(false);
    }//GEN-LAST:event_BttEliminarActionPerformed

    private void tabla_infoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_infoMousePressed
        int fila = tabla_info.rowAtPoint(evt.getPoint());
        buscado = c_producto.buscarProducto((Integer)tabla_info.getValueAt(fila, 0));
        visibilidadComp1(true);
    }//GEN-LAST:event_tabla_infoMousePressed

    private void BttActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttActualizarActionPerformed
        int cantidadAnterior = buscado.getCantidad();
        
        JDialog_CantidadProducto cantidadProducto = new JDialog_CantidadProducto(frame_principal, buscado);
        cantidadProducto.setLocationRelativeTo(Formulario_Compra.frame_principal);
        cantidadProducto.setVisible(true);
        
        if(buscado.getCantidad() != 0){
            c_producto.llenarTabla(tabla_info);
        }else{
            buscado.setCantidad(cantidadAnterior);
        } 
        
    }//GEN-LAST:event_BttActualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttActualizar;
    private javax.swing.JButton BttComprar;
    private javax.swing.JButton BttEliminar;
    private javax.swing.JButton BttRegresar;
    private javax.swing.JPanel Panel_Principal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel label_importe;
    private javax.swing.JTable tabla_info;
    private javax.swing.JTextField txtImporteTotal;
    // End of variables declaration//GEN-END:variables
}
