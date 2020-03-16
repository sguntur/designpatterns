package self.learning.bridge;

public class EmailMessageSender extends MessageSender {

	@Override
	void sendMessage() {
		System.out.println("Sending email message.");
	}

}
