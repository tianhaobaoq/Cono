package ProgramaComposicionCono;
/**
 * Clase principal hecha para generar 5 conos aleatorios y los muestra
 * @author Abimael
 *
 */
public class ProgramaComposicionCono {
	/**
	 * Método que muestra la base del cono es decir, los datos de la circunferencia (x,y,R,A), además del color y la altura del cono.
	 * @param datos
	 */
	private static void imprimir(Object datos) {
		System.out.println(datos);
	}

	/**
	 * Método main que crea una variable aleatorio con java.util.random, y a través de un bucle (for) crea 5 nuevos objetos de cono, los cuales tendrán una "x" e "y" de valor 0, un rádio de valor aleatorio (situado ente 1 y 10), 
	 * una altura que sea el contador incremental del bucle (valor de i) y de color la cadena "Azul". Finalmente se imprimen los datos del cono al usuario.
	 * @param args no utiliza
	 */
	public static void main(String[] args) {
		java.util.Random aleatorio = new java.util.Random();
		for (int i = 1; i <= 5; i++) {
			int radio = aleatorio.nextInt(9) + 1;
			Cono cono = new Cono(0, 0, radio, i, "Azul");
			cono.imprimir();
		}
	}

}

