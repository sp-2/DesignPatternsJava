/*
 * The Abstract Factory Pattern provides an interface for creating families of related or
 *  dependent objects without specifying their concrete classes.
 */

package client;
import products.Laptop;

public class TestClass {

	public static void main(String[] args) {
		LaptopStore dellLaptopStore = new DellLaptopStore();
		
		Laptop dellLaptop = dellLaptopStore.orderLaptop();
		
		dellLaptop.details();
		
		LaptopStore macLaptopStore = new MacBookAirLaptopStore();
		
		Laptop macLaptop = macLaptopStore.orderLaptop();
		
		macLaptop.details();
	}

}
/*
 Output:
Name      : Dell Inspiron
Processor : IntelCore i5
OS        : Windows 10
Memory    : 8GB RAM
Screen    : Touch Screen

Name      : MacBook Air
Processor : Apple M1 Chip
OS        : MacOS Big Sur 11.0
Memory    : 16GB RAM
Screen    : Retina Screen
*/