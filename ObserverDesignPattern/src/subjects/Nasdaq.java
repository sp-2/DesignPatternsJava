package subjects;

import java.util.ArrayList;
import java.util.List;

import observers.Observer;
import stockData.StockData;

public class Nasdaq implements StockExchangeSubject{
	private List<Observer>  observers     = null;
	private List<StockData> stockDataList = null;
	
	public Nasdaq() {
		observers 	  = new ArrayList<Observer>();
		stockDataList = new ArrayList<StockData>();
	}
	
	public void subscribe(Observer observer) {
		observers.add(observer);
	}
	
	public void unSubscribe(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update(stockDataList);
		}
	}
	
	public void setData(List<StockData> stockDataList) {
		this.stockDataList = stockDataList;
		notifyObservers();
	}
}
