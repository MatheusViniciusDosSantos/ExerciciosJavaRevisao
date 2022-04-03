package LojaVirtual;

public class Produto {
	private Integer id;
	private String nome;
	private Double valor;
	private Integer quantidadeEmEstoque;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Integer getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	@Override
	public String toString() {
		return "O produto " + nome + " custa " + valor + "reais e sua quantidade em estoque é: "
				+ quantidadeEmEstoque;
	}
	
	
	

}
