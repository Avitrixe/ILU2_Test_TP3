package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		if(input == null || input.isBlank()) {
			return "Hello, my friend";
		}
		StringBuilder chaine = new StringBuilder();
		String chaine_maj = input.toUpperCase();
		if (chaine_maj == input){
			chaine.append("Hello, " + chaine_maj + " !");
		}
		else {
			String maj = input.substring(0, 1).toUpperCase();
			String nom = maj + input.substring(1);
			chaine.append("Hello, " + nom);
		}
		return chaine.toString();
	}

}
