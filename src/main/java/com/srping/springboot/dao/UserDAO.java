package com.srping.springboot.dao;



import com.srping.springboot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    User getUserById(int id);
    void saveUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
}
