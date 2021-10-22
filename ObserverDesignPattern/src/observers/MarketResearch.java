package observers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import stockData.StockData;

public class MarketResearch implements Observer{
	Map<String,List<StockData>> stockDataMap = null;
	
	public MarketResearch() {
		stockDataMap = new HashMap<>();
	}
	
	public void update(List<StockData> stockDataList) {
		for(StockData stockData: stockDataList) {
			String symbol = stockData.getSymbol();
			List<StockData> listSymbol = new ArrayList<>();
			if(stockDataMap.containsKey(symbol)){
				listSymbol = stockDataMap.get(symbol);
			}
			listSymbol.add(stockData);
		}
		
		performAnalytics();
	}
	
	public void performAnalytics() {
		//Market Analytics
		displayAnalytics();
	}
	
	public void displayAnalytics() {
		//Display Market Analytics
	}
}

