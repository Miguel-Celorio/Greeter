/**
 * @author Bad Taste
 * greets in different languages
 */
public class Greeter {
	/**
	 * @param language chosen language
	 * @param repetitions how many times repeat greet
	 * @return a String with the greeting
	 */
	public String greet (int language, int repetitions) {
		String greeting = "";

		switch (language) {
			case 0 -> greeting = "hola";
			case 1 -> greeting = "hello";
			case 2 -> greeting = "kaixo";
		}
		
		return greeting.repeat(Math.max(0, repetitions));
	}
}
