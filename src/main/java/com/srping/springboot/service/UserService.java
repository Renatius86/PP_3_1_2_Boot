package com.srping.springboot.service;



import com.srping.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);

    void saveUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
}
