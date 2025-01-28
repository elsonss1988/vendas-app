package com.unixverso.vendas.vendas_app.business.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unixverso.vendas.vendas_app.business.dto.UserRequestDTO;
import com.unixverso.vendas.vendas_app.business.dto.UserResponseDTO;
import com.unixverso.vendas.vendas_app.business.dto.UserResponseDTORecords;
import com.unixverso.vendas.vendas_app.business.mapstruct.UserMapper;
import com.unixverso.vendas.vendas_app.infrastructure.model.entities.UserEntity;
import com.unixverso.vendas.vendas_app.infrastructure.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    // private final UserUpdate userUpdate;

    public UserResponseDTORecords saveUserDTO(UserRequestDTO request) {

        UserEntity entity = userRepository.save(userMapper.toEntity(request));
        return userMapper.toUserDTORecords(entity);
    }

    public List<UserResponseDTO> findAll() {

        List<UserEntity> entity = userRepository.findAll();

        return userMapper.toListUserDTO(entity);
    }

    public UserResponseDTO findById(Long id) {

        UserEntity entity = userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User not found"));

        return userMapper.toUserDTO(entity);

    }

    public UserResponseDTO findByEmail(String email) {

        UserEntity entity = userRepository.findByEmail(email);
        return userMapper.toUserDTO(entity);
    }

    public Boolean deleteByEmail(String email) {

        return userRepository.deleteByEmail(email);
    }

}