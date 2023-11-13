/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vjv.figurasgeometricas;
import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.Set;
import javax.swing.*;
import javax.swing.border.LineBorder;
/**
 *
 * @author Yo
 */
public class FigurasGeometricas extends javax.swing.JFrame {

    /**
     * Creates new form FigurasGeometricas
     */
    public FigurasGeometricas() {
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

        lblFigura = new javax.swing.JLabel();
        lblDatos = new javax.swing.JLabel();
        btnRectangulo = new javax.swing.JButton();
        btnCirculo = new javax.swing.JButton();
        btnCuadrado = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFigura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDatos.setPreferredSize(null);

        btnRectangulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRectangulo.setText("Rectangulo");
        btnRectangulo.setMaximumSize(null);
        btnRectangulo.setMinimumSize(null);
        btnRectangulo.setPreferredSize(null);
        btnRectangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRectanguloMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRectanguloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRectanguloMouseExited(evt);
            }
        });

        btnCirculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCirculo.setText("Circulo");
        btnCirculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCirculoMouseClicked(evt);
            }
        });

        btnCuadrado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCuadrado.setText("Cuadrado");
        btnCuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCuadradoMouseClicked(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addComponent(lblDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRectanguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRectanguloMouseClicked
        // TODO add your handling code here:
        double base,altura,area,perimetro;
        String baseMensaje,alturaMensaje;
        
        lblFigura.setText("Figura: Rectangulo");
        baseMensaje=JOptionPane.showInputDialog("Ingresa el valor de la base:");
        base=Double.parseDouble(baseMensaje);
        alturaMensaje=JOptionPane.showInputDialog("Ingresa el valor de la altura:");
        altura=Double.parseDouble(alturaMensaje);
        
        perimetro=(2*base)+(2*altura);
        area=base*altura;
        
        // Crear un formato para mostrar solo dos decimales
        DecimalFormat df = new DecimalFormat("#.##");

        // Formatear los resultados
        String areaFormateada = df.format(area);
        String perimetroFormateado = df.format(perimetro);

        lblDatos.setText("Perímetro = " + perimetroFormateado + "  Área = " + areaFormateada);
    }//GEN-LAST:event_btnRectanguloMouseClicked

    private void btnCirculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCirculoMouseClicked
        // TODO add your handling code here:
        double radio, area, perimetro;
        String radioMensaje;

        lblFigura.setText("Figura: Círculo");
        radioMensaje = JOptionPane.showInputDialog("Ingresa el valor del radio:");
        radio = Double.parseDouble(radioMensaje);

        area = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;
        
        // Crear un formato para mostrar solo dos decimales
        DecimalFormat df = new DecimalFormat("#.##");

        // Formatear los resultados
        String areaFormateada = df.format(area);
        String perimetroFormateado = df.format(perimetro);

        lblDatos.setText("Perímetro = " + perimetroFormateado + "  Área = " + areaFormateada);
        
    }//GEN-LAST:event_btnCirculoMouseClicked

    private void btnCuadradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCuadradoMouseClicked
        // TODO add your handling code here:
        double lado, area, perimetro;
        String ladoMensaje;

        lblFigura.setText("Figura: Cuadrado");
        ladoMensaje = JOptionPane.showInputDialog("Ingresa el valor del lado:");
        lado = Double.parseDouble(ladoMensaje);

        perimetro = 4 * lado;
        area = Math.pow(lado, 2);

        // Crear un formato para mostrar solo dos decimales
        DecimalFormat df = new DecimalFormat("#.##");

        // Formatear los resultados
        String areaFormateada = df.format(area);
        String perimetroFormateado = df.format(perimetro);

        lblDatos.setText("Perímetro = " + perimetroFormateado + "  Área = " + areaFormateada);
    }//GEN-LAST:event_btnCuadradoMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        // TODO add your handling code here:
        lblFigura.setText("");
        lblDatos.setText("");
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnRectanguloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRectanguloMouseEntered
        // TODO add your handling code here:
     
        btnRectangulo.setBackground(Color.YELLOW);
        btnRectangulo.setBorder(new LineBorder(Color.YELLOW));
        btnRectangulo.setForeground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_btnRectanguloMouseEntered

    private void btnRectanguloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRectanguloMouseExited
        // TODO add your handling code here:
      
        btnRectangulo.setBackground(Color.LIGHT_GRAY);
        btnRectangulo.setBorder(new LineBorder(Color.LIGHT_GRAY));
        btnRectangulo.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnRectanguloMouseExited

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
            java.util.logging.Logger.getLogger(FigurasGeometricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FigurasGeometricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FigurasGeometricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FigurasGeometricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FigurasGeometricas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCirculo;
    private javax.swing.JButton btnCuadrado;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRectangulo;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblFigura;
    // End of variables declaration//GEN-END:variables
}