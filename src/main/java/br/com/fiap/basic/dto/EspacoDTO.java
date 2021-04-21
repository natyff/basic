package br.com.fiap.basic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EspacoDTO {

    private Long id;
    private EnderecoDTO endereco;
    private UserDTO usuario;
    private DimensoesDTO dimensoes;
    private CaracteristicasDTO caracteristicas;



}
