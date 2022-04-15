package br.com.lojavirtual.model.dados;

import java.util.List;

import br.com.lojavirtual.model.entidade.Carrinho;

public class CarrinhoDados {
	
	private static List<Carrinho> listaCarrinhos;
	
	public CarrinhoDados( ) {
		
	}

	public static void adicionarCarrinho(Carrinho carrinho) {
		listaCarrinhos.add(carrinho);
	}
	
	public static List<Carrinho> retornaListaCarrinhos() {
		return listaCarrinhos;
	}
}
