package com.hendisantika.springbootthymeleaf.controller;

import com.hendisantika.springbootthymeleaf.constant.TemplateConstant;
import com.hendisantika.springbootthymeleaf.entity.User;
import com.hendisantika.springbootthymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

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

    @GetMapping(value = "/users")
    public String getAllUsers(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);

        return TemplateConstant.ALL_USERS;
    }

    @GetMapping(value = "/user-show/{id}")
    public String getUserById(@PathVariable(value = "id") Integer id, Model model) {
        Optional<User> userOptional = userService.findById(id);
        if (userOptional.isPresent()) {
            model.addAttribute("user", userOptional.get());
        } else {
            model.addAttribute("user", Optional.empty());
        }
        return TemplateConstant.USER_SHOW;
    }
}
