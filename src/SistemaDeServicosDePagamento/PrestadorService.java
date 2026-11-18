package SistemaDeServicosDePagamento;

import java.util.LinkedList;

public class PrestadorService {
    private static LinkedList<Prestador> prestadores = new LinkedList<>();

    public static Prestador cadastrarPrestador(String nome, String cnpj) {
        if (nome == null || nome.isEmpty()) {
            System.out.printf("Nome inválido!%n");
            return null;
        }

        if (cnpj == null || cnpj.isEmpty()) {
            System.out.printf("Cnpj invalido!%n");
            return null;
        }

        Prestador prestador = new Prestador(nome, cnpj);
        prestadores.add(prestador);
        System.out.printf("Prestador cadastrado no sistema com sucesso!%n");

        return prestador;
    }

    public static void exibirPrestadores() {
        if (prestadores.isEmpty()) {
            System.out.printf("Nenhum prestador cadastrado!%n");
            return;
        }

        for (Prestador prestador : prestadores) {
            prestador.dadosPrestador();
        }
    }
}
