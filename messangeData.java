
public class messangeData extends MyData{
	String msg;
	messangeData(String _name, int _id, String _msg){
		super(_name, _id);
		msg=_msg;
	}

	void sendMsg(messangeData msgDt){
		return;
	}
	@Override
	boolean changeData() {
		// TODO Auto-generated method stub
		return false;
	}

}
