package factory;
import product.Car;
import product.Sedan;

public class SedanFactory extends CarFactory{
	@Override
	public Car makeCar() {
		return new Sedan();
	}	
}