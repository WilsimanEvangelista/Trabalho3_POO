public class Venda {
    private Veiculo veiculo;
    private Cliente cliente;
    private double desconto;
    private Data d;
    private String chassi;
    private Vendedor vendedor;

    public Venda(Veiculo veiculo, Cliente cliente, double desconto, Data d, String chassi, Vendedor vendedor) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.desconto = desconto;
        this.d = d;
        this.chassi = chassi;
        this.vendedor = vendedor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Data getData() {
        return d;
    }

    public String getChassi() {
        return chassi;
    }

    public double getDesconto() {
        return desconto;
    }

    public double valor(){
        return this.veiculo.getValor() - this.desconto;
    }

    public void setDesconto(double desconto,Gerente gerente, String senha){
        if (gerente.validarAcesso(senha)){
            this.desconto = desconto;
        } else {
            System.out.println("Acesso negado. Desconto não alterado.");
        }
    }

    public String toString() {
        return "Veiculo: " + veiculo.toString() + "\n" +
                "Cliente: " + cliente.getNome() + " - CPF: " + cliente.getCpf() + " - " + cliente.getEmail() + "\n" +
                "Valor da venda: R$" + valor() + "\n" +
                "Data: " + d.getDia() + "/" + d.getMes() + "/" + d.getAno();
    }

}