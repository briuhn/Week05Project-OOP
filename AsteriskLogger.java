package week05Project;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("*** " + message + " ***");
		
	}

	@Override
	public void error(String message) {
		System.out.println("****************\r\n"
				+ "\r\n"
				+ "***Error: " + message + "***\r\n"
				+ "\r\n"
				+ "****************");
		
	}
	
}
