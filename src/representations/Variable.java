package representations;

import java.util.Set;

public class Variable {

	private String nom;
	private Set<String> domaine;
	
	// Ajout du Set dans un second temps
	public Variable(String nom, Set<String> domaine){
		this.nom = nom;
		this.domaine = domaine;
	}
	
}