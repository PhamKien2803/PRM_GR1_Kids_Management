package com.example.myapplication.Repo;
import com.example.myapplication.DAO.UserDao;
import com.example.myapplication.Entity.User;
import com.example.myapplication.UserManagerActivity;

import java.util.List;

public class UserRepository implements IUserRepository {
    private final UserDao userDao;
    public UserRepository(UserManagerActivity userDao) {
        this.userDao = userDao;
    }
    @Override
    public boolean register(User user) {
        return userDao.insert(user) > 0;
    }
    @Override
    public boolean login(String username, String password) {
        return userDao.validate(username, password);
    }
    @Override
    public List<User> getAllUsers() {
        return userDao.getAll();
    }
    public boolean update(User user) {
        return userDao.update(user);
    }
    public boolean delete(int userId) {
        return userDao.delete(userId);
    }
}
