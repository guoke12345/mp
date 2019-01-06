package com.qibao.mp;

import com.qibao.mp.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MpApplicationTests {
    @Autowired
    private UserMapper  userMapper;

    @Test
    public void contextLoads() {
        List userlist =  userMapper.selectList(null);
        System.out.println(userlist.toString());
    }

}

