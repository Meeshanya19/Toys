package toys.service;

import toys.entity.commodity.Clothing;

import java.util.List;
import java.util.Optional;

/**
 * Created by Michail on 7/23/2019.
 */
public interface ClothingService {
    void save(Clothing clothing);
    List<Clothing> findAll();
    void delete(int id);
    void update(int id ,Clothing clothing);
    Clothing findOne(int id);
}
