
package Vista;

import Controlador.C_Producto;
import Controlador.C_Producto_ListaEnlazada;
import Modelo.Tienda;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author RODRIGO
 */
public class Formulario_Compra extends JPanel {

    private Panel_VideoJuegos p_videoJuegos;
    private C_Producto c_producto;
    private Tienda tienda;
    
    protected static JFrame frame_principal;
    
    public Formulario_Compra(JFrame frame_principal, C_Producto c_producto, String nombre) {
        initComponents();
        
        Formulario_Compra.frame_principal = frame_principal;
        
        this.c_producto = c_producto;
        tienda = new Tienda();
        p_videoJuegos = new Panel_VideoJuegos(c_producto,tienda);
        
        label_EstructuraDeDatos.setText(nombre);
        
        ponerScroll(Contenedor);
        ponerPanel(p_videoJuegos);
        
    }
    
    /**
     * MÉTODO NUEVO: Para abrir el carrito desde fuera (desde Formulario_Principal).
     */
    public void abrirCarrito() {
        JDialog_ListCompra compras = new JDialog_ListCompra(frame_principal, c_producto);
        compras.setSize(818, 550);
        compras.setLocationRelativeTo(this);
        compras.setVisible(true);
    }
    
    /**
     * MÉTODO NUEVO: Para que Formulario_Principal actualice el controlador.
     */
    public void setControlador(C_Producto c_producto) {
        this.c_producto = c_producto;
        // Actualiza también el controlador del panel de juegos
        if (p_videoJuegos != null) {
            p_videoJuegos.setControlador(c_producto);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_contenido = new javax.swing.JPanel();
        labelTitlte = new javax.swing.JLabel();
        Contenedor = new javax.swing.JPanel();
        BttCarrito = new javax.swing.JButton();
        label_EstructuraDeDatos = new javax.swing.JLabel();

        panel_contenido.setBackground(new java.awt.Color(23, 29, 37));
        panel_contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitlte.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelTitlte.setForeground(new java.awt.Color(255, 255, 255));
        labelTitlte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelTitlte.setText("Seleccione sus juegos :");
        panel_contenido.add(labelTitlte, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 30));

        Contenedor.setBackground(new java.awt.Color(24, 32, 40));
        Contenedor.setForeground(new java.awt.Color(255, 255, 255));
        Contenedor.setLayout(new java.awt.BorderLayout());
        panel_contenido.add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 640, 460));

        BttCarrito.setBackground(new java.awt.Color(120, 178, 36));
        BttCarrito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BttCarrito.setForeground(new java.awt.Color(180, 222, 120));
        BttCarrito.setText("Ver mi carrito");
        BttCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BttCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttCarritoActionPerformed(evt);
            }
        });
        panel_contenido.add(BttCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 130, 30));

        label_EstructuraDeDatos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_EstructuraDeDatos.setForeground(new java.awt.Color(255, 255, 255));
        panel_contenido.add(label_EstructuraDeDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BttCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttCarritoActionPerformed
       // Modifica esta línea para que llame al nuevo método:
        abrirCarrito();
    }//GEN-LAST:event_BttCarritoActionPerformed

    private void ponerScroll(JPanel panel){
        JScrollPane scroll = new JScrollPane(panel);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        scroll.setBounds(40, 100, 640, 460);

        panel_contenido.remove(panel);
        panel_contenido.add(scroll, new AbsoluteConstraints(40, 100, 640, 460));
    }
    
    private void ponerPanel(JPanel panel) {
        panel.setSize(639, 827);

        Contenedor.removeAll();
        Contenedor.add(panel);
        Contenedor.revalidate();
        Contenedor.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttCarrito;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel labelTitlte;
    private javax.swing.JLabel label_EstructuraDeDatos;
    private javax.swing.JPanel panel_contenido;
    // End of variables declaration//GEN-END:variables
}
