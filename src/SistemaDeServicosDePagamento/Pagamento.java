package SistemaDeServicosDePagamento;

public class Pagamento {
    private String nome = "Generico";
    private double taxa = 0.0;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public String getNome() {
        return nome;
    }

    public double getTaxa() {
        return taxa;
    }

    public void dadosPagamento() {
        System.out.printf("%s | Taxa R$ %.2f%n",
                this.getNome(),
                this.getTaxa()
        );
    }
}
