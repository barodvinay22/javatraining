package interfacedemo;

public class NotificationDemo {
    public static void main(String[] args) {
        Notification notification = new Sms();
        notification.sendNotification();
        System.out.println(Notification.numberOfNotification);
        notification.retryNotification();
        Notification.staticMethod();
    }
}