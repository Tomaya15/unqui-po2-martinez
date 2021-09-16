package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

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
	public float calcularSalarioFamiliar() {
		float asignacionPorHijo = 150 * this.getCantidadHijos();
		float asignacionPorConyuge = this.tieneConyuge? 100 : 0 ;
		float antiguedad = 50 * this.añosAntiguedad;
		float salarioFamiliar = asignacionPorHijo + asignacionPorConyuge + antiguedad;
		
		return salarioFamiliar;
	}
	
	public float calcularSueldoBruto() {
		return this.getSueldoBasico() + this.calcularSalarioFamiliar();
	}
	
	public double calcularRetenciones() {
		double obraSocial = ( this.calcularSueldoBruto() * 0.10 ) + (this.cantidadHijos * 20) ;
		double aportesJubilatorios = this.calcularSueldoBruto() * 0.15;

		return obraSocial + aportesJubilatorios; 
	}
}
