package InverterValores;

import javax.swing.JOptionPane;

public class InverterValores {

	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Digite números separados por vírgula para inverter sua ordem.");
		String valores[] = separarValores(entrada);
		String resultado = inverterValores(valores);
		
		print(resultado);
	}
	
	private static String[] separarValores(String entrada) {
		
		return entrada.split(",");
	}
	
	private static String inverterValores(String[] valores) {
		String resultado = new String();
		for (int i = valores.length - 1; i >=0; i--) {
			if (i == 0) {
				resultado = resultado + valores[i];
			} else {
				resultado = resultado + valores[i] + ",";
			}
		}
		return resultado;
	}
	
	private static void print(Object valor) {
		System.out.println(valor);
	}

}
