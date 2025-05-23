package edu.eci.cvds.clinicaEci.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Setter
@Getter
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

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(boolean confirmacion) {
        this.confirmacion = confirmacion;
    }
}
