package is.c3.entities;

import java.util.logging.Logger;

import is.c3.model.Producto;

/**
 * Datos de un paquete
 */
public class Paquete implements Producto, Comparable<Paquete> {
	private static Logger log = Logger.getLogger(Paquete.class.getName());
	private String descripcion;
	private String destino;
	private int peso;

	// Constructor
	public Paquete(String descripcion, String destino, int peso) {
		this.descripcion = descripcion;
		this.destino = destino;
		this.peso = peso;
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String getDestino() {
		return destino;
	}

	@Override
	public void setDestino(String destino) {
		this.destino = destino;
		
	}

	@Override
	public int getPeso() {
		return peso;
	}

	@Override
	public void setPeso(int peso) {
		this.peso = peso;
		
	}
	
	@Override
	public String toString() {
		String sms = "\nDatos del paquete: \ndescripcion: " + descripcion + "\nDestino: " + destino+ "\nPeso: "
				+ peso + "\n***************************************\n";
		return sms;
	}

	// La ordenación natural se llevará a cabo por el peso del paquete, de un modo ascendente
	@Override
	public int compareTo(Paquete p1) {
		return (p1.peso - this.peso);
	}

	

}
