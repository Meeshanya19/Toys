package toys.service;

import toys.entity.commodity.Mams;

import java.util.List;

/**
 * Created by Michail on 7/23/2019.
 */
public interface MamsServise {
    void save(Mams mams);
    List<Mams> findAll();
    void delete(int id);
    void update(int id ,Mams mams);
    Mams findOne(int id);
}
