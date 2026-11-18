package SistemaDeServicosDePagamento;

public class Prestador {
    private static int idPk;
    private int id;
    private String nome;
    private String cnpj;
    private double caixa;
    private int quantidadePagos;
    private double precoServico;

    public Prestador(String nome, String cnpj, double precoServico) {
        this.id = ++idPk;
        this.nome = nome;
        this.cnpj = cnpj;
        this.caixa = 0.;
        this.precoServico = precoServico;
    }

    public void receberPagamento(double valor){
        this.caixa += valor;
        quantidadePagos++;
    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public double getCaixa() {
        return caixa;
    }

    public int getQuantidadePagos() {
        return quantidadePagos;
    }


    public double getPrecoServico() {
        return precoServico;
    }

    public void dadosPrestador() {
        System.out.printf("%d | %s | CNPJ %s | Caixa R$ %.2f | Valor Serviço R$ %.2f | Vendas %d%n",
                this.getId(),
                this.getNome(),
                this.getCnpj(),
                this.getCaixa(),
                this.precoServico,
                this.quantidadePagos
        );
    }
}
