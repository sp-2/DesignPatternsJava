import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextArea;

public class MakeTextBold extends TextDecorator{

	TextPad textpad;
	
	public MakeTextBold(TextPad textpad) {
		this.textpad       = textpad;
		JTextArea textArea = textpad.getJTextArea();
		Font  f            = new Font(Font.DIALOG_INPUT, Font.BOLD, 15);
		textArea.setFont(f);
	}
	
	@Override
	public String getDescription() {
		return textpad.getDescription()+", with Bold Font";
	}
	
	public JTextArea getJTextArea() {
		return textpad.getJTextArea();
	}
}
