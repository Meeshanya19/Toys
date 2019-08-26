package toys.service;

import toys.entity.commodity.Furniture;

import java.util.List;

/**
 * Created by Michail on 7/23/2019.
 */
public interface FurnitureService {
    void save(Furniture furniture);
    List<Furniture> findAll();
    void delete(int id);
    void update(int id ,Furniture furniture);
    Furniture findOne(int id);
}
