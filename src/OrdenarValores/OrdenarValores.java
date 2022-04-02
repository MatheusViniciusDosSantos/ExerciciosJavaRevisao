package OrdenarValores;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class OrdenarValores {

	public static void main(String[] args) {
		try {
			String valores = JOptionPane.showInputDialog("Digite 3 valores separados por vírgula para serem colocardos em ordem crescente.");
			String[] valoresSeparados = separarValores(valores);
			List<Integer> valoresNumericos = converteParaInt(valoresSeparados);
			List<Integer> valoresOrdenados = ordenarValores(valoresNumericos);
			printarEmUmaLinha(valoresOrdenados);
		} catch (Exception e) {
			System.out.println("O seguinte erro aconteceu: " + e);
		}
		
		

	}
	
	private static List<Integer> converteParaInt(String[] valoresString) {
		List<Integer> valoresNumericos = new ArrayList();
		try {
			for (int i = 0; i < valoresString.length; i++) {
				valoresNumericos.add(Integer.parseInt(valoresString[i]));
			}
		} catch (Exception e) {
			System.out.println("Erro ao converter para int.\r\n"
					+ "Erro detectado: " + e);
		}
		return valoresNumericos;
	}
	
	private static String[] separarValores(String resultado) {
		
		return resultado.split(",", 3);
	}
	
	private static List<Integer> ordenarValores(List<Integer> valores) {
		int auxOrdenacao;
		for (int p = 0; p < valores.size() - 1; p++) {
			for (int q = 1; q < valores.size(); q++) {
				if (valores.get(p) > valores.get(q)) {
					auxOrdenacao = valores.get(p);
					valores.set(p, valores.get(q));
					valores.set(q, auxOrdenacao);
				}
			}
		}
		
		return valores;
	}
	
	private static void printarEmUmaLinha(List<Integer> valores) {
		String resultado = new String();
		for (int t = 0; t < valores.size(); t++) {
			if (t == valores.size() - 1) {
				resultado = resultado  + valores.get(t);
			} else {
				resultado = resultado  + valores.get(t) + ",";
			}
		}
		System.out.println(resultado);
	}

}
