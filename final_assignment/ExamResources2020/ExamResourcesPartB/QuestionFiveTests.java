import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuestionFiveTests {
	
	//set these to where you saved the files for this question
	private String fileReadFile = "numbers.txt";
	private String fileReadNumbersFile = "integers.txt";

	@Test
	public void testPartA() {
		Field[] fields = Question5.class.getFields();
		
		int count = 0;
		
		for (Field f : fields) {
			if (f.getName().equals("FIRST_TOKEN")) {
				count++;
			} else if (f.getName().equals("LAST_TOKEN")) {
				count++;
			} else if (f.getName().equals("ITH_TOKEN")) {
				count++;
			}
		}
		
		if (count != 3) {
			fail("One or more of the constants may be missing");
		}

		assertEquals(2, Question5.operator.values().length);
		
		count = 0;
		for (Question5.operator o : Question5.operator.values()) {
			if (o.toString().equals("SUM")) {
				count++;
			} else if (o.toString().equals("PRODUCT")) {
				count++;
			}
		}
		
		if (count != 2) {
			fail("Something might be wrong with the enum");
		}
	}
	
	@Test
	public void testPartB() throws InstantiationException, IllegalAccessException {
		try {
			Method m = Question5.class.getDeclaredMethod("readFile", String.class, char.class, int.class);
			
			Class [] c = m.getExceptionTypes();
			boolean pass = false;
			for (Class cls : c) {
				if (cls.newInstance() instanceof IOException) {
					pass = true;
				}
			}
			
			if (!pass) {
				fail("readFile signature might not indicate how it will deal with errors");
			}
			
		} catch (NoSuchMethodException | SecurityException e) {
			fail("readFile method signature is incorrect");
		}
	}
	
	@Test
	public void testPartC() {
		try {
			String s = Question5.readFile(fileReadFile, ' ', Question5.FIRST_TOKEN);
			assertEquals("one four seven ten", s);
		} catch (Exception ex) {
			ex.printStackTrace();
			fail(ex.getMessage());
		}
	}
	
	@Test
	public void testPartD() {
		try {
			String s = Question5.readFile(fileReadFile, ' ', Question5.LAST_TOKEN);
			assertEquals("three six nine twelve", s);
		} catch (Exception ex) {
			ex.printStackTrace();
			fail(ex.getMessage());
		}
	}
	
	@Test
	public void testPartE() {
		try {
			String s = Question5.readFile(fileReadFile, ' ', Question5.ITH_TOKEN);
			assertEquals("one five nine ERROR", s);
		} catch (Exception ex) {
			ex.printStackTrace();
			fail(ex.getMessage());
		}
	}
	
	@Test
	public void testPartF() {
		try {
			//Example 1
			int s = Question5.readFileNumeric(fileReadNumbersFile, ' ', Question5.LAST_TOKEN, Question5.operator.SUM);
			assertEquals(30, s);
			
			//Example 2
			s = Question5.readFileNumeric(fileReadNumbersFile, ' ', Question5.FIRST_TOKEN, Question5.operator.PRODUCT);
			assertEquals(280, s);			
		} catch (Exception ex) {
			ex.printStackTrace();
			fail(ex.getMessage());
		}		
	}

}
