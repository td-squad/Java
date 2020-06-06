
public class Utils {
	
	public static void validaNumeroPositivo(int valor, String mensajeError) {
		if(valor <= 0) {
			throw new RuntimeException(mensajeError);
		}
	}
	
	public static void validaStringVacio(String valor, String mensajeError) {
		if(valor.isEmpty()) {
			throw new RuntimeException(mensajeError);
		}
	}


}
