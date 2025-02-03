package com.unixverso.vendas.vendas_app.business.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.unixverso.vendas.vendas_app.VendasAppApplication;
import com.unixverso.vendas.vendas_app.business.dto.UserRequestDTO;
import com.unixverso.vendas.vendas_app.business.dto.UserResponseDTO;
import com.unixverso.vendas.vendas_app.business.dto.UserResponseDTOnew;
import com.unixverso.vendas.vendas_app.business.dto.UserResponseDTORecords;
import com.unixverso.vendas.vendas_app.business.mapstruct.UserMapper;
import com.unixverso.vendas.vendas_app.business.mapstruct.UserUpdate;
import com.unixverso.vendas.vendas_app.infrastructure.model.entities.UserEntity;
import com.unixverso.vendas.vendas_app.infrastructure.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final UserUpdate userUpdate;

    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    public List<UserResponseDTO> findAll() {

        List<UserEntity> entity = userRepository.findAll();
        logger.info("List of users: " + entity);
        List<UserResponseDTO> dto = userMapper.toListUserDTO(entity);
        logger.info("List of users: " + dto);
        // logger.warn("alerta");
        // logger.error("erro");
        // logger.debug("debug");
        // logger.trace("trace");
        // logger.info("info");

        return dto;
    }

    public UserResponseDTO findById(Long id) {

        UserEntity entity = userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User not found"));
        logger.info("User found: " + entity);
        UserResponseDTO dto = userMapper.toUserDTO(entity);
        logger.info("User found: " + dto);
        return dto;

    }

    public UserResponseDTORecords findByEmail(String email) {

        logger.info("Searching for user with email: " + email);
        UserEntity entity = userRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("User not found"));
        logger.info("User found: " + entity);
        UserResponseDTORecords dto = userMapper.toUserDTORecords(entity);
        logger.info("User found: " + dto);
        return dto;
    }

    public UserResponseDTORecords updateUser(UserRequestDTO request, Long id) {

        UserEntity entity = userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User not found"));

        userUpdate.userUpdate(request, entity);

        return userMapper.toUserDTORecords(userRepository.save(entity));

    }

    public UserResponseDTO saveUserDTO(UserRequestDTO request) {

        UserEntity entity = userRepository.save(userMapper.toEntity(request));
        return userMapper.toUserDTO(entity);
    }

    public Boolean deleteByEmail(String email) {
        logger.info("usuario do" + email + "sendo removido ...");
        userRepository.deleteByEmail(email);
        return true;
    }

}