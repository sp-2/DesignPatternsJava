import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public abstract class TextPad {
	
	JFrame frame       = null;
	JPanel panel       = null;
	JTextArea textArea = null;
	JButton button     = null;
	
	String description = "Text Pad";
	
	public TextPad() {	}
	
	public JTextArea getJTextArea() {
		//System.out.println("in textpad getJTextArea() "+textArea.hashCode());
		return this.textArea;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void initFrame() {
		//System.out.println("in textpad init");
		frame    = new JFrame("Frame");
	    panel    = new JPanel();
		textArea = new JTextArea();
		button   = new JButton("Exit");
		//  System.out.println("in textpad init textArea: "+textArea.hashCode());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(500,500,500,500);
		button.addActionListener(e->frame.dispose());
	    textArea.setColumns(20);
	    textArea.setForeground(Color.red);
		
	    panel.add(textArea);
	    panel.add(button);
	    frame.add(panel);
	    //frame.pack();
	    frame.setVisible(true);
	}
}
