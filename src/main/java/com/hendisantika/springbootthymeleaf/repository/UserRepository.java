package com.hendisantika.springbootthymeleaf.repository;

import com.hendisantika.springbootthymeleaf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-thymeleaf
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/01/20
 * Time: 12.04
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
