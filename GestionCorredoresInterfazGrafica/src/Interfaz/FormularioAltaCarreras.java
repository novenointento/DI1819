/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.File;
import java.net.URL;
import java.util.Date;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import logica.GestorPrincipal;
import modelo.Carrera;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;

/**
 *
 * @author daniel regueiro
 */
public class FormularioAltaCarreras extends javax.swing.JDialog {

    private Carrera carrera = null;
    private MainPantallaPrincipalCorredor pantallaPrincipal;

    /**
     * Creates new form FormularioCarreras
     */
    public FormularioAltaCarreras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        pantallaPrincipal = (MainPantallaPrincipalCorredor) parent;
        initComponents();
       
        ponlaAyuda();
        setResizable(false);
        jButtonAceptarCarrera.setEnabled(false);
        validador();

    }

    public FormularioAltaCarreras(VisualizadorCarreras parent, boolean modal, Carrera carreraSeleccionada) {

        super(parent, modal);
        initComponents();
        this.carrera = carreraSeleccionada;
        this.jSpinnerFecha.setValue(carreraSeleccionada.getFecha());
        jTextFieldIdCarrera.setText(carreraSeleccionada.getIdentificador());
        jTextFieldLugar.setText(carreraSeleccionada.getLugar());
        jTextFieldNombre.setText(carreraSeleccionada.getNombre());
        jTextFieldNumParticipantes.setText(Integer.toString(carreraSeleccionada.getNumParticipantes()));
        validador();
    }

    private void ponlaAyuda() {
        try {
            // Carga el fichero de ayuda
            File fichero = new File("help" + File.separator + "help_set.hs");
            URL hsURL = fichero.toURI().toURL();

            // Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

            // Pone ayuda a item de menu al pulsarlo y a F1 en ventana
            // principal y secundaria.
            hb.enableHelpOnButton(jButtonAyuda, "crear_carrera", helpset);
            hb.enableHelpKey(getRootPane(), "crear_carrera", helpset);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void validador() {
        ValidationGroup group = validationPanel.getValidationGroup();
        group.add(jTextFieldNombre, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldLugar, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldIdCarrera, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldNumParticipantes, StringValidators.REQUIRE_NON_NEGATIVE_NUMBER, StringValidators.REQUIRE_NON_EMPTY_STRING, StringValidators.REQUIRE_VALID_INTEGER);
        validationPanel.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (validationPanel.getProblem() == null) {
                    jButtonAceptarCarrera.setEnabled(true);
                } else {
                    jButtonAceptarCarrera.setEnabled(false);
                }
            }
        });

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
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelNombreCarrera = new javax.swing.JLabel();
        jLabelLugarCarrera = new javax.swing.JLabel();
        jTextFieldLugar = new javax.swing.JTextField();
        jLabelFecha1 = new javax.swing.JLabel();
        jSpinnerFecha = new javax.swing.JSpinner();
        jTextFieldIdCarrera = new javax.swing.JTextField();
        jLabelIdCarrera = new javax.swing.JLabel();
        validationPanel = new org.netbeans.validation.api.ui.swing.ValidationPanel();
        jLabelParticipantes = new javax.swing.JLabel();
        jTextFieldNumParticipantes = new javax.swing.JTextField();
        jButtonAceptarCarrera = new javax.swing.JButton();
        jButtonCancelarCarrera = new javax.swing.JButton();
        jButtonAyuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel1.setText("Formulario alta de carrera");

        jTextFieldNombre.setBackground(new java.awt.Color(204, 204, 204));

        jLabelNombreCarrera.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelNombreCarrera.setText("Nombre de la carrera:");

        jLabelLugarCarrera.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelLugarCarrera.setText("Lugar de la carrera:");

        jTextFieldLugar.setBackground(new java.awt.Color(204, 204, 204));

        jLabelFecha1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelFecha1.setText("Fecha de la carrera:");

        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.DAY_OF_WEEK_IN_MONTH));

        jTextFieldIdCarrera.setBackground(new java.awt.Color(204, 204, 204));

        jLabelIdCarrera.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelIdCarrera.setText("Id de la carrera:");

        jLabelParticipantes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelParticipantes.setText("Nº de participantes");

        jTextFieldNumParticipantes.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldNumParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(validationPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabelIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabelLugarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldLugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldIdCarrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLugarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonAceptarCarrera.setText("Aceptar");
        jButtonAceptarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarCarreraActionPerformed(evt);
            }
        });

        jButtonCancelarCarrera.setText("Volver");
        jButtonCancelarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCarreraActionPerformed(evt);
            }
        });

        jButtonAyuda.setText("Ayuda");
        jButtonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButtonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAceptarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonCancelarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCancelarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jButtonAceptarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarCarreraActionPerformed

        String nombre = jTextFieldNombre.getText();
        String lugar = jTextFieldLugar.getText();
        String id = jTextFieldIdCarrera.getText();
        Date fecha = (Date) jSpinnerFecha.getValue();
        int participantes = Integer.parseInt(jTextFieldNumParticipantes.getText());
        if (carrera == null) {
            if (GestorPrincipal.getInstance().buscarCarreraId(id) == null) {
                GestorPrincipal.getInstance().anadirCarreraNueva(nombre, lugar, id, fecha, participantes);
                JOptionPane.showMessageDialog(this, "Se ha creado una carrera");
                setVisible(false);

            } else {
                JOptionPane.showMessageDialog(this, "El ID ya existe en la base de datos, modifique la entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            GestorPrincipal.getInstance().eleminarCarrera(carrera.getIdentificador());
            carrera.setNombre(nombre);
            carrera.setLugar(lugar);
            carrera.setFecha(fecha);
            carrera.setIdentificador(id);
            carrera.setNumParticipantes(participantes);
            GestorPrincipal.getInstance().anadirCarreraModificada(carrera);
            JOptionPane.showMessageDialog(this, "Se ha modificado una carrera");
            setVisible(false);

        }

    }//GEN-LAST:event_jButtonAceptarCarreraActionPerformed

    private void jButtonCancelarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCarreraActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonCancelarCarreraActionPerformed

    private void jButtonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAyudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAyudaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptarCarrera;
    private javax.swing.JButton jButtonAyuda;
    private javax.swing.JButton jButtonCancelarCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFecha1;
    private javax.swing.JLabel jLabelIdCarrera;
    private javax.swing.JLabel jLabelLugarCarrera;
    private javax.swing.JLabel jLabelNombreCarrera;
    private javax.swing.JLabel jLabelParticipantes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JTextField jTextFieldIdCarrera;
    private javax.swing.JTextField jTextFieldLugar;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNumParticipantes;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanel;
    // End of variables declaration//GEN-END:variables
}
