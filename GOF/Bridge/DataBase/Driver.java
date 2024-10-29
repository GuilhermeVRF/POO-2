package GOF.Bridge.DataBase;

public class Driver {
    private DataBase abstrato;
    public Driver(DataBase abstrato){
        this.abstrato = abstrato;
    }

    public void executeImplementation(){
        this.abstrato.execute();
    }
}
