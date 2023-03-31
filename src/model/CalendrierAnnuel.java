package model;

public class CalendrierAnnuel {
	private Mois[] calendrier;
	
	public CalendrierAnnuel() {
		calendrier = new Mois[12];
		calendrier[0] = new Mois("Janvier",31);
		calendrier[1] = new Mois("Février",28);
		calendrier[2] = new Mois("Mars",31);
		calendrier[3] = new Mois("Avril",30);
		calendrier[4] = new Mois("Mai",31);
		calendrier[5] = new Mois("Juin",30);
		calendrier[6] = new Mois("Juillet",31);
		calendrier[7] = new Mois("Août",31);
		calendrier[8] = new Mois("Septembre",30);
		calendrier[9] = new Mois("Octobre",31);
		calendrier[10] = new Mois("Novembre",30);
		calendrier[11] = new Mois("Décembre",31);
		
	}
	
	public boolean estLibre(int numJour,int numMois) {
		return calendrier[numMois - 1].estLibre(numJour);
	}
	
	public boolean reserver(int numJour,int numMois) {
		if (estLibre(numJour,numMois)) {
			calendrier[numMois - 1].reserver(numJour);
			return true;
		}else {
			return false;
		}
	}
	
	
	// Classe Interne
	private static class Mois{
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom,int nbJours) {
			this.nom = nom;
			jours = new boolean[nbJours];
		}
		
		private boolean estLibre(int numJour) {
			return !(jours[numJour - 1]);
		}
		
		private void reserver(int numJour) throws IllegalStateException{
			if (estLibre(numJour)) {
				jours[numJour - 1] = true;
			} else {
				throw new IllegalStateException();
			}
		}
	}
}
