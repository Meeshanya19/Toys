package toys.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toys.dao.ClothingDao;
import toys.entity.commodity.Clothing;
import toys.service.ClothingService;

import java.util.List;
import java.util.Optional;

/**
 * Created by Michail on 7/23/2019.
 */
@Service
public class ClothingServiceImpl implements ClothingService {

@Autowired
    private ClothingDao clothingDao;

    public void save(Clothing clothing) {
clothingDao.save(clothing);

    }

    public List<Clothing> findAll() {
        return clothingDao.findAll();
    }

    public void delete(int id) {
clothingDao.delete(id);
    }

    public void update(int id, Clothing clothing) {
        clothingDao.delete(id);
     clothingDao.save(clothing);
           }

    public Clothing findOne(int id) {
        return clothingDao.findOne(id);
    }
}
