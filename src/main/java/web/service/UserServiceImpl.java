package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDao) {
        this.userDAO = userDao;
    }


    @Transactional
    @Override
    public List<User> getListOfUsers() {
        return userDAO.getListOfUsers();
    }

    @Transactional
    @Override
    public void create(User user) {
        userDAO.create(user);
    }

    @Transactional
    @Override
    public User readUserById(int id) {
        return userDAO.readUserById(id);
    }

    @Transactional
    @Override
    public void update(int id,User user) {
        userDAO.update(id,user);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }
}