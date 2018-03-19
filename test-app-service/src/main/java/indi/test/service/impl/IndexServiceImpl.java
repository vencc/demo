package indi.test.service.impl;


import indi.test.domain.entity.UserEntity;
import indi.test.domain.repository.UserRepository;
import indi.test.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }
}
