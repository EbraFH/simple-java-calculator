package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainCalculator extends Calculator implements ActionListener {
	
	// building fun'
	public mainCalculator() {
		super();
		
		// button click
		num1 = operand = num2 = "";
		add.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
		mult.addActionListener(this);
		clear.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		dot.addActionListener(this);
		equl.addActionListener(this);
	}
	// abstract fun'
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		// if the value is a number
        if ((str.charAt(0) >= '0' && str.charAt(0) <= '9') || str.charAt(0) == '.') {
            // if operand is present then add to second no
            if (!operand.equals(""))
            {
                num2 = num2 + str;
             // set the value of text
                textarea.setText(textarea.getText()+str);
            }
            else
            {
                num1 = num1 + str;
             // set the value of text
                textarea.setText(textarea.getText()+str);
            }
        }
        else if (str.charAt(0) == 'C') {
            // clear the one letter
        	num1 = operand = num2 = "";
            // set the value of text
            textarea.setText("");
        }
        else if (str.charAt(0) == '=') {
            double result = 0;
            // store the value in 1st
            switch (operand)
            {
            	case "+":result = (Double.parseDouble(num1) + Double.parseDouble(num2));
            			break;
            	case "-":result = (Double.parseDouble(num1) - Double.parseDouble(num2));
            			break;
            	case "/":result = (Double.parseDouble(num1) / Double.parseDouble(num2));
            			break;
            	case "*":result = (Double.parseDouble(num1) * Double.parseDouble(num2));
            			break;
            }
            // set the value of text
            textarea.setText(""+result);
            // convert it to string
            num1 = ""+result;
            operand = num2 = "";
        }
        else {
            // if there was no operand
            if (operand.equals("") || num2.equals(""))
                operand = str;
            // else evaluate
            else {
                double result=0;
                // store the value in 1st
                switch (operand)
                {
                	case "+":result = (Double.parseDouble(num1) + Double.parseDouble(num2));
                			break;
                	case "-":result = (Double.parseDouble(num1) - Double.parseDouble(num2));
                			break;
                	case "/":result = (Double.parseDouble(num1) / Double.parseDouble(num2));
                			break;
                	case "*":result = (Double.parseDouble(num1) * Double.parseDouble(num2));
                			break;
                }
                // convert it to string
                num1 = ""+result;
                // place the operator
                operand = str;
                // make the operand blank
                num2 = "";
            }
            // set the value of text
            textarea.setText(textarea.getText()+ operand);
        }
	}

	public static void main(String[] args) {
		
		new mainCalculator();
		
	}
}
