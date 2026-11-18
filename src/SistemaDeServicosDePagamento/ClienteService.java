package SistemaDeServicosDePagamento;

import java.util.LinkedList;

public class ClienteService {
    private static LinkedList<Cliente> clientes = new LinkedList<>();

    public static Cliente cadastrarCliente(String nome, String cpf) {
        if (nome == null || nome.isEmpty()) {
            System.out.printf("Nome do cliente inválido!%n");
            return null;
        }

        if (cpf == null || cpf.isEmpty()) {
            System.out.printf("Cpf invalido!%n");
            return null;
        }

        System.out.printf("Cliente cadastrado no sistema!%n");
        Cliente cliente = new Cliente(nome, cpf);
        clientes.add(cliente);
        return cliente;
    }

    public static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.printf("Nenhum cliente cadastrado no sistema!%n");
            return;
        }

        for (Cliente cliente : clientes) {
            cliente.dadosCliente();
        }
    }
}
