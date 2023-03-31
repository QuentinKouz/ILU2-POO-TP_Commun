package model;

public class ReservationSpectacle extends Reservation{
	private int jour;
	private int mois;
	private int numZone;
	private int numChaise;	
	
	public ReservationSpectacle(int jour,int mois,int numZone, int numChaise) {
		super(jour,mois);
		this.numZone = numZone;
		this.numChaise = numChaise;
	}
	
	public String toString() {
		return "Le " + jour + "/" + mois + " dans la zone n°" + numZone + " à la chaise n°" + numChaise + ".\n";
	}
}
