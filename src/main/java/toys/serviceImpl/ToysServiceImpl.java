package toys.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toys.dao.ToysDao;
import toys.entity.commodity.Toys;
import toys.service.ToysService;

import java.util.List;

/**
 * Created by Michail on 7/23/2019.
 */
@Service
public class ToysServiceImpl implements ToysService {

    @Autowired
    ToysDao toysDao;

    public void save(Toys toys) {
toysDao.save(toys);
    }

    public List<Toys> findAll()
    {
        return toysDao.findAll();
    }

    public void delete(int id) {
toysDao.delete(id);
    }

    public void update(int id, Toys toys) {
toysDao.delete(id);
        toysDao.save(toys);
    }

    public Toys findOne(int id)
    {
        return toysDao.findOne(id);
    }
}
