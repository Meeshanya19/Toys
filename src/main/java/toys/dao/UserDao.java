package toys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import toys.entity.User;

import java.util.List;

/**
 * Created by Michail on 6/18/2019.
 */
public interface UserDao extends JpaRepository<User,Integer>{


   User findByName(String name);

}
