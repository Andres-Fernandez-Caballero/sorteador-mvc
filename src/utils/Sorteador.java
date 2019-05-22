package utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Colección que permite ingresar elementos de cualquier tipo y devolverlos en orden aleatorio.
 * @author Carlos E. Cimino
 * @see <a href="http://www.github.com/caemci"/>http://www.github.com/caemci</a>
 */

public class Sorteador<T> implements Iterable<T> {
	private ArrayList<T> elementos;
	
	/**
     * Construye un nuevo sorteador de elementos.
     */
	public Sorteador() {
		this.elementos = new ArrayList<T>();
	}
	
	/**
     * Inserta <code>elemento</code> en el sorteador siempre y cuando no exista.
     * @param elemento El elemento a insertar.
     */
	public void insertar (T elemento) {
		if ( existe(elemento) ) {
			throw new IllegalArgumentException("Ya existe el elemento " + elemento);
		} else {
			elementos.add(elemento);
		}
	}
	
	/**
     * Inserta cada uno de los elementos de <code>elementos</code> en la colección.
     * @param elementos Los elementos a insertar.
     */
	public void insertar (T[] elementos) {
		for (T t : elementos) {
			this.elementos.add(t);
		}
	}
	
	/**
     * Inserta cada uno de los elementos de <code>elementos</code> en la colección.
     * @param elementos Los elementos a insertar.
     */
	public void insertar (ArrayList<T> elementos) {
		this.elementos = (ArrayList<T>) elementos.clone();
	}
	
	/**
     * Retorna un elemento de la colección de manera aleatoria.
     * @return un elemento de la colección de manera aleatoria.
     */
	public T proximoSorteado() {
		T elemento = null;
		if ( !estaVacio() ) {
			int a = aleatorio(this.elementos.size());
			elemento = this.elementos.remove(a); // remove() lo devuelve antes de borrarlo
		}
		return elemento;
	}
	
	/**
     * Retorna <code>true</code> si no hay elementos en la colección.
     * @return <code>true</code> si no hay elementos en esta colección.
     */
	public boolean estaVacio () {
		return this.elementos.isEmpty();
	}
	
	/**
     * Retorna <code>true</code> si existe <code>elemento</code> en la colección.
     * @param elemento El elemento a comprobar.
     * @return <code>true</code> si existe <code>elemento</code> en esta colección.
     */
	private boolean existe (T elemento) {
		return this.elementos.contains(elemento);
	}
	
	/**
     * Retorna un número entero aleatorio entre 0 y <code>n-1</code>
     * @param n Entero máximo a devolver (sin incluir)
     * @return un número entero aleatorio entre 0 y <code>n-1</code>
     */
	private int aleatorio (int n) {
		Random r = new Random(System.currentTimeMillis());
		return r.nextInt(n);
	}
	
	/**
     * Retorna un iterador para esta colección
     * @return un iterador para esta colección
     */
	@Override
	public Iterator<T> iterator() {
		return new IteratorSorteador();
	}
	
	private class IteratorSorteador implements Iterator<T> {
		@Override
		public boolean hasNext() {
			return !estaVacio();
		}

		@Override
		public T next() {
			return proximoSorteado();
		}
	}
}
