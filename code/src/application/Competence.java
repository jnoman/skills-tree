package application;



public class Competence {
   private int id;
   private String title;
   private String reference;
   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public Competence(int id, String title, String reference) {
		super();
		this.id = id;
		this.title = title;
		this.reference = reference;
	}
   
   
}