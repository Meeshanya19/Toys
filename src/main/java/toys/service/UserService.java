package toys.service;

import toys.entity.User;

import java.util.List;

/**
 * Created by Michail on 7/23/2019.
 */
public interface UserService {
    void save(User user);
    List<User> findAll();
    void delete(int id);
    void update(User user,int id);
    User findOne(int id);
    String getShipping(int id);
}
