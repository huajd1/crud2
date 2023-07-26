package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

@Repository
public interface UserDAO {
    List<User> getListOfUsers();
    void create(User user);
    User readUserById(int id);
    void update(int id, User user);
    void delete(int id);
}





