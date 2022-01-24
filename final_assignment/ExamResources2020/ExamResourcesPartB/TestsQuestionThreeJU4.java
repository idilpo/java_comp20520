import static org.junit.Assert.*;

import org.junit.Test;

public class TestsQuestionThreeJU4 {

	@Test
	public void testPartA() {
		try {
			Draw.class.getDeclaredMethod("boxes", int.class, int.class, char.class, char.class);
		} catch (NoSuchMethodException ex) {
			fail("boxes method signature incorrect");
		}
		
		try {
			Draw.class.getDeclaredMethod("stripes", int.class, int.class, char.class, char.class, boolean.class);
		} catch (NoSuchMethodException ex) {
			fail("stripes method signature incorrect");
		}
		
		try {
			Draw.boxes(-1, -1, 'x', 'o');
			fail("Boxes: invalid input");
		} catch (Exception ex) {}
		
		try {
			Draw.stripes(-1, -1, 'x', 'o', false);
			fail("Stripes: invalid input");
		} catch (Exception ex) {}
	}
	
	@Test
	public void testPartB() {
		//example 1
		String s = Draw.boxes(7,7,'+', 'o');
		String answer = "+++++++\n" + 
				"+ooooo+\n" + 
				"+o+++o+\n" + 
				"+o+o+o+\n" + 
				"+o+++o+\n" + 
				"+ooooo+\n" + 
				"+++++++";
		
		assertEquals(answer, s);
		
		//example 2
		s = Draw.boxes(8,15,'|', '*');
		answer = "|||||||||||||||\n" + 
				"|*************|\n" + 
				"|*|||||||||||*|\n" + 
				"|*|*********|*|\n" + 
				"|*|*********|*|\n" + 
				"|*|||||||||||*|\n" + 
				"|*************|\n" + 
				"|||||||||||||||";
		
		assertEquals(answer, s);
	}
	
	@Test
	public void testPartC() {
		String s = Draw.stripes(5, 15,'+', 'o', false);
		String answer = "+++++ooooo+++++\n" + 
				"+++++ooooo+++++\n" + 
				"+++++ooooo+++++\n" + 
				"+++++ooooo+++++\n" + 
				"+++++ooooo+++++";
		
		assertEquals(answer, s);
		
		s = Draw.stripes(9,15,'-', '|', true);
		answer = "---------------\n" + 
				"---------------\n" + 
				"---------------\n" + 
				"|||||||||||||||\n" + 
				"|||||||||||||||\n" + 
				"|||||||||||||||\n" + 
				"---------------\n" + 
				"---------------\n" + 
				"---------------";
		
		assertEquals(answer, s);
	}

}
