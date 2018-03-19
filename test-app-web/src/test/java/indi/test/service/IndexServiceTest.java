package indi.test.service;

import indi.test.domain.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IndexServiceTest {
    @Autowired
    private IndexService indexService;

    @Test
    public void test(){
        List<UserEntity> list=indexService.findAll();
        for (UserEntity userEntity:list){
            System.out.println(userEntity);
        }
    }
}
