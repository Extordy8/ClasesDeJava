/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg21_menubar;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Yo
 */
public class menubar extends javax.swing.JFrame {

    /**
     * Creates new form menubar
     */
    public menubar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuVentana = new javax.swing.JMenu();
        MenuColores = new javax.swing.JMenu();
        itemMenuColorVentana1 = new javax.swing.JMenuItem();
        itemMenuColorVentana2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ItemMenuSalir = new javax.swing.JMenuItem();
        menuLabel = new javax.swing.JMenu();
        menuColoresLabel = new javax.swing.JMenu();
        itemMenuColorLabel1 = new javax.swing.JMenuItem();
        itemMenuColorLabel2 = new javax.swing.JMenuItem();
        MenuImagen = new javax.swing.JMenu();
        itemMenuImagen1 = new javax.swing.JMenuItem();
        itemMenuImagen2 = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();
        itemMenuCreador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        menuVentana.setText("Ventana");

        MenuColores.setText("Colores");

        itemMenuColorVentana1.setText("Color 1");
        itemMenuColorVentana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuColorVentana1ActionPerformed(evt);
            }
        });
        MenuColores.add(itemMenuColorVentana1);

        itemMenuColorVentana2.setText("Color 2");
        itemMenuColorVentana2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuColorVentana2ActionPerformed(evt);
            }
        });
        MenuColores.add(itemMenuColorVentana2);

        menuVentana.add(MenuColores);
        menuVentana.add(jSeparator1);

        ItemMenuSalir.setText("Salir");
        ItemMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuSalirActionPerformed(evt);
            }
        });
        menuVentana.add(ItemMenuSalir);

        jMenuBar1.add(menuVentana);

        menuLabel.setText("Label");

        menuColoresLabel.setText("Colores");

        itemMenuColorLabel1.setText("Color 1");
        itemMenuColorLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuColorLabel1ActionPerformed(evt);
            }
        });
        menuColoresLabel.add(itemMenuColorLabel1);

        itemMenuColorLabel2.setText("Color 2");
        itemMenuColorLabel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuColorLabel2ActionPerformed(evt);
            }
        });
        menuColoresLabel.add(itemMenuColorLabel2);

        menuLabel.add(menuColoresLabel);

        MenuImagen.setText("Imagen");

        itemMenuImagen1.setText("Imagen 1");
        itemMenuImagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuImagen1ActionPerformed(evt);
            }
        });
        MenuImagen.add(itemMenuImagen1);

        itemMenuImagen2.setText("imagen 2");
        itemMenuImagen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuImagen2ActionPerformed(evt);
            }
        });
        MenuImagen.add(itemMenuImagen2);

        menuLabel.add(MenuImagen);

        jMenuBar1.add(menuLabel);

        menuAbout.setText("about");

        itemMenuCreador.setText("Creador");
        itemMenuCreador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCreadorActionPerformed(evt);
            }
        });
        menuAbout.add(itemMenuCreador);

        jMenuBar1.add(menuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuColorVentana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuColorVentana1ActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.decode("#378A6A"));
    }//GEN-LAST:event_itemMenuColorVentana1ActionPerformed

    private void itemMenuColorVentana2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuColorVentana2ActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.decode("#278287"));
    }//GEN-LAST:event_itemMenuColorVentana2ActionPerformed

    private void itemMenuColorLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuColorLabel1ActionPerformed
        // TODO add your handling code here:
        label.setOpaque(true); 
        label.setBackground(Color.decode("#9F33FF"));
    }//GEN-LAST:event_itemMenuColorLabel1ActionPerformed

    private void itemMenuColorLabel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuColorLabel2ActionPerformed
        // TODO add your handling code here:
        label.setOpaque(true); 
        label.setBackground(Color.decode("#FC9D37"));
    }//GEN-LAST:event_itemMenuColorLabel2ActionPerformed

    private void ItemMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ItemMenuSalirActionPerformed

    private void itemMenuCreadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCreadorActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "VJV");
    }//GEN-LAST:event_itemMenuCreadorActionPerformed

    private void itemMenuImagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuImagen1ActionPerformed
        // TODO add your handling code here:
    URL imageUrl = getClass().getResource("/img/1.jpeg");
    ImageIcon nuevoIcono = new ImageIcon(imageUrl);
    label.setIcon(nuevoIcono);
    }//GEN-LAST:event_itemMenuImagen1ActionPerformed

    private void itemMenuImagen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuImagen2ActionPerformed
        // TODO add your handling code here:
        URL imageUrl = getClass().getResource("/img/2.gif");
    ImageIcon nuevoIcono = new ImageIcon(imageUrl);
    label.setIcon(nuevoIcono);
    }//GEN-LAST:event_itemMenuImagen2ActionPerformed

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
            java.util.logging.Logger.getLogger(menubar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menubar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menubar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menubar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menubar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemMenuSalir;
    private javax.swing.JMenu MenuColores;
    private javax.swing.JMenu MenuImagen;
    private javax.swing.JMenuItem itemMenuColorLabel1;
    private javax.swing.JMenuItem itemMenuColorLabel2;
    private javax.swing.JMenuItem itemMenuColorVentana1;
    private javax.swing.JMenuItem itemMenuColorVentana2;
    private javax.swing.JMenuItem itemMenuCreador;
    private javax.swing.JMenuItem itemMenuImagen1;
    private javax.swing.JMenuItem itemMenuImagen2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel label;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenu menuColoresLabel;
    private javax.swing.JMenu menuLabel;
    private javax.swing.JMenu menuVentana;
    // End of variables declaration//GEN-END:variables
}
