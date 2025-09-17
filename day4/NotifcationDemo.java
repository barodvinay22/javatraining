public class NotifcationDemo {
    public static void main(String[] args) {
        Email email = new Email();
        sendNotification(email);
        Sms sms = new Sms();
        sendNotification(sms);
    }
    public static void sendNotification(Notification email) {

    }
}