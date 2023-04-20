package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder();
		String maj = input.substring(0, 1).toUpperCase();
		String nom = maj + input.substring(1);
		chaine.append("Hello, " + nom);
		return chaine.toString();
	}

}
