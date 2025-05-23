package edu.eci.cvds.clinicaEci.controller;

import edu.eci.cvds.clinicaEci.Service.CitasService;
import edu.eci.cvds.clinicaEci.model.Citas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cita")
public class CitasController {

    @Autowired
    private CitasService citasService;

    @PostMapping("/")
    public Citas createCita(@RequestBody Citas citas){
        return citasService.createCita(citas);
    }

    @GetMapping("/all")
    public List<Citas> getAllCitas(){
        return citasService.findAll();
    }
}
