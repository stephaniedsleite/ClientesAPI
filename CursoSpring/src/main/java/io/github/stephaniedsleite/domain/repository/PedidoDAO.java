package io.github.stephaniedsleite.domain.repository;

import io.github.stephaniedsleite.domain.entity.Cliente;
import io.github.stephaniedsleite.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PedidoDAO extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente (Cliente cliente);

    @Query("select p from Pedido p left join fetch p.items where p.id =:id")
    Optional<Pedido> findByIdFetchItems(@Param("id") Integer id);
}
