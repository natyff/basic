package br.com.fiap.basic.service.impl;

import br.com.fiap.basic.dto.LocatarioDTO;
import br.com.fiap.basic.entity.LocatarioEntity;
import br.com.fiap.basic.repository.LocatarioRepository;
import br.com.fiap.basic.service.LocatarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocatarioImplementation implements LocatarioService {

    @Autowired
    LocatarioRepository locatarioRepository;

    @Override
    public void save(LocatarioDTO locatario){
        LocatarioEntity locatarioEntity = new LocatarioEntity(locatario);
        locatarioRepository.save(locatarioEntity);

    }


}
