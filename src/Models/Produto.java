package Models;

import java.util.List;

public class Produto {
	private Integer id;
	private String descricao;
	private Double estoque;
	private Double valorVenda;
	
	
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

	
	
	

}
