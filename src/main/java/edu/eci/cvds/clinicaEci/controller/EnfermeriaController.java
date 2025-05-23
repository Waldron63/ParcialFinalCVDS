package edu.eci.cvds.clinicaEci.controller;

import edu.eci.cvds.clinicaEci.Service.EnfermeriaService;
import edu.eci.cvds.clinicaEci.model.Enfermeria;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Enfermeria")
public class EnfermeriaController {

    @Autowired
    private EnfermeriaService enfermeriaService;

    @PostMapping("/")
    public Enfermeria createEnfermeria(@RequestBody Enfermeria enfermeria){
        return enfermeriaService.createEnfermeria(enfermeria);
    }

    @GetMapping("/all")
    public List<Enfermeria> getAllEnfermerias(){
        return enfermeriaService.findAll();
    }

}
