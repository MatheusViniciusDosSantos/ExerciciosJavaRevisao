package br.com.lojavirtual.model.entidade;

public class Produto {
	private Integer id;
	private Integer idAtual;
	private String descricao;
	private Double estoque;
	private Double valorVenda;
	
	public Produto() {
		gerarId();
	}
	
	private void gerarId() {
		
		if (idAtual == 0 || idAtual == null) {
			idAtual = 1;
		} else {
			idAtual += 1;
		}
		setId(idAtual);
	}	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
		
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getEstoque() {
		return estoque;
	}

	public void setEstoque(Double estoque) {
		this.estoque = estoque;
	}

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

	@Override
	public String toString() {
		return "O produto " + descricao + " tem estoque de " + estoque + " e seu  valor de venda é " + valorVenda;
	}

	
	
	

}
