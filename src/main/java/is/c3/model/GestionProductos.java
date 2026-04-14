package is.c3.model;

import java.util.List;

/**
 * Interfaz genérica para la gestión del stock productos del tipo T
 * 
 * @param <T> tipo de producto gestionado
 */
public interface GestionProductos<T> {
	
	/**
	 * Comprobar si existe un objeto en el listado 
	 * 
	 *  @return True o False si la entidad de tipo T existe
	 */

	Boolean find(T t);

	/**
	 * Operación de lectura Encuentra todas las entidades de tipo T del repositorio
	 * 
	 * @return todas las entidades del tipo T encontradas en el repositorio de
	 *         persistencia
	 */
	List<T> findAll();

	/**
	 * Operación de escritura Almacena en el listado la entidad, de tipo T, pasada
	 * como parámetro
	 * 
	 * @param t entidad a persistir
	 */
	void save(T t);


	/**
	 * Operación de borrado Elimina del listado la entidad pasada como parámetro
	 * 
	 * @param t entidad a eliminar
	 */
	void delete(T t);

	/**
	 * Operación de guardado Añade varios T a la vez, a través de un array
	 * 
	 * @param t array de objetos T
	 */
	void saveAll(T[] t);

	/**
	 * Operación de borrado Elimina todos los objetos del listado
	 */
	void deleteAll();

}
