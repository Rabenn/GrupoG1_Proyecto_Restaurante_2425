package views;

import controllers.Ingredientes;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Ingrediente;
import models.IngredienteReceta;
import oraclegeneral.Conexion;

/**
 * JFrame para agregar ingredientes-recetas a la base de datos.
 * @author Daniela Santillanes Castro
 * @version 1.0
 * @since 28/05/2015
 */
public class FrmIngredientesRecetas extends BaseFrame {

    private String idReceta;
    private String idIngrediente;
    private Integer cantidad;

    /**
     * Creates new form Login
     */
    private List<Ingrediente> ingredientesCombo = new ArrayList<>();
    private FrmProductos ventanaProductos;
    private IngredienteReceta ingredienteReceta = new IngredienteReceta();
    private Ingrediente ingredienteAgregar = new Ingrediente();
    public FrmIngredientesRecetas(FrmProductos frm) {
        initComponents();
        setTitle("Ingredientes");
        ventanaProductos = frm;
        ingredientesCombo = (List<Ingrediente>) Ingredientes.select(Conexion.getInstance().getCon(), "select * from ingredientes", Ingrediente.class);
        try {
            Ingredientes.fillCombo(comboIngrediente, ingredientesCombo, "nombre_ingrediente", Ingrediente.class);
        } catch (Exception ex) {
            Logger.getLogger(FrmIngredientesRecetas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        cmdAcceder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        comboIngrediente = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmdAcceder.setText("Agregar");
        cmdAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAccederActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrediente:");

        jLabel4.setText("Cantidad:");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        comboIngrediente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addContainerGap(150, Short.MAX_VALUE)
                            .addComponent(cmdAcceder)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCerrar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel3)))
                            .addGap(18, 18, 18)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboIngrediente, 0, 206, Short.MAX_VALUE)
                                .addComponent(txtCantidad)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdAcceder)
                    .addComponent(btnCerrar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAccederActionPerformed
        
        ingredienteReceta.setId_ingrediente(ingredientesCombo.get(comboIngrediente.getSelectedIndex()).getId_ingrediente());
        ingredienteReceta.setCantidad_ingrediente(BigDecimal.valueOf(Double.valueOf(txtCantidad.getText())));
        ventanaProductos.getIngredientes().add(ingredienteReceta);
        ventanaProductos.refrescarTabla(ingredientesCombo.get(comboIngrediente.getSelectedIndex()).getNombre_ingrediente());
        this.dispose();
    }//GEN-LAST:event_cmdAccederActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    /**
     * Metodo para obtener el Ingrediente a agregar.
     * @return ingredienteAgregar que es el ingrediente que se agrego.
     */
    public Ingrediente getIngredienteAgregar() {
        return ingredienteAgregar;
    }

    /**
     * Método que asigna el Ingrediente a agregar.
     * @param ingredienteAgregar que es el ingrediente que se agrego.
     */
    public void setIngredienteAgregar(Ingrediente ingredienteAgregar) {
        this.ingredienteAgregar = ingredienteAgregar;
    }

    /**
     * Método para obtener la cantidad que se utilizara del Ingrediente a agregar.
     * @return cantidad que es la cantidad que se requiere.
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Método para asignar la cantidad que se utilizara del Ingrediente a agregar.
     * @param cantidad que es la cantidad que se requiere.
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton cmdAcceder;
    private javax.swing.JComboBox comboIngrediente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
