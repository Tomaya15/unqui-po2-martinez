package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PlantaPermanente extends Empleado {
	private int cantidadHijos;
	private int añosAntiguedad;
	private boolean tieneConyuge;

	public PlantaPermanente(String nombre, String estadoCivil, String direccion, LocalDate fechaNacimiento,
			float sueldoBasico, int cantidadHijos, int añosAntiguedad, boolean tieneConyuge) {
		super(nombre, estadoCivil, direccion, fechaNacimiento, sueldoBasico);
		this.cantidadHijos = cantidadHijos;
		this.añosAntiguedad = añosAntiguedad;
		this.tieneConyuge = tieneConyuge;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public int getAñosAntiguedad() {
		return añosAntiguedad;
	}

	public void setAñosAntiguedad(int añosAntiguedad) {
		this.añosAntiguedad = añosAntiguedad;
	}

	public boolean isTieneConyuge() {
		return tieneConyuge;
	}

	public void setTieneConyuge(boolean tieneConyuge) {
		this.tieneConyuge = tieneConyuge;
	}
	// Calculos para para la asignacion familiar 
	private float calcularAsignacionPorHijo() {
		return 150 * this.getCantidadHijos();
	}
	private int calcularAsginacionPorConyuge() {
		return this.tieneConyuge? 100 : 0 ;
	}
	private int calcularAntiguedad() {
		return 50 * this.añosAntiguedad;
	}
	
	private float calcularSalarioFamiliar() {
		return this.calcularAsignacionPorHijo() + this.calcularAsginacionPorConyuge() + this.calcularAntiguedad();
	}
	// Calcular sueldo bruto 
	public double calcularSueldoBruto() {
		return this.getSueldoBasico() + this.calcularSalarioFamiliar();
	}
	
	// Calculos para las retenciones
	private double calcularObraSocial() {
		return (( this.calcularSueldoBruto() * 0.10 ) + (this.cantidadHijos * 20));
	}
	private double calcularAportesJubilatorios() {
		return this.calcularSueldoBruto() * 0.15;
	}
	
	public double calcularRetenciones() {
		return this.calcularObraSocial() + this.calcularAportesJubilatorios(); 
	}
	// Lista de Desgloce de concepto de cobro
	public List<String> getDesgloceDeConceptos(){
		List<String> list  = new ArrayList<String>();
		list.add("Salario familiar: + " + this.calcularSalarioFamiliar());
		list.add("Sueldo basico: + " + this.getSueldoBasico());
		list.add("Obra Social - " + this.calcularObraSocial());
		list.add("Aportes Jubilatorios -" + this.calcularAportesJubilatorios());
		
		return list;
	}
}
