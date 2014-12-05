import java.util.ArrayList;
import java.lang.UnsupportedOperationException;
//import org.apache.commons.lang.NotImplementedException;
public class Catalog {
	ArrayList<productData> items;
	ArrayList<orderData> ordItems;
	ArrayList<messangeData> msgData;
	Catalog(){
		items = new ArrayList<productData>();
		ordItems = new ArrayList<orderData>();
		msgData = new ArrayList<messangeData>();
	}

	void sort(ArrayList<productData> items){
		for (int i = items.size()-1; i >= 0; i--){
		    for (int j = 0; j < i; j++){
		      if (items.get(j).price > items.get(j+1).price){
		        float tmp = items.get(j).price;
		        items.get(j).price = items.get(j+1).price;
		        items.get(j+1).price = tmp;
		      }
		    }
		  }
		//view();
	}
	
	void orderItem(String _name, int _id, productData dt, String address, float phoneNumber){
		orderData orderDt = new orderData(_name, _id, dt, address, phoneNumber);
		ordItems.add(orderDt);
	}
	
	ArrayList<productData> getArrayList(){
		return items;
	}
}
