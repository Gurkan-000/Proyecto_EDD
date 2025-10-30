
package Vista;

import Vista.JDialog_CantidadProducto;
import Vista.Formulario_Compra;
import Controlador.C_Producto;
import Modelo.Producto;
import Modelo.Tienda;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Dimension;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author RODRIGO
 */
public class Panel_VideoJuegos extends JPanel implements ActionListener {


    private C_Producto c_producto;
    private Tienda tienda;
    private Producto producto;

    public Panel_VideoJuegos(C_Producto c_producto, Tienda tienda) {
        initComponents();

        ponerImagen(game1, "/Img_Games/deepRock.png",200,90);
        ponerImagen(game2, "/Img_Games/counterStrike.png",200,90);
        ponerImagen(game3, "/Img_Games/rust.PNG",200,90);
        ponerImagen(game4, "/Img_Games/sky.PNG",200,90);

        botonEvent();

        this.setPreferredSize(new Dimension(640, 1000));
        this.c_producto = c_producto;
        this.tienda = tienda;
    }
    
    /**
     * MÉTODO NUEVO: Para que Formulario_Compra actualice este panel.
     */
    public void setControlador(C_Producto c_producto) {
        this.c_producto = c_producto;
    }
    
    private void botonEvent() {
        game1.addActionListener(this);
        game2.addActionListener(this);
        game3.addActionListener(this);
        game4.addActionListener(this);
    }

    private void ponerImagen(JButton boton, String URL, int ancho, int altura) {
        ImageIcon icon = new ImageIcon(getClass().getResource(URL));
        Image image = icon.getImage().getScaledInstance(ancho, altura, Image.SCALE_SMOOTH);
        boton.setIcon(new ImageIcon(image));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton boton = (JButton) e.getSource(); 
        int indice = Integer.parseInt(boton.getText());
        
        Producto existente = c_producto.buscarProducto(indice + 1);
        
        if (existente == null) {
            tienda.setIndice(indice);

            producto = new Producto();
            producto.setId(indice + 1);
            producto.setNombre(tienda.getJuego());
            producto.setPrecio(tienda.getPrecio());
            
            JDialog_CantidadProducto cantidadProducto = new JDialog_CantidadProducto(Formulario_Compra.frame_principal,producto);
            cantidadProducto.setLocationRelativeTo(Formulario_Compra.frame_principal);
            cantidadProducto.setVisible(true);
            
            if(producto.getCantidad() > 0){
                c_producto.insertar(producto);
            }
        }else{
            JOptionPane.showMessageDialog(Formulario_Compra.frame_principal, "Este juego ya se encuentra en tu carrito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        label_game4 = new javax.swing.JLabel();
        label_game1 = new javax.swing.JLabel();
        label_game2 = new javax.swing.JLabel();
        label_game3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        game1 = new javax.swing.JButton();
        game2 = new javax.swing.JButton();
        game3 = new javax.swing.JButton();
        game4 = new javax.swing.JButton();

        jLabel7.setText("jLabel1");

        setBackground(new java.awt.Color(24, 32, 40));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_game4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        label_game4.setForeground(new java.awt.Color(255, 255, 255));
        label_game4.setText("Sky");
        add(label_game4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        label_game1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        label_game1.setForeground(new java.awt.Color(255, 255, 255));
        label_game1.setText("Deep Rock");
        add(label_game1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        label_game2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        label_game2.setForeground(new java.awt.Color(255, 255, 255));
        label_game2.setText("Counter Strike");
        add(label_game2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        label_game3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        label_game3.setForeground(new java.awt.Color(255, 255, 255));
        label_game3.setText("Rust");
        add(label_game3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("S/. 44.00");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 80, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("S/. 33.00");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 80, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("S/. 5.00");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 80, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("S/. 25.00");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 80, -1));

        game1.setBackground(new java.awt.Color(24, 32, 40));
        game1.setText("0");
        game1.setBorderPainted(false);
        game1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(game1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 200, 90));

        game2.setBackground(new java.awt.Color(24, 32, 40));
        game2.setText("1");
        game2.setBorderPainted(false);
        game2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(game2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 200, 90));

        game3.setBackground(new java.awt.Color(24, 32, 40));
        game3.setText("2");
        game3.setBorderPainted(false);
        game3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(game3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 200, 90));

        game4.setBackground(new java.awt.Color(24, 32, 40));
        game4.setText("3");
        game4.setBorderPainted(false);
        game4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(game4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 200, 90));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton game1;
    private javax.swing.JButton game2;
    private javax.swing.JButton game3;
    private javax.swing.JButton game4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel label_game1;
    private javax.swing.JLabel label_game2;
    private javax.swing.JLabel label_game3;
    private javax.swing.JLabel label_game4;
    // End of variables declaration//GEN-END:variables
}
