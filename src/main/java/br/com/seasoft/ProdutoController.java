package br.com.seasoft;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {
	
	@CrossOrigin
	@PostMapping("/produtos")
	public void save(@RequestBody Produto produto) {
		System.out.println(produto);
		ProdutoService.add(produto);
	}
	
	@CrossOrigin
	@GetMapping("/produtos")
	public List<Produto> list() {
		System.out.println(ProdutoService.getList());
		return ProdutoService.getList();
	}
	
}
