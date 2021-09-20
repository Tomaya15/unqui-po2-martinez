package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PlantaTemporal extends Empleado {
	private LocalDate finDesignacion;
	private int horasExtras;
	private int añosAporte;

	public PlantaTemporal(String nombre, String estadoCivil, String direccion, LocalDate fechaNacimiento,
			float sueldoBasico, LocalDate finDesignacion, int horasExtras, int añosAporte) {
		super(nombre, estadoCivil, direccion, fechaNacimiento, sueldoBasico);
		this.finDesignacion = finDesignacion;
		this.horasExtras = horasExtras;
		this.añosAporte = añosAporte;
	}

	public LocalDate getFinDesignacion() {
		return finDesignacion;
	}

	public void setFinDesignacion(LocalDate finDesignacion) {
		this.finDesignacion = finDesignacion;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public int getAñosAporte() {
		return añosAporte;
	}

	public void setAñosAporte(int añosAporte) {
		this.añosAporte = añosAporte;
	}
	// Calcular sueldo bruto
	public int calcularAsignacionHorasExtras( ) {
		return this.getHorasExtras() * 40;
	}
	public double calcularSueldoBruto() {
		return this.getSueldoBasico() + this.calcularAsignacionHorasExtras();
	}
	// Calcular retenciones 
	public double calcularObraSocial() {
		return this.calcularSueldoBruto() * 0.10;
	}
	public double calcularAsignacionAportes() {
		return this.getAñosAporte() > 50 ? 25 : 0;
	}
	public double calcularJubilatorios() {
		return (this.calcularSueldoBruto() * 0.10) + (5 * this.getHorasExtras());
	}
	public double calcularRetenciones() {		

		return this.calcularObraSocial() + this.calcularAsignacionAportes() + this.calcularJubilatorios();
	}
	// Desgloce de conceptos para el cobro de un empleado de planta temporal.
	public List<String> getDesgloceDeConceptos(){
			List<String> list  = new ArrayList<String>();
			list.add("Bono por horas extra: +" + this.calcularAsignacionHorasExtras());
			list.add("Sueldo basico: +" + this.getSueldoBasico());
			list.add("Obra social -" + this.calcularObraSocial());
			list.add("Aportes - " + this.calcularAsignacionAportes());
			list.add("Jubilatorios -" + this.calcularJubilatorios());
			
			
			return list;
	}

}
