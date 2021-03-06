import java.awt.Color;

import javax.swing.JTextArea;

public class MakeTextBlue extends TextDecorator{
	TextPad textpad;
	
	public MakeTextBlue(TextPad textpad) {
		this.textpad = textpad;
		JTextArea textArea = textpad.getJTextArea();
		textArea.setForeground(Color.BLUE);
	}
	
	@Override
	public String getDescription() {
		return textpad.getDescription()+", with Blue Text";
	}
	
	public JTextArea getJTextArea() {
		return textpad.getJTextArea();
	}
}