
public class TestClass {

	public static void main(String[] args) {
		//Eager Loading
		SingletonDesignPatternEagerLoading singleInstance1 = SingletonDesignPatternEagerLoading.getInstance();
		SingletonDesignPatternEagerLoading singleInstance2 = SingletonDesignPatternEagerLoading.getInstance();
		
		System.out.println(singleInstance1);
		System.out.println(singleInstance2);
		
		//not thread safe, Lazy loading with 2 threads
		MyThread t1 = new MyThread();
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.start();
		
	}

}
/* Output
SingletonDesignPatternEagerLoading@33909752
SingletonDesignPatternEagerLoading@33909752
Thread-0 SingletonDesignPatternLazyLoading@6b75f
Thread-1 SingletonDesignPatternLazyLoading@708e446f
*/