package toys.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toys.dao.CountryDao;
import toys.entity.Country;
import toys.service.CountryService;

import java.util.List;

/**
 * Created by Michail on 8/25/2019.
 */
@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryDao countryDao;

    public void save(Country country) {
        countryDao.save(country);
    }

    public List<Country> findAll() {
        return countryDao.findAll();
    }

    public void delete(int id) {
countryDao.delete(id);
    }

    public void update(int id, Country country) {
countryDao.delete(id);
        countryDao.save(country);
    }

    public Country findOne(int id) {
        return countryDao.findOne(id);
    }
}
