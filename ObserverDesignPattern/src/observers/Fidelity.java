package observers;
import java.util.List;

import stockData.StockData;
import subjects.StockExchangeSubject;

public class Fidelity implements Observer{
	List<StockData> stockDataList = null;
	private StockExchangeSubject stockExchangeSubject;
	
	public Fidelity(StockExchangeSubject stockExchangeSubject) {
		this.stockExchangeSubject = stockExchangeSubject;
		this.stockExchangeSubject.subscribe(this);
	}
	
	public void update(List<StockData> stockDataList) {
		this.stockDataList = stockDataList;
		refreshData();
	}
	
	public void refreshData() {
		System.out.println("Symbol Name 	  Price  Volume");
		for(StockData stockData: stockDataList) {
			System.out.printf("%-5s  %-10s %-5.1f  %-6.1f%n", stockData.getSymbol(), stockData.getName(), stockData.getPrice(), stockData.getVolume());
		}
		System.out.println();
	}
	
	public void unSubscribeStockExchangeSubject() {
		stockExchangeSubject.unSubscribe(this);
		stockExchangeSubject = null;
	}
}