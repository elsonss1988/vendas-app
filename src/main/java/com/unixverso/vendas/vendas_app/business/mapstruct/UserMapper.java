package com.unixverso.vendas.vendas_app.business.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.unixverso.vendas.vendas_app.business.dto.UserRequestDTO;
import com.unixverso.vendas.vendas_app.business.dto.UserResponseDTO;
import com.unixverso.vendas.vendas_app.business.dto.UserResponseDTORecords;
import com.unixverso.vendas.vendas_app.infrastructure.model.entities.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    UserEntity toEntity(UserRequestDTO request);

    UserResponseDTO toUserDTO(UserEntity entity);

    UserResponseDTORecords toUserDTORecords(UserEntity entity);

    List<UserResponseDTO> toListUserDTO(List<UserEntity> entities);

}
