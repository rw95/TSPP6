import junit.framework.TestCase;

public class JUnitTest extends TestCase{
	public void testAddItem(){
		Catalog catObj = new Catalog();
		productData actual=catObj.addItem("Misha", 1, "Inel_i7", (float)25, "white", (float)2000);
		productData expected = new productData("Misha",1, "Inel_i7", (float)25, "white", (float)2000);
		assertEquals(expected, actual);
	}
}
