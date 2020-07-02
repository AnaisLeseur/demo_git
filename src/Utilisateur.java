
/**
 * classe de l'utilisateur 
 * @author vincent
 *
 */
public class Utilisateur {
	
	// ----- props -----
	private int id;
	private String nom;
	private String prenom;
	private String telephone;

	
	// ----- ctors -----
	public Utilisateur() {
	}
	
	public Utilisateur(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	
	// getter setter
	
	
	
	

}// end class
