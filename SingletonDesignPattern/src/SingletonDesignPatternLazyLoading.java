
public class SingletonDesignPatternLazyLoading {
	private static SingletonDesignPatternLazyLoading singleInstance = null;
	
	public static SingletonDesignPatternLazyLoading getInstance() {
		
		if(singleInstance==null) {
			singleInstance = new SingletonDesignPatternLazyLoading();
		}
		return singleInstance;
	}
}