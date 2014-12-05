
public class orderData extends MyData {
	productData dt;
	String address, status;
	float phoneNumber;

	orderData(String _name, int _id, productData _dt, String _address, float _phoneNumber){
		super(_name, _id);
		dt=_dt;
		address=_address;
		phoneNumber=_phoneNumber;
	}
	
	@Override
	boolean changeData() {
		// TODO Auto-generated method stub
		return false;
	}
	
	String getOrderStatus(orderData ordDt){
		return ordDt.status;
	}
	
	void changeOrderStatus(String _status){
		this.status=_status;
	}

}
