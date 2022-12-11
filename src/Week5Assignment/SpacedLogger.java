package Week5Assignment;

public class SpacedLogger implements Logger {

	/*
	 * i n s e r t  l o g  m e s s a g e  h e r e
	 */

	@Override
	public void log(String log) {
		String line = "";
		
		for(int i = 0; i < log.length(); i+= 1) {
			line += log.charAt(i) + " ";
		} 
		System.out.println(line.substring(0, line.length()-1));
	}

	/*
	 * ERROR: i n s e r t  e r r o r  m e s s a g e  h e r e
	 */
	
	@Override
	public void error(String error) {
		String line = "";
		
		for(int i = 0; i < error.length(); i+= 1) {
			line += error.charAt(i) + " ";
		} 
		System.out.println("ERROR: " + line.substring(0, line.length()-1));
	}

}
