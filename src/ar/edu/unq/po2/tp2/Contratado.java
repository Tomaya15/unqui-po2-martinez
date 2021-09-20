package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contratado extends Empleado {
	private int numeroContrato;
	private String medioPago;

	public Contratado(String nombre, String estadoCivil, String direccion, LocalDate fechaNacimiento,
			float sueldoBasico) {
		super(nombre, estadoCivil, direccion, fechaNacimiento, sueldoBasico);
		// TODO Auto-generated constructor stub
	}

	public int getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public String getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}
	public double calcularSueldoBruto(){
		return this.calcularSueldoNeto();
	}
	public double calcularRetenciones() {
		return 50; // Gastos administrativos contables.
	}
	// Desgloce de conceptos para el cobro de un empleado de planta temporal.
	public List<String> getDesgloceDeConceptos(){
		 List<String> list  = new ArrayList<String>();
		 list.add("Gastos administrativos contracturales -: +" + this.calcularRetenciones());	   
    			
      return list;
    }
}