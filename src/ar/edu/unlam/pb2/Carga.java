package ar.edu.unlam.pb2;

public class Carga {
	
	private String descripcion;
	private Double peso;
	
	public Carga(String descripcion,Double peso) {
		this.descripcion = descripcion;
		this.peso = peso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
	
	
}
