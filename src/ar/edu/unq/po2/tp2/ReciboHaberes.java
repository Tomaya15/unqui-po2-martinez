package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.List;

public class ReciboHaberes {
	private String nombreEmpleado;
	private String direccion;
	private LocalDate fechaEmision = LocalDate.now();
	private double sueldoBruto;
	private double sueldoNeto;
	private List<String> desgloceDeConceptos;
	

	public ReciboHaberes(String nombreEmpleado, String direccion, double sueldoBruto,
			double sueldoNeto, List<String> desgloceDeConceptos) {
		super();
		this.nombreEmpleado = nombreEmpleado;
		this.direccion = direccion;
		this.fechaEmision = LocalDate.now(); // Ya que la fecha de emision es el dia que se genera, puse la actual en la que se invoce un reciboHaberes.
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.desgloceDeConceptos = desgloceDeConceptos;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public double getSueldoNeto() {
		return sueldoNeto;
	}

	public void setSueldoNeto(double sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}

	public List<String> getDesgloceDeConceptos() {
		return desgloceDeConceptos;
	}

	public void setDesgloceDeConceptos(List<String> desgloceDeConceptos) {
		this.desgloceDeConceptos = desgloceDeConceptos;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}


}
