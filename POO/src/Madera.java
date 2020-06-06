
public class Madera {

	private int alto;
	private int ancho;
	private String tipo;
	private int grosor;
	
	//Imprimir la descripcion de la madera o mejor dicho objetos
	//modificador de acceso, tipo de retorno, nombre del método y los parámetros
	public void imprimeDescripcion() {
		System.out.println("******** Madera ********");
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Madera [alto=" + alto + ", ancho=" + ancho + ", tipo=" + tipo + ", grosor=" + grosor + "]";
	}


	public int getAlto() {
		return alto;
	}
	
	
	public void setAlto(int alto) {
		Utils.validaNumeroPositivo(alto, "Alto invalido");
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		Utils.validaNumeroPositivo(ancho, "ancho invalido");
		this.ancho = ancho;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		Utils.validaStringVacio(tipo, "tipo invalido");
		this.tipo = tipo;
	}

	public int getGrosor() {
		return grosor;
	}

	public void setGrosor(int grosor) {
		Utils.validaNumeroPositivo(grosor, "Grosor invalido");
		this.grosor = grosor;
	}
}
