package orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import orm.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
}
