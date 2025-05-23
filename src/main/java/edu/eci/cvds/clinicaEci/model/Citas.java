package edu.eci.cvds.clinicaEci.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "Citas")
public class Citas {

    @Id
    private String id;
    private String nombrePaciente;
    private int cedula;
    private String correo;
    private LocalDate fecha;
    private boolean confirmacion;

    public void changeConfirmation(){
        confirmacion = false;
    }

    public String getCorreo() {
        return correo;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
