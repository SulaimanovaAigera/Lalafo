package service;

import models.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    User getUserById(Long id);
    String updateUser(Long id, User user);
    List<User>getAllUser();
    String deleteUser(Long id);
    User getUserByEmail(String userEmail);
}
