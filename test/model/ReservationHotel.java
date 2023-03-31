package model;

public class ReservationHotel extends Reservation{
	private int jour;
	private int mois;
	private int nbLitSimple;
	private int nbLitDouble;
	private int numChambre;
	
	public ReservationHotel(int jour, int mois, int nbLitSimple,int nbLitDouble,int numChambre) {
		super(jour,mois);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.numChambre = numChambre;
	}
	
	public String toString() {
		return "Le " + jour + "/" + mois + " : Chambre n°" + numChambre + "avec " 
	+ nbLitDouble + " lit(s) double(s) et " + nbLitSimple + " lit(s) simple(s)." + "\n";
	}
}