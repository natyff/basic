//package br.com.fiap.basic.controller;
//
//import br.com.fiap.basic.dto.LocatarioDTO;
//import br.com.fiap.basic.service.LocatarioService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//
//import javax.validation.Valid;
//
//
//@RestController
//public class LocatarioController {
//
//    @Autowired
//    LocatarioService locatarioService;
//
//    @PostMapping("/cadastrar")
//    public String addLocatario(@RequestBody @Valid LocatarioDTO locatarioDTO){
//        locatarioService.save(locatarioDTO);
//        return "Locatário cadastrado com sucesso";
//    }
//}
