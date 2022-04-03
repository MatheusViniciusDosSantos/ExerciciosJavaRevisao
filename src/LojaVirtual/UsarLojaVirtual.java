package LojaVirtual;

public class UsarLojaVirtual {

	public static void main(String[] args) {
		Produto alface = new Produto();
		Produto hamburguer = new Produto();
		Produto macarrao = new Produto();
		
		alface.setNome("Alface");
		alface.setId(1);
		alface.setValor(3.5);
		alface.setQuantidadeEmEstoque(5);
		
		hamburguer.setId(2);
		hamburguer.setNome("Haburguer");
		hamburguer.setQuantidadeEmEstoque(0);
		hamburguer.setValor(5.0);
		

	}
	
	public static void adicionarProdutosCarrinho() {
		
	}
	public static void removerProdutosCarrinho() {
		
	}

}
