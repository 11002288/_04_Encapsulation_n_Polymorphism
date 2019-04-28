package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PolyTest {
	EncapsulateTheData encap = new EncapsulateTheData();

	@Test
	public void testItems() {

		try {
			encap.setItems(-1);
			assertEquals(encap.getItems(), -1);
			// encap.setItems();
			fail("test");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception

			e.printStackTrace();
			// encap.setItems(-2);
			// System.out.println(encap.getItems());
			assertEquals(encap.getItems(), 0);

		}
	}
	@Test
	public void testdeg() {
		try {
			encap.setDegrees(362);
			assertEquals(encap.getDegrees(),362);
			fail("Doesn't throw");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			e.printStackTrace();
			assertEquals(encap.getDegrees(), 360);
		}
	}
	@Test
	public void testClat() {
		try {
			encap.setClat("");
			assertEquals(encap.getClat(),"");
			fail("Not thrown");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			e.printStackTrace();
			assertEquals(encap.getClat(), " ");
		}
	}
	@Test
	public void testObj(){
		try {
			encap.setObj("");
			assertEquals(encap.getObj(), "");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			e.printStackTrace();
			assertEquals(encap.getObj(), (Object)"");
		}
	}
}
