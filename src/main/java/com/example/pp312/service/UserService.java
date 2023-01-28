package com.example.pp312.service;

import com.example.pp312.model.User;
import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User getUserById(int id);
    public void addUser(User user);
    public void delUser(int id);
    public void updUser(User user, int id);


}
