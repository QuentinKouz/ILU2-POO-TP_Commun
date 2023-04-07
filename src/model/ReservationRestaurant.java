package model;

public class ReservationRestaurant extends Reservation{
	private int jour;
	private int mois;
	private int numService;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour,mois);
		this.jour = jour;
		this.mois = mois;
		this.numService = numService;
		this.numTable = numTable;
	}
	
	public String toString() {
		String service;
		if (numService == 1) {
			service = "premier service";
		}else {
			service = "deuxième service";
		}
		return "Le " + jour + "/" + mois + " : table n°" + numTable + " pour le " + service + ".\n";
	}
}
