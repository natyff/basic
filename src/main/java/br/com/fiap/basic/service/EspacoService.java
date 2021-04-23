package br.com.fiap.basic.service;


import br.com.fiap.basic.dto.EspacoDTO;

import java.util.List;

public interface EspacoService {

    List<EspacoDTO> buscarEspaco(String bairro, Float area);

    EspacoDTO addEspaco(EspacoDTO espacoDTO);

}
