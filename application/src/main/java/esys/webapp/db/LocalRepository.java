package esys.webapp.db;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocalRepository extends CrudRepository<Local, Long> {

    List<Local> findByName(String name);
}
