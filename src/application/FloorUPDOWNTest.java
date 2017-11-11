package application;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FloorUPDOWNTest {
	private static FloorUPDOWN test = new FloorUPDOWN();
	
	@Before
	public void setUp() throws Exception {
		
		test = new FloorUPDOWN();
	}

	

	@Test
	public void testToString() {
		String mess = test.toString();
        assertEquals("Someone pressed button on "+0+" going "+"", mess);
	}

	@Test
	public void testIsUp() {
		Boolean dire = test.isUp();
        assertEquals(false, dire);
	}



	@Test
	public void testGetFloor() {
		int age = test.getFloor();
        assertEquals(0, age);
	}

	@Test
	public void testIsDown() {
		Boolean dire = test.isDown();
        assertEquals(false, dire);
	}

}
