package GOF.Bridge.DataBase;

public class MySQL implements DataBase{
    public void execute(){
        System.out.println("Rodando o MySQL");
    }
}
