package products;
public abstract class Laptop {
	String    name;
	Processor processor;
	OS        os;
	Memory    memory;
	Screen    screen;
	
	public abstract void assembleLaptop();
	
	public void details() {
		System.out.println("Name      : "+ name);
		System.out.println("Processor : "+ processor.getProcessor());
		System.out.println("OS        : "+ os.getOS());
		System.out.println("Memory    : "+ memory.getMemory());
		System.out.println("Screen    : "+ screen.getScreen()+"\n");
	}
}
