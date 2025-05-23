package edu.eci.cvds.clinicaEci.repository;

import edu.eci.cvds.clinicaEci.model.Citas;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CitasMongo  extends MongoRepository<Citas, String> {
}
