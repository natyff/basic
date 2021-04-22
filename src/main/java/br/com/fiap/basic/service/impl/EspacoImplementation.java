package br.com.fiap.basic.service.impl;

import br.com.fiap.basic.dto.*;
import br.com.fiap.basic.entity.EspacoEntity;
import br.com.fiap.basic.repository.EspacoRepository;
import br.com.fiap.basic.service.EspacoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EspacoImplementation implements EspacoService {

    @Autowired
    private EspacoRepository espacoRepository;

    @Override
    public List<EspacoDTO> buscarEspaco(String bairro, Float area) {
        List<EspacoEntity> listaBuscaEspaco;

        if (area == null) {
            listaBuscaEspaco = espacoRepository.findByEnderecoBairro(bairro);
        } else if (bairro == null) {
            listaBuscaEspaco = espacoRepository.findByDimensoesArea(area);
        } else {
            listaBuscaEspaco = espacoRepository.findByEnderecoBairroAndDimensoesArea(bairro, area);
        }


        List<EspacoDTO> listaEspacoDTO = new ArrayList<>();

        for (
                EspacoEntity itemLista : listaBuscaEspaco) {
            Long idEspaco = itemLista.getIdEspaco();
            EnderecoDTO enderecoDTO = new EnderecoDTO(itemLista.getEndereco());
            UserDTO userDTO = new UserDTO(itemLista.getUsuario());
            DimensoesDTO dimensoesDTO = new DimensoesDTO(itemLista.getDimensoes());
            CaracteristicasDTO caracteristicasDTO = new CaracteristicasDTO(itemLista.getCaracteristicas());

            EspacoDTO espacoDTO = new EspacoDTO(idEspaco, enderecoDTO, userDTO, dimensoesDTO, caracteristicasDTO);
            listaEspacoDTO.add(espacoDTO);
        }

        return listaEspacoDTO;
    }
}
