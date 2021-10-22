
public class SingletonDesignPatternThreadSafeLazyLoading {
	private static SingletonDesignPatternThreadSafeLazyLoading singleInstance = null;
	
	public static SingletonDesignPatternThreadSafeLazyLoading getInstance() {
		
		if(singleInstance==null) {
			synchronized(SingletonDesignPatternThreadSafeLazyLoading.class) {
				if(singleInstance==null) {
					singleInstance = new SingletonDesignPatternThreadSafeLazyLoading();
				}
			}
		}
		return singleInstance;
	}
}