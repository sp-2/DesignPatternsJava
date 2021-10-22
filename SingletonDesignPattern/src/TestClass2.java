
public class TestClass2 {
	public static void main(String[] args) {
		//Thread safe Lazy loading with 2 threads
		MyThread1 t1 = new MyThread1();
		t1.start();
	
		MyThread1 t2 = new MyThread1();
		t2.start();
	}
}

/* Output
Thread-0 SingletonDesignPatternThreadSafeLazyLoading@795bdf61
Thread-1 SingletonDesignPatternThreadSafeLazyLoading@795bdf61
*/