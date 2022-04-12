package br.com.lojavirtual.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.lojavirtual.model.entidade.Carrinho;
import br.com.lojavirtual.model.entidade.CarrinhoItens;
import br.com.lojavirtual.model.entidade.Produto;

public class CarrinhoController {
	private List<CarrinhoItens> carrinhoItens = new ArrayList();
	
	public void adicionarItem(Carrinho carrinho, Produto produto, Double valorUnitario, Double quantidade) {
		CarrinhoItens carrinhoItem = new CarrinhoItens();
		carrinhoItem.setProduto(produto);
		carrinhoItem.setCarrinho(carrinho);
		carrinhoItem.setValorUnitario(valorUnitario);
		carrinhoItem.setQuantidade(quantidade);
		carrinhoItens.add(carrinhoItem);
	}
	
	public void removerItem() {
		
	}
	
	public List<CarrinhoItens> retornaListaProdutosCarrinho() {
		return carrinhoItens;
	}

	@Override
	public String toString() {
		//Descrição de cada produto
		//Quantidade adicionada
		//Valor unitário
		//Valor total
		//Mostrar cliente
		String retorno = new String();
		for (CarrinhoItens carrinhoItem : carrinhoItens) {
			retorno = retorno + ("Produto: " + carrinhoItem.getProduto().getDescricao() + ", quantidade: "
					+ carrinhoItem.getQuantidade() + ", valor unitário: " + carrinhoItem.getValorUnitario()
					+ ", valor total: " + carrinhoItem.getQuantidade() * carrinhoItem.getValorUnitario() 
					+ ", cliente: " + carrinhoItem.getCarrinho().getCliente().getNome() + ".\r\n");
		}
		return "Lista de produtos: \r\n" + retorno;
	}
	
	

}
