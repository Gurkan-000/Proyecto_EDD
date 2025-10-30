
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
import Modelo.Producto;

public class Formulario_Principal extends JFrame {

   // --- Definir todos los controladores y paneles aquí ---
    private C_Producto_Arreglo c_arreglo;
    private C_Producto_ListaEnlazada c_lista;
    // (Ya no necesitamos c_cola aquí, el panel de cuenta lo maneja)
    
    private Formulario_Compra panel_arreglo;
    private Formulario_Compra panel_lista;
    private Panel_CuentaTotal panel_cuenta; // ¡El nuevo panel!
    
    // Variable para recordar a dónde "regresar"
    private C_Producto c_ultimoCarrito;

    public Formulario_Principal() {
        initComponents();
        ponerImagen(labelfoto, "/logo.png");
        ponerImagen(label_fondo, "/fondo_presentacion.jpg");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        // --- Crear todas las instancias en el constructor ---
        
        // 1. Crear controladores
        c_arreglo = new C_Producto_Arreglo();
        c_lista = new C_Producto_ListaEnlazada();

        // 2. Crear paneles
        panel_arreglo = new Formulario_Compra(this, c_arreglo, "-- Arreglo --");
        panel_lista = new Formulario_Compra(this, c_lista, "-- Lista Enlazada --");
        panel_cuenta = new Panel_CuentaTotal(this); // ¡El nuevo panel!
        
        // Inicia en el panel de arreglo por defecto
        c_ultimoCarrito = c_arreglo;
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
    
    public void mostrarCuentaTotal(Producto[] productos) {
        // 1. Pasa los productos y el carrito original al panel de cuenta
        panel_cuenta.mostrarCuenta(productos, c_ultimoCarrito);
        
        // 2. Muestra el panel de cuenta
        ponerPanel(panel_cuenta);
    }
    
    public void regresarAlCarrito(C_Producto c_carritoOriginal) {
        // 1. Muestra el panel de compra original
        if (c_carritoOriginal instanceof C_Producto_Arreglo) {
            ponerPanel(panel_arreglo);
        } else if (c_carritoOriginal instanceof C_Producto_ListaEnlazada) {
            ponerPanel(panel_lista);
        }

        // 2. Re-abre el JDialog del carrito
        JDialog_ListCompra compras = new JDialog_ListCompra(this, c_carritoOriginal);
        compras.setSize(818, 550);
        compras.setLocationRelativeTo(this);
        compras.setVisible(true);
    }
    
    private void bttListEnlazadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttListEnlazadaActionPerformed
      // Muestra el panel y guarda este controlador como el "último"
        ponerPanel(panel_lista);
        c_ultimoCarrito = c_lista;
    }//GEN-LAST:event_bttListEnlazadaActionPerformed

    private void bttPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPilaActionPerformed

    }//GEN-LAST:event_bttPilaActionPerformed

    private void bttArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttArbolActionPerformed

    }//GEN-LAST:event_bttArbolActionPerformed

    private void bttColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttColaActionPerformed
        ponerPanel(panel_cuenta);
    }//GEN-LAST:event_bttColaActionPerformed

    private void bttArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttArregloActionPerformed
       // Muestra el panel y guarda este controlador como el "último"
        ponerPanel(panel_arreglo);
        c_ultimoCarrito = c_arreglo;
    }//GEN-LAST:event_bttArregloActionPerformed
    
    public void resetearCarritos() {
       if (c_arreglo != null) {
            c_arreglo.reset();
        }
        if (c_lista != null) {
            c_lista.reset();
        }
        // --- AÑADE ESTAS LÍNEAS ---
        // Vuelve a mostrar el panel de arreglo vacío después de pagar
        ponerPanel(panel_arreglo);
        c_ultimoCarrito = c_arreglo;
        // --------------------------
        System.out.println("Carritos reseteados y volviendo al panel Arreglo.");
    }

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
