/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlesdatos;
import java.awt.event.ActionEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
/**
 *
 * @author Yo
 */

public class ControlesDatos extends JFrame implements ActionListener{

    private JLabel lbll,lblN,lblG,lblE,lblT,lblCE,lblC;
    private JTextField txtN,txtCE;
    private JButton btnG,btnL;
    private JToggleButton tbtnM,tbtnF;
    private JSpinner spnEdad;
    private JFormattedTextField ftxtTel;
    private JPasswordField pfl;
    private JTextArea tstal;
    private String genero;
    
    public ControlesDatos(){
    
        //crar instancias de controles y propiedades
        lbll= new JLabel("Ingresa lo siguiente");
        lbll.setBounds(15, 15, 160, 30);
        add(lbll);
        
        lblN=new JLabel("NOMBRE:    ");
        lblN.setBounds(15, 50, 80, 30);
        add(lblN);
        
        txtN=new JTextField("");
        txtN.setBounds(100, 50, 120, 30);
        add(txtN);
        
        lblG=new JLabel("Genero:    ");
        lblG.setBounds(15, 90, 80, 30);
        add(lblG);
        
        tbtnM=new JToggleButton("M");
        tbtnM.setBounds(100, 90, 50, 30);
        
        add(tbtnM);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
