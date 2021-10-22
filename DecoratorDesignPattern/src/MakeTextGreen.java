import java.awt.Color;

import javax.swing.JTextArea;

public class MakeTextGreen extends TextDecorator{
	TextPad textpad;
	
	public MakeTextGreen(TextPad textpad) {
		this.textpad       = textpad;
		JTextArea textArea = textpad.getJTextArea();
		textArea.setForeground(Color.GREEN);
	}
	
	@Override
	public String getDescription() {
		return textpad.getDescription()+", with Green Text";
	}
	public JTextArea getJTextArea() {
		return textpad.getJTextArea();
	}
}
