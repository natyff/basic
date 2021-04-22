package br.com.fiap.basic.controller;

import br.com.fiap.basic.dto.EspacoDTO;
import br.com.fiap.basic.entity.EspacoEntity;
import br.com.fiap.basic.service.EspacoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EspacoController {

    @Autowired
    private EspacoService espacoService;

    @GetMapping("/espaco")
    public ResponseEntity buscarEspaco(@RequestParam(required = false) String bairro,
                                       @RequestParam(required = false) Float area) {
        try {
            List<EspacoDTO> listaBuscaEspaco = espacoService.buscarEspaco(bairro, area);
            return ResponseEntity.status(HttpStatus.OK).body(listaBuscaEspaco);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao buscar ocorrencias.");
        }
    }
}
