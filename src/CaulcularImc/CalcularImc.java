package CaulcularImc;

import javax.swing.JOptionPane;

public class CalcularImc {

	public static void main(String[] args) {
		try {
			char sexo = JOptionPane.showInputDialog("Digite seu sexo(f para feminino e m para masculino).").toLowerCase().charAt(0);
			Double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso."));
			Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura."));
			
			System.out.println(calcularImc(sexo, peso, altura));
			
		} catch (Exception e) {
			System.out.println("Erro encontrado: " + e);
		}
	}
	
	public static String calcularImc(char sexo, Double peso, Double altura) {
		Double imc = peso/(altura*altura);
		String condicaoImc = new String();
		if (sexo == 'f') {
			if (imc < 19.1) {
				condicaoImc = "Abaixo do peso.";
			} else if (imc < 25.8) {
				condicaoImc = "Peso normal";
			} else if (imc < 27.3) {
				condicaoImc = "Marginalmente acima do peso";
			} else if (imc < 32.3) {
				condicaoImc = "Acima do peso ideal";
			} else {
				condicaoImc = "Obeso";
			}
		} else if (sexo == 'm') {
			if (imc < 20.7) {
				condicaoImc = "Abaixo do peso.";
			} else if (imc < 26.4) {
				condicaoImc = "Peso normal";
			} else if (imc < 27.8) {
				condicaoImc = "Marginalmente acima do peso";
			} else if (imc < 31.1) {
				condicaoImc = "Acima do peso ideal";
			} else {
				condicaoImc = "Obeso";
			}
		} else {
			condicaoImc = "Não foi digitado um sexo válido.";
		}
		return condicaoImc;
	}

}
