/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import logica.GestorPrincipal;
import org.openide.util.Exceptions;

/**
 *
 * @author daniel regueiro
 */
public class MainPantallaPrincipalCorredor extends javax.swing.JFrame {

    private File f = new File("/imagenes/corredor.png");
    private static final String RUTA_LOGO = "/imagenes/corredor.png";

    /**
     * Creates new form MainCorredor
     */
    public MainPantallaPrincipalCorredor() {
        cargarLookAndFeel();
        setResizable(false);
        try {

            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel(GestorPrincipal.getInstance().mandarLookAndFeelSeleccionado());
            SwingUtilities.updateComponentTreeUI(this);

        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Gestor corredores");
        setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());
        GestorPrincipal.getInstance().volcarCsvCorredoresAColeccion();
        try {
            Image image = ImageIO.read(getClass().getResource(RUTA_LOGO));
            image = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            jLabelIcono.setIcon(new ImageIcon(image));
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        //metodo para guardar la coleccion si se cierra en la cruz el programa
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                GestorPrincipal.getInstance().grabarColeccionCorredoresAcsv();
                GestorPrincipal.getInstance().grabarArchivoCarreras();
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

        jButtonSalir = new javax.swing.JButton();
        jLabelIcono = new javax.swing.JLabel();
        jButtonCrearCarrera = new javax.swing.JButton();
        jButtonCrearCorredor = new javax.swing.JButton();
        jButtonVerCarreras = new javax.swing.JButton();
        jButtonVerCorredores = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuItemAltaCorredor = new javax.swing.JMenuItem();
        jMenuItemAltaCarrera = new javax.swing.JMenuItem();
        jMenuItemVisualCorredor = new javax.swing.JMenuItem();
        jMenuVerCarrera = new javax.swing.JMenuItem();
        jMenuItemConfiguracion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonCrearCarrera.setText("Crear carrera");
        jButtonCrearCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearCarreraActionPerformed(evt);
            }
        });

        jButtonCrearCorredor.setText("Crear corredor");
        jButtonCrearCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearCorredorActionPerformed(evt);
            }
        });

        jButtonVerCarreras.setText("Ver carreras");
        jButtonVerCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerCarrerasActionPerformed(evt);
            }
        });

        jButtonVerCorredores.setText("Ver corredores");
        jButtonVerCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerCorredoresActionPerformed(evt);
            }
        });

        jMenuPrincipal.setText("Menu");

        jMenuItemAltaCorredor.setText("Alta Corredor");
        jMenuItemAltaCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaCorredorActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(jMenuItemAltaCorredor);

        jMenuItemAltaCarrera.setText("Alta Carrera");
        jMenuItemAltaCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaCarreraActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(jMenuItemAltaCarrera);

        jMenuItemVisualCorredor.setText("Ver Corredores");
        jMenuItemVisualCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualCorredorActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(jMenuItemVisualCorredor);

        jMenuVerCarrera.setText("Ver Carrera");
        jMenuVerCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVerCarreraActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(jMenuVerCarrera);

        jMenuItemConfiguracion.setText("Configuración");
        jMenuItemConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfiguracionActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(jMenuItemConfiguracion);

        jMenuBar1.add(jMenuPrincipal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButtonCrearCorredor)
                .addGap(18, 18, 18)
                .addComponent(jButtonCrearCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVerCorredores)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVerCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCrearCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCrearCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVerCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVerCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAltaCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaCarreraActionPerformed
        FormularioAltaCarreras formularioCarrera = new FormularioAltaCarreras(this, true);
        formularioCarrera.setVisible(true);
    }//GEN-LAST:event_jMenuItemAltaCarreraActionPerformed

    private void jMenuItemAltaCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaCorredorActionPerformed
        FormularioAltaCorredor formulario = new FormularioAltaCorredor(this, true);
        formulario.setVisible(true);
        //poner rellenar lista
    }//GEN-LAST:event_jMenuItemAltaCorredorActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        GestorPrincipal.getInstance().grabarColeccionCorredoresAcsv();
        GestorPrincipal.getInstance().grabarArchivoCarreras();
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jMenuItemVisualCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualCorredorActionPerformed
        VisualizadorCorredores visCorredores = new VisualizadorCorredores(this, true);
        visCorredores.setVisible(true);
    }//GEN-LAST:event_jMenuItemVisualCorredorActionPerformed

    private void jMenuVerCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVerCarreraActionPerformed
        VisualizadorCarreras visCarreras = new VisualizadorCarreras(this, true);
        visCarreras.setVisible(true);
    }//GEN-LAST:event_jMenuVerCarreraActionPerformed

    private void jMenuItemConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfiguracionActionPerformed
        FormularioConfiguracion configuracion = new FormularioConfiguracion(this, true);
        configuracion.setVisible(true);
    }//GEN-LAST:event_jMenuItemConfiguracionActionPerformed

    private void jButtonCrearCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearCarreraActionPerformed
        FormularioAltaCarreras formularioCarrera = new FormularioAltaCarreras(this, true);
        formularioCarrera.setVisible(true);
    }//GEN-LAST:event_jButtonCrearCarreraActionPerformed

    private void jButtonCrearCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearCorredorActionPerformed
        FormularioAltaCorredor formulario = new FormularioAltaCorredor(this, true);
        formulario.setVisible(true);
    }//GEN-LAST:event_jButtonCrearCorredorActionPerformed

    private void jButtonVerCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerCarrerasActionPerformed
        VisualizadorCarreras visCarreras = new VisualizadorCarreras(this, true);
        visCarreras.setVisible(true);
    }//GEN-LAST:event_jButtonVerCarrerasActionPerformed

    private void jButtonVerCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerCorredoresActionPerformed
        VisualizadorCorredores visCorredores = new VisualizadorCorredores(this, true);
        visCorredores.setVisible(true);
    }//GEN-LAST:event_jButtonVerCorredoresActionPerformed
    public void cargarLookAndFeel() {
        UIManager.installLookAndFeel(new UIManager.LookAndFeelInfo("Platano", "com.jtattoo.plaf.bernstein.BernsteinLookAndFeel"));
        UIManager.installLookAndFeel(new UIManager.LookAndFeelInfo("Aluminio", "com.jtattoo.plaf.aluminium.AluminiumLookAndFeel"));
        UIManager.installLookAndFeel(new UIManager.LookAndFeelInfo("Acrilico", "com.jtattoo.plaf.acryl.AcrylLookAndFeel"));
        UIManager.installLookAndFeel(new UIManager.LookAndFeelInfo("Aero", "com.jtattoo.plaf.aero.AeroLookAndFeel"));
        UIManager.installLookAndFeel(new UIManager.LookAndFeelInfo("Fast", "com.jtattoo.plaf.fast.FastLookAndFeel"));
        UIManager.installLookAndFeel(new UIManager.LookAndFeelInfo("Grafito", "com.jtattoo.plaf.graphite.GraphiteLookAndFeel"));
        UIManager.installLookAndFeel(new UIManager.LookAndFeelInfo("Mint", "com.jtattoo.plaf.mint.MintLookAndFeel"));
        UIManager.installLookAndFeel(new UIManager.LookAndFeelInfo("Luna", "com.jtattoo.plaf.luna.LunaLookAndFeel"));
        UIManager.installLookAndFeel(new UIManager.LookAndFeelInfo("Mcwin", "com.jtattoo.plaf.mcwin.McWinLookAndFeel"));
        UIManager.installLookAndFeel(new UIManager.LookAndFeelInfo("Noire", "com.jtattoo.plaf.noire.NoireLookAndFeel"));
        UIManager.installLookAndFeel(new UIManager.LookAndFeelInfo("Acrilico", "com.jtattoo.plaf.acryl.AcrylLookAndFeel"));
        UIManager.installLookAndFeel(new UIManager.LookAndFeelInfo("Smart", "com.jtattoo.plaf.smart.SmartLookAndFeel"));
        UIManager.installLookAndFeel(new UIManager.LookAndFeelInfo("Texture", "com.jtattoo.plaf.texture.TextureLookAndFeel"));

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPantallaPrincipalCorredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPantallaPrincipalCorredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPantallaPrincipalCorredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPantallaPrincipalCorredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPantallaPrincipalCorredor().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrearCarrera;
    private javax.swing.JButton jButtonCrearCorredor;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVerCarreras;
    private javax.swing.JButton jButtonVerCorredores;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAltaCarrera;
    private javax.swing.JMenuItem jMenuItemAltaCorredor;
    private javax.swing.JMenuItem jMenuItemConfiguracion;
    private javax.swing.JMenuItem jMenuItemVisualCorredor;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JMenuItem jMenuVerCarrera;
    // End of variables declaration//GEN-END:variables
}
