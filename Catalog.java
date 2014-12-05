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

	void view(){
//		for(int i=0; i<items.size(); ++i){
//			System.out.print(items.get(i).processor + " ");
//			System.out.print(items.get(i).screenSize + " ");
//			System.out.print(items.get(i).color + " ");
//			System.out.println(items.get(i).price);
//		}
	}
	
	void sort(ArrayList<productData> items){
		//throw new UnsupportedOperationException();
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
	void askAboutItem(String _name, int _id, String _msg){
		messangeData msgDt = new messangeData(_name, _id, _msg);
		msgData.add(msgDt);
	}
	
	productData addItem(String _name, int _id, String processor, Float screenSize, String color, float price){
		//throw new UnsupportedOperationException();
		productData dt = new productData(_name, _id, processor, screenSize, color, price);
		items.add(dt);
		return dt;
	}
	
	ArrayList<productData> getArrayList(){
		return items;
	}
}
