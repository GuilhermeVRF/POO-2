import java.util.Date;

public class SMSNotificationFactory extends NotificationFactory {
    public SMSNotificationFactory(String name, Date date, String message){
        super(name, date, message);
    }

    @Override
    public String createNotificationHeader(){
        return "SMS Notification for " + this.name + " on " + this.date.toString();
    }

    @Override
    public Notification createNotification(){
        return new SMS(this.message);
    }
}
