import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Test {
	Catalog catObject;
	void Log(String filename, String text, Catalog catObject, int i){
		try{
			File file = new File(filename);
			FileWriter myOutput = new FileWriter(file,true);
			myOutput.write(text+"\r\n");
			myOutput.write("Заказ №" + (i+1));
			myOutput.write(" Товар : "+catObject.ordItems.get(i).dt.name+"  Адрес заказчика : "+catObject.ordItems.get(i).address);
			myOutput.write("\r\n");
			myOutput.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}


	void testOrderitem1(Catalog catObject, String filename){
		catObject.ordItems.clear();//очистка массива заказов
		try{
			File file = new File(filename);
			FileWriter myOutput = new FileWriter(file,false);
			myOutput.write("Test 1" + "\r\n");
			myOutput.write("Проверяем, создается либо объект orderData и добавляется ли он в массив заказов" + "\r\n");
			myOutput.close();
			for(int i=0; i<3; ++i){
				catObject.orderItem("Misha", i, catObject.items.get(i), "Nad. Ostrovskoy", 79753243);
				Log(filename,"Создан новый заказ!", catObject, i);
			}
			FileWriter myOutput2 = new FileWriter(file,true);
			myOutput2.write("Создание заказов выполняется корректно!" + "\r\n");
			myOutput2.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}










//	ArrayList<productData> Testing(String filename){
//		Catalog test1 = new Catalog();
//		test1.addItem("Misha", 1, "Intel", (float)5, "blue", (float)350);
//		test1.addItem("Vlad", 2, "Snapdragon", (float)4, "red", (float)250);
//		test1.addItem("Masha", 3, "Pentium", (float)3, "yellow", (float)450);
//		test1.addItem("Alex", 4, "KP580", (float)7.2, "green", (float)780);
//		test1.addItem("Denis", 5, "AMD", (float)2.3, "white", (float)440);
//		test1.addItem("Sergey", 6, "Radeon", (float)4.4, "gray", (float)644);
//		test1.addItem("Andrey", 7, "Intel9090", (float)6.4, "purple", (float)125);
//		Log(filename, test1, 1);
//		
//		Catalog test2 = new Catalog();
//		test2.addItem("Andrey", 7, "Intel9090", (float)6.4, "purple", (float)125);
//		test2.addItem("Vlad", 2, "Snapdragon", (float)4, "red", (float)250);
//		test2.addItem("Misha", 1, "Intel", (float)5, "blue", (float)350);
//		test2.addItem("Denis", 5, "AMD", (float)2.3, "white", (float)440);
//		test2.addItem("Masha", 3, "Pentium", (float)3, "yellow", (float)550);
//		test2.addItem("Sergey", 6, "Radeon", (float)4.4, "gray", (float)644);
//		test2.addItem("Alex", 4, "KP580", (float)7.2, "green", (float)780);
//		Log(filename, test2, 2);
//		
//		Catalog test3 = new Catalog();
//		test3.addItem("Alex", 4, "KP580", (float)7.2, "green", (float)780);
//		test3.addItem("Vlad", 2, "Snapdragon", (float)4, "red", (float)250);
//		test3.addItem("Misha", 1, "Intel", (float)5, "blue", (float)350);
//		test3.addItem("Denis", 5, "AMD", (float)2.3, "white", (float)440);
//		test3.addItem("Masha", 3, "Pentium", (float)3, "yellow", (float)550);
//		test3.addItem("Sergey", 6, "Radeon", (float)4.4, "gray", (float)644);
//		test3.addItem("Andrey", 7, "Intel9090", (float)6.4, "purple", (float)125);
//		Log(filename, test3, 3);
//		
//		return test1.items;
//	}
//}
