package self.learning.bridge.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import self.learning.bridge.EmailMessage;
import self.learning.bridge.EmailMessageSender;
import self.learning.bridge.Message;
import self.learning.bridge.MessageSender;
import self.learning.bridge.TextMessage;
import self.learning.bridge.TextMessageSender;

class BridgePatternTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		MessageSender textMessageSender = new TextMessageSender();
		Message textMessage = new TextMessage(textMessageSender);
		textMessage.send();
		
		MessageSender emailMessageSender = new EmailMessageSender();
		Message emailMessage = new EmailMessage(emailMessageSender);
		emailMessage.send();
	}

}
