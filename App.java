package week05Project;

public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("Hello");
		asteriskLogger.error("Hello");
		
		spacedLogger.log("Hello");
		spacedLogger.error("Error");
	}

}
