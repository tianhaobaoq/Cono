package ProgramaComposicionCono;

/**
 * Clase para generar objetos de cono
 * @author Abimael
 *
 */

public class Cono {
	/**
	 * La base del cono, que se trata del objeto círculo, ya calculado en la clase círculo
	 */
	private Circulo base;
	/**
	 * La altura del cono
	 */
	private float altura;
	/**
	 * El color del cono
	 */
	private String color;
	
	/**
	 * El constructor del cono
	 * @param cX Abcisa del centro del círculo
	 * @param cY Ordenada del centro
	 * @param r Radio
	 * @param h altura del cono
	 * @param color color del cono
	 */
	public Cono(float cX, float cY, float r, float h, String color) { // constructor
		this.base = new Circulo(cX, cY, r);
		this.altura = h;
		this.color = color;
	}

	/**
	 * Método que obtiene la base del cono (círculo del objeto círculo)
	 * @return base
	 */
	public Circulo getBase() {
		return base;
	}

	/**
	 * Método que establece la base del cono
	 * @param base Objeto círculo
	 */
	public void setBase(Circulo base) {
		this.base = base;
	}

	/**
	 * Método que obtiene el alto del cono
	 * @return altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * Método que establece la altura del cono
	 * @param altura La altura del cono
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}

	/**
	 * Método que obtiene el color del cono
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Método que establece el color del cono
	 * @param color Color del cono
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Método que imprime la base (datos del objeto Círculo), la "h" (altura), y el color
	 */
	public void imprimir() {
		base.imprimir();
		System.out.println(" h=" + altura + " c=" + color);
	}
}

