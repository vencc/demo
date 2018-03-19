package indi.test.service;

import indi.test.domain.entity.UserEntity;

import java.util.List;

public interface IndexService {
    List<UserEntity> findAll();
}
