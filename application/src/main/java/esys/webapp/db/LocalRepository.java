package esys.webapp.db;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocalRepository extends CrudRepository<Local, Long> {

    Local findById(Long id);

    List<Local> findByName(String name);

    List<Local> findByCity(String city);

    List<Local> findByOwnerId(String ownerId);

}
