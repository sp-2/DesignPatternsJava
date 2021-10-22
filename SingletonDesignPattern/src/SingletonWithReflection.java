public class SingletonWithReflection {

	public static void main(String[] args) throws Exception{

		SingletonDesignPatternEagerLoading singleInstance   =  SingletonDesignPatternEagerLoading.getInstance();
		SingletonDesignPatternEagerLoading singleInstanceR  =  SingletonDesignPatternEagerLoading.class.newInstance();
		
		System.out.println(singleInstance);
		System.out.println(singleInstanceR);
	}
}
/*
Output:
SingletonDesignPatternEagerLoading@33909752
SingletonDesignPatternEagerLoading@55f96302
*/