import java.io.Serializable;

public class SingletonDesignPatternEagerLoadingWithSer implements Serializable{
	private static SingletonDesignPatternEagerLoadingWithSer singleInstance = new SingletonDesignPatternEagerLoadingWithSer();
	
	public static SingletonDesignPatternEagerLoadingWithSer getInstance() {
		return singleInstance;
	}
}
