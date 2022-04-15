package br.com.lojavirtual.view;

import java.util.List;
import java.util.Scanner;

import br.com.lojavirtual.controller.ClienteController;
import br.com.lojavirtual.model.dados.ClienteDados;
import br.com.lojavirtual.model.entidade.Cliente;

public class SelecionarCliente {
	public static Cliente retornaCliente() {
		Scanner sc = new Scanner(System.in);
		List<Cliente> clientes = ClienteDados.retornaListaClientes();
		System.out.println("Selecione o cliente: ");
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println((i+1) + " - " + clientes.get(i) + "\r\n");
		}
		System.out.println("0 - Inserir novo cliente.\r\n");
		int controlador = sc.nextInt();
		sc.close();
		if (controlador == 0) {
			return ClienteController.inserirCliente();
		} else {
			return clientes.get(controlador - 1);
		}
	}
	
	

}
