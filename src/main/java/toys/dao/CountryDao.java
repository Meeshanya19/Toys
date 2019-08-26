package toys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import toys.entity.Country;

/**
 * Created by Michail on 8/25/2019.
 */
public interface CountryDao extends JpaRepository<Country,Integer> {
}
