package SistemaDeServicosDePagamento;

public class Prestador {
    private static int idPk;
    private int id;
    private String nome;
    private String cnpj;
    private double caixa;
    private int quantidadePagos;

    public Prestador(String nome, String cnpj) {
        this.id = ++idPk;
        this.nome = nome;
        this.cnpj = cnpj;
        this.caixa = 0.;
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

    public void dadosPrestador() {
        System.out.printf("%d | %s | CNPJ %s | Caixa R$ %.2f | Vendas %d%n",
                this.getId(),
                this.getNome(),
                this.getCnpj(),
                this.getCaixa(),
                this.quantidadePagos
        );
    }
}
