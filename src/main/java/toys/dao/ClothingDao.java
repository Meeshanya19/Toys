package toys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import toys.entity.commodity.Clothing;

import java.util.List;

/**
 * Created by Michail on 6/21/2019.
 */

public interface ClothingDao extends JpaRepository <Clothing,Integer> {



}
