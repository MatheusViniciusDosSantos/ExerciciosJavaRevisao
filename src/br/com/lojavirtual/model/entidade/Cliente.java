package br.com.lojavirtual.model.entidade;

public class Cliente {
	private Integer id;
	private Integer idAtual;
	private String nome;
	private String cpf;
	
	public Cliente() {
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
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente: nome=" + nome + ", cpf=" + cpf + ".";
	}
	
	

}
