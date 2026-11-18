package SistemaDeServicosDePagamento;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int opcao = -1;

        Cliente clienteAtual = ClienteService.cadastrarCliente("Hiago Rian", "923.123.234-14");
        ClienteService.cadastrarCliente("Joao Bola", "123.456.789-11");
        ClienteService.cadastrarCliente("Cara  Foia", "633.236.819-23");
        PrestadorService.cadastrarPrestador("Group mark", "52-123.235.123-77", 100);
        PrestadorService.cadastrarPrestador("Reunidas", "23-132.234.151-11", 120);
        PrestadorService.cadastrarPrestador("Jose Farias", "63-194.834.496-60", 60);


        System.out.printf("***** Cliente x Freelancer *****%n");

        do {
            System.out.printf("Em atendimento%n");
            clienteAtual.dadosCliente();
            System.out.printf("----------------------------------------%n");
            System.out.printf("1 -  cadastrar Clientes%n");
            System.out.printf("2 -  exibir Clientes cadastrados%n");
            System.out.printf("3 -  cadastrar Prestadores%n");
            System.out.printf("4 -  exibir Prestadores%n");
            System.out.printf("5 -  Contratar um Serviço %n");
            System.out.printf("0 -  Sair %n");
            System.out.printf("Digite a opção%n");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.printf("Digite o nome do Cliente %n");
                    String nome = teclado.nextLine();
                    System.out.printf("Digite o Cpf do Cliente! %n");
                    String cpf = teclado.nextLine();
                    ClienteService.cadastrarCliente(nome, cpf);
                    break;

                case 2:
                    System.out.printf("Exibindo clientes do sistema%n");
                    ClienteService.listarClientes();
                    break;
                case 3:
                    System.out.printf("Digite o nome do Prestador de Serviço%n");
                    String nomePrestador = teclado.nextLine();

                    System.out.printf("Digite o CNPJ do Prestador de Serviço%n");
                    String cnpj = teclado.nextLine();


                    System.out.printf("Digite o preço do serviço%n");
                    double precoServico = teclado.nextDouble();

                    PrestadorService.cadastrarPrestador(nomePrestador, cnpj, precoServico);
                    break;
                case 4:
                    System.out.printf("Exibindo Prestadores de Serviços%n");
                    PrestadorService.exibirPrestadores();
                    break;
                case 5:
                    System.out.printf("Digite o ID do Prestador que deseja!%n");
                    int id = teclado.nextInt();

                    if (PrestadorService.buscarPrestadorPorId(id) == null) {
                        continue;
                    }

                    Prestador prestadorAtual = PrestadorService.buscarPrestadorPorId(id);
                    prestadorAtual.dadosPrestador();

                    // Logica pagamento
                    System.out.printf("Como deseja efetuar o pagamento?%n");
                    System.out.printf("1 - PIX %n");
                    System.out.printf("2 - Débito %n");
                    System.out.printf("3 - Crédito %n");
                    int metodoPagamento = teclado.nextInt();
                    teclado.nextLine();
                    int qtdParcelas = 0;
                    Pagamento metodo;

                    if (metodoPagamento == 1) {
                        metodo = new Pix();
                    } else if (metodoPagamento == 2) {
                        metodo = new Debito();
                    } else if (metodoPagamento == 3) {
                        System.out.printf("Digite a quantidade de parcelas 1 a 3 %n");
                        qtdParcelas = teclado.nextInt();
                        teclado.nextLine();

                        if (qtdParcelas > 3 || qtdParcelas < 1) {
                            System.out.printf("Numeros de parcelas invalido!%n");
                            continue;
                        }

                        metodo = new Credito();
                    } else {
                        System.out.printf("Método de pagamento inválido!%n");
                        continue;
                    }

                    double valorTotal = prestadorAtual.getPrecoServico() + prestadorAtual.getPrecoServico()  * metodo.getTaxa();

                    if (!clienteAtual.verificarSaldo(valorTotal)) {
                        System.out.printf("saldo insuficiente%n");
                        continue;
                    }

                    PagamentoService.pagar(clienteAtual,prestadorAtual, metodo, qtdParcelas, valorTotal);
                    break;
                default:
                    System.out.printf("Opção invalida!%n");
                    break;
            }

        } while (opcao != 0);

        System.out.printf("Volte logo..%n");

    }
}
