package com.github.springboot.springdata.service;

import com.github.springboot.springdata.dao.UserDao;
import com.github.springboot.springdata.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by verse on 2018/4/9.
 */
@Service
public class UserService {
    @Resource
    private UserDao userDao;
    public List<User> findAll(Integer id) {
        return userDao.findAll();
    }

}
