package SistemaDeServicosDePagamento;

public class Debito extends Pagamento {

    @Override
    public String getNome() {
        return "Débito";
    }

    @Override
    public double getTaxa() {
        return 0.02;
    }
}
