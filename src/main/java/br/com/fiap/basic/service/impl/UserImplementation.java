package br.com.fiap.basic.service.impl;

import br.com.fiap.basic.dto.UserDTO;
import br.com.fiap.basic.entity.UserEntity;
import br.com.fiap.basic.repository.UserRepository;
import br.com.fiap.basic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImplementation implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void save(UserDTO user){
        UserEntity userEntity = new UserEntity(user);
        userRepository.save(userEntity);
    }
}
