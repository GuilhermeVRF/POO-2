import java.util.Date;

public abstract class NotificationFactory {
    protected String name;
    protected Date date;
    protected String message;

    public NotificationFactory(String name, Date date, String message){
        this.name = name;
        this.date = date;
        this.message = message;
    }

    public String createNotificationHeader(){
        return "Notification for " + name + " on " + date.toString();
    }

    public abstract Notification createNotification();
}
