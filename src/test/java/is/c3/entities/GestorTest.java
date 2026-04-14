package is.c3.entities;


import is.c3.model.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class GestorTest {

	private Almacen almacen;

	@BeforeEach
	public void setUp() {
		// Antes de cada test, creamos una nueva instancia del almacen
		almacen = new Almacen();
	}

	@Test
	public void testdelete() {
		
		Paquete p1 = new Paquete("raspberry 4", "Calle A", 788);
	    Paquete p2 = new Paquete("raspberry 5", "Calle B", 815);
		
		almacen.save(p1);
		almacen.save(p2);
		
		almacen.delete(p1);

		assertFalse(almacen.find(p1), "Producto elimando incorrectamente");
	}
	
	@Test
	public void testSave() {
		
		Paquete p1 = new Paquete("raspberry 5", "Calle B", 815);
		
		//Añadir un producto
		almacen.save(p1);

		assertTrue(almacen.find(p1), "Producto añadido correctamente");
	}
	
	@Test
	public void testDeleteAll() {
		
		Paquete p1 = new Paquete("raspberry 4", "Calle A", 788);
	    Paquete p2 = new Paquete("raspberry 5", "Calle B", 815);
		
		almacen.save(p1);
		almacen.save(p2);
		
		//Eliminar todos los productos
		almacen.deleteAll();
		
		assertEquals(0, almacen.getProductos().size(), "Eliminados incorrectamente");
	}
	
	@Test
	public void testSaveAll() {
		
		Paquete p1 = new Paquete("raspberry 4", "Calle A", 788);
	    Paquete p2 = new Paquete("raspberry 5", "Calle B", 815);
		
	    Paquete[] productos = {p1, p2};
		
		// Almacenar varios productos
		almacen.saveAll(productos);		
				
		assertEquals(2, almacen.getProductos().size(), "Almacenados incorrectamente");
	}

	

}
