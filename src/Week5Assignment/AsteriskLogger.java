package Week5Assignment;

public class AsteriskLogger implements Logger{
	
	/*
	 * 	***insert log message here***
	 */


	@Override
	public void log(String log) {
		String line = log;
		System.out.println("***" + line + "***");
		
	}

	/*
	 * 	*******************************	
	 * 	***insert error message here***
	 * 	*******************************
	 */
	
	@Override
	public void error(String error) {
		String line = "***ERROR: " + error + "***";
		String outer = "*".repeat(line.length());
		
		System.out.println(outer);
		System.out.println(line);
		System.out.println(outer);
	}

}
