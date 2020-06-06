
public class CasaDePerro {
	
	private Madera madera;
	private Clavo clavo;
	
	public void armarCasa(Madera madera, Clavo clavo) {
		madera.imprimeDescripcion();
		System.out.println("Tenemos el clavo: " + clavo.toString());
	}
	

}
