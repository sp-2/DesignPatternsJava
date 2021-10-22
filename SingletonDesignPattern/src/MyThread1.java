
public class MyThread1 extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		SingletonDesignPatternThreadSafeLazyLoading singleInstance = SingletonDesignPatternThreadSafeLazyLoading.getInstance();
		System.out.println(Thread.currentThread().getName()+" "+singleInstance);
	}

}

