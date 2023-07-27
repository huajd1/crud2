package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

@Repository
public interface UserDao {
    List<User> getListOfUsers();
    void createUser(User user);
    User readUserById(int id);
    void updateUser(int id, User user);
    void deleteUser(int id);
}





