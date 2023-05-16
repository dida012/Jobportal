package controller;

import model.User;
import service.UserService;

import java.util.List;

public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void addUser(User user) {
        userService.addUser(user);
        System.out.println("User added successfully: " + user);
    }

    public User getUserById(String userId) {
        return userService.getUserById(userId);
    }

    public void updateUser(User user) {
        userService.updateUser(user);
        System.out.println("User updated successfully: " + user);
    }

    public void deleteUser(User user) {
        userService.deleteUser(user);
        System.out.println("User deleted successfully: " + user);
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
