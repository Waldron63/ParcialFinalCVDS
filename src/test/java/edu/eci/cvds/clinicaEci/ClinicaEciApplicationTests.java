package edu.eci.cvds.clinicaEci;

import edu.eci.cvds.clinicaEci.model.Citas;
import edu.eci.cvds.clinicaEci.model.Enfermeria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClinicaEciApplicationTests {

	private Citas citas;
	private Enfermeria enfermeria

	@BeforeEach
	public void setUp() {
		citas = new Citas();
		enfermeria = new Enfermeria();
	}

	@Test
	void testSetValidCitas(){
		citas.setCedula(100000);
		citas.setConfirmacion(true);
		citas.setFecha(LocalDate.now());
		citas.setNombrePaciente("Ricardo");
		assertEquals(100000, citas.getCedula());
        assertTrue(citas.isConfirmacion());
		assertEquals(LocalDate.now(), citas.getFecha());
		assertEquals("Ricardo", citas.getNombrePaciente());
	}

	@Test
	void testSetValidEnfermeria(){
		enfermeria.setEspecialidad("psicologia");
		enfermeria.setDescripcion("descripcion");
		enfermeria.setDoctor("Ricardo");
		enfermeria.setUbicacion("ubicacion");
		assertEquals("psicologia", enfermeria.getEspecialidad());
		assertEquals("descripcion", enfermeria.getDescripcion());
		assertEquals("Ricardo", enfermeria.getDoctor());
		assertEquals("ubicacion", enfermeria.getUbicacion());
	}
}
