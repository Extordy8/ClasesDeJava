/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package vjv.formulario;
import javax.swing.*;
/**
 *
 * @author Yo
 */
public class Formulario extends JFrame{
    public Formulario(){
        setLayout(null);
    }
    public static void main(String[] args) {
        Formulario formulario1=new Formulario();
        formulario1.setBounds(10,20,400,300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
    }
}
