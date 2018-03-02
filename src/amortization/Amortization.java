/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amortization;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Amortization implements ActionListener {

    JFrame frame;
    JPanel panel;
    JTextField textFieldm,textFieldl,textFieldapr,answer;
    JButton submit;
    JLabel Lmonths,Lloan,apr,Lmonthpay;

    static double firstNum = 0, secondNum = 0, result = 0;
    static int operator = 0;
    String convert;

    
    Amortization() {
        frame = new JFrame("Amortization");
        //panel.setBackground(Color.BLUE);
        
        textFieldm = new JTextField();
        Lmonths = new JLabel("Number of Months");
       
        textFieldl = new JTextField();
        Lloan = new JLabel("Loan amount");
        
        textFieldapr = new JTextField(); 
        apr = new JLabel("apr");

        submit = new JButton("Submit");
        answer = new JTextField();
        Lmonthpay = new JLabel("Monthly payment");
        
        
        textFieldl.setBounds(30, 25, 175, 30);
        Lloan.setBounds(210, 25, 150, 30);
        
        textFieldm.setBounds(30, 60, 175, 30);
        Lmonths.setBounds(210, 60, 150, 30);
        
        textFieldapr.setBounds(30, 95, 175, 30);
        apr.setBounds(210, 95, 150, 30);

        submit.setBounds(30, 130, 150, 30);
        submit.setBackground(Color.magenta);
        answer.setBounds(30, 165, 175, 30);
        Lmonthpay.setBounds(210, 165, 175, 30);
        
        frame.add(textFieldl);
        frame.add(Lloan);
        
        frame.add(textFieldm);
        frame.add(Lmonths);
        
        frame.add(textFieldapr);
        frame.add(apr);
        
        frame.add(submit);
        frame.add(answer);
        frame.add(Lmonthpay);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(420, 230);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        submit.addActionListener(this);

    }

    public class test {

        test() {

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


/*


Second equation: A = P (1 + r/n) (nt)



*/
