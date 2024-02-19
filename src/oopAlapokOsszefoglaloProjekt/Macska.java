package oopAlapokOsszefoglaloProjekt;

public final class Macska extends Allat {

	private boolean hosszuszoru;

	public Macska(String nev, int suly, boolean hosszuszoru) {
		super(nev, suly);
		this.hosszuszoru = hosszuszoru;
	}

	@Override
	public double napiEtelAdag() {

		return getSuly() / 70.0;

	}

	@Override
	public String toString() {
		return getNev() + getSuly() + " kg " + ((hosszuszoru) ? "hosszuszoru" : "rovidszoru");
	}

}
