package Vista;

/**
 *
 * @author RODRIGO
 */

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.C_Producto;
import Controlador.C_Producto_Arreglo;
import Controlador.C_Producto_ListaEnlazada;
import Controlador.C_Producto_Pilas;
import Controlador.C_Producto_Cola; // ¡Importa el nuevo controlador de Cola!

public class Formulario_Principal extends JFrame {

    // Vuelve a tener una sola variable genérica
    private C_Producto c_producto; 

    public Formulario_Principal() {
        initComponents();
        ponerImagen(labelfoto, "/logo.png");
        ponerImagen(label_fondo, "/fondo_presentacion.jpg");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        // Ya no inicializamos los paneles aquí
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_fondo = new javax.swing.JPanel();
        panel_contenido = new javax.swing.JPanel();
        label_fondo = new javax.swing.JLabel();
        panel_barra = new javax.swing.JPanel();
        labelfoto = new javax.swing.JLabel();
        bttListEnlazada = new javax.swing.JButton();
        bttPila = new javax.swing.JButton();
        bttArbol = new javax.swing.JButton();
        bttCola = new javax.swing.JButton();
        bttArreglo = new javax.swing.JButton();
        labelSteam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_fondo.setBackground(new java.awt.Color(23, 29, 37));

        panel_contenido.setBackground(new java.awt.Color(23, 29, 37));

        javax.swing.GroupLayout panel_contenidoLayout = new javax.swing.GroupLayout(panel_contenido);
        panel_contenido.setLayout(panel_contenidoLayout);
        panel_contenidoLayout.setHorizontalGroup(
            panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_contenidoLayout.setVerticalGroup(
            panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel_barra.setBackground(new java.awt.Color(14, 52, 80));

        labelfoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bttListEnlazada.setBackground(new java.awt.Color(14, 52, 80));
        bttListEnlazada.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bttListEnlazada.setForeground(new java.awt.Color(255, 255, 255));
        bttListEnlazada.setText("        >    Lista Enlazada");
        bttListEnlazada.setBorder(new javax.swing.border.MatteBorder(null));
        bttListEnlazada.setBorderPainted(false);
        bttListEnlazada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttListEnlazada.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bttListEnlazada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttListEnlazadaActionPerformed(evt);
            }
        });

        bttPila.setBackground(new java.awt.Color(14, 52, 80));
        bttPila.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bttPila.setForeground(new java.awt.Color(255, 255, 255));
        bttPila.setText("        >    Pila");
        bttPila.setBorder(new javax.swing.border.MatteBorder(null));
        bttPila.setBorderPainted(false);
        bttPila.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttPila.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bttPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttPilaActionPerformed(evt);
            }
        });

        bttArbol.setBackground(new java.awt.Color(14, 52, 80));
        bttArbol.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bttArbol.setForeground(new java.awt.Color(255, 255, 255));
        bttArbol.setText("        >    Arbol");
        bttArbol.setBorder(new javax.swing.border.MatteBorder(null));
        bttArbol.setBorderPainted(false);
        bttArbol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttArbol.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bttArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttArbolActionPerformed(evt);
            }
        });

        bttCola.setBackground(new java.awt.Color(14, 52, 80));
        bttCola.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bttCola.setForeground(new java.awt.Color(255, 255, 255));
        bttCola.setText("        >    Cola");
        bttCola.setBorder(new javax.swing.border.MatteBorder(null));
        bttCola.setBorderPainted(false);
        bttCola.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttCola.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bttCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttColaActionPerformed(evt);
            }
        });

        bttArreglo.setBackground(new java.awt.Color(14, 52, 80));
        bttArreglo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bttArreglo.setForeground(new java.awt.Color(255, 255, 255));
        bttArreglo.setText("        >    Arreglo");
        bttArreglo.setBorder(new javax.swing.border.MatteBorder(null));
        bttArreglo.setBorderPainted(false);
        bttArreglo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttArreglo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bttArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttArregloActionPerformed(evt);
            }
        });

        labelSteam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelSteam.setForeground(new java.awt.Color(255, 255, 255));
        labelSteam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSteam.setText("STEAM");

        javax.swing.GroupLayout panel_barraLayout = new javax.swing.GroupLayout(panel_barra);
        panel_barra.setLayout(panel_barraLayout);
        panel_barraLayout.setHorizontalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bttArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bttListEnlazada, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bttPila, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bttCola, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bttArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSteam, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panel_barraLayout.setVerticalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelSteam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bttArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bttListEnlazada, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bttPila, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bttCola, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bttArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panel_fondoLayout = new javax.swing.GroupLayout(panel_fondo);
        panel_fondo.setLayout(panel_fondoLayout);
        panel_fondoLayout.setHorizontalGroup(
            panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fondoLayout.createSequentialGroup()
                .addComponent(panel_barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_fondoLayout.setVerticalGroup(
            panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ponerImagen(JLabel label, String URL) {
        ImageIcon icon = new ImageIcon(getClass().getResource(URL));
        Image image = icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(image));
    }

    private void ponerPanel(JPanel panel) {
        panel.setSize(730, 600);
        panel_contenido.removeAll();
        panel_contenido.add(panel);
        panel_contenido.revalidate();
        panel_contenido.repaint();
    }

    // --- Métodos de botones (Restaurados y Modificados) ---
    
    private void bttListEnlazadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttListEnlazadaActionPerformed
        c_producto = new C_Producto_ListaEnlazada();
        Formulario_Compra f_compra = new Formulario_Compra(this,c_producto,"-- Lista Enlazada --");
        ponerPanel(f_compra);
    }//GEN-LAST:event_bttListEnlazadaActionPerformed

    private void bttPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPilaActionPerformed
        c_producto = new C_Producto_Pilas();
        Formulario_Compra f_compra = new Formulario_Compra(this,c_producto,"-- Pilas --");
        ponerPanel(f_compra);
    }//GEN-LAST:event_bttPilaActionPerformed

    private void bttArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttArbolActionPerformed
        // Vacío
    }//GEN-LAST:event_bttArbolActionPerformed

    private void bttColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttColaActionPerformed
        // ¡Implementa la nueva Cola!
        c_producto = new C_Producto_Cola();
        Formulario_Compra f_compra = new Formulario_Compra(this,c_producto,"-- Colas --");
        ponerPanel(f_compra);
    }//GEN-LAST:event_bttColaActionPerformed

    private void bttArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttArregloActionPerformed
       c_producto = new C_Producto_Arreglo();
       Formulario_Compra f_compra = new Formulario_Compra(this,c_producto,"-- Arreglo --");
       ponerPanel(f_compra);
    }//GEN-LAST:event_bttArregloActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttArbol;
    private javax.swing.JButton bttArreglo;
    private javax.swing.JButton bttCola;
    private javax.swing.JButton bttListEnlazada;
    private javax.swing.JButton bttPila;
    private javax.swing.JLabel labelSteam;
    private javax.swing.JLabel label_fondo;
    private javax.swing.JLabel labelfoto;
    private javax.swing.JPanel panel_barra;
    private javax.swing.JPanel panel_contenido;
    private javax.swing.JPanel panel_fondo;
    // End of variables declaration//GEN-END:variables
}