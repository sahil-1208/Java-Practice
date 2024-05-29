package day2;

public class Client {

    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();
           Notification notification =  notificationFactory.resolve("Sms");
           System.out.println(notification);

    }
}
