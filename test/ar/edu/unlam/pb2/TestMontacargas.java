package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMontacargas {
	
	@Test
	public void testQueVerifiqueQueSeCreoUnMontaCarga() {
		Montacargas miMontacarga = new Montacargas(200.0);
		
		assertNotNull(miMontacarga);
	}

	@Test
	public void testQueAgregueUnaCarga() {
		Carga miCarga = new Carga("Piedras", 500.0);
		Montacargas miMontacargas = new Montacargas(700.0);
		
		Boolean cargo = miMontacargas.cargar(miCarga);
		assertTrue(cargo);
	}
	
	@Test
	public void testQueDescargueUnaCarga() {
		Carga miCarga = new Carga("Piedras", 500.0);
		Montacargas miMontacargas = new Montacargas(700.0);
		miMontacargas.cargar(miCarga);
		
		Boolean descargo = miMontacargas.descargar();
		assertTrue(descargo);

	}

	
	@Test
	public void testQueObtengaLaCarga() {
		Carga miCarga = new Carga("Piedras", 500.0);
		Carga miCarga2 = new Carga("Piedras", 100.0);
		Montacargas miMontacargas = new Montacargas(700.0);
		
		miMontacargas.cargar(miCarga);
		miMontacargas.cargar(miCarga2);
		
		Double valorEsperado = 600.0;
		Double valorObtenido = miMontacargas.obtenerCarga();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	
	@Test
	public void testQueObtengaElPromedioDeCargas() {
		Carga miCarga = new Carga("Piedras", 500.0);
		Carga miCarga2 = new Carga("Piedras", 100.0);
		Montacargas miMontacargas = new Montacargas(700.0);
		
		miMontacargas.cargar(miCarga);
		miMontacargas.cargar(miCarga2);
		
		Double valorEsperado = 300.0;
		Double valorObtenido = miMontacargas.obtenerCargaPromedio();
		
		assertEquals(valorEsperado, valorObtenido);
	}
}
