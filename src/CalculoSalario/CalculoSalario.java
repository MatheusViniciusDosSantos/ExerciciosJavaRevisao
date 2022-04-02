package CalculoSalario;

import javax.swing.JOptionPane;

public class CalculoSalario {

	public static void main(String[] args) {
		try {
			Double desconto;
			Double quantidadeHoras = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas no mês"));
			Double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada"));
			Salario salario = new Salario();
			salario.setQuantidadeHoras(quantidadeHoras);
			salario.setValorHora(valorHora);
			
			
			System.out.println(salario.toString());
		} catch (Exception e) {
			System.out.println("Erro encontrado: " + e);
		}
	}
}
