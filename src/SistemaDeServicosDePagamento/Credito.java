package SistemaDeServicosDePagamento;

public class Credito extends  Pagamento{

    @Override
    public String getNome() {
        return "Crédito";
    }

    @Override
    public double getTaxa() {
        return 0.05;
    }
}
