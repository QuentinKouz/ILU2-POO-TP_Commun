package model;

public class FormulaireHotel extends Formulaire{
	private int jour; 
	private int mois;
	private int numChambre;
	private int nbLitSimple;
	private int nbLitDouble;
	
	
	public FormulaireHotel(int jour, int mois, int nbLitSimple, int nbLitDouble) {
		super(jour, mois);
		this.jour = jour;
		this.mois = mois;
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
	}


	public int getJour() {
		return jour;
	}


	public int getMois() {
		return mois;
	}


	public int getNumChambre() {
		return numChambre;
	}


	public void setNumChambre(int numChambre) {
		this.numChambre = numChambre;
	}


	public int getNbLitSimple() {
		return nbLitSimple;
	}


	public int getNbLitDouble() {
		return nbLitDouble;
	}
	
	
}
