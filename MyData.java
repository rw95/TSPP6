
public abstract class MyData {
	String name;
	int id;
	MyData(String _name, int _id){
		name=_name;
		id=_id;
	}
	abstract boolean changeData();
}
