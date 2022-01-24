import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestsQuestionFourJU4 {

	@Test
	public void testPartA() {
		Question4 q4 = new Question4(5);
		
		assertEquals(0, q4.getArrayList().size());
		assertEquals(5, q4.getDoubleArray().length);
	}
	
	@Test
	public void testPartB() {
		Question4 q4 = new Question4(5);
		
		q4.add(1);
		q4.add(2f);
		q4.add(3d);
		q4.add("4");
		Object s = new String("5");
		q4.add(s);
		q4.add(new Double(6));
		
		double [] d = q4.getDoubleArray();
		assertEquals(1, d[0], 0);
		assertEquals(2, d[1], 0);
		assertEquals(3, d[2], 0);
		
		ArrayList<String> a = q4.getArrayList();
		assertEquals("4", a.get(0));
		assertEquals("5", a.get(1));
		assertEquals("6.0", a.get(2));
		
		//force an array resize: array should resize +5 here to 10
		q4.add(1);
		q4.add(1);
		q4.add(1);
		
		//check array contents and that nothing was lost during the resizing
		d = q4.getDoubleArray();
		assertEquals(10, d.length);
		assertEquals(1, d[0], 0);
		assertEquals(2, d[1], 0);
		assertEquals(3, d[2], 0);
		assertEquals(1, d[3], 0);
		assertEquals(1, d[4], 0);
		assertEquals(1, d[5], 0);
	}
	
	@Test
	public void testPartC() {
		Question4 q4 = new Question4(5);
		
		q4.add(1);
		q4.add(2);
		q4.add("Java");
		q4.add("Exam");
		
		assertEquals("Java, Exam, 1.0, 2.0", q4.toString());
	}
	
	@Test
	public void testPartD() {
		Question4 q4 = new Question4(5);
		
		q4.add(1);
		q4.add(2d);
		q4.add("Java");
		q4.add("Exam");
		
		assertTrue(q4.contains(1));
		assertTrue(q4.contains(2d));
		assertTrue(q4.contains("Java"));
		assertTrue(q4.contains("Exam"));
		
		assertFalse(q4.contains(3));
		assertFalse(q4.contains("Java Exam"));
		assertFalse(q4.contains(new Double(2)));
	}
	
	@Test
	public void testPartE() {
		ArrayList<Object> ao = new ArrayList<Object>();
		ao.add(new Double(2));
		ao.add(new Integer(3));
		ao.add(new Float(4));
		ao.add("5");
		ao.add("6");
		
		Question4 q4 = new Question4(6);
		q4.add(ao);
		
		ArrayList<String> a = q4.getArrayList();
		assertEquals("5", a.get(0));
		assertEquals("6", a.get(1));
		
		double [] d = q4.getDoubleArray();
		assertEquals(2, d[0], 0);
		assertEquals(3, d[1], 0);
		assertEquals(4, d[2], 0);
	}
	
	@Test
	public void testPartF() {
		Question4 q4 = new Question4(5);
		
		q4.add(1);
		q4.add(2d);
		q4.add("Java");
		q4.add("Exam");
		
		q4.reverseAndDuplicate();
		double [] d = q4.getDoubleArray();
		
		assertEquals(2, d[0], 0);
		assertEquals(1, d[1], 0);
		assertEquals(2, d[2], 0);
		assertEquals(1, d[3], 0);
		
		ArrayList<String> a = q4.getArrayList();
		assertEquals("Exam", a.get(0));
		assertEquals("Java", a.get(1));
		assertEquals("Exam", a.get(2));
		assertEquals("Java", a.get(3));
	}
}
