import java.util.Date;

public class PushNotificationFactory extends NotificationFactory {
    public PushNotificationFactory(String name, Date date, String message){
        super(name, date, message);
    }

    @Override
    public String createNotificationHeader(){
        return "Push Notification for " + this.name + " on " + this.date.toString();
    }

    @Override
    public Notification createNotification(){
        return new Push(this.message);
    }
}
