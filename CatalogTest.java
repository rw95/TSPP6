
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CatalogTest extends TestCase {
	
    @BeforeClass
    public void startTest(){
        System.out.println("Testing starts!");
    }
    
    @AfterClass
    public void endTest(){
        System.out.println("Testing ends!");
    }
    
    @Test
 	public void testAddItem(){
 		Catalog catObj = new Catalog();
 		productData actual=catObj.addItem("Misha", 1, "Inel_i7", (float)25, "white", (float)2000);
 		productData expected = new productData("Misha",1, "Inel_i7", (float)25, "white", (float)2000);
 		assertEquals(expected.color, actual.color);
 	}
	
    @Test
    public void testSort(){
    	Catalog catObj = new Catalog();
    	catObj.addItem("Misha", 1, "Intel i3", (float)5, "blue", (float)350);
		catObj.addItem("Vlad", 2, "Snapdragon", (float)4, "red", (float)250);
		catObj.addItem("Masha", 3, "Pentium", (float)3, "yellow", (float)450);
		catObj.addItem("Alex", 4, "KP580", (float)7.2, "green", 280);
		catObj.addItem("Denis", 5, "Intel i7", (float)7.2, "green",370);
		catObj.sort(catObj.items);
		float actual[] = new float[5];
		for(int i=0; i<actual.length;++i){
			actual[i]=catObj.items.get(i).price;
		}
		float expected[] = {250, 280, 350, 370, 450};
//		expected[0]=250;
//		expected[1]=280;
//		expected[2]=350;
//		expected[3]=370;
//		expected[4]=450;
		for(int i=0; i<actual.length; i++){
			assertEquals(actual[i],expected[i]);
			System.out.println("expected "+expected[i]);
			System.out.println("actual "+actual[i]);
		}
			
    }
}
