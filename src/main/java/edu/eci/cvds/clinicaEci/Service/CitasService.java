package edu.eci.cvds.clinicaEci.Service;

import edu.eci.cvds.clinicaEci.model.Citas;
import edu.eci.cvds.clinicaEci.repository.CitasMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitasService {

    @Autowired
    private CitasMongo citasMongo;


    public Citas createCita(Citas citas) {
        return citasMongo.save(citas);
    }

    public List<Citas> findAll() {
        return citasMongo.findAll();
    }
}
