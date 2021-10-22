import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextArea;

public class AddPinkBackGround extends TextDecorator{
	TextPad textpad;
	
	public AddPinkBackGround(TextPad textpad) {
		this.textpad       = textpad;
		JTextArea textArea = textpad.getJTextArea();
		textArea.setBackground(Color.pink);
	}
	
	@Override
	public String getDescription() {
		return textpad.getDescription()+", with Pink BackGround";
	}
	
	public JTextArea getJTextArea() {
		return textpad.getJTextArea();
	}
}