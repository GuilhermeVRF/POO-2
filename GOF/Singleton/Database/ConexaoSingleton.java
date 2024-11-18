public class ConexaoSingleton {
    private static ConexaoSingleton unicaInstancia = null;
    private ConexaoSingleton(){}

    public static ConexaoSingleton getConexao(){
        System.out.print("Criando uma instância: " + (unicaInstancia == null? true : false));
        if(unicaInstancia == null) unicaInstancia = new ConexaoSingleton();
        return unicaInstancia;
    }
}
