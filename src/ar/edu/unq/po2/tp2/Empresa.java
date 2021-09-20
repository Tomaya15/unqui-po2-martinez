package ar.edu.unq.po2.tp2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String nombre;
	private int cuit;
	private List<Empleado> empleados = new ArrayList<Empleado>(); 

	public Empresa(String nombre, int cuit) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	
	public double calcularTotalSueldoNeto() {
		int i = 0; 
		double totalSueldoNeto = 0;
		while ( i <= empleados.size()) {
			Empleado empleado = empleados.get(i);
			totalSueldoNeto = totalSueldoNeto + empleado.calcularSueldoNeto();
			i++;
		}
		return totalSueldoNeto;
	}
	public double calcularTotalRetenciones() {
		int i = 0;
		double totalRetenciones = 0;
		while ( i <= empleados.size()){
			Empleado empleado = empleados.get(i);
			totalRetenciones = totalRetenciones + empleado.calcularRetenciones(); 
			i++;
		}
		return totalRetenciones;
	}
	public double calcularTotalSueldoBruto() {
		int i = 0;
		double totalSueldoBruto = 0;
		while ( i <= empleados.size() ) {
			Empleado empleado = empleados.get(i);
			totalSueldoBruto = totalSueldoBruto + empleado.calcularSueldoBruto();
			i++;
		}
		return totalSueldoBruto;
	}
	public List<ReciboHaberes> realizarLiquidacionDeSueldos() {
		List<ReciboHaberes> reciboHaberesList = new ArrayList<ReciboHaberes>();
		int i = 0;
		while ( i <= empleados.size() ) { // Hago un recorrido sobre los empleados.
			Empleado empleado = empleados.get(i); // Tomo a un empleado
			ReciboHaberes reciboHaberesDeEmpleado = new ReciboHaberes(empleado.getNombre(), empleado.getDireccion(),  // Genero el recibo de haberes 
									empleado.calcularSueldoBruto(), empleado.calcularSueldoNeto(), empleado.getDesgloceDeConceptos());
			reciboHaberesList.add(reciboHaberesDeEmpleado); // Añado el recibo de haberres a la lista de un empleado
			
		}
		return reciboHaberesList;
	}
	
}

