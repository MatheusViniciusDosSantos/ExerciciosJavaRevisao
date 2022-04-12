package br.com.lojavirtual.model.dados;

import java.util.ArrayList;
import java.util.List;

import br.com.lojavirtual.model.entidade.Produto;

public class ProdutoDados {
	
	public static List<Produto> retornaListaProdutos() {
		List<Produto> listaProdutos = new ArrayList();
		
		Produto tecladoMecanico = new Produto();
		tecladoMecanico.setDescricao("Teclado mecânico");
		tecladoMecanico.setEstoque(5.0);
		tecladoMecanico.setValorVenda(400.0);
		
		Produto mousepadGamer = new Produto();
		mousepadGamer.setDescricao("Mousepad gamer");
		mousepadGamer.setEstoque(10.0);
		mousepadGamer.setValorVenda(70.0);
		
		Produto mouseGamer = new Produto();
		mouseGamer.setDescricao("Mouse gamer");
		mouseGamer.setEstoque(8.0);
		mouseGamer.setValorVenda(180.0);
		
		Produto monitor = new Produto();
		monitor.setDescricao("Monitor 144hz");
		monitor.setEstoque(2.0);
		monitor.setValorVenda(2500.0);
		
		Produto gabinete = new Produto();
		gabinete.setDescricao("Gabinete");
		gabinete.setEstoque(12.0);
		gabinete.setValorVenda(300.0);
		
		
		
		return null;
	}

}
