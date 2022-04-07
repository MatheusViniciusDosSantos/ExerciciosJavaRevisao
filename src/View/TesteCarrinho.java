package View;

import Controller.CarrinhoController;
import Models.Carrinho;
import Models.Cliente;
import Models.Produto;

public class TesteCarrinho {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setCpf("02345178564");
		cliente.setNome("Cliente 1");
		
		Produto produto = new Produto();
		produto.setDescricao("Teclado mecânico");
		produto.setEstoque(5.0);
		produto.setValorVenda(400.0);
		
		Carrinho carrinho = new Carrinho();
		carrinho.setCliente(cliente);
		CarrinhoController carrinhoController = new CarrinhoController();
		carrinhoController.adicionarItem(carrinho, produto, produto.getValorVenda(), 1.);
		
		
		Cliente cliente2 = new Cliente();
		cliente2.setCpf("12345678941");
		cliente2.setNome("Cliente 2");
		
		Produto produto2 = new Produto();
		produto2.setDescricao("Mousepad gamer");
		produto2.setEstoque(10.0);
		produto2.setValorVenda(70.0);
		
		Carrinho carrinho2 = new Carrinho();
		carrinho2.setCliente(cliente2);
		carrinhoController.adicionarItem(carrinho2, produto2, produto2.getValorVenda(), 2.);
		
		Cliente cliente3 = new Cliente();
		cliente3.setCpf("74185296341");
		cliente3.setNome("Cliente 3");
		
		Produto produto3 = new Produto();
		produto3.setDescricao("Mouse gamer");
		produto3.setEstoque(8.0);
		produto3.setValorVenda(180.0);
		
		Carrinho carrinho3 = new Carrinho();
		carrinho3.setCliente(cliente3);
		carrinhoController.adicionarItem(carrinho3, produto3, produto3.getValorVenda(), 1.);
		
		Cliente cliente4 = new Cliente();
		cliente4.setCpf("12378945645");
		cliente4.setNome("Cliente 4");
		
		Produto monitor = new Produto();
		monitor.setDescricao("Mouse gamer");
		monitor.setEstoque(2.0);
		monitor.setValorVenda(2500.0);
		
		Carrinho carrinho4 = new Carrinho();
		carrinho4.setCliente(cliente4);
		carrinhoController.adicionarItem(carrinho4, monitor, monitor.getValorVenda(), 1.);
		
		Cliente cliente5 = new Cliente();
		cliente5.setCpf("45678912365");
		cliente5.setNome("Cliente 5");
		
		Produto gabinete = new Produto();
		gabinete.setDescricao("Gabinete");
		gabinete.setEstoque(12.0);
		gabinete.setValorVenda(300.0);
		
		Carrinho carrinho5 = new Carrinho();
		carrinho5.setCliente(cliente5);
		carrinhoController.adicionarItem(carrinho5, gabinete, gabinete.getValorVenda(), 3.);

		System.out.println(carrinhoController);
	}

}
