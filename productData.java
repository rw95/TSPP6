
public class productData extends MyData {
	String processor, color;
	float screenSize, price;
	productData(String _name, int _id, String _processor, Float _screenSize, String _color, float _price){
		super(_name, _id);
		processor=_processor;
		screenSize=_screenSize;
		color=_color;
		price=_price;
	}

	boolean changeData(String _name, int _id, String _processor, Float _screenSize, String _color, float _price) {
		name=_name;
		id=_id;
		processor=_processor;
		screenSize=_screenSize;
		color=_color;
		price=_price;
		return true;
	}

	@Override
	boolean changeData() {
		// TODO Auto-generated method stub
		return false;
	}
}
