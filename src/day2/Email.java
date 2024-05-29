package day2;

class Email extends Notification {

    @Override
    void send(String message) {
        System.out.println("Email Sent");
    }
}