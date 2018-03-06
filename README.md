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

    //amortization field
    JFrame frame1;
    JPanel panel;
    JTextField textFieldm, textFieldl, textFieldapr, answer;
    JButton submit;
    JLabel Lmonths, Lloan, apr, Lmonthpay;

    static double loanNum, monthNum, intrestRate;

    //compound interest field
    JFrame frame2;
    JTextField textFieldloan2, textFieldintRate2, textFieldcomNum2, textFieldyear2, answer2;
    JButton submit2;
    JLabel LloanC, LintRate, LcomNum, Lyearpay;

    static double CloanNum, CintRate, compoundNum, yearNum;

    //future value field

    JFrame frame3;
    JTextField textfieldnum, textFieldintmonth, textFieldintrate, textFieldcomyears, textFieldinvest, answer3;
    JButton submit3;
    JLabel Lloan3, Lintmonth, Lintrate, Lcomyears, Linvest, finalnum;

    static double p, pmt, r, n, t;


    Amortization() {
        frame1 = new JFrame("Amortization");
        frame1.getContentPane().setBackground(Color.CYAN);

        textFieldm = new JTextField();
        Lmonths = new JLabel("Number of Months");

        textFieldl = new JTextField();
        Lloan = new JLabel("Loan amount");

        textFieldapr = new JTextField();
        apr = new JLabel("interest  Rate");

        submit = new JButton("Submit");
        answer = new JTextField();
        answer.setEditable(false);
        Lmonthpay = new JLabel("Monthly payment");


        textFieldl.setBounds(15, 25, 175, 30);
        Lloan.setBounds(195, 25, 150, 30);

        textFieldm.setBounds(15, 60, 175, 30);
        Lmonths.setBounds(195, 60, 150, 30);

        textFieldapr.setBounds(15, 95, 175, 30);
        apr.setBounds(195, 95, 150, 30);

        submit.setBounds(15, 130, 150, 30);
        submit.setBackground(Color.magenta);
        answer.setBounds(15, 165, 175, 30);
        Lmonthpay.setBounds(195, 165, 175, 30);

        frame1.add(textFieldl);
        frame1.add(Lloan);

        frame1.add(textFieldm);
        frame1.add(Lmonths);

        frame1.add(textFieldapr);
        frame1.add(apr);

        frame1.add(submit);
        frame1.add(answer);
        frame1.add(Lmonthpay);

        frame1.setLocationRelativeTo(null);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setSize(330, 240);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setResizable(false);

        submit.addActionListener(this);


        //compound interest
        frame2 = new JFrame("Compound Interest");

        frame2.getContentPane().setBackground(Color.LIGHT_GRAY);

        textFieldloan2 = new JTextField();
        LloanC = new JLabel("Loan amount");

        textFieldintRate2 = new JTextField();
        LintRate = new JLabel("interest  Rate");

        textFieldcomNum2 = new JTextField();
        LcomNum = new JLabel("Compund amount");

        textFieldyear2 = new JTextField();
        Lyearpay = new JLabel("Number of years");

        submit2 = new JButton("Submit");
        answer2 = new JTextField();
        answer2.setEditable(false);
        Lmonthpay = new JLabel("compound interest");


        textFieldloan2.setBounds(15, 25, 175, 30);
        LloanC.setBounds(195, 25, 150, 30);

        textFieldintRate2.setBounds(15, 60, 175, 30);
        LintRate.setBounds(195, 60, 150, 30);

        textFieldcomNum2.setBounds(15, 95, 175, 30);
        LcomNum.setBounds(195, 95, 150, 30);

        textFieldyear2.setBounds(15, 130, 175, 30);
        Lyearpay.setBounds(195, 130, 150, 30);

        submit2.setBounds(15, 165, 150, 30);
        submit2.setBackground(Color.YELLOW);
        answer2.setBounds(15, 200, 175, 30);
        Lmonthpay.setBounds(195, 200, 175, 30);

        frame2.add(textFieldloan2);
        frame2.add(LloanC);

        frame2.add(textFieldintRate2);
        frame2.add(LintRate);

        frame2.add(textFieldcomNum2);
        frame2.add(LcomNum);

        frame2.add(textFieldyear2);
        frame2.add(Lyearpay);

        frame2.add(submit2);
        frame2.add(answer2);
        frame2.add(Lmonthpay);


        frame2.setLocationRelativeTo(frame1);
        frame2.setLayout(null);
        frame2.setVisible(true);
        frame2.setSize(420, 280);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setResizable(false);

        submit2.addActionListener(this);


        //future value


        frame3 = new JFrame("future value");

        frame3.getContentPane().setBackground(Color.MAGENTA);

        textfieldnum = new JTextField();
        Lloan3 = new JLabel("Loan amount");

        textFieldintmonth = new JTextField();
        Lintmonth = new JLabel("Monthly payment");

        textFieldintrate = new JTextField();
        Lintrate = new JLabel("Intrest rate");

        textFieldcomyears = new JTextField();
        Lcomyears = new JLabel("Number of compounds");

        textFieldinvest = new JTextField();
        Linvest = new JLabel("Time borrowed");

        submit3 = new JButton("Submit");
        answer3 = new JTextField();
        answer3.setEditable(false);
        finalnum = new JLabel("Future value");


        textfieldnum.setBounds(15, 25, 175, 30);
        Lloan3.setBounds(195, 25, 150, 30);

        textFieldintmonth.setBounds(15, 60, 175, 30);
        Lintmonth.setBounds(195, 60, 150, 30);

        textFieldintrate.setBounds(15, 95, 175, 30);
        Lintrate.setBounds(195, 95, 150, 30);

        textFieldcomyears.setBounds(15, 130, 175, 30);
        Lcomyears.setBounds(195, 130, 150, 30);

        textFieldinvest.setBounds(15, 165, 175, 30);
        Linvest.setBounds(195, 165, 150, 30);

        submit3.setBounds(15, 200, 150, 30);
        submit3.setBackground(Color.PINK);
        answer3.setBounds(15, 235, 175, 30);
        finalnum.setBounds(195, 235, 175, 30);

        frame3.add(textfieldnum);
        frame3.add(Lloan3);

        frame3.add(textFieldintmonth);
        frame3.add(Lintmonth);

        frame3.add(textFieldintrate);
        frame3.add(Lintrate);

        frame3.add(textFieldcomyears);
        frame3.add(Lcomyears);

        frame3.add(textFieldinvest);
        frame3.add(Linvest);

        frame3.add(submit3);
        frame3.add(answer3);
        frame3.add(finalnum);


        frame3.setLocationRelativeTo(frame2);
        frame3.setLayout(null);
        frame3.setVisible(true);
        frame3.setSize(420, 320);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setResizable(false);

        submit3.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            loanNum = Double.parseDouble(textFieldl.getText());
            monthNum = Double.parseDouble(textFieldm.getText());
            intrestRate = Double.parseDouble(textFieldapr.getText());

            double part1 = intrestRate * Math.pow((1 + intrestRate), monthNum);
            double part2 = Math.pow((1 + intrestRate), monthNum) - 1;
            double result = loanNum * (part1 / part2);

            answer.setText("" + (float) result);
        }
        if (e.getSource() == submit2) {
            CloanNum = Double.parseDouble(textFieldloan2.getText());
            CintRate = Double.parseDouble(textFieldintRate2.getText());
            compoundNum = Double.parseDouble(textFieldcomNum2.getText());
            yearNum = Double.parseDouble(textFieldyear2.getText());

            double result2 = CloanNum * Math.pow((1 + (CintRate / compoundNum)), (compoundNum * yearNum));

            answer2.setText("" + (float) result2);
        }
        if (e.getSource() == submit3) {

           // Total = [ P(1+r/n)^(nt) ] + [ PMT × (((1 + r/n)^(nt) - 1) / (r/n)) ]

            p = Double.parseDouble(textfieldnum.getText());
            pmt = Double.parseDouble(textFieldintmonth.getText());
            r = Double.parseDouble(textFieldintrate.getText());
            n = Double.parseDouble(textFieldcomyears.getText());
            t = Double.parseDouble(textFieldinvest.getText());

            double part1 = p * Math.pow((1+r/n),(n * t));
            double part2 = pmt * (Math.pow((1 + r/n),(n * t)) - 1) / (r/n);
            double result3 = part1 + part2;

            answer3.setText("" + (float) result3);
        }

    }


    public static void main(String... s) {

        new Amortization();
    }
}




/*
Second equation: A = P (1 + r/n) (nt)
*/
