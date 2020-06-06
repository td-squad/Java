
public class PintorDeStencil {

	private Stencil stencil;
	private Spray spray;
	private Muro muro;

	public PintorDeStencil(Stencil stencil, Spray spray, Muro muro) {
		this.stencil = stencil;
		this.spray = spray;
		this.muro = muro;
	}

	public Stencil getStencil() {
		return stencil;
	}

	public void setStencil(Stencil stencil) {
		this.stencil = stencil;
	}

	public Spray getSpray() {
		return spray;
	}

	public void setSpray(Spray spray) {
		this.spray = spray;
	}

	public Muro getMuro() {
		return muro;
	}

	public void setMuro(Muro muro) {
		this.muro = muro;
	}

	public void pintarMuro() {
		if (spray.getColor().equals(muro.getColor())) {
			System.out.println("No se puede pintar un muro del mismo color que el spray");
		} else {
			System.out.println("El muro de color " + muro.getColor() + " fue pintado con un " + stencil.getForma()
					+ " de color " + spray.getColor());
		}
	}

}
