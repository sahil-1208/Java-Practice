package day2;

class NotificationFactory {

    public Notification resolve(String type) {
        Notification notification = null;

        if (type == "Sms") {

            notification = new Sms();
        } else if (type == "Email") {
            notification = new Email();
        } else {
            notification = new PushNotification();
        }
        return notification;
    }
}
