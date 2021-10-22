
public class MyThread extends Thread{
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		SingletonDesignPatternLazyLoading singleInstance = SingletonDesignPatternLazyLoading.getInstance();
		System.out.println(Thread.currentThread().getName()+" "+singleInstance);
	}

}
