package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

abstract class Calculator   {
	// helper variable
	String num1,operand, num2;
	
	// create a frame
	JFrame frame = new JFrame("calculator");
	
	// create a panel
	JPanel panelText = new JPanel();
	JPanel panelOperand = new JPanel();	
	JPanel panelNum = new JPanel(new GridLayout(0,3));
	
	// create a textarea
	JTextArea textarea = new JTextArea(3,25);
	
	// create number buttons
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b0 = new JButton("0");

    // create operator buttons
	JButton add = new JButton("+");
	JButton sub = new JButton("-");
	JButton div = new JButton("/");
	JButton mult = new JButton("*");
	JButton clear = new JButton("C");
	
    // create . button
	JButton dot = new JButton(".");
	
    // create equals button
	JButton equl = new JButton("=");
	
	public Calculator() {
		// build frame
		frame.setSize(300,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		// build panelText
		frame.add(panelText,BorderLayout.NORTH);
		panelText.add(textarea);
		
		// build panelOperand
		frame.add(panelOperand,BorderLayout.CENTER);
		panelOperand.add(add);
		panelOperand.add(sub);
		panelOperand.add(div);
		panelOperand.add(mult);
		panelOperand.add(clear);
		
		// build panelNumber
		frame.add(panelNum,BorderLayout.SOUTH);
		panelNum.add(b1);
		panelNum.add(b2);
		panelNum.add(b3);
		panelNum.add(b4);
		panelNum.add(b5);
		panelNum.add(b6);
		panelNum.add(b7);
		panelNum.add(b8);
		panelNum.add(b9);
		panelNum.add(b0);
		panelNum.add(dot);
		panelNum.add(equl);		
		
		}
	
	// abstract fun'
	public abstract void actionPerformed(ActionEvent e);
	
}
