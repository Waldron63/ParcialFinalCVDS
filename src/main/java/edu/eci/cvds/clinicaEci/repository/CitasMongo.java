package edu.eci.cvds.clinicaEci.repository;

import edu.eci.cvds.clinicaEci.model.Citas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface CitasMongo  extends MongoRepository<Citas, String> {
    @Query("{ 'correo' : ?0 }")
    List<Citas> findByEmail(String correo);

    @Query("{ 'correo' : ?0, 'fecha' : ?1 }")
    Citas findByCita(String correo, LocalDate fecha);
}
