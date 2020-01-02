package com.hendisantika.springbootthymeleaf.controller;

import com.hendisantika.springbootthymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-thymeleaf
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/01/20
 * Time: 12.06
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
}
