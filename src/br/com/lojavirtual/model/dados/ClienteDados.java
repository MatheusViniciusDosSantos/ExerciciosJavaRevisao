package br.com.lojavirtual.model.dados;

import java.util.List;

import br.com.lojavirtual.model.entidade.Cliente;

public class ClienteDados {
	private static List<Cliente> listaClientes;
	
	public ClienteDados() {
		Cliente jose = new Cliente();
		jose.setCpf("02345178564");
		jose.setNome("José");
		
		Cliente hugo = new Cliente();
		hugo.setCpf("12345678941");
		hugo.setNome("Hugo");
		
		Cliente clementina = new Cliente();
		clementina.setCpf("74185296341");
		clementina.setNome("Clementina");
		
		Cliente maria = new Cliente();
		maria.setCpf("12378945645");
		maria.setNome("Maria");
		
		Cliente bernardo = new Cliente();
		bernardo.setCpf("45678912365");
		bernardo.setNome("Bernardo");
		
		listaClientes.add(jose);
		listaClientes.add(hugo);
		listaClientes.add(clementina);
		listaClientes.add(maria);
		listaClientes.add(bernardo);
	}

	public static List<Cliente> retornaListaClientes() {		
		return listaClientes;
	}
	
	public static void adicionarCliente(Cliente cliente) {
		listaClientes.add(cliente);
	}
}
