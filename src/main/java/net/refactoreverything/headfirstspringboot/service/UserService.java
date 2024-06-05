package net.refactoreverything.headfirstspringboot.service;

import net.refactoreverything.headfirstspringboot.model.User;
import net.refactoreverything.headfirstspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserRepository getUserRepository() {
        return userRepository;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(User user) {
        System.out.println("Create user " + user.getClass().getName());
        userRepository.save(user);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
