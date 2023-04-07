package model;

public class FormulaireSpectacle extends Formulaire{
	private int jour;
	private int mois;
	private int numPlace;
	private int numZone;

	public FormulaireSpectacle(int jour, int mois, int numZone) {
		super(jour,mois);
		this.jour = jour;
		this.mois = mois;
		this.numZone = numZone;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getNumPlace() {
		return numPlace;
	}

	public void setNumPlace(int numPlace) {
		this.numPlace = numPlace;
	}

	public int getNumZone() {
		return numZone;
	}
}
