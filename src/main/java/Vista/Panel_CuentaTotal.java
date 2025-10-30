package Vista;

import Controlador.C_Producto;
import Controlador.C_Producto_ColaPrioridad;
import Modelo.Producto;
import javax.swing.JFrame;
import javax.swing.JOptionPane; 
import javax.swing.table.DefaultTableModel;

public class Panel_CuentaTotal extends javax.swing.JPanel {

    private C_Producto_ColaPrioridad c_cola; // Este panel USA la cola de prioridad
    private JFrame frame_principal;
    private C_Producto c_carritoOriginal; // Para saber a dónde "regresar"

    /**
     * Creates new form Panel_CuentaTotal
     */
    public Panel_CuentaTotal(JFrame frame) {
        initComponents();
        this.frame_principal = frame;
        this.c_cola = new C_Producto_ColaPrioridad();
        
        // Configura la tabla
        tabla_cuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "Nombre", "Precio/u", "Cantidad", "Prioridad", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        // Desactiva el campo de texto total
        txtTotal.setEditable(false);
    }

    /**
     * Este método es llamado desde Formulario_Principal.
     * Recibe los productos, los ordena por prioridad y los muestra.
     */
    public void mostrarCuenta(Producto[] productos, C_Producto c_carritoOriginal) {
        // 1. Guarda el carrito original por si el usuario quiere "regresar"
        this.c_carritoOriginal = c_carritoOriginal;
        
        // 2. Limpia la cola y la recarga con los productos (esto los ordena)
        this.c_cola = new C_Producto_ColaPrioridad();
        for (Producto p : productos) {
            c_cola.insertar(p);
        }
        
        // 3. Llena la tabla y el total (usando una versión modificada de llenarTabla)
        llenarTablaConPrioridad(tabla_cuenta);
        c_cola.generarImporteFinal(txtTotal);
    }
    
    /**
     * Versión especial de llenarTabla que también muestra la prioridad
     */
    public void llenarTablaConPrioridad(javax.swing.JTable tabla) {
        DefaultTableModel dt = (DefaultTableModel) tabla.getModel();
        dt.setRowCount(0);

        if (c_cola.estaVacia()) return;

        Producto[] productos = c_cola.getCola();

        // Recorremos la cola (que ya está ordenada por prioridad)
        for (int i = c_cola.getFirst(); i <= c_cola.getLast(); i++) {
            Object[] datos = new Object[6]; // 6 columnas
            datos[0] = productos[i].getId();
            datos[1] = productos[i].getNombre();
            datos[2] = productos[i].getPrecio();
            datos[3] = productos[i].getCantidad();
            datos[4] = productos[i].getPrioridad(); // ¡La nueva columna!
            datos[5] = productos[i].getCantidad() * productos[i].getPrecio();
            dt.addRow(datos);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_cuenta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_cuenta = new javax.swing.JTable();
        bttRegresar = new javax.swing.JButton();
        bttPagar = new javax.swing.JButton();
        label_total = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setBackground(new java.awt.Color(23, 29, 37));

        label_cuenta.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        label_cuenta.setForeground(new java.awt.Color(255, 255, 255));
        label_cuenta.setText("Cuenta total:");

        tabla_cuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla_cuenta);

        bttRegresar.setBackground(new java.awt.Color(120, 178, 36));
        bttRegresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttRegresar.setForeground(new java.awt.Color(255, 255, 255));
        bttRegresar.setText("<= regresar");
        bttRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttRegresarActionPerformed(evt);
            }
        });

        bttPagar.setBackground(new java.awt.Color(120, 178, 36));
        bttPagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttPagar.setForeground(new java.awt.Color(255, 255, 255));
        bttPagar.setText("Pagar");
        bttPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttPagarActionPerformed(evt);
            }
        });

        label_total.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        label_total.setForeground(new java.awt.Color(255, 255, 255));
        label_total.setText("Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(label_total)
                            .addGap(18, 18, 18)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(label_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_total, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttRegresarActionPerformed
        // Llama al método en Formulario_Principal para volver al carrito
        if (frame_principal instanceof Formulario_Principal) {
            ((Formulario_Principal) frame_principal).regresarAlCarrito(c_carritoOriginal);
        }
    }//GEN-LAST:event_bttRegresarActionPerformed

    private void bttPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPagarActionPerformed
        // Muestra el mensaje de agradecimiento
        JOptionPane.showMessageDialog(this, "gracias por su compra");
        
        // (Opcional) Aquí podrías limpiar los carritos y volver al inicio
        // if (frame_principal instanceof Formulario_Principal) {
        //     ((Formulario_Principal) frame_principal).resetearPaneles();
        // }
    }//GEN-LAST:event_bttPagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttPagar;
    private javax.swing.JButton bttRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_cuenta;
    private javax.swing.JLabel label_total;
    private javax.swing.JTable tabla_cuenta;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}