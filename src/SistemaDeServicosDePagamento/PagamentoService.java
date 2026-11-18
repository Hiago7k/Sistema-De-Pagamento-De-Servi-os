package SistemaDeServicosDePagamento;

public class PagamentoService {

    public static void pagar(Pagamento metodo, int quantidadeParcelas){
        double taxa = metodo.getTaxa();

        if (metodo instanceof  Credito){
            if (quantidadeParcelas > 2){
               taxa += 0.02;
            }
        }



    }

}
