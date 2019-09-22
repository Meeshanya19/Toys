package toys.validator.userValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import toys.dao.UserDao;
import toys.entity.User;
import toys.validator.Validator;

/**
 * Created by Michail on 9/1/2019.
 */
@Component
public class UserValidator implements Validator {

    @Autowired
    UserDao userDao;


    public void validate(Object o) throws Exception {

        User user = (User) o;
        if(user.getName().isEmpty()){
            throw new UserException(UserValidatorMessages.USER_NAME_EMPTY);
         }
        else if(userDao.findByName(user.getName())!=null){
            throw new UserException(UserValidatorMessages.USER_NAME_ALREADY_EXIST);
        }
    }
}
