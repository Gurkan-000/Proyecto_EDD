
package Vista;

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
        ponerImagen(game3, "/Img_Games/rust.png",200,90);
        ponerImagen(game4, "/Img_Games/sky.png",200,90);
        ponerImagen(game5, "/Img_Games/R.E.P.O.png",200,90);
        ponerImagen(game6, "/Img_Games/palword.png",200,90);
        ponerImagen(game7, "/Img_Games/peak.png",200,90);

        botonEvent();

        this.setPreferredSize(new Dimension(640, 1050));
        this.c_producto = c_producto;
        this.tienda = tienda;
    }
    
    private void botonEvent() {
        game1.addActionListener(this);
        game2.addActionListener(this);
        game3.addActionListener(this);
        game4.addActionListener(this);
        game5.addActionListener(this);
        game6.addActionListener(this);
        game7.addActionListener(this);
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
        game5 = new javax.swing.JButton();
        game6 = new javax.swing.JButton();
        label_game5 = new javax.swing.JLabel();
        label_game6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        game7 = new javax.swing.JButton();
        label_game7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel7.setText("jLabel1");

        setBackground(new java.awt.Color(24, 32, 40));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_game4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        label_game4.setForeground(new java.awt.Color(255, 255, 255));
        label_game4.setText("Sky");
        add(label_game4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));

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
        add(label_game3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("S/. 44.00");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 80, -1));

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
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 80, -1));

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
        add(game3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 200, 90));

        game4.setBackground(new java.awt.Color(24, 32, 40));
        game4.setText("3");
        game4.setBorderPainted(false);
        game4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(game4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 200, 90));

        game5.setBackground(new java.awt.Color(24, 32, 40));
        game5.setText("4");
        game5.setBorderPainted(false);
        game5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(game5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 200, 90));

        game6.setBackground(new java.awt.Color(24, 32, 40));
        game6.setText("5");
        game6.setBorderPainted(false);
        game6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(game6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 760, 200, 90));

        label_game5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        label_game5.setForeground(new java.awt.Color(255, 255, 255));
        label_game5.setText("R.E.P.O");
        add(label_game5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, -1, -1));

        label_game6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        label_game6.setForeground(new java.awt.Color(255, 255, 255));
        label_game6.setText("Palword");
        add(label_game6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 770, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("S/. 15.00");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 660, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("S/. 63.00");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 800, 80, -1));

        game7.setBackground(new java.awt.Color(24, 32, 40));
        game7.setText("6");
        game7.setBorderPainted(false);
        game7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(game7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 900, 200, 90));

        label_game7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        label_game7.setForeground(new java.awt.Color(255, 255, 255));
        label_game7.setText("Peak");
        add(label_game7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 910, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("S/. 11.00");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 940, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton game1;
    private javax.swing.JButton game2;
    private javax.swing.JButton game3;
    private javax.swing.JButton game4;
    private javax.swing.JButton game5;
    private javax.swing.JButton game6;
    private javax.swing.JButton game7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel label_game1;
    private javax.swing.JLabel label_game2;
    private javax.swing.JLabel label_game3;
    private javax.swing.JLabel label_game4;
    private javax.swing.JLabel label_game5;
    private javax.swing.JLabel label_game6;
    private javax.swing.JLabel label_game7;
    // End of variables declaration//GEN-END:variables
}
