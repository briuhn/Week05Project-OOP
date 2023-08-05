package week05Project;

public class SpacedLogger implements Logger {

	@Override
	public void log(String message) {
		StringBuilder newMessage = new StringBuilder();
		for(int i = 0; i < message.length(); i++) {
			newMessage.append(message.charAt(i)).append(' ');
		}
		System.out.println(newMessage.toString());
		
	}

	@Override
	public void error(String message) {
		StringBuilder newErrorMessage = new StringBuilder();
		for(int i = 0; i < message.length(); i++) {
			newErrorMessage.append(message.charAt(i)).append(' ');
		}
		System.out.println(newErrorMessage.toString());
	}

}
