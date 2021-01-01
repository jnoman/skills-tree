package application;

public class Niveau extends Competence{
   private int id_user;
   private int niveau;
   
	public Niveau(int id_competence, int id_user, String title, String reference, int niveau) {
		super(id_competence,title,reference);
		this.id_user = id_user;
		this.niveau = niveau;
	}
	
	public Niveau(int id_competence, String title, String reference, int niveau) {
		super(id_competence,title,reference);
		this.niveau = niveau;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

}