public class Pagamento {
    private Venda venda;
    private String status;

    public Pagamento(Venda venda){
        this.venda = venda;
        this.status = "pendente";
    }

    public void pagar(){
        System.out.println("Pagamento efetuado com sucesso! Valor: R$" + this.venda.getTotal());
        this.status = "pago";
    }
}
