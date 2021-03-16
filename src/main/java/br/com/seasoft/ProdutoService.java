package br.com.seasoft;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
	
	private static List<Produto> list = new ArrayList<Produto>();
	
	public static List<Produto> getList() {
		return list;
	}
	
	public static void add(Produto produto) {
		list.add(produto);
	}

}
