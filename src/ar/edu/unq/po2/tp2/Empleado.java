package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public abstract class Empleado {

	private String nombre;
	private String estadoCivil;
	private String direccion;
	private LocalDate fechaNacimiento;
	private float sueldoBasico;
    
	public Empleado(String nombre, String estadoCivil, String direccion, LocalDate fechaNacimiento,
			float sueldoBasico) {	
		this.nombre = nombre;
		this.estadoCivil = estadoCivil;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public int getEdad() {
		LocalDate ahora = LocalDate.now();
		Period edad = Period.between(ahora, this.fechaNacimiento);
		return edad.getYears();
	}
	
	public double calcularSueldoNeto() {
		 return  this.calcularSueldoBruto()- this.calcularRetenciones();
	}
	public abstract double calcularSueldoBruto() ;
	public abstract double calcularRetenciones() ;
	public abstract List<String> getDesgloceDeConceptos();
}
