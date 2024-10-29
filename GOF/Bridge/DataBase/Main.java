package GOF.Bridge.DataBase;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        DataBase mySQL = new MySQL();
        DataBase mySQL2 = new MySQL2();

        List<DataBase> dataBases = new ArrayList<>();
        dataBases.add(mySQL);
        dataBases.add(mySQL2);

        for(DataBase dataBase : dataBases){
            new Driver(dataBase).executeImplementation();
        }
    }
}
