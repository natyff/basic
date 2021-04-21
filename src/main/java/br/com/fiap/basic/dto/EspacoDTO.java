package br.com.fiap.basic.dto;

import br.com.fiap.basic.entity.EnderecoEntity;
import br.com.fiap.basic.entity.EspacoEntity;
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

    public EspacoDTO(EspacoEntity espacoEntity) {
        this.id = espacoEntity.getIdEspaco();
        this.endereco = new EnderecoDTO();
        this.usuario = new UserDTO();
        this.dimensoes = new DimensoesDTO();
        this.caracteristicas = new CaracteristicasDTO();
    }

}
