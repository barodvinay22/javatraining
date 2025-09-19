package interfacedemo;

public interface Notification {// 2008
    int numberOfNotification=1;//public static final
    void sendNotification();// abstract keyword is not required
    //2009
    default void retryNotification(){
        System.out.println("Retrying notification");
    }

    static void staticMethod(){
        System.out.println("Static method");
    }
}