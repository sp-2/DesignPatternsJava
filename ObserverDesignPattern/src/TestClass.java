/*
 * The observer pattern is a software design pattern in which an object, named the subject, 
 * maintains a list of its dependents, called observers, 
 * and notifies them automatically of any state changes, usually by calling one of their methods. 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import observers.*;
import stockData.StockData;
import subjects.*;

public class TestClass {

	public static void main(String[] args) {
		//create the publisher
		Nasdaq nasdaq   			  = new Nasdaq();
		//create and register the observer 
		Observer fidelity             = new Fidelity(nasdaq);
		
		List<StockData> stockDataList = new ArrayList<StockData>();
		Scanner scanner               = null;
		StockData stockData           = null;
		String[] info;
  	  	String name;
  	  	String symbol;
  	  	Double price;
  	  	Double volume;
		
  	  	//simulate updates
		try {
				File file = new File("/Users/sp/Desktop/DesignPatterns/ObserverDesignPattern/src/data");
			    scanner   = new Scanner(file);

				while (scanner.hasNextLine()) {
					String data = scanner.nextLine();
					info        = data.split(",");
		        
					if(info[0].equals("#")) {nasdaq.setData(stockDataList);stockDataList.clear(); continue;}
		         
					name      = info[0];
					symbol    = info[1];
					price     = Double.parseDouble(info[2]);
					volume    = Double.parseDouble(info[3]);
					stockData = new StockData(name,symbol, price, volume, LocalDateTime.now());
					
					stockDataList.add(stockData);
				}
				
		  } catch (FileNotFoundException e) {
		    	e.printStackTrace();
		  } finally {
		    	scanner.close();
		  }
		
	}
	
}


/* Output:
 
Symbol Name 	  Price  Volume
AAPL   Apple      142.0  100000.0
DIS    Disney     160.0  227000.0
GEVO   Gevo       6.8    1127000.0
NRXP   NRX Pharm  142.0  339952.0
STMP   Stamps     320.2  420000.0

Symbol Name 	  Price  Volume
AAPL   Apple      122.0  100000.0
DIS    Disney     188.0  1000000.0
GEVO   Gevo       8.8    2227000.0
NRXP   NRX Pharm  102.0  112252.0
STMP   Stamps     340.2  880000.0

*/