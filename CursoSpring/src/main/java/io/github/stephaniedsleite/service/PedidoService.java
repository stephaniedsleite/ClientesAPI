package io.github.stephaniedsleite.service;

import io.github.stephaniedsleite.domain.entity.Pedido;
import io.github.stephaniedsleite.domain.enums.StatusPedido;
import io.github.stephaniedsleite.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
