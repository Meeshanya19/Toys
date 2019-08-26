package toys.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toys.dao.FurnitureDao;
import toys.entity.commodity.Furniture;
import toys.service.FurnitureService;

import java.util.List;

/**
 * Created by Michail on 7/23/2019.
 */
@Service
public class FurnitureServiceImpl implements FurnitureService {
    
    @Autowired
    FurnitureDao furnitureDao;

    public void save(Furniture furniture) {
furnitureDao.save(furniture);
    }

    public List<Furniture> findAll() {
        return furnitureDao.findAll();
    }

    public void delete(int id) {
furnitureDao.delete(id);
    }

    public void update(int id, Furniture furniture) {
        furnitureDao.delete(id);
furnitureDao.save(furniture);
    }

    public Furniture findOne(int id) {
        return furnitureDao.findOne(id);
    }
}
