package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboHaberes {
	private LocalDate fechaEmision;

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public ReciboHaberes(LocalDate fechaEmision) {
		super();
		this.fechaEmision = fechaEmision;
	}
	
}
