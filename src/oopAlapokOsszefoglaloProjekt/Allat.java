package oopAlapokOsszefoglaloProjekt;

public abstract class Allat {

	private String nev;
	private int suly;

	public Allat(String nev, int suly) {

		setNev(nev);
		setSuly(suly);
	}

	public String getNev() {
		return nev;
	}

	private void setNev(String nev) {
		if (nev != null && !nev.isEmpty()) {
			this.nev = nev;
		} else {
			throw new IllegalArgumentException("A nev kitoltese kotelezo!");

		}
	}

	public int getSuly() {
		return suly;
	}

	private void setSuly(int suly) {
		if (suly >= 2) {
			this.suly = suly;
		} else {
			throw new IllegalArgumentException("A suly minimum 2 kg!");
		}
	}
	
	public abstract double napiEtelAdag();

}
