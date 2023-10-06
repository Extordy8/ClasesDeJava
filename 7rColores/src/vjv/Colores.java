/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vjv;

import java.awt.Color;

/**
 *
 * @author Yo
 */
public class Colores extends javax.swing.JFrame {

    /**
     * Creates new form Colores
     */
    public Colores() {
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

        btnGColores = new javax.swing.ButtonGroup();
        btnColorear = new javax.swing.JButton();
        lblColor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbtnRojo = new javax.swing.JRadioButton();
        rbtnVerde = new javax.swing.JRadioButton();
        rbtnAzul = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnColorear.setText("Colorear");
        btnColorear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnColorearMouseClicked(evt);
            }
        });

        lblColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Colores"));

        btnGColores.add(rbtnRojo);
        rbtnRojo.setText("Rojo");
        rbtnRojo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnRojoStateChanged(evt);
            }
        });

        btnGColores.add(rbtnVerde);
        rbtnVerde.setText("Verde");
        rbtnVerde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnVerdeStateChanged(evt);
            }
        });

        btnGColores.add(rbtnAzul);
        rbtnAzul.setText("Azul");
        rbtnAzul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnAzulStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnRojo)
                    .addComponent(rbtnAzul)
                    .addComponent(rbtnVerde))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(rbtnRojo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnVerde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnAzul)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnColorear))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnColorear)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnRojoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnRojoStateChanged
        // TODO add your handling code here:
        if (rbtnRojo.isSelected()) {
        rbtnVerde.setSelected(false);
        rbtnAzul.setSelected(false);
        }
    }//GEN-LAST:event_rbtnRojoStateChanged

    private void rbtnVerdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnVerdeStateChanged
        // TODO add your handling code here:
        if (rbtnVerde.isSelected()) {
        rbtnRojo.setSelected(false);
        rbtnAzul.setSelected(false);
        }
    }//GEN-LAST:event_rbtnVerdeStateChanged

    private void rbtnAzulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnAzulStateChanged
        // TODO add your handling code here:
        if (rbtnAzul.isSelected()) {
        rbtnRojo.setSelected(false);
        rbtnVerde.setSelected(false);
        }
    }//GEN-LAST:event_rbtnAzulStateChanged

    private void btnColorearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColorearMouseClicked
        // TODO add your handling code here:
        lblColor.setOpaque(true);
        
        if(rbtnRojo.isSelected())
        {
            lblColor.setBackground(Color.red);
        }
        if(rbtnVerde.isSelected())
        {
            lblColor.setBackground(Color.GREEN);
        }
        if(rbtnAzul.isSelected())
        {
            lblColor.setBackground(Color.BLUE);
        }
    }//GEN-LAST:event_btnColorearMouseClicked

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
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColorear;
    private javax.swing.ButtonGroup btnGColores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblColor;
    private javax.swing.JRadioButton rbtnAzul;
    private javax.swing.JRadioButton rbtnRojo;
    private javax.swing.JRadioButton rbtnVerde;
    // End of variables declaration//GEN-END:variables
}
