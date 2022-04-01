package InverterValores;

import javax.swing.JOptionPane;

public class InverterValores {

	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Digite números separados por vírgula para inverter sua ordem.");
		String valores[] = entrada.split(",");
		String resultado = new String();
		for (int i = valores.length - 1; i >=0; i--) {
			if (i == 0) {
				resultado = resultado + valores[i];
			} else {
				resultado = resultado + valores[i] + ",";
			}
		}
		System.out.println(resultado);
	}

}
