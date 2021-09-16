package ar.edu.unq.po2.tp2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String nombre;
	private int cuit;
	private List<PlantaTemporal> empleadosTemporales = new ArrayList(); // PREGUNTAR 
	private List<PlantaPermanente> empleadosPermanentes= new ArrayList(); // PREGUNTAR

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
	
	public List<PlantaTemporal> getEmpleadosTemporales() {
		return empleadosTemporales;
	}

	public void setEmpleadosTemporales(List<PlantaTemporal> empleados) {
		this.empleadosTemporales = empleados;
	}
	public List<PlantaPermanente> getEmpleadosPermanentes() {
		return empleadosPermanentes;
	}

	public void setEmpleadosPermanentes(List<PlantaPermanente> empleadosPermanentes) {
		this.empleadosPermanentes = empleadosPermanentes;
	}
	
	public double calcularTotalSueldoNetoDeEmpleadosTemporales() {  
		int i = 0;
		double total = 0;
		while ( i <= empleadosTemporales.size() ){
			PlantaTemporal empleado = empleadosTemporales.get(i);
			total = total + empleado.calcularSueldoNeto(empleado.calcularSueldoBruto(),empleado.calcularRetenciones());
			i++;
		}
		return total;
	}
	
	public double calcularTotalSueldoNetoDeEmpleadosPermanentes() {
		int i = 0;
		double total = 0;
		while ( i <= empleadosPermanentes.size() ){
			PlantaPermanente empleado = empleadosPermanentes.get(i);
			total = total + empleado.calcularSueldoNeto(empleado.calcularSueldoBruto(),empleado.calcularRetenciones());
			i++;
		}
		return total;
	}
	
	public double calcularTotalSueldoNeto() { 
		return this.calcularTotalSueldoNetoDeEmpleadosPermanentes() + this.calcularTotalSueldoNetoDeEmpleadosTemporales();
	}
	
	public double calcularTotalSueldoBrutoDeEmpleadosTemporales() {  
		int i = 0;
		double total = 0;
		while ( i <= empleadosTemporales.size() ){
			PlantaTemporal empleado = empleadosTemporales.get(i);
			total = total + empleado.calcularSueldoBruto();
			i++;
		}
		return total;
	}
	public double calcularTotalSueldoBrutoDeEmpleadosPermanentes() {  
		int i = 0;
		double total = 0;
		while ( i <= empleadosPermanentes.size() ){
			PlantaPermanente empleado = empleadosPermanentes.get(i);
			total = total + empleado.calcularSueldoBruto();
			i++;	
		}
		return total;
	}
	public double calcularTotalDeSueldoBruto() {
		return calcularTotalSueldoBrutoDeEmpleadosPermanentes() + calcularTotalSueldoBrutoDeEmpleadosTemporales();
	}
	public double calcularTotalRetencionesDeEmpleadosPermanentes() {
		int i = 0;
		double total = 0;
		while ( i <= empleadosPermanentes.size() ){
			PlantaPermanente empleado = empleadosPermanentes.get(i);
			total = total + empleado.calcularRetenciones();
			i++;	
		}
		return total;
	}
	public double calcularTotalRetencionesDeEmpleadosTemporales() {
		int i = 0;
		double total = 0;
		while ( i <= empleadosTemporales.size() ){
			PlantaTemporal empleado = empleadosTemporales.get(i);
			total = total + empleado.calcularRetenciones();
			i++;	
		}
		return total;
	}
	public double calcularTotalRetenciones() {
		return this.calcularTotalRetencionesDeEmpleadosPermanentes() + this.calcularTotalRetencionesDeEmpleadosTemporales();
	}
}

