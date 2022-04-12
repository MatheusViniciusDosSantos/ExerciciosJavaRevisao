package br.com.lojavirtual.model.entidade;

public class CarrinhoItens {
	private Produto produto;
	private Carrinho carrinho;
	private Double quantidade;
	private Double valorUnitario;	
	
	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	@Override
	public String toString() {
		return "ItensCarrinho [produto=" + produto + ", valorUnitario=" + valorUnitario + "]";
	}
}
