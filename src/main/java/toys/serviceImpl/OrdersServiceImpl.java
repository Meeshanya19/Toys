package toys.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toys.dao.ClothingDao;
import toys.dao.OrdersDao;
import toys.dao.UserDao;
import toys.entity.Orders;
import toys.entity.User;
import toys.entity.commodity.Clothing;
import toys.service.OrdersService;
import toys.service.UserService;

import java.util.List;

/**
 * Created by Michail on 7/23/2019.
 */
@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersDao ordersDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private ClothingDao clothingDao;

    public void save(Orders o,int userId) {

        User user=userDao.findOne(userId);
        o.setUser(user);
        ordersDao.save(o);
    }
    public void save(Orders orders,int userId,int clothingId) {
        User user=userDao.findOne(userId);
        Clothing clothing=clothingDao.findOne(clothingId);

        ordersDao.saveAndFlush(orders);
        System.out.println(user);
        orders.setUser(user);
        System.out.println(clothing);

        System.out.println(orders.getClothings().add(clothing) );

        System.out.println(user);
        System.out.println(clothing);
        ordersDao.save(orders);
        System.out.println("save");
    }

    public Orders findOne(int id) {
        return ordersDao.findOne(id);
    }

    public List<Orders> findAll() {
        return ordersDao.findAll();
    }

    public void delete(int id) {
ordersDao.delete(id);
    }
}
