package LojaVirtual;

public class Carrinho {
	private Integer id;
	private ItensCarrinho itensCarrinho;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ItensCarrinho getItensCarrinho() {
		return itensCarrinho;
	}
	public void setItensCarrinho(ItensCarrinho itensCarrinho) {
		this.itensCarrinho = itensCarrinho;
	}
	
	
	@Override
	public String toString() {
		return "Carrinho [id=" + id + ", itensCarrinho=" + itensCarrinho + "]";
	}
}
