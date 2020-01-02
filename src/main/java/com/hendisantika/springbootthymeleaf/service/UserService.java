package com.hendisantika.springbootthymeleaf.service;

import com.hendisantika.springbootthymeleaf.entity.User;
import com.hendisantika.springbootthymeleaf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-thymeleaf
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/01/20
 * Time: 12.05
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;


    /**
     * Method for getting all users
     *
     * @return List of User Objects
     */
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userRepository.findAll();
    }


    /**
     * Method for getting user by id
     *
     * @param id given user identifier
     * @return Optional of User Object
     */
    @Transactional(readOnly = true)
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }
}