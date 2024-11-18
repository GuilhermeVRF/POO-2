public class Main {
    public static void main(String[] args) {
        ConexaoSingleton conexao = ConexaoSingleton.getConexao();
        conexao = ConexaoSingleton.getConexao();
    }   
}
