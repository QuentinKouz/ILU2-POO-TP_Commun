package model;

public class FormulaireRestaurant extends Formulaire{
	private int jour;
	private int mois;
	private int numTable;
	private int nbPersonnes;
	private int numService;

	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService) {
		super(jour, mois);
		this.jour = jour;
		this.mois = mois;
		this.nbPersonnes = nbPersonnes;
		this.numService = numService;

	}

	public Integer getIdentificationEntite() {
		return numTable;
	}

	public Integer getNombrePersonnes() {
		return nbPersonnes;
	}

	public Integer getNumService() {
		return numService;
	}

	public void setIdentificationEntite(int identification2) {
		this.numTable = identification2;
	}

	public Integer getJour() {
		return jour;
	}

	public Integer getMois() {
		return mois;
	}
	
	
}
