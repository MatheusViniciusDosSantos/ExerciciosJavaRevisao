package br.com.lojavirtual.controller;

import java.util.Scanner;

import br.com.lojavirtual.model.dados.ClienteDados;
import br.com.lojavirtual.model.entidade.Cliente;

public class ClienteController {
	
	public static Cliente inserirCliente() {
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		System.out.println("Digite o nome do cliente: ");
		cliente.setNome(sc.nextLine());
		System.out.println("Digite o cpf do cliente: ");
		cliente.setCpf(sc.nextLine());
		sc.close();
		ClienteDados.adicionarCliente(cliente);
		return cliente;
	}

}
