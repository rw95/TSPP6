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


	
	ArrayList<productData> getArrayList(){
		return items;
	}
}
