package SistemaDeServicosDePagamento;

public class PagamentoService {

    public static void pagar(Cliente cliente, Prestador prestador, Pagamento metodo, int quantidadeParcelas, double valorTotal) {
        double taxa = 0;

        if (metodo instanceof Credito) {
            if (quantidadeParcelas > 2) {
                taxa += metodo.getTaxa() + 0.02;
            }
        }

        double valorPagoPeloCliente = valorTotal + taxa;
        double valorRecebidoPeloPrestador = valorTotal -= valorTotal * metodo.getTaxa();

        cliente.descontarSaldo(valorPagoPeloCliente);
        prestador.receberPagamento(valorRecebidoPeloPrestador);
        System.out.printf("Pagamento realizado com sucesso!%n");
    }

}
