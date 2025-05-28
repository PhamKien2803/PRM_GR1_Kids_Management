package com.example.myapplication.Repo;

import com.example.myapplication.Entity.User;
import java.util.List;

public interface IUserRepository {
    boolean register(User user);
    boolean login(String username, String password);
    List<User> getAllUsers();
}