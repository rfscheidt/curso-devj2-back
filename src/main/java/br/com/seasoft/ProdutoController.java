package br.com.seasoft;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {
	
	@CrossOrigin
	@GetMapping("/produtos")
	public List<Produto> produtos() {
		List<Produto> list = new ArrayList<Produto>();
		Produto p1 = new Produto("nome1", "codigo1", "tamanho1");
		Produto p2 = new Produto("nome2", "codigo2", "tamanho2");
		Produto p3 = new Produto("nome3", "codigo3", "tamanho3");
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		return list;
	}
	
	class Produto {
		private String nome;
		private String codigo;
		private String tamanho;
		public Produto(String nome, String codigo, String tamanho) {
			super();
			this.nome = nome;
			this.codigo = codigo;
			this.tamanho = tamanho;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public String getTamanho() {
			return tamanho;
		}
		public void setTamanho(String tamanho) {
			this.tamanho = tamanho;
		}
	}

}
