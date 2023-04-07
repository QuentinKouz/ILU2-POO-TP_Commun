package model;

public class CentraleReservation <T extends EntiteReservable> {
	private T[] tabEntite;
	private int nbReservation;
	
	public CentraleReservation(T[] tabEntite, int nbReservation) {
		this.tabEntite = tabEntite;
		this.nbReservation = nbReservation;
	}
	
	public int ajouterEntite(T entite) {
		tabEntite[nbReservation + 1] = entite;
		entite.setIdentification(nbReservation++);
		nbReservation++;
		return entite.getIdentification();
	}
	
	public int[] donnerPossibilites(Formulaire formulaire) {
		int[] entiteDispo = new int[tabEntite.length];
		for (int i=0;i<tabEntite.length;i++) {
			if(tabEntite[i].estLibre(formulaire)) {
				entiteDispo[i] = 0;
			}else {
				entiteDispo[i] = 1;
			}
		}
		return entiteDispo;
	}
}
