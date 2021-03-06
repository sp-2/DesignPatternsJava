import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.LineNumberInputStream;

public class TestClass {
	public static void main(String[] args) {
		
		TextPad spA = new ScratchPad();
		spA.initFrame();
		spA = new MakeTextBlue(spA);
		spA = new MakeTextBold(spA);
		spA = new AddPinkBackGround(spA);
		System.out.println(spA.getDescription());
		
		TextPad sp2 = new ScratchPad();
		sp2.initFrame();
		sp2 = new AddOrangeBackGround(new MakeTextGreen(new MakeTextBold(sp2)));
		System.out.println(sp2.getDescription());
	
	}
}

/* Output:
 /DecoratorDesignPattern/src/Decorator Output.png
 
   Scratch Pad, with Blue Text, with Bold Font, with Pink BackGround
   Scratch Pad, with Bold Font, with Green Text, with Orange BackGround
 */








