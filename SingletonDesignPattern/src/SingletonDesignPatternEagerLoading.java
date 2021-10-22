
public class SingletonDesignPatternEagerLoading {
	private static SingletonDesignPatternEagerLoading singleInstance = new SingletonDesignPatternEagerLoading();
	
	public static SingletonDesignPatternEagerLoading getInstance() {
		return singleInstance;
	}
}
