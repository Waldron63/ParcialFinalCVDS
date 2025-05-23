package edu.eci.cvds.clinicaEci.repository;

import edu.eci.cvds.clinicaEci.model.Enfermeria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnfermeriaMongo extends MongoRepository<Enfermeria, String> {
}
