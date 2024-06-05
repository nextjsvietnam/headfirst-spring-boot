package net.refactoreverything.headfirstspringboot;

import net.refactoreverything.headfirstspringboot.model.User;
import net.refactoreverything.headfirstspringboot.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class HeadfirstSpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(HeadfirstSpringBootApplication.class, args);
        System.out.println("Hello Spring Boot Application from refactoreverything.net");

        UserService userService = applicationContext.getBean(UserService.class);

        User user = applicationContext.getBean(User.class);
        user.setFirstName("Java3");
        user.setLastName("Spring");
        user.setEmail("java3@refactoreverything.net");
        user.setUsername("java3");
        user.setPassword("123456");

        userService.createUser(user);

        List<User> users = userService.getUsers();
        System.out.println(users);
    }

}
