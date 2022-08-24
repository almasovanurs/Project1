package impl;

import model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(int id);
    void removeById(int id);
    void  addUser(User user);

}
