/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author elifc
 */
public class Swing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame jf = new JFrame();
        jf.setTitle("window");
        jf.setSize(500,600);
        jf.setLocation(100, 200);
        
        jf.getContentPane().setLayout(new FlowLayout());
        
        JTextField text = new JTextField(10);
        JButton button = new JButton("send");
        JLabel label = new JLabel();
        label.setText("enter your name: ");
        
        jf.getContentPane().add(label);
        jf.getContentPane().add(text);
        jf.getContentPane().add(button);
        
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("Hello " + text.getText() + "! Welome to the program  ");
            }
        });
        
        JButton button2 = new JButton("click");
        
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane pane = new JOptionPane();
                pane.showMessageDialog(null, "Hi! welcome to pane"); //message dialog jOptionPane olarak isimlendirilir
            }
        });
        
        
        JButton button3 = new JButton("click to enter password");
        
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String password = JOptionPane.showInputDialog("Please enter your password");
                JOptionPane.showMessageDialog(null, "Wrong password!");
            }
        });  
        
        jf.getContentPane().add(button3);
        jf.getContentPane().add(button2);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //yazılmazsa program kapanmasına ragmen arka planda calismaya devam eder
        //jf.setResizable(false); ekranın köşelerinden size ı değiştiremezsin
        jf.setVisible(true); //yazılmazsa frame gözükmez
        
    }
    
}
