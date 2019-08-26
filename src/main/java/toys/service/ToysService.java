package toys.service;

import toys.entity.commodity.Toys;

import java.util.List;

/**
 * Created by Michail on 7/23/2019.
 */
public interface ToysService {
    void save(Toys toys);
    List<Toys> findAll();
    void delete(int id);
    void update(int id ,Toys toys);
    Toys findOne(int id);
}
