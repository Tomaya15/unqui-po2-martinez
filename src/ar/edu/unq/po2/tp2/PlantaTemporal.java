package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

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

	public double calcularSueldoBruto() {
		float asignacionHorasExtras = this.horasExtras * 40;

		return this.getSueldoBasico() + asignacionHorasExtras;
	}

	public double calcularRetenciones() {
		double obraSocial = this.calcularSueldoBruto() * 0.10;
		int asignacionAportes = this.getAñosAporte() > 50 ? 25 : 0;
		double jubilatorios = (this.calcularSueldoBruto() * 0.10) + (5 * this.getHorasExtras());

		return obraSocial + asignacionAportes + jubilatorios;

	}

}
