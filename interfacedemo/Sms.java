package interfacedemo;

public class Sms implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sending notification via SMS");
    }
}