package service;

import model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    User getUserById(String userId);
    void updateUser(User user);
    void deleteUser(User user);
    List<User> getAllUsers();
}

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User getUserById(String userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}