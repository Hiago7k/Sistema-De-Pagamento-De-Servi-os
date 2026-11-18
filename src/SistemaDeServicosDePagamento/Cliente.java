package SistemaDeServicosDePagamento;

public class Cliente {
    private static int idPk;
    private int id;
    private String nome;
    private String cpf;
    private double saldo;

    public Cliente(String nome, String cpf, double saldo) {
        this.id = ++idPk;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 500.0;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void dadosCliente() {
        System.out.printf("%d | %s | %s | R$ %.2f%n",
                this.getId(),
                this.getNome(),
                this.getCpf(),
                this.getSaldo()
        );
    }
}
