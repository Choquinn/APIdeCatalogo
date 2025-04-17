package com.exemplo.APIdeCatalogo.Controller;

import com.exemplo.APIdeCatalogo.model.Produto;
import com.exemplo.APIdeCatalogo.Service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	private final ProdutoService service;
	
	public ProdutoController(ProdutoService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Produto> listar() {
		return service.listarTodos();
	}
	
	@PostMapping
	public Produto criar(@RequestBody Produto produto) {
		return service.salvar(produto);
	}
	
	@GetMapping("/{id}")
	public Produto buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
	
	@PutMapping("/{id}")
	public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto) {
		return service.atualizar(id, produto);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		service.deletar(id);
	}
}
