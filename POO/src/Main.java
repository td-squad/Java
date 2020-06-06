
public class Main {

	public static void main(String [] args) {
		/*Madera madera = new Madera();
		madera.setAlto(10);
		madera.setAncho(20);
		madera.setGrosor(4);
		madera.setTipo("Pimno");
		Clavo clavo = new Clavo();
		CasaDePerro casaDePerro = new CasaDePerro();
		casaDePerro.armarCasa(madera, clavo);*/
		
		Pino pino = new Pino();
		pino.setAlto(10);
		pino.setAncho(4);
		pino.setGrosor(5);
		pino.setTipo("Pino");
		pino.setCalidad("Insigne");
		
		pino.imprimeDescripcion();
			
	}
}
