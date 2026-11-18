package SistemaDeServicosDePagamento;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int opcao = -1;

        System.out.printf("***** Cliente x Freelancer *****%n");

        do {
            System.out.printf("1 - Para cadastrar Clientes%n");
            System.out.printf("2 - Para exibir Clientes cadastrados%n");
            System.out.printf("3 - Para cadastrar Prestadores%n");
            System.out.printf("4 - Para exibir Prestadores%n");
            System.out.printf("Digite a opção%n");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.printf("Exibindo clientes%n");
                    break;
                case 2:
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
