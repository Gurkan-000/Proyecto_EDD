
package Vista;

/**
 *
 * @author RODRIGO
 */

import Modelo.Producto;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class JDialog_CantidadProducto extends JDialog {

    private Producto producto;
    
    public JDialog_CantidadProducto(JFrame frame, Producto producto) {
        super(frame, DEFAULT_MODALITY_TYPE);
        initComponents();
        ponerImagen(BttRegresar, "/flecha.png", 50, 31);
        this.producto = producto;
    }
    
    private void ponerImagen(JButton boton, String URL,int ancho, int altura){
        ImageIcon icon = new ImageIcon(getClass().getResource(URL));
        Image image = icon.getImage().getScaledInstance(ancho, altura, Image.SCALE_SMOOTH);
        boton.setIcon(new ImageIcon(image));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Principal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BttRegresar = new javax.swing.JButton();
        BttAñadir = new javax.swing.JButton();
        labelTitulo1 = new javax.swing.JLabel();
        SpinCantidad = new javax.swing.JSpinner();
        label_Error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        Panel_Principal.setBackground(new java.awt.Color(23, 29, 37));
        Panel_Principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                .addContainerGap(12, Short.MAX_VALUE))
        );

        BttAñadir.setBackground(new java.awt.Color(50, 134, 227));
        BttAñadir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BttAñadir.setForeground(new java.awt.Color(255, 255, 255));
        BttAñadir.setText("Añadir");
        BttAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BttAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttAñadirActionPerformed(evt);
            }
        });

        labelTitulo1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        labelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo1.setText("Cantidad:");

        SpinCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout Panel_PrincipalLayout = new javax.swing.GroupLayout(Panel_Principal);
        Panel_Principal.setLayout(Panel_PrincipalLayout);
        Panel_PrincipalLayout.setHorizontalGroup(
            Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(labelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BttAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        Panel_PrincipalLayout.setVerticalGroup(
            Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BttAñadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

    private void BttRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttRegresarActionPerformed
        producto.setCantidad(0);
        this.dispose();
    }//GEN-LAST:event_BttRegresarActionPerformed

    private void BttAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttAñadirActionPerformed
        int cantidad = (int) SpinCantidad.getValue();

        producto.setCantidad(cantidad);
        this.dispose();
    }//GEN-LAST:event_BttAñadirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttAñadir;
    private javax.swing.JButton BttRegresar;
    private javax.swing.JPanel Panel_Principal;
    private javax.swing.JSpinner SpinCantidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JLabel label_Error;
    // End of variables declaration//GEN-END:variables
}
