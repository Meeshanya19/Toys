package toys.service;

import toys.entity.Country;
import toys.entity.commodity.Clothing;

import java.util.List;

/**
 * Created by Michail on 8/25/2019.
 */
public interface CountryService {
    void save(Country country);
    List<Country> findAll();
    void delete(int id);
    void update(int id ,Country country);
    Country findOne(int id);
}
