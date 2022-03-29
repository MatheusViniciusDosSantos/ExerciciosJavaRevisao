package FaseDaVida;

import javax.swing.JOptionPane;

public class FaseDaVida {
	public static void definirFasedaVida() {
		try {
			int idade;
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade para saber a fase da vida correspondente: "));
			if (idade > 0 && idade < 12) {
				System.out.println("A idade correspode a fase da vida: Criança.");
			} else if (idade >= 12 && idade < 18) {
				System.out.println("A idade correspode a fase da vida: Adolescente.");
			} else if (idade >= 18 && idade < 60) {
				System.out.println("A idade correspode a fase da vida: Adulto.");
			} else if (idade >= 60 && idade < 115) {
				System.out.println("A idade correspode a fase da vida: Idoso.");
			} else {
				System.out.println("A idade correspondente é inválida.");
			}
		} catch (Exception e) {
			System.out.println("É necessário digitar um número para saber a fase da vida.");
		}		
	}
}
