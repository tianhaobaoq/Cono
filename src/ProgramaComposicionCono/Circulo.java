package ProgramaComposicionCono;

/**
 * Método para generar objetos de círculo (base del cono) (Nuevo commit)
 * @author Abimael
 *
 */

public class Circulo {
	/**
	 * El ancho y el alto del círculo
	 */
	private float x, y;
	/**
	 * El radio del círculo
	 */
	private float radio;

	/**
	 * El constructor del círculo
	 * @param cX Abcisa del centro del círculo
	 * @param cY Ordenada del centro
	 * @param r Radio
	 */
	public Circulo(float cX, float cY, float r) { // constructor
		this.x = cX;
		this.y = cY;
		this.radio = r;
	}

	/**
	 * Método que obtiene la x (ancho) del círculo
	 * @return x
	 */
	public float getX() {
		return x;
	}

	/**
	 * Método que establece la x del círculo
	 * @param x El valor x (ancho) del círculo
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * Método que obtiene la y (alto) del círculo
	 * @return y
	 */
	public float getY() {
		return y;
	}

	/**
	 * Método que establece la y del círculo
	 * @param y El valor y (alto) del círculo
	 */
	public void setY(float y) {
		this.y = y;
	}
	
	/**
	 * Método que obtiene el radio del circulo
	 * @return radio
	 */
	public float getRadio() {
		return radio;
	}

	/**
	 * Método que establece el radio del círculo
	 * @param radio El radio
	 */
	public void setRadio(float radio) {
		this.radio = radio;
	}

	/**
	 * Método que calcula el área de la circunferencia a través de una fórmula
	 * @return (float) Math.PI * radio * radio
	 */
	public float area() {
		return (float) Math.PI * radio * radio;
	}
	
	/**
	 * Método que imprime los valores "x","y","r" y "A"; de la circunferencia
	 */
	public void imprimir() {
		System.out.print(" x=" + x);
		System.out.print(" y=" + y);
		System.out.print(" r=" + radio);
		System.out.print(" A=" + area());
	}
}
