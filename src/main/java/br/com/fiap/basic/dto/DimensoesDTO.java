package br.com.fiap.basic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DimensoesDTO {

    private Long id;
    private float largura;
    private float comprimento;
    private float altura;

}
