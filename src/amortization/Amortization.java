/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amortization;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Amortization implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton monthpay,principal,rate,numpay;
    JLabel Lmonthpay;

    static double firstNum = 0, secondNum = 0, result = 0;
    static int operator = 0;
    String convert;

    @SuppressWarnings("LeakingThisInConstructor")
    Amortization() {
        frame = new JFrame("Amortization");
        textField = new JTextField();
        monthpay = new JButton("Enter");
        Lmonthpay = new JLabel("Monthly payment"); 
        
        textField.setBounds(30, 40, 350/2, 30);
        monthpay.setBounds(30, 100, 150, 30);
        Lmonthpay.setBounds(210, 40, 150, 30);

        frame.add(textField);
        //frame.add(monthpay);
        frame.add(Lmonthpay);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(420, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        monthpay.addActionListener(this);

    }
    
    public class test {
        
        
        test(){
            
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String... s) {

        new Amortization();
    }
}
