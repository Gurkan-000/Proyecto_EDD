
package Vista;

/**
 *
 * @author RODRIGO
 */
public class Formulario_Principal extends javax.swing.JFrame {


    public Formulario_Principal() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_barra = new javax.swing.JPanel();
        labelfoto = new javax.swing.JLabel();
        bttListEnlazada = new javax.swing.JButton();
        bttPila = new javax.swing.JButton();
        bttArbol = new javax.swing.JButton();
        bttCola = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_barra.setBackground(new java.awt.Color(51, 51, 51));

        labelfoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelfoto.setText("LOGO");

        bttListEnlazada.setBackground(new java.awt.Color(51, 51, 51));
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

        bttPila.setBackground(new java.awt.Color(51, 51, 51));
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

        bttArbol.setBackground(new java.awt.Color(51, 51, 51));
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

        bttCola.setBackground(new java.awt.Color(51, 51, 51));
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

        javax.swing.GroupLayout panel_barraLayout = new javax.swing.GroupLayout(panel_barra);
        panel_barra.setLayout(panel_barraLayout);
        panel_barraLayout.setHorizontalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bttCola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bttArbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_barraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addComponent(bttListEnlazada, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
            .addComponent(bttPila, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_barraLayout.setVerticalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(bttListEnlazada, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttPila, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttCola, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttListEnlazadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttListEnlazadaActionPerformed
        
    }//GEN-LAST:event_bttListEnlazadaActionPerformed

    private void bttPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPilaActionPerformed
       
    }//GEN-LAST:event_bttPilaActionPerformed

    private void bttArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttArbolActionPerformed
        
    }//GEN-LAST:event_bttArbolActionPerformed

    private void bttColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttColaActionPerformed
     
    }//GEN-LAST:event_bttColaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttArbol;
    private javax.swing.JButton bttCola;
    private javax.swing.JButton bttListEnlazada;
    private javax.swing.JButton bttPila;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelfoto;
    private javax.swing.JPanel panel_barra;
    // End of variables declaration//GEN-END:variables
}
