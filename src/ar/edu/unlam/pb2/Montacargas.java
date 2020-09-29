package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Montacargas {
	
	private Double pesoMaximo;
	private ArrayList<Carga> listaCarga = new ArrayList<Carga>();
	
	public Montacargas(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}
	
	public Boolean cargar(Carga carga) {
		if(this.obtenerCarga() + carga.getPeso() < this.pesoMaximo) {
		this.listaCarga.add(carga);
		return true;
		}	
		return false;
	}

	public Boolean descargar() {
		if(!this.listaCarga.isEmpty()) {
			this.listaCarga.clear();
			return true;
		}
		return false;
	}
	
	public Double obtenerCarga() {
		Double pesoActual = 0.0;
		for(Carga carga : listaCarga) {
			pesoActual = pesoActual + carga.getPeso();
		}
		return pesoActual;
	}
	
	public Double obtenerCargaPromedio() {
		Double pesoActual = 0.0;
		Integer cantidadCargasCompletadas = 0;
		Double promedio = 0.0;
		
		for(Carga carga : this.listaCarga) {
			pesoActual = pesoActual + carga.getPeso();
			cantidadCargasCompletadas = cantidadCargasCompletadas + 1;
		}	
		return promedio = pesoActual / cantidadCargasCompletadas;
	
	}

	public Double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public ArrayList<Carga> getListaCarga() {
		return listaCarga;
	}

	public void setListaCarga(ArrayList<Carga> listaCarga) {
		this.listaCarga = listaCarga;
	}

	
}

