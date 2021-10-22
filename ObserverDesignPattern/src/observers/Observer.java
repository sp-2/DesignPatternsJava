package observers;
import java.util.List;

import stockData.StockData;

public interface Observer {
	public void update(List<StockData> StockDataList);
}