package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getListOfUsers();

    User readUserById(int id);
    void createUser(User user);
    void updateUser(int id, User user);
    void deleteUser(int id);

}