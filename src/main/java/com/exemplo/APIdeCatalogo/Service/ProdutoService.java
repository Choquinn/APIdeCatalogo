package com.exemplo.APIdeCatalogo.Service;

import com.exemplo.APIdeCatalogo.model.Produto;
import com.exemplo.APIdeCatalogo.Repository.ProdutoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProdutoService {
	private final ProdutoRepository repository;
	
	public ProdutoService(ProdutoRepository repository) {
		this.repository = repository;
	}
	
	public List<Produto> listarTodos() {
		return repository.findAll();
	}
	
	public Produto salvar(Produto produto) {
		return repository.save(produto);
	}
	
	public Produto buscarPorId(Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));		
	}
	
	public Produto atualizar(Long id, Produto produtoAtualizado) {
		Produto existente = buscarPorId(id);
		existente.setNome(produtoAtualizado.getNome());
		existente.setDescricao(produtoAtualizado.getDescricao());
		existente.setPreco(produtoAtualizado.getPreco());
		existente.setCategoria(produtoAtualizado.getCategoria());
		return repository.save(existente);
	}
	
	public void deletar(Long id) {
		repository.deleteById(id);
	}
}
