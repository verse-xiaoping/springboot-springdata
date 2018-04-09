package com.github.springboot.springdata.dao;

import com.github.springboot.springdata.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by verse on 2018/4/9.
 */
public interface UserDao extends JpaRepository<User, Integer> {
}
