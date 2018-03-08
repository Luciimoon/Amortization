package amortization;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Amortization implements ActionListener {

    static double loanNum, monthNum, intrestRate;
    static double CloanNum, CintRate, compoundNum, yearNum;
    static double p, pmt, r, n, t;
//amortization field
    JFrame A_frame;
    JTextField A_textFieldMonths, A_textFieldLoan, A_textFieldIntRate, A_answer;
    JButton A_submit;
    JLabel A_Lmonths, A_Lloan, A_LIntRate, A_Lanswer;
    JCheckBox A_convert;
//compound interest field
    JFrame CI_frame;
    JTextField CI_textFieldLoan, CI_textFieldintRate, CI_textFieldcomNum, CI_textFieldyear, CI_answer;
    JButton CI_submit;
    JLabel CI_Lloan, CI_LintRate, CI_LcomNum, CI_Lyearpay;
    JCheckBox CI_convert;
//future value field
    JFrame CIM_frame;
    JTextField CIM_textfieldLoan, CIM_textFieldintmonth, CIM_textFieldintrate, CIM_textFieldcomyears, CIM_textFieldinvest, CIM_answer;
    JButton CIM_submit;
    JLabel CIM_Lloan, CIM_Lintmonth, CIM_Lintrate, CIM_Lcomyears, CIM_Linvest, CIM_finalnum;
    JCheckBox CIM_convert;

    Amortization() {
        A_frame = new JFrame("Amortization");
        A_frame.getContentPane().setBackground(Color.CYAN);

        A_convert = new JCheckBox("use percent");

        A_textFieldMonths = new JTextField();
        A_Lmonths = new JLabel("Number of Months");

        A_textFieldLoan = new JTextField();
        A_Lloan = new JLabel("Loan amount");

        A_textFieldIntRate = new JTextField();
        A_LIntRate = new JLabel("interest  Rate");

        A_submit = new JButton("Submit");
        A_answer = new JTextField();
        A_answer.setEditable(false);
        A_Lanswer = new JLabel("Monthly payment");

        A_textFieldLoan.setBounds(15, 25, 175, 30);
        A_Lloan.setBounds(195, 25, 150, 30);

        A_textFieldMonths.setBounds(15, 60, 175, 30);
        A_Lmonths.setBounds(195, 60, 150, 30);

        A_textFieldIntRate.setBounds(15, 95, 175, 30);
        A_LIntRate.setBounds(195, 95, 150, 30);

        A_convert.setBounds(295, 95, 150, 30);
        A_convert.setBackground(Color.CYAN);

        A_submit.setBounds(15, 130, 150, 30);
        A_submit.setBackground(Color.MAGENTA);
        A_answer.setBounds(15, 165, 175, 30);
        A_Lanswer.setBounds(195, 165, 175, 30);

        A_frame.add(A_textFieldLoan);
        A_frame.add(A_Lloan);

        A_frame.add(A_textFieldMonths);
        A_frame.add(A_Lmonths);

        A_frame.add(A_textFieldIntRate);
        A_frame.add(A_LIntRate);

        A_frame.add(A_convert);

        A_frame.add(A_submit);
        A_frame.add(A_answer);
        A_frame.add(A_Lanswer);

        A_frame.setLocationRelativeTo(null);
        A_frame.setLayout(null);
        A_frame.setVisible(true);
        A_frame.setSize(410, 240);
        A_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        A_frame.setResizable(false);

        A_submit.addActionListener(this);

        //compound interest
        CI_frame = new JFrame("Compound Interest");

        CI_convert = new JCheckBox("use percent");

        CI_frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        CI_textFieldLoan = new JTextField();
        CI_Lloan = new JLabel("Loan amount");

        CI_textFieldintRate = new JTextField();
        CI_LintRate = new JLabel("interest  Rate");

        CI_textFieldcomNum = new JTextField();
        CI_LcomNum = new JLabel("Compound amount");

        CI_textFieldyear = new JTextField();
        CI_Lyearpay = new JLabel("Number of years");

        CI_submit = new JButton("Submit");
        CI_answer = new JTextField();
        CI_answer.setEditable(false);
        A_Lanswer = new JLabel("compound interest");

        CI_textFieldLoan.setBounds(15, 25, 175, 30);
        CI_Lloan.setBounds(195, 25, 150, 30);

        CI_textFieldintRate.setBounds(15, 60, 175, 30);
        CI_LintRate.setBounds(195, 60, 150, 30);

        CI_convert.setBounds(295, 60, 150, 30);
        CI_convert.setBackground(Color.LIGHT_GRAY);

        CI_textFieldcomNum.setBounds(15, 95, 175, 30);
        CI_LcomNum.setBounds(195, 95, 150, 30);

        CI_textFieldyear.setBounds(15, 130, 175, 30);
        CI_Lyearpay.setBounds(195, 130, 150, 30);

        CI_submit.setBounds(15, 165, 150, 30);
        CI_submit.setBackground(Color.YELLOW);
        CI_answer.setBounds(15, 200, 175, 30);
        A_Lanswer.setBounds(195, 200, 175, 30);

        CI_frame.add(CI_textFieldLoan);
        CI_frame.add(CI_Lloan);

        CI_frame.add(CI_textFieldintRate);
        CI_frame.add(CI_LintRate);

        CI_frame.add(CI_convert);

        CI_frame.add(CI_textFieldcomNum);
        CI_frame.add(CI_LcomNum);

        CI_frame.add(CI_textFieldyear);
        CI_frame.add(CI_Lyearpay);

        CI_frame.add(CI_submit);
        CI_frame.add(CI_answer);
        CI_frame.add(A_Lanswer);

        CI_frame.setLocationRelativeTo(A_frame);
        CI_frame.setLayout(null);
        CI_frame.setVisible(true);
        CI_frame.setSize(430, 280);
        CI_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CI_frame.setResizable(false);

        CI_submit.addActionListener(this);

        //future value (Compound Intrest with Monthly payments)
        CIM_frame = new JFrame("future value");

        CIM_convert = new JCheckBox("use percent");

        CIM_frame.getContentPane().setBackground(Color.MAGENTA);

        CIM_textfieldLoan = new JTextField();
        CIM_Lloan = new JLabel("Loan amount");

        CIM_textFieldintmonth = new JTextField();
        CIM_Lintmonth = new JLabel("Monthly payment");

        CIM_textFieldintrate = new JTextField();
        CIM_Lintrate = new JLabel("interest Rate");

        CIM_textFieldcomyears = new JTextField();
        CIM_Lcomyears = new JLabel("Number of compounds");

        CIM_textFieldinvest = new JTextField();
        CIM_Linvest = new JLabel("Time borrowed");

        CIM_submit = new JButton("Submit");
        CIM_answer = new JTextField();
        CIM_answer.setEditable(false);
        CIM_finalnum = new JLabel("Future value");

        CIM_textfieldLoan.setBounds(15, 25, 175, 30);
        CIM_Lloan.setBounds(195, 25, 150, 30);

        CIM_textFieldintmonth.setBounds(15, 60, 175, 30);
        CIM_Lintmonth.setBounds(195, 60, 150, 30);

        CIM_textFieldintrate.setBounds(15, 95, 175, 30);
        CIM_Lintrate.setBounds(195, 95, 150, 30);

        CIM_convert.setBounds(290, 95, 150, 30);
        CIM_convert.setBackground(Color.MAGENTA);

        CIM_textFieldcomyears.setBounds(15, 130, 175, 30);
        CIM_Lcomyears.setBounds(195, 130, 175, 30);

        CIM_textFieldinvest.setBounds(15, 165, 175, 30);
        CIM_Linvest.setBounds(195, 165, 150, 30);

        CIM_submit.setBounds(15, 200, 150, 30);
        CIM_submit.setBackground(Color.PINK);
        CIM_answer.setBounds(15, 235, 175, 30);
        CIM_finalnum.setBounds(195, 235, 175, 30);

        CIM_frame.add(CIM_textfieldLoan);
        CIM_frame.add(CIM_Lloan);

        CIM_frame.add(CIM_textFieldintmonth);
        CIM_frame.add(CIM_Lintmonth);

        CIM_frame.add(CIM_textFieldintrate);
        CIM_frame.add(CIM_Lintrate);

        CIM_frame.add(CIM_convert);

        CIM_frame.add(CIM_textFieldcomyears);
        CIM_frame.add(CIM_Lcomyears);

        CIM_frame.add(CIM_textFieldinvest);
        CIM_frame.add(CIM_Linvest);

        CIM_frame.add(CIM_submit);
        CIM_frame.add(CIM_answer);
        CIM_frame.add(CIM_finalnum);

        CIM_frame.setLocationRelativeTo(CI_frame);
        CIM_frame.setLayout(null);
        CIM_frame.setVisible(true);
        CIM_frame.setSize(430, 320);
        CIM_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CIM_frame.setResizable(false);

        CIM_submit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == A_submit) {
            loanNum = Double.parseDouble(A_textFieldLoan.getText());
            monthNum = Double.parseDouble(A_textFieldMonths.getText());
            if (A_convert.isSelected()) {
                intrestRate = Double.parseDouble(A_textFieldIntRate.getText()) / 100;
            } else {
                intrestRate = Double.parseDouble(A_textFieldIntRate.getText());
            }

            double part1 = intrestRate * Math.pow((1 + intrestRate), monthNum);
            double part2 = Math.pow((1 + intrestRate), monthNum) - 1;
            double result = loanNum * (part1 / part2);

            DecimalFormat twoDForm = new DecimalFormat("#.##");
            A_answer.setText("" + Double.valueOf(twoDForm.format(result)));
        }
        if (e.getSource() == CI_submit) {
            CloanNum = Double.parseDouble(CI_textFieldLoan.getText());
            if (CI_convert.isSelected()) {
                CintRate = Double.parseDouble(CI_textFieldintRate.getText()) / 100;
            } else {
                CintRate = Double.parseDouble(CI_textFieldintRate.getText());
            }
            compoundNum = Double.parseDouble(CI_textFieldcomNum.getText());
            yearNum = Double.parseDouble(CI_textFieldyear.getText());

            double result2 = CloanNum * Math.pow((1 + (CintRate / compoundNum)), (compoundNum * yearNum));

            DecimalFormat twoDForm = new DecimalFormat("#.##");
            CI_answer.setText("" + Double.valueOf(twoDForm.format(result2)));
        }
        if (e.getSource() == CIM_submit) {

            p = Double.parseDouble(CIM_textfieldLoan.getText());
            pmt = Double.parseDouble(CIM_textFieldintmonth.getText());

            if (CIM_convert.isSelected()) {
                r = Double.parseDouble(CIM_textFieldintrate.getText()) / 100;
            } else {
                r = Double.parseDouble(CIM_textFieldintrate.getText());
            }
            n = Double.parseDouble(CIM_textFieldcomyears.getText());
            t = Double.parseDouble(CIM_textFieldinvest.getText());

            double part1 = p * Math.pow((1 + r / n), (n * t));
            double part2 = pmt * (Math.pow((1 + r / n), (n * t)) - 1) / (r / n);
            double result3 = part1 + part2;

            DecimalFormat twoDForm = new DecimalFormat("#.##");
            CIM_answer.setText("" + Double.valueOf(twoDForm.format(result3)));
        }

    }

    public static void main(String... s) {

        new Amortization();
    }
}
