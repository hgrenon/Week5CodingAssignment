package Week5Assignment;

public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		asteriskLogger.log("Hello, Spaceman!");
		System.out.println();
		asteriskLogger.error("Take me to your leader!");
		
		System.out.println();
		
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.log("Hello, Spaceman!");
		System.out.println();
		spacedLogger.error("Take me to your leader!");
	}

}
