package LojaVirtual;

import java.util.List;

public class ItensCarrinho {
	private List<Produto> produtos;
	private Double valorCompra;
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public Double getValorCompra() {
		return valorCompra;
	}
	
	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	
	@Override
	public String toString() {
		return "ItensCarrinho [produtos=" + produtos + ", valorCompra=" + valorCompra + "]";
	}
}
