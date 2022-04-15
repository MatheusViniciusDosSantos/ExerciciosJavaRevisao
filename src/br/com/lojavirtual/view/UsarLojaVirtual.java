package br.com.lojavirtual.view;

import java.util.List;
import java.util.Scanner;

import br.com.lojavirtual.controller.CarrinhoController;
import br.com.lojavirtual.controller.ClienteController;
import br.com.lojavirtual.controller.ProdutoController;
import br.com.lojavirtual.model.dados.ProdutoDados;
import br.com.lojavirtual.model.entidade.Carrinho;
import br.com.lojavirtual.model.entidade.CarrinhoItens;
import br.com.lojavirtual.model.entidade.Cliente;
import br.com.lojavirtual.model.entidade.Produto;


public class UsarLojaVirtual {
	private static int controlador;
	private static List<Produto> listaProdutos;
	private static CarrinhoItens carrinhoItens;
	private static Carrinho carrinho;
	private static Cliente cliente;

	public static void main(String[] args) {
		listaProdutos = ProdutoDados.retornaListaProdutos();
		carrinhoItens = new CarrinhoItens();
		cliente = SelecionarCliente.retornaCliente();
		Scanner sc = new Scanner(System.in);
		
		
		try {
			while (controlador != 0) {
				System.out.println("Digite o número correspondente para realizar uma ação na loja.\r\n"
						+ "1 - Inserir produtos.\r\n"
						+ "2 - Inserir carrinho.\r\n"
						+ "3 - Inserir cliente.\r\n"
						+ "0 - Sair da loja.\r\n");
				if (controlador == 0) {
					System.out.println("Saindo da loja.");
				} else if (controlador == 1) {
					ProdutoController.inserirProduto();
				} else if (controlador == 2) {
					CarrinhoController.inserirCarrinho();
				} else if (controlador == 3) {
					ClienteController.inserirCliente();
				} else {
					System.out.println("Você digitou um valor incompatível.\r\nTente escrever: 1");
				}
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}
	
	public static void adicionarProdutosCarrinho() {
		int produtoEscolhido = 0;
		System.out.println("Será moestrada uma lista de produtos em seguida digite o número do produto para adicionalo ao carrinho\r\n");
		do {
			for (int i = 0; i < listaProdutos.size(); i++) {
				System.out.println((i + 1) + " - " + listaProdutos.get(i).toString() + "\r\n");
			}
			System.out.println("0 - Não adicionar mais produtos");
			Scanner sc = new Scanner(System.in);
			produtoEscolhido = sc.nextInt();
			if (produtoEscolhido > 0) {
				if (listaProdutos.get(produtoEscolhido).getEstoque() > 0) {	
					listaProdutos.get(produtoEscolhido).setEstoque(listaProdutos.get(produtoEscolhido).getEstoque() - 1);;
					carrinhoItens.setProduto(listaProdutos.get(produtoEscolhido));
					sc.close();
				} else {
					System.out.println("Este produto está com falta de estoque, por favor escolha outro.");
				}
			} else if (produtoEscolhido == 0) {
				
				System.out.println("Produtos");
				sc.close();
			}
		} while (produtoEscolhido != 0);
	}
	public static void removerProdutosCarrinho() {
		
	}

}
