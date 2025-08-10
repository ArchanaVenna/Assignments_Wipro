package assignment;

interface Message{
	void send(String msg);
}

class Email implements Message {
    public void send(String msg) {
        System.out.println("Email: " + msg);
    }
}

class Notification {
    Message message;
    Notification(Message message ) {
        this.message = message;
    }
    void notifyUser(String msg) {
        message.send(msg);
    }
}


public class Dependency_INversion_P {
    public static void main(String[] args) {
		 Notification n = new Notification(new Email());
	        n.notifyUser("Hello Archana!");
	    
	}

}
