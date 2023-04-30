package ilu2;

public class Welcome {
	
	private static String majNom(String nom) {
		String maj = nom.substring(0, 1).toUpperCase();
		String nomAvecMaj = maj + nom.substring(1);
		return nomAvecMaj;
	}
	
	private static String afficherPhraseBase(String[] noms, int noms_size) {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Hello");
		for(int i=0; i<noms_size; i++) {
			if(i == noms_size-1 && i != 0) {
				chaine.append(" and ").append(Welcome.majNom(noms[i]));
			}
			else {
				chaine.append(", ").append(Welcome.majNom(noms[i]));
			}
		}
		return chaine.toString();
	}
	
	private static String afficherPhraseCrie(String[] noms, int noms_size) {
		StringBuilder chaine = new StringBuilder();
		chaine.append(". AND HELLO");
		for(int i=0; i<noms_size; i++) {
			if(i == noms_size-1 && i != 0) {
				chaine.append(" AND ").append(noms[i]);
			}
			else {
				chaine.append(", ").append(noms[i]);
			}
		}
		chaine.append(" !");
		return chaine.toString();
	}
	
	private static String gererPleinNoms(String[] noms) {
		String[] noms_maj = new String[noms.length];
		int nombre_noms_maj = 0;
		String[] noms_min = new String[noms.length];
		int nombre_nom_min = 0;
		for(int i = 0; i<noms.length; i++) {
			if(noms[i].toUpperCase() == noms[i]) {
				noms_maj[nombre_noms_maj] = noms[i];
				nombre_noms_maj ++;
			}
			else {
				noms_min[nombre_nom_min] = noms[i];
				nombre_nom_min ++;
			}
		}
		StringBuilder chaine = new StringBuilder();
		chaine.append(afficherPhraseBase(noms_min, nombre_nom_min));
		if(nombre_noms_maj > 0) {
			chaine.append(afficherPhraseCrie(noms_maj, nombre_noms_maj));
		}
		return chaine.toString();
	}		
		
	
	public static String welcome(String input) {
		if(input == null || input.isBlank()) {
			return "Hello, my friend";
		}
		input = input.replaceAll("\\s", "");
		String[] noms = input.split(",");
		if(noms.length > 1) {
			String chaine = gererPleinNoms(noms);
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
