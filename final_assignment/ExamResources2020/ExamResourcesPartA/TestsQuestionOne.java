import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class TestsQuestionOne {

	@Test
	public void testInterface() {
		Method [] methods = Building.class.getMethods();
		
		int count = 0;
		
		for (Method m : methods) {
			if (m.getName().trim().equalsIgnoreCase("getNumWindows"))
				count++;
			else if (m.getName().trim().equalsIgnoreCase("getFloorSpace"))
				count++;
			else if (m.getName().trim().equalsIgnoreCase("getTotalFloorSpace"))
				count++;
			else if (m.getName().trim().equalsIgnoreCase("addRoom"))
				count++;
				
		}
		
		assertEquals(4, count);
		
		assertTrue(Building.class.isInterface());
	}
	
	@Test
	public void testHouse() {
		Building house = new House(2);
		house.addRoom(10, 0);
		house.addRoom(15, 0);
		house.addRoom(20, 1);
		house.addRoom(5, 1);
		
		assertEquals(8, house.getNumWindows());
		assertEquals(50, house.getTotalFloorSpace());
		assertEquals(25, house.getFloorSpace(0));
		assertEquals(25, house.getFloorSpace(1));
		assertEquals("House: 8 windows, 4 Rooms, Floor Space: 50.0, and 2 Floors", house.toString());
		
	}
	
	@Test
	public void testBungalow() {
		Building house = new Bungalow();
		house.addRoom(10, 0);
		house.addRoom(30, 0);

		assertEquals(4, house.getNumWindows());
		assertEquals(40, house.getTotalFloorSpace());
		assertEquals(40, house.getFloorSpace(0));
		assertEquals("Bungalow: 4 windows, 2 Rooms, Floor Space: 40.0, and 1 Floor", house.toString());
	}
	
	@Test
	public void testEstate() {
		Estate e = new Estate(null, 2, 160);
		
		Building house = new House(2);
		house.addRoom(10, 0);
		house.addRoom(15, 0);
		house.addRoom(20, 1);
		
		Building bungalow = new Bungalow();
		bungalow.addRoom(10, 0);
		bungalow.addRoom(30, 0);
		
		e.addBuilding(house);
		//largest room is 25, so area is 25 + (25 * 2) = 75
		assertEquals(75, e.calculateArea());
		
		e.addBuilding(bungalow);
		//bungalow is 40 + (40 * (2 / 2)) = 40 + 40 = 80
		//75 (house) + 80 (bungalow) = 155
		assertEquals(155, e.calculateArea());
		
		//house has 4 (2 per floor) + 3 (one per room) = 7
		//bungalow has 2 (2 per floor) + 2 (one per room) = 4
		//7 + 4 = 11
		assertEquals(11, e.getNumWindows());
		
		try {
			e.addBuilding(bungalow);
			//max area is 160
			//before adding bungalow again, area is 155
			//adding it again takes the area to 155 + 80 = 235
			//235 > 160 therefore this should case an error
			fail("max estate area was exceeded");
		} catch (Exception ex) {}
		
	}

}
