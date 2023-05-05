package ilu2;

public class Welcome {
	
	private static String majNom(String nom) {
		String maj = nom.substring(0, 1).toUpperCase();
		String nomAvecMaj = maj + nom.substring(1);
		return nomAvecMaj;
	}
	
	private static int tailleTab(String[] tab) {
		int taille = 0;
		for(int i = 0; i<tab.length; i++) {
			if(tab[i] == null) return i;
			taille ++;
		}
		return taille;
	}
	
	private static String[] faireListeNomsDistinct(String[] noms) {
		String[] noms_distinct = new String[noms.length];
		int nombre_noms_distinct = 0;
		boolean dedans;
		for(int i = 0; i<noms.length; i++) {
			dedans = false;
			for(int j = 0; j<nombre_noms_distinct; j++) {
				if(noms[i].equals(noms_distinct[j])) dedans = true;
				
			}
			if(!dedans) {
				noms_distinct[nombre_noms_distinct] = noms[i];
				nombre_noms_distinct ++;
			}
		}
		return noms_distinct;
	}
	
	private static int[] compter_noms(String[] noms_non_distinct, String[] noms_distinct, int taille_noms_distinct) {
		int[] compteur = new int[noms_non_distinct.length];
		for(int i = 0; i<taille_noms_distinct; i++) {
			compteur[i] = 0;
			for(int j = 0; j<noms_non_distinct.length; j++) {
				if(noms_distinct[i].equals(noms_non_distinct[j])) compteur[i] ++;
			}
		}
		return compteur;
	}
	
	private static boolean etreDansNoms(String[] noms, String nom) {
		int taille_noms = tailleTab(noms);
		boolean estDedans = false;
		for(int i = 0; i<taille_noms; i++) {
			if(noms[i].equals(nom)) estDedans = true;
		}
		return estDedans;
	}
	
	private static String afficherPhraseBase(String[] noms, int noms_size, int[] compteur) {
		StringBuilder chaine = new StringBuilder();
		boolean yodaInNoms = etreDansNoms(noms, "yoda");
		if(!yodaInNoms) chaine.append("Hello");
		for(int i=0; i<noms_size; i++) {
			if(i == noms_size-1 && i != 0) {
				chaine.append(" and ").append(Welcome.majNom(noms[i]));
			}
			else {
				if(yodaInNoms && i == 0) chaine.append(Welcome.majNom(noms[i]));
				else chaine.append(", ").append(Welcome.majNom(noms[i]));
			}
			if(compteur[i] != 1) {
				chaine.append(" (x" + compteur[i] + ")");
			}
		}
		if(yodaInNoms) chaine.append(", Hello");
		return chaine.toString();
	}
	
	private static String afficherPhraseCrie(String[] noms, int noms_size, int[] compteur) {
		StringBuilder chaine = new StringBuilder();
		boolean yodaInNoms = etreDansNoms(noms, "YODA");
		if(!yodaInNoms) chaine.append("HELLO");
		for(int i=0; i<noms_size; i++) {
			if(i == noms_size-1 && i != 0) {
				chaine.append(" AND ").append(noms[i]);
			}
			else {
				if(yodaInNoms && i == 0) chaine.append(noms[i]);
				else chaine.append(", ").append(noms[i]);
			}
			if(compteur[i] != 1) {
				chaine.append(" (x" + compteur[i] + ")");
			}
		}
		if(yodaInNoms) chaine.append(", HELLO");
		chaine.append(" !");
		return chaine.toString();
	}
	
	private static String gererPleinNoms(String[] noms, String[] noms_non_distinct) {
		int taille_noms = tailleTab(noms);
		String[] noms_maj = new String[taille_noms];
		int nombre_noms_maj = 0;
		String[] noms_min = new String[taille_noms];
		int nombre_nom_min = 0;
		for(int i = 0; i<taille_noms; i++) {
			if(noms[i].toUpperCase() == noms[i]) {
				noms_maj[nombre_noms_maj] = noms[i];
				nombre_noms_maj ++;
			}
			else {
				noms_min[nombre_nom_min] = noms[i];
				nombre_nom_min ++;
			}
		}
		int taille_noms_min = tailleTab(noms_min);
		int taille_noms_max = tailleTab(noms_maj);
		int[] compteur_nom_min = compter_noms(noms_non_distinct, noms_min, taille_noms_min);
		int[] compteur_nom_maj = compter_noms(noms_non_distinct, noms_maj, taille_noms_max);
		StringBuilder chaine = new StringBuilder();
		if(nombre_nom_min > 0) {
			chaine.append(afficherPhraseBase(noms_min, nombre_nom_min, compteur_nom_min));
			if(nombre_noms_maj > 0) chaine.append(". AND ");
		}
		if(nombre_noms_maj > 0) chaine.append(afficherPhraseCrie(noms_maj, nombre_noms_maj, compteur_nom_maj));
		return chaine.toString();
	}		
		
	
	public static String welcome(String input) {
		if(input == null || input.isBlank()) {
			return "Hello, my friend";
		}
		input = input.replaceAll("\\s", "");
		String[] noms_non_distinct = input.split(",");
		String[] noms = faireListeNomsDistinct(noms_non_distinct);
		if(noms.length > 1) {
			String chaine = gererPleinNoms(noms, noms_non_distinct);
			return chaine;
		}
		StringBuilder chaine = new StringBuilder();
		String chaine_maj = input.toUpperCase();
		if (chaine_maj == input){
			chaine.append("Hello, ").append(chaine_maj).append(" !");
		}
		else {
			chaine.append("Hello, ").append(Welcome.majNom(input));;
		}
		return chaine.toString();
	}

}
