package ilu2;

public class Welcome {
	
	private static String majNom(String nom) {
		String maj = nom.substring(0, 1).toUpperCase();
		String nomAvecMaj = maj + nom.substring(1);
		return nomAvecMaj;
	}
	
	private static String gererPleinNoms(String noms[]) {
		StringBuilder chaine = new StringBuilder();
		StringBuilder chaine_cri = new StringBuilder();
		chaine_cri.append("AND HELLO");
		chaine.append("Hello");
		for(int i=0; i<noms.length;i++) {
			if(noms[i].toUpperCase() == noms[i]) {
				chaine_cri.append(", " + noms[i]);
			}
			else {
				chaine.append(", ").append(Welcome.majNom(noms[i]));
			}
		}
		if(chaine_cri.toString().equalsIgnoreCase("AND HELLO")) {
			return chaine.toString();
		}
		else {
			chaine.append(".");
			chaine_cri.append(" !");
			chaine.append(" ").append(chaine_cri.toString());
			return chaine.toString();
		}
	}
	
	public static String welcome(String input) {
		if(input == null || input.isBlank()) {
			return "Hello, my friend";
		}
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
