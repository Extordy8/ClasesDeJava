/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlesdatos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private JTextArea txtal;
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
        tbtnM.addActionListener(this);
        add(tbtnM);
        
        tbtnF=new JToggleButton("F");
        tbtnF.setBounds(155, 90, 50, 30);
        tbtnF.addActionListener(this);
        add(tbtnF);
        
        lblE=new JLabel("Edad:    ");
        lblE.setBounds(15, 130, 80, 30);
        add(lblE);
        
        spnEdad=new JSpinner();
        spnEdad.setBounds(100, 130, 80, 30);
        spnEdad.setModel(new SpinnerNumberModel(1,1,100,1));
        add(spnEdad);
        
        lblT=new JLabel("Telefono:    ");
        lblT.setBounds(15, 170, 80, 30);
        add(lblT);
        
        ftxtTel= new JFormattedTextField();
        ftxtTel.setBounds(100, 170, 100, 30);
        
        try{
            ftxtTel.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##########")));
        }catch (java.text.ParseException ex){
            ex.printStackTrace();
        }
        add(ftxtTel);
        
        lblCE=new JLabel("Correo Electronico");
        lblCE.setBounds(15, 210, 150, 30);
        add(lblCE);
        
        txtCE=new JTextField("");
        txtCE.setBounds(170, 210, 245, 30);
        add(txtCE);
        
        lblC=new JLabel("Contraseña:  ");
        lblC.setBounds(15, 250, 100, 30);
        add(lblC);
        
        pfl=new JPasswordField("");
        pfl.setBounds(120, 250, 120, 30);
        add(pfl);
        
         btnG = new JButton("Guardar");
         btnG.setBounds(315, 50, 100, 30);
         btnG.addActionListener(this);
         add(btnG);
         
         btnL = new JButton("Limpiar");
         btnL.setBounds(315, 90, 100, 30);
         btnL.addActionListener(this);
         add(btnL);
         
        txtal = new JTextArea(" ");
        txtal.setBounds(15, 300, 400, 150);
        add(txtal);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ControlesDatos ventana=new ControlesDatos();
        ventana.setTitle("Controles Datos");
         ventana.setSize(460, 500);
         ventana.setLayout(null);
         ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
         ventana.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==tbtnM){
            if(tbtnM.isSelected()) genero="M";
        }
        if(ae.getSource()==tbtnF){
            if(tbtnF.isSelected()) genero="F";
        }
        if(ae.getSource()==btnG){
            String salida="",nombre="",correo="",tel="",edad="";
        char []contra;
        
        nombre=txtN.getText();
        tel=ftxtTel.getText();
        edad=spnEdad.getValue().toString();
        correo=txtCE.getText();
        contra=pfl.getPassword();
        
        salida=salida +"\nNombre:  "+nombre+"\nGenero:  "+genero+"\nEdad:  "+edad
                +"\nTelefono:  "+tel+"\nCorreo:  :  "+correo+"\nContraseña:"+contra;
        
                txtal.setText(salida);
                
                txtN.setText("");
                txtN.requestFocus();
                ftxtTel.setText("");
                spnEdad.setValue(1);
                txtCE.setText("");
                pfl.setText("");
                
                tbtnM.setSelected(false);
                tbtnF.setSelected(false);
        }
        if(ae.getSource()==btnL){
        txtal.setText("");
        }
        }
    }
