package factory;
import product.Car;
import product.Compact;

public class CompactFactory extends CarFactory {
	@Override
	public Car makeCar() {
		return new Compact();
	}
}