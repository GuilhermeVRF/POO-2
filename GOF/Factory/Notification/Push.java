public class Push implements Notification {
    private String message;

    public Push(String message){
        this.message = message;
    }

    @Override
    public void notifyUser(){
        System.out.println(this.message);
    } 
}
