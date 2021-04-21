package br.com.fiap.basic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CaracteristicasDTO {

    private Long id;
    private boolean portaoManual;
    private boolean portaoAutomatico;
    private boolean semCobertura;
    private boolean comCobertura;
    private enum Tipo {QUARTO, GARAGEM, TERRENO, EDICULA};


}
