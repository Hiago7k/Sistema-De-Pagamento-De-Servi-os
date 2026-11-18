package SistemaDeServicosDePagamento;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int opcao = -1;

        System.out.printf("***** Cliente x Freelancer *****%n");

        do {
            System.out.printf("----------------------------------------%n");
            System.out.printf("1 - Para cadastrar Clientes%n");
            System.out.printf("2 - Para exibir Clientes cadastrados%n");
            System.out.printf("3 - Para cadastrar Prestadores%n");
            System.out.printf("4 - Para exibir Prestadores%n");
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
                    break;
                case 4:
                    break;
                default:
                    System.out.printf("Opção invalida!%n");
                    break;
            }

        } while (opcao != 0);

        System.out.printf("Volte logo..%n");

    }
}
