
public class Main {

	public static void main(String[] args) {
		Spray lataMorada = new Spray("Morado");
		Spray lataRoja = new Spray();
		lataRoja.setColor("Rojo");
		
		Spray lataBlanca = new Spray("Blanco");

		Stencil stencilDeElefante = new Stencil();
		stencilDeElefante.setForma("Elefante");

		Muro muroDeLaEsquina = new Muro("Lisa", "Blanco");
		
		PintorDeStencil pintorDeStencil = new PintorDeStencil(stencilDeElefante, lataBlanca, muroDeLaEsquina);
		pintorDeStencil.pintarMuro();

	}
}
