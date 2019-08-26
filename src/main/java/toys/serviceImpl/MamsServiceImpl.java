package toys.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toys.dao.MamsDao;
import toys.entity.commodity.Mams;
import toys.service.MamsServise;

import java.util.List;

/**
 * Created by Michail on 7/23/2019.
 */
@Service
public class MamsServiceImpl implements MamsServise {

    @Autowired
    MamsDao mamsDao;

    public void save(Mams mams) {
mamsDao.save(mams);
    }

    public List<Mams> findAll() {
        return mamsDao.findAll();
    }

    public void delete(int id) {
mamsDao.delete(id);
    }

    public void update(int id, Mams mams) {
mamsDao.delete(id);
        mamsDao.save(mams);
    }

    public Mams findOne(int id) {
        return mamsDao.findOne(id);
    }
}
