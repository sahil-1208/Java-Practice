package day2;

class Sms extends Notification {

    @Override
    void send(String message) {
        System.out.println("Sms Sent");
    }
}
