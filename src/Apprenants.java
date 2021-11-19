package Tp_java_exo1;

public abstract class Apprenants  {
		  private String nom;
		  private String prenom;
		  private int age;
		  private String statut;
	  
		  public Apprenants(String nom, String prenom, int age, String statut) {
			  this.nom=nom;
			  this.prenom=prenom;
			  this.age=age;
			  this.statut=statut;
		  }
		  
		  public String getNom() {
			  return this.nom;
		  }
		  
		  public void setNom( String nom) {
			  this.nom=nom;
		  }
		  
		  public String getPrenom() {
			  return this.prenom;
		  }
		  
		  public void setPrenom( String prenom) {
			  this.prenom=prenom;
		  }
		  
		  
		  public int getAge() {
			  return this.age;
		  }
		  
		  public void setAge( int age) {
			  this.age=age;
		  }
		  
		  public String getStatut() {
			  return this.statut;
		  }
		  
		  public void setStatut( String statut) {
			  this.statut=statut;
		  }
		  
		 	public void etudier() {
		 		 System.out.println("J'etudie");
		 	}
		 	

	}

