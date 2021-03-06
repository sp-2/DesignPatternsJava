import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonWithSerialization {
	public static void main(String[] args) throws Exception {
		SingletonDesignPatternEagerLoadingWithSer singleInstance = SingletonDesignPatternEagerLoadingWithSer.getInstance();
		System.out.println(singleInstance);
		
		//serialization
		FileOutputStream   fos  = new FileOutputStream("/Users/sp/Desktop/DesignPatterns/SingletonDesignPattern/src/a.txt");
		ObjectOutputStream oos  = new ObjectOutputStream(fos);
		
		oos.writeObject(singleInstance);
		
		//deserialization
		FileInputStream   fis  = new FileInputStream("/Users/sp/Desktop/DesignPatterns/SingletonDesignPattern/src/a.txt");
		ObjectInputStream ois  = new ObjectInputStream(fis);
		
		SingletonDesignPatternEagerLoadingWithSer singleton = (SingletonDesignPatternEagerLoadingWithSer) ois.readObject();
		System.out.println(singleton);
	}
}


/*
Output:
SingletonDesignPatternEagerLoadingWithSer@33909752
SingletonDesignPatternEagerLoadingWithSer@682a0b20
*/