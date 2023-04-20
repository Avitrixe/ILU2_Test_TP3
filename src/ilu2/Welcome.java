package ilu2;

public class Welcome {
	
	private static String majNom(String nom) {
		String maj = nom.substring(0, 1).toUpperCase();
		String nomAvecMaj = maj + nom.substring(1);
		return nomAvecMaj;
	}
	
	public static String welcome(String input) {
		if(input == null || input.isBlank()) {
			return "Hello, my friend";
		}
		StringBuilder chaine = new StringBuilder();
		String[] noms = input.split(",");
		if(noms.length > 1) {
			String nom1 = Welcome.majNom(noms[0]);
			String nom2 = Welcome.majNom(noms[1]);
			chaine.append("Hello, ").append(nom1).append(", ").append(nom2);
			return chaine.toString();
		}
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
