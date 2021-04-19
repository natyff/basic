package br.com.fiap.basic.controller;

import br.com.fiap.basic.dto.LocadorDTO;
import br.com.fiap.basic.service.LocadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LocadorController {

    @Autowired
    LocadorService locadorService;

    @PostMapping("/cadastar-locador")
    public String addLocador(LocadorDTO locadorDTO){
        locadorService.save(locadorDTO);
        return "Cadastro do locador salva com sucesso!";
    }
}
