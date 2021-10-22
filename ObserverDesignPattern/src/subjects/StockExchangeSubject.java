package subjects;
import observers.Observer;

public interface StockExchangeSubject {
	public void subscribe(Observer observer);
	public void unSubscribe(Observer observer);
	public void notifyObservers();
}