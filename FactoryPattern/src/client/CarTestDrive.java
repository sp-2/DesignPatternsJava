/*
 * 
 * The Factory Method Pattern is a Creational design pattern that uses factory methods to deal with the problem of creating objects.
"It defines an interface for creating an object, but lets subclasses decide which class to instantiate. 
The Factory method lets a class defer instantiation it uses to subclasses."
 */

package client;
import factory.*;
import product.Car;

public class CarTestDrive {

	public static void main(String[] args) {
		CarFactory carFactory = new SedanFactory();
		Car		   sedan	  = carFactory.makeCar();
		sedan.print();//output Sedan
		
	    carFactory = new CompactFactory();
		Car		   compact	  = carFactory.makeCar();
		compact.print();//output Compact
	}
}