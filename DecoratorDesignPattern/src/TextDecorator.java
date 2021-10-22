//all text decorators need to re implement getDescription() and getJTextArea() methods
import javax.swing.JTextArea;

public abstract class TextDecorator extends TextPad{
	
	public abstract String getDescription();
	public abstract JTextArea getJTextArea();
}
