package io.github.stephaniedsleite.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {

    private Integer cliente;
    private double total;
    private List<ItemPedidoDTO> items;


}
