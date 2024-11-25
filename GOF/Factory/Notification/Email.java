public class Email implements Notification {
    private String message;

    public Email(String message){
        this.message = message;
    }

    @Override
    public void notifyUser(){
        System.out.println(this.message);
    }
}
