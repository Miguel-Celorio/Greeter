import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Bad Taste 
 * test class for a greeting class
 */
public class GreeterTest {
	@Test
	public void testGreetMethod() {
		Greeter greeter = new Greeter();

		String expected = "hola";
		String target = greeter.greet(0, 1);
		assertEquals("Testing spanish greet once", expected, target);

		expected = "hellohello";
		target = greeter.greet(1, 2);
		assertEquals("Testing english greet twice", expected, target);

		expected = "kaixokaixokaixokaixo";
		target = greeter.greet(2, 4);
		assertEquals("Testing basque greet four times", expected, target);

	}

}
