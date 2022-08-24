package impl;

import dao.UserDao;
import exception.MyException;
import model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDao();

    @Override
    public List<User> getAll() {
        return userDao.getUsers();
    }

    @Override
    public User getById(int id) {

       return userDao.getUsers()
               .stream()
               .filter(user -> user.getId()==id)
               .findFirst()
               .orElseThrow(() -> new MyException("Not found user by id"));


    }

    @Override
    public void removeById(int id) {
        User user1 = userDao.getUsers()
                .stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElseThrow(() -> new MyException("Not found user by id"));
                 userDao.getUsers().remove(user1);


    }

    @Override
    public void addUser(User user) {
        List<User> users = userDao.getUsers();
        users.add(user);

    }
}
