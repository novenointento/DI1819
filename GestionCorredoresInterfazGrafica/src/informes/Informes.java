/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informes;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;
import logica.GestorPrincipal;
import logica.TableModelCarrera;
import logica.TableModelCorredor;
import modelo.Carrera;
import modelo.Corredor;
import modelo.CorredorCarrera;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.openide.util.Exceptions;

/**
 *
 * @author daniel
 */
public class Informes extends javax.swing.JDialog {

    private int filaCarreraSeleccionada = -1;
    private int filaCorredorSeleccionado = -1;

    /**
     * Creates new form Informes
     */
    public Informes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        rellenarTable();
        rellenarTableAcabadas();
        rellenarTableCorredores();
    }

    public void rellenarTableAcabadas() {
        List<Carrera> listaAcabadas = GestorPrincipal.getInstance().devolverColeccionCarreras();
        List<Carrera> acabadas = new ArrayList();

        for (Carrera carrera : listaAcabadas) {
            if (!carrera.isAbierta()) {
                acabadas.add(carrera);

            }
        }

        jTableCarreras1.setModel(new TableModelCarrera(acabadas));

    }

    public void rellenarTable() {

        jTableCarreras.setModel(new TableModelCarrera(GestorPrincipal.getInstance().devolverColeccionCarreras()));

    }

    public void rellenarTableCorredores() {

        TableModelCorredor tbm = new TableModelCorredor(GestorPrincipal.getInstance().devolverColeccionCorredores());
        jTableCorredores.setModel(tbm);
        TableRowSorter<TableModelCorredor> sorter = new TableRowSorter<>(tbm);
        jTableCorredores.setRowSorter(sorter);
        List<RowSorter.SortKey> sortkeys = new ArrayList<>();
        sortkeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortkeys);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonInforme1 = new javax.swing.JButton();
        jLabelTituloCarreras = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCarreras = new javax.swing.JTable();
        jButtonEliminarCarrera1 = new javax.swing.JButton();
        jLabelTituloCarreras1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCarreras1 = new javax.swing.JTable();
        jButtonClasificacion = new javax.swing.JButton();
        jLabelTituloCarreras2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();
        jButtonSalir = new javax.swing.JButton();
        jLabelTituloCarreras3 = new javax.swing.JLabel();
        jButtonEliminarCarrera4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonInforme1.setText(org.openide.util.NbBundle.getMessage(Informes.class, "Informes.jButtonInforme1.text")); // NOI18N
        jButtonInforme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInforme1ActionPerformed(evt);
            }
        });

        jLabelTituloCarreras.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTituloCarreras.setText(org.openide.util.NbBundle.getMessage(Informes.class, "Informes.jLabelTituloCarreras.text")); // NOI18N

        jTableCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableCarreras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCarrerasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCarreras);

        jButtonEliminarCarrera1.setText(org.openide.util.NbBundle.getMessage(Informes.class, "Informes.jButtonEliminarCarrera1.text")); // NOI18N
        jButtonEliminarCarrera1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInforme(evt);
            }
        });

        jLabelTituloCarreras1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTituloCarreras1.setText(org.openide.util.NbBundle.getMessage(Informes.class, "Informes.jLabelTituloCarreras1.text")); // NOI18N

        jTableCarreras1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTableCarreras1);

        jButtonClasificacion.setText(org.openide.util.NbBundle.getMessage(Informes.class, "Informes.jButtonClasificacion.text")); // NOI18N
        jButtonClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClasificacionActionPerformed(evt);
            }
        });

        jLabelTituloCarreras2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTituloCarreras2.setText(org.openide.util.NbBundle.getMessage(Informes.class, "Informes.jLabelTituloCarreras2.text")); // NOI18N

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTableCorredores);

        jButtonSalir.setText(org.openide.util.NbBundle.getMessage(Informes.class, "Informes.jButtonSalir.text")); // NOI18N
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabelTituloCarreras3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTituloCarreras3.setText(org.openide.util.NbBundle.getMessage(Informes.class, "Informes.jLabelTituloCarreras3.text")); // NOI18N

        jButtonEliminarCarrera4.setText(org.openide.util.NbBundle.getMessage(Informes.class, "Informes.jButtonEliminarCarrera4.text")); // NOI18N
        jButtonEliminarCarrera4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCorredoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabelTituloCarreras3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTituloCarreras1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTituloCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                .addComponent(jButtonInforme1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelTituloCarreras2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonEliminarCarrera1)
                                    .addComponent(jButtonClasificacion))))
                        .addContainerGap(12, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalir)
                .addGap(168, 168, 168))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(764, Short.MAX_VALUE)
                    .addComponent(jButtonEliminarCarrera4)
                    .addGap(2, 2, 2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInforme1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTituloCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabelTituloCarreras3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminarCarrera1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTituloCarreras1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTituloCarreras2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(936, Short.MAX_VALUE)
                    .addComponent(jButtonEliminarCarrera4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInforme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInforme1ActionPerformed
        try {
            JFileChooser selector = new JFileChooser();
            File selectedFile = selector.getSelectedFile();

            List<Carrera> listaCarrerasAbiertas = GestorPrincipal.getInstance().devolverCarrerasNoFinalizadas();

            //La encapsulamos en el objeto adecuado
            JRDataSource dataSource = new JRBeanCollectionDataSource(listaCarrerasAbiertas);

            //Creamos el map para los parámetros, en este caso va vacío.
            Map parametros = new HashMap();

            JasperPrint print = JasperFillManager.fillReport("Informes/InformeCarrerasSinFinalizar.jasper", parametros, dataSource);
            JasperExportManager.exportReportToPdfFile(print, "Informes/informeCarrerasSinFinalizar.pdf");
            JOptionPane.showMessageDialog(this, "Se ha generado un informe");
        } catch (JRException ex) {
            Exceptions.printStackTrace(ex);
        }

    }//GEN-LAST:event_jButtonInforme1ActionPerformed

    private void jTableCarrerasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCarrerasMouseClicked

    }//GEN-LAST:event_jTableCarrerasMouseClicked

    private void jButtonInforme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInforme
        filaCarreraSeleccionada = jTableCarreras.getSelectedRow();
        Carrera carrera;

        ArrayList<CorredorInformeCarrera> corredoresInformes = new ArrayList<>();
        if (filaCarreraSeleccionada >= 0) {
            try {
                carrera = carreraSeleccionada();
                carrera.getCorredores();
                for (CorredorCarrera corredor : carrera.getCorredores()) {

                    CorredorInformeCarrera corredorI = new CorredorInformeCarrera();
                    corredorI.setApellidos(corredor.getCorredor().getApellidos());
                    corredorI.setDireccion(corredor.getCorredor().getDireccion());
                    corredorI.setDni(corredor.getCorredor().getDni());
                    corredorI.setNombre(corredor.getCorredor().getNombre());
                    corredorI.setDorsal(corredor.getDorsal());
                    corredorI.setFechaNacimiento(corredor.getCorredor().getFechaNacimiento());
                    corredorI.setTiempo(corredor.getTiempo());
                    corredoresInformes.add(corredorI);
                }

                Map parametros = new HashMap();

                parametros.put("nombre", carrera.getNombre());

                parametros.put("lugar", carrera.getLugar());

                parametros.put("estado", carrera.getEstado());
                JRDataSource dataSource = new JRBeanCollectionDataSource(corredoresInformes);
                JasperPrint print = JasperFillManager.fillReport("Informes/informeCorredoresDeUnaCarrera.jasper", parametros, dataSource);
                JasperExportManager.exportReportToPdfFile(print, "Informes/informeCorredoresDeUnaCarrera.pdf");
                JOptionPane.showMessageDialog(this, "Se ha generado un informe");
            } catch (JRException ex) {
                Exceptions.printStackTrace(ex);
            }
        }


    }//GEN-LAST:event_jButtonInforme

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed


    private void jButtonClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClasificacionActionPerformed
        filaCarreraSeleccionada = jTableCarreras1.getSelectedRow();
        Carrera carrera;

        ArrayList<CorredorInformeCarrera> corredoresInformes = new ArrayList<>();
        if (filaCarreraSeleccionada >= 0) {
            try {
                carrera = carreraSeleccionada();
                carrera.getCorredores();
                for (CorredorCarrera corredor : carrera.getCorredores()) {

                    CorredorInformeCarrera corredorI = new CorredorInformeCarrera();
                    corredorI.setApellidos(corredor.getCorredor().getApellidos());
                    corredorI.setDireccion(corredor.getCorredor().getDireccion());
                    corredorI.setDni(corredor.getCorredor().getDni());
                    corredorI.setNombre(corredor.getCorredor().getNombre());
                    corredorI.setDorsal(corredor.getDorsal());
                    corredorI.setFechaNacimiento(corredor.getCorredor().getFechaNacimiento());
                    corredorI.setTiempo(corredor.getTiempo());
                    corredoresInformes.add(corredorI);
                }

                Map parametros = new HashMap();

                parametros.put("nombre", carrera.getNombre());

                parametros.put("lugar", carrera.getLugar());

                parametros.put("estado", carrera.getEstado());
                JRDataSource dataSource = new JRBeanCollectionDataSource(corredoresInformes);
                JasperPrint print = JasperFillManager.fillReport("Informes/informeClasificacion.jasper", parametros, dataSource);
                JasperExportManager.exportReportToPdfFile(print, "Informes/informeClasificacion.pdf");
                JOptionPane.showMessageDialog(this, "Se ha generado un informe");
            } catch (JRException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }//GEN-LAST:event_jButtonClasificacionActionPerformed

    private void jButtonCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCorredoresActionPerformed
        filaCorredorSeleccionado = jTableCorredores.getSelectedRow();
        Corredor corredor;

        if (filaCorredorSeleccionado >= 0) {

            try {
                corredor = GestorPrincipal.getInstance().devolverColeccionCorredores().get(filaCorredorSeleccionado);
                List<Carrera> carrerasParticipa = new ArrayList<Carrera>();
                List<Carrera> carreras = GestorPrincipal.getInstance().devolverColeccionCarreras();
                for (Carrera carrera : carreras) {

                    List<CorredorCarrera> corredores = carrera.getCorredores();
                    for (CorredorCarrera corredore : corredores) {
                        if (corredore.getCorredor().equals(corredor)) {
                            System.out.println(carrera.toString());
                            carrerasParticipa.add(carrera);
                        }
                    }

                }

                Map parametros = new HashMap();

                parametros.put("nombre", corredor.getNombre());

                parametros.put("dni", corredor.getDni());

                parametros.put("apellidos", corredor.getApellidos());

                JRDataSource dataSource = new JRBeanCollectionDataSource(carrerasParticipa);
                JasperPrint print = JasperFillManager.fillReport("Informes/informeCorredorConCarreras.jasper", parametros, dataSource);
                JasperExportManager.exportReportToPdfFile(print, "Informes/informeCorredorConCarreras.pdf");
                JOptionPane.showMessageDialog(this, "Se ha generado un informe");
            } catch (JRException ex) {
                Exceptions.printStackTrace(ex);
            }

        }


    }//GEN-LAST:event_jButtonCorredoresActionPerformed
    public Carrera carreraSeleccionada() {
        Carrera carrera = null;
        if (filaCarreraSeleccionada >= 0) {
            carrera = GestorPrincipal.getInstance().devolverColeccionCarreras().get(filaCarreraSeleccionada);
        }

        return carrera;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClasificacion;
    private javax.swing.JButton jButtonEliminarCarrera1;
    private javax.swing.JButton jButtonEliminarCarrera4;
    private javax.swing.JButton jButtonInforme1;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelTituloCarreras;
    private javax.swing.JLabel jLabelTituloCarreras1;
    private javax.swing.JLabel jLabelTituloCarreras2;
    private javax.swing.JLabel jLabelTituloCarreras3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableCarreras;
    private javax.swing.JTable jTableCarreras1;
    private javax.swing.JTable jTableCorredores;
    // End of variables declaration//GEN-END:variables
}
