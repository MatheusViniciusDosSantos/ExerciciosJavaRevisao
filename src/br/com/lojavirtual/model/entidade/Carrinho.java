package br.com.lojavirtual.model.entidade;

import java.util.Date;

public class Carrinho {
	private Integer id;
	private Cliente cliente;
	private Date dataCompra = new Date();
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
		
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	@Override
	public String toString() {
		return "Carrinho [id=" + id + ", itensCarrinho=]";
	}
}
