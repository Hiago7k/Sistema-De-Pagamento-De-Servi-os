package SistemaDeServicosDePagamento;

public class Pix extends Pagamento {

    @Override
    public double getTaxa() {
        return 0.01;
    }

    @Override
    public String getNome() {
        return "Pix";
    }
}
