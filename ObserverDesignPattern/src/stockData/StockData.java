package stockData;
import java.time.LocalDateTime;
import java.util.Date;

public class StockData {

	String name;
	String symbol;
	Double price;
	Double volume;
	LocalDateTime date;
	
	public StockData(String name, String symbol, Double price, Double volume, LocalDateTime date) {
		super();
		this.name = name;
		this.symbol = symbol;
		this.price = price;
		this.volume = volume;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getVolume() {
		return volume;
	}
	public void setVolume(Double volume) {
		this.volume = volume;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
}
