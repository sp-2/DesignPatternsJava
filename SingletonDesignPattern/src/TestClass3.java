
public class TestClass3 {
	public static void main(String[] args) {
		//Lazy Loading, 1 thread
		SingletonDesignPatternLazyLoading singleInstance3 = SingletonDesignPatternLazyLoading.getInstance();
		SingletonDesignPatternLazyLoading singleInstance4 = SingletonDesignPatternLazyLoading.getInstance();
				
		System.out.println(singleInstance3);
		System.out.println(singleInstance4);
		
		//Thread safe Lazy Loading
		SingletonDesignPatternThreadSafeLazyLoading singleInstance5 = SingletonDesignPatternThreadSafeLazyLoading.getInstance();
		SingletonDesignPatternThreadSafeLazyLoading singleInstance6 = SingletonDesignPatternThreadSafeLazyLoading.getInstance();
				
		System.out.println(singleInstance5);
		System.out.println(singleInstance6);
	}
}