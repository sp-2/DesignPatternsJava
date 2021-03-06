//Adapter implements the target interface and is composed with the Adaptee
//All requests get delegated to the Adaptee
public class FahrenheitAdapter implements CelsiusTemperature{

	FahrenheitTemperature fahrenheitTemperature;
	
	public FahrenheitAdapter(FahrenheitTemperature fahrenheitTemperature) {
		this.fahrenheitTemperature = fahrenheitTemperature;
	}
	
	@Override
	public void getCelsiusNormalBodyTemperature() {
		fahrenheitTemperature.getFahrenheitNormalBodyTemperature();
	}
}
