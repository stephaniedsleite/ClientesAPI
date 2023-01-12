package io.github.stephaniedsleite.domain.repository;

import io.github.stephaniedsleite.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoDAO extends JpaRepository<Produto, Integer> {


}
