import java.awt.*;
import javax.swing.*;


//import java.awt.I
//import javax.imageio.*;
//import java.io.*;

import java.awt.event.*;

public class Test {
public static void main(String[] args) {
	JFrame frame = new JFrame("frame");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setBounds(500,500,500,500);
	JPanel panel = new JPanel();
	Font  f1  = new Font(Font.SERIF, Font.PLAIN,  50);
	Font  f2  = new Font(Font.SANS_SERIF,  Font.BOLD, 10);
	Font  f4  = new Font(Font.DIALOG_INPUT,  Font.BOLD|Font.ITALIC, 15);
	
	Font  f11  = new Font(Font.SERIF, Font.PLAIN,  10);
	Color  green   = new Color(0, 255,  0);
	Color  blue   = new Color(0, 0, 255);
	Color  red  = new Color(255, 0, 0);
	
	JScrollBar sb1  = new JScrollBar();
	//frame.add(sb1);
	//Font  f12  = new Font(Font.BOLD);
	//Font.BOLD
	JTextField textField1 = new JTextField();
	JTextArea textField = new JTextArea();
	textField.setColumns(20);
	textField.setToolTipText("<html><b><font color=red>"
            + "Please enter some text here" + "</font></b></html>");
	//textField.setForeground(Color.BLUE);
		//textField.setBackground(Color.YELLOW);
		//textField.setHorizontalAlignment(JTextField.CENTER);
	//frame.add(textField);
	textField.setFont(f4);
	textField.setFont(f1);
	textField.setForeground(red);
	JButton button = new JButton("Ok");
	//button.
	button.addActionListener(e->frame.dispose());
	//JLabel label = new JLabel("Enter your text: ");
	
	panel.add(textField);
	panel.add(button);
panel.add(sb1);
	frame.add(panel);
	//label.setFont(f2);
	//label.setForeground(fg);
	frame.pack();
	frame.setVisible(true);
}
}