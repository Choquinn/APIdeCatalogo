package com.exemplo.APIdeCatalogo.Repository;

import com.exemplo.APIdeCatalogo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
