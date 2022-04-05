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
		produto.setEstoque(0.);
		produto.setValorVenda(199.);
		
		Carrinho carrinho = new Carrinho();
		carrinho.setCliente(cliente);
		CarrinhoController carrinhoController = new CarrinhoController();
		carrinhoController.adicionarItem(carrinho, produto, 33., 2.);

		System.out.println(carrinhoController);
	}

}
