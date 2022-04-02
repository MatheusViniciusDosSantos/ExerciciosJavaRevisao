package CalculoSalario;

public class Salario {
	private Double quantidadeHoras;
	private Double valorHora;
	private String porcentagemIP;
	
	public Double getQuantidadeHoras() {
		return quantidadeHoras;
	}
	
	public void setQuantidadeHoras(Double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}
	
	public Double getValorHora() {
		return valorHora;
	}
	
	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	
	public String getPorcentagemIP() {
		return porcentagemIP;
	}
	
	public void setPorcentagemIP(String porcentagemIP) {
		this.porcentagemIP = porcentagemIP;
	}
	
	public Double getSalarioBruto() {
		return quantidadeHoras * valorHora;
	}
	
	public Double getValorSindicato() {
		return (getSalarioBruto()*1.03) - getSalarioBruto();
	}
	
	public Double getValorImpostoRenda() {
		if (getSalarioBruto() <= 900.00) {
			setPorcentagemIP("0");
			return 0.0;
		} else if (getSalarioBruto() <= 1500.00) {
			setPorcentagemIP("5");
			return (getSalarioBruto() * 1.05) - getSalarioBruto();
		} else if (getSalarioBruto() <= 2500.00) {
			setPorcentagemIP("10");
			return (getSalarioBruto() * 1.1) - getSalarioBruto();
		} else {
			setPorcentagemIP("20");
			return (getSalarioBruto() * 1.2) - getSalarioBruto();
		}
	}
	
	public Double getValorFGTS() {
		return (getSalarioBruto() * 1.11) - getSalarioBruto();
	}
	
	public Double getValorINSS() {
		return (getSalarioBruto() * 1.1) - getSalarioBruto();
	}
	
	public Double getValorTotalDesconto() {
		return (getValorSindicato() + getValorImpostoRenda() + getValorFGTS() + getValorINSS());
	}
	
	public Double getSalarioLiquido() {
		return getSalarioBruto() - getValorTotalDesconto() + getValorFGTS();
	}
	
	@Override
	public String toString() {
		Double impostoDeRenda = getValorImpostoRenda();
		return "Salário Bruto: (" + valorHora + " * " + quantidadeHoras + ")" + "\t : " + getSalarioBruto() +"\r\n"
				+ "(-) IR (" + getPorcentagemIP() + "%)" + "\t : " + impostoDeRenda +"\r\n"
				+ "(-) INSS (10%) \t : " + getValorINSS() + "\r\n"
						+ "FGTS (11%) \t : " + getValorFGTS() + "\r\n"
								+ "Total de descontos \t : " + getValorTotalDesconto() + "\r\n"
										+ "Salário Liquido \t : " + getSalarioLiquido();
	}
	
}
