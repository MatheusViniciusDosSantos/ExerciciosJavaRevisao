import javax.swing.JOptionPane;

import FaseDaVida.FaseDaVida;

public class RevisaoJava {

	public static void main(String[] args) {
		String selecionarAcao = new String();
		selecionarAcao = JOptionPane.showInputDialog("Escolha uma a��o a ser executada: \r\n1 - Descobrir a fase da vida com base na idade.\r\n"
				+ "2 - Inverter a ordem dor valores digitados.\r\n"
				+ "3 - Apresentar 3 valores em ordem crescente.\r\n"
				+ "4 - \r\n"
				+ "5 - \r\n"
				+ "6 - \r\n");
		if (selecionarAcao != null) {
			if (selecionarAcao.equals("1")) {
				FaseDaVida.definirFasedaVida();
			} else {
				System.out.println("N�o foi identificada nenhuma a��o para o valor digitado.\r\nDica: digite \"1\"");
			}
		} else {
			System.out.println("Fechando programa.");
		}
		
	}

}
