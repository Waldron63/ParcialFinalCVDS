package edu.eci.cvds.clinicaEci.Service;

import edu.eci.cvds.clinicaEci.model.Enfermeria;
import edu.eci.cvds.clinicaEci.repository.EnfermeriaMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnfermeriaService {

    @Autowired
    private EnfermeriaMongo enfermeriaMongo;


    public Enfermeria createEnfermeria(Enfermeria enfermeria) {
        return enfermeriaMongo.save(enfermeria);
    }

    public List<Enfermeria> findAll() {
        return enfermeriaMongo.findAll();
    }
}
