package LojaVirtual;

import java.util.List;
import java.util.Scanner;

import Models.Carrinho;
import Models.CarrinhoItens;
import Models.Produto;

public class UsarLojaVirtual {
//	private static int controlador;
//	private static List<Produto> listaProdutos;
//	private static List<Produto> listaProdutosCarrinho;
//	private static CarrinhoItens carrinhoItens;
//	private static Carrinho carrinho;
//
//	public static void main(String[] args) {
//		Produto alface = new Produto();
//		Produto hamburguer = new Produto();
//		Produto macarrao = new Produto();
//		
//		alface.setNome("Alface");
//		alface.setId(1);
//		alface.setValor(3.5);
//		alface.setQuantidadeEmEstoque(5);
//		
//		hamburguer.setId(2);
//		hamburguer.setNome("Haburguer");
//		hamburguer.setQuantidadeEmEstoque(0);
//		hamburguer.setValor(5.0);
//		
//		macarrao.setId(3);
//		macarrao.setNome("Macarrão");
//		macarrao.setValor(10.0);
//		macarrao.setQuantidadeEmEstoque(2);
//		
//		listaProdutos.set(0, alface);
//		listaProdutos.set(1, hamburguer);
//		listaProdutos.set(2, macarrao);
//		carrinhoItens = new CarrinhoItens();
////		carrinho.setItensCarrinho(carrinhoItens);
//		Scanner sc = new Scanner(System.in);
//		
//		
//		try {
//			while (controlador != 0) {
//				System.out.println("Digite o número correspondente para realizar uma ação na loja.\r\n"
//						+ "1 - Adicionar produtos no carrinho.\r\n"
//						+ "2 - Retirar produto do carrinho.\r\n");
//			}
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		
//
//	}
//	
//	public static void adicionarProdutosCarrinho() {
//		int produtoEscolhido = 0;
//		System.out.println("Será moestrada uma lista de produtos em seguida digite o número do produto para adicionalo ao carrinho\r\n");
//		do {
//			System.out.println("1 - " + listaProdutos.get(0).toString() + "\r\n" 
//					+ "2 - " + listaProdutos.get(1).toString() + "\r\n" 
//					+ "3 - " + listaProdutos.get(2).toString() + "\r\n"
//					+ "0 - Não adicionar mais produtos" );
//			Scanner sc = new Scanner(System.in);
//			produtoEscolhido = sc.nextInt();
//			if (produtoEscolhido == 1) {
//				if (listaProdutos.get(0).getQuantidadeEmEstoque() > 0) {			
//					listaProdutosCarrinho.add(listaProdutos.get(0));
//					listaProdutos.get(0).setQuantidadeEmEstoque(listaProdutos.get(0).getQuantidadeEmEstoque() - 1);;
////					carrinhoItens.setProdutos(listaProdutosCarrinho);
//					sc.close();
//				} else {
//					System.out.println("Este produto está com falta de estoque, por favor escolha outro.");
//				}
//			} else if (produtoEscolhido == 2) {
//				if (listaProdutos.get(1).getQuantidadeEmEstoque() > 0) {
//					listaProdutosCarrinho.add(listaProdutos.get(1));
//					listaProdutos.get(1).setQuantidadeEmEstoque(listaProdutos.get(1).getQuantidadeEmEstoque() - 1);
////					carrinhoItens.setProdutos(listaProdutosCarrinho);
//					sc.close();
//				}
//			} else if (produtoEscolhido == 3) {
//				if (listaProdutos.get(2).getQuantidadeEmEstoque() > 0) {
//					listaProdutosCarrinho.add(listaProdutos.get(2));
//					listaProdutos.get(2).setQuantidadeEmEstoque(listaProdutos.get(2).getQuantidadeEmEstoque() - 1);
////					carrinhoItens.setProdutos(listaProdutosCarrinho);
//					sc.close();
//				}
//			} else if (produtoEscolhido == 0) {
//				System.out.println();
//				sc.close();
//			}
//		} while (produtoEscolhido != 0);
//	}
//	public static void removerProdutosCarrinho() {
//		
//	}

}
