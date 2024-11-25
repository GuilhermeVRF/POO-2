public class SMS implements Notification {
    private String message;

    public SMS(String message){
        this.message = message;
    }

    @Override
    public void notifyUser(){
        System.out.println(this.message);
    }   
}
