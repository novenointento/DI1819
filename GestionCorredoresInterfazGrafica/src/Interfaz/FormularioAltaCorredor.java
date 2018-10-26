/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import logica.GestorPrincipal;
import modelo.Corredor;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;

/**
 *
 * @author daniel regueiro
 */
public class FormularioAltaCorredor extends javax.swing.JDialog {

    private Corredor corredorSeleccionado = null;

    /**
     * Creates new form FormularioAlta
     */
    public FormularioAltaCorredor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Aceptar1.setEnabled(false);
        GestorPrincipal.getInstance().volcarCsvCorredoresAColeccion();
        validador();
    }

    public FormularioAltaCorredor(VisualizadorCorredores parent, boolean modal, Corredor corredorSeleccionado) {
        super(parent, modal);
        initComponents();
        jTextFieldNombre.setText(corredorSeleccionado.getNombre());
        jTextFieldApellidos.setText(corredorSeleccionado.getApellidos());
        jTextFieldDireccion.setText(corredorSeleccionado.getDireccion());
        jTextFieldDni.setText(corredorSeleccionado.getDni());
        jSpinnerFecha.setValue(corredorSeleccionado.getFechaNacimiento());
        validador();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelApellidos = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldDni = new javax.swing.JTextField();
        jLabelFecha = new javax.swing.JLabel();
        jSpinnerFecha = new javax.swing.JSpinner();
        Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Aceptar1 = new javax.swing.JButton();
        validationPanel = new org.netbeans.validation.api.ui.swing.ValidationPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelApellidos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelApellidos.setText("Apellidos");

        jLabelDni.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelDni.setText("Dni");

        jLabelDireccion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelDireccion.setText("Direccion");

        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jTextFieldNombre.setBackground(new java.awt.Color(204, 204, 204));

        jTextFieldApellidos.setBackground(new java.awt.Color(204, 204, 204));

        jTextFieldDireccion.setBackground(new java.awt.Color(204, 204, 204));

        jTextFieldDni.setBackground(new java.awt.Color(204, 204, 204));

        jLabelFecha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelFecha.setText("Fecha");

        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel());

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel1.setText("Formulario dar de alta corredor");

        Aceptar1.setText("Aceptar");
        Aceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aceptar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(524, 524, 524)
                                .addComponent(Aceptar1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addGap(44, 44, 44)
                                .addComponent(Volver, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(352, 352, 352)
                                .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldApellidos)
                                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                                    .addComponent(jTextFieldDni)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(validationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(103, 103, 103))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(286, 286, 286)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addGap(104, 104, 104)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(409, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_VolverActionPerformed
    private void validador() {
        ValidationGroup group = validationPanel.getValidationGroup();
        group.add(jTextFieldNombre, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldApellidos, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldDireccion, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldDni, StringValidators.REQUIRE_NON_EMPTY_STRING);
        validationPanel.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (validationPanel.getProblem() == null) {
                    Aceptar1.setEnabled(true);
                } else {
                    Aceptar1.setEnabled(false);
                }
            }
        });

    }
    private void Aceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aceptar1ActionPerformed
        // TODO add your handling code here:  
        boolean anadido = false;
        String nombre = jTextFieldNombre.getText();
        String apellido = jTextFieldApellidos.getText();
        String dni = jTextFieldDni.getText();
        String direccion = jTextFieldDireccion.getText();
        Date fecha = (Date) jSpinnerFecha.getValue();
        if (corredorSeleccionado == null) {
            if (GestorPrincipal.getInstance().buscarUnCorredorDni(jTextFieldDni.getText()) == null) {
                GestorPrincipal.getInstance().anadirCorredor(nombre, apellido, fecha, dni, direccion);
                JOptionPane.showMessageDialog(this, "Se ha creado un corredor", "Alta", JOptionPane.INFORMATION_MESSAGE);
                  setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "El Dni ya existe en la base de datos, modifique la entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            corredorSeleccionado.setNombre(nombre);
            corredorSeleccionado.setApellidos(apellido);
            corredorSeleccionado.setDireccion(direccion);
            corredorSeleccionado.setDni(dni);
            corredorSeleccionado.setFechaNacimiento(fecha);
            JOptionPane.showMessageDialog(this, "Se ha creado un corredor", "Alta", JOptionPane.INFORMATION_MESSAGE);
              setVisible(false);
        }
    }//GEN-LAST:event_Aceptar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar1;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldNombre;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanel;
    // End of variables declaration//GEN-END:variables
}
