import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        NotificationFactory notificationFactory = null;
        Notification notification= null;
        Scanner scanner = new Scanner(System.in);

        String notificationType = scanner.nextLine();

        switch (notificationType) {
            case "Email":
                notificationFactory = new EmailNotificationFactory("Guilherme", new Date(),"Hello World"); 
            break;
            case "SMS":
                notificationFactory = new SMSNotificationFactory("Guilherme", new Date(),"Hello World");
            break;
            case "Push":
                notificationFactory = new PushNotificationFactory("Guilherme", new Date(),"Hello World");
            break;
            default:
                throw new IllegalArgumentException("Tipo de notificação inválido.");
        }

        notification = notificationFactory.createNotification();
        System.out.println(notificationFactory.createNotificationHeader());
        notification.notifyUser();
    }   
}
