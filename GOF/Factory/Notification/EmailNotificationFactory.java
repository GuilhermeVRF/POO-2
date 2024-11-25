import java.util.Date;

public class EmailNotificationFactory extends NotificationFactory {
    public EmailNotificationFactory(String name, Date date, String message){
        super(name, date, message);
    }

    @Override
    public String createNotificationHeader(){
        return "Email Notification for " + this.name + " on " + this.date.toString();
    }

    @Override
    public Notification createNotification(){
        return new Email(this.message);
    }
}
