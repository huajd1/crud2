package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }



    @Override
    public List<User> getListOfUsers() {
        return userDao.getListOfUsers();
    }


    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }


    @Override
    public User readUserById(int id) {
        return userDao.readUserById(id);
    }


    @Override
    public void updateUser(int id,User user) {
        userDao.updateUser(id,user);
    }


    @Override
    public void deleteUser(int id) { userDao.deleteUser(id);
    }
}