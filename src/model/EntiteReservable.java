package model;


public abstract class EntiteReservable <T extends Formulaire>{
	private CalendrierAnnuel calendrierPersonnel = new CalendrierAnnuel();
	private int identification;
	
	
	public int getIdentification() {
		return identification;
	}
	public void setIdentification(int identification) {
		this.identification = identification;
	}
	
	public boolean estLibre(T formulaire) {
		return calendrierPersonnel.estLibre(formulaire.getJour(),formulaire.getMois());
	}
	
	public abstract void compatible(T formulaire);
	public abstract void reserver(T formulaire);
}
