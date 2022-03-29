import javax.swing.JOptionPane;

import FaseDaVida.FaseDaVida;

public class RevisaoJava {

	public static void main(String[] args) {
		String selecionarAcao = new String();
		selecionarAcao = JOptionPane.showInputDialog("Escolha uma ação a ser executada: \r\n1 - Descobrir a fase da vida com base na idade.\r\n");
		if (selecionarAcao != null) {
			if (selecionarAcao.equals("1")) {
				FaseDaVida.definirFasedaVida();
			} else {
				System.out.println("Não foi identificada nenhuma ação para o valor digitado.\r\nDica: digite \"1\"");
			}
		} else {
			System.out.println("Fechando programa.");
		}
		
	}

}
