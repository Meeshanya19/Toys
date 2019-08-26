package toys.service;

import toys.entity.Orders;

import java.util.List;

/**
 * Created by Michail on 7/23/2019.
 */
public interface OrdersService {
    void save(Orders o,int userId,int clothing);
    Orders findOne(int id);
    List<Orders> findAll();
    void delete(int id);
}
