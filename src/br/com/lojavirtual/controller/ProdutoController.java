package br.com.lojavirtual.controller;

import java.util.Scanner;

import br.com.lojavirtual.model.dados.ClienteDados;
import br.com.lojavirtual.model.dados.ProdutoDados;
import br.com.lojavirtual.model.entidade.Cliente;
import br.com.lojavirtual.model.entidade.Produto;

public class ProdutoController {

	public static void inserirProduto() {
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		System.out.println("Digite a descrição do produto: ");
		produto.setDescricao(sc.nextLine());
		System.out.println("Digite a quantidade em estoque do produto: ");
		produto.setEstoque(sc.nextDouble());
		System.out.println("Digite o valor para vendo do produto: ");
		produto.setValorVenda(sc.nextDouble());
		sc.close();
		ProdutoDados.adicionarProduto(produto);
		System.out.println("O produto foi inserido.");
	}
}
