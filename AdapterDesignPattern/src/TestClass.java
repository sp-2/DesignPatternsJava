/*
 * The adapter pattern is a Structural Software Design Pattern which converts the interface
 * of a class into another interface the clients expect.
 * Adapter lets classes work together that otherwise could not because of incompatible interfaces.
 */

public class TestClass {

	public static void main(String[] args) {
		UKTemperature ukTemperature = new UKTemperature();
		
		USTemperature usTemperature = new USTemperature();
		
		//wrap usTemperature in a FahrenheitAdapter, which makes it look like a CelsiusTemperature interface
		//client sees only target interface
		CelsiusTemperature fahrenheitAdapter = new FahrenheitAdapter(usTemperature);
		
		System.out.println("In the UK:");
		testTemp(ukTemperature);
		
		System.out.println("In the US:");
		testTemp(fahrenheitAdapter);
	}
	
	static void testTemp(CelsiusTemperature celsiusTemperature) {
		celsiusTemperature.getCelsiusNormalBodyTemperature();
	}
}
/* Output:
In the UK:
Normal body temperature is: 37 Degrees Celsius
In the US:
Normal body temperature is: 98.6 Degrees Fahrenheit
 */