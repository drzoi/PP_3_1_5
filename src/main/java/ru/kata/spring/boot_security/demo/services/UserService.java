package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

    User findByUsername(String username);

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);
}
