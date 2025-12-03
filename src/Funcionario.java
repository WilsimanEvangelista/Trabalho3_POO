public abstract class Funcionario extends Pessoa {
    protected double salario;

    public Funcionario(String nome, String cpf, int dia, int mes, int ano, double salario) {
        super(nome, cpf, dia, mes, ano);
        this.salario = salario;
    }

    public double getSalarioBase() {
        return salario;
    }

    public abstract double getSalario(int mes, int ano);
    public String toString() {
        return nome + " - CPF: " + cpf + " - Salário base: R$" + salario;
    }
}