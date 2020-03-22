package self.learning.bridge;

public abstract class Message {
	 
	MessageSender messageSender;
	 
	 Message(MessageSender messageSender){
		 this.messageSender = messageSender;
	 }
	 
	 abstract public void send();
}
