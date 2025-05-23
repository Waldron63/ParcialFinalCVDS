package edu.eci.cvds.clinicaEci.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "Enfermeria")
public class Enfermeria {

    @Id
    private int id;
    private String especialidad;
    private String[] especialidadType = new String[] {"medicina general","psicologia","ortopedia","odontologia"};
    private String descripcion;
    private String doctor;
    private String ubicacion;


}
