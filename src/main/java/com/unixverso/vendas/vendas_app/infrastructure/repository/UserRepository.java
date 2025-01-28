package com.unixverso.vendas.vendas_app.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unixverso.vendas.vendas_app.infrastructure.model.entities.UserEntity;

import jakarta.transaction.Transactional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByEmail(String email);

    @Transactional
    Boolean deleteByEmail(String email);
}
