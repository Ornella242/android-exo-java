package Tp_java_exo1;

public class Etudiant extends Apprenants implements Etude {

	private String matricule;
	private String filiere;
	private double noteC;
	private double noteEx;

	
	 public Etudiant(String nom, String prenom, int age, String statut,String matricule,String filiere, double noteC,double noteEx) {
		 
		 super(nom,prenom,age,statut);
		  this.matricule=matricule;
		  this.filiere=filiere;
		  this.noteC=noteC;
		  this.noteEx=noteEx;
		  
	  }
	  
	  public String getMatricule() {
		  return this.matricule;
	  }
	  
	  public void setMatricule( String matricule) {
		  this.matricule=matricule;
	  }
	  
	  public String getFiliere() {
		  return this.filiere;
	  }
	  
	  public void setFiliere( String filiere) {
		  this.filiere=filiere;
	  }
	  
	  public double getNoteC() {
		  return this.noteC;
	  }
	  
	  public void setNoteC( double noteC) {
		 this.noteC=noteC;
	  }
	  
	  public double getNoteEx() {
		  return this.noteEx;
	  }
	  
	  public void setNoteEx( double noteEx) {
		  this.noteEx=noteEx;
	  }
	  
		public void etudier() {
	 		 System.out.println("j'etudie");
	 	}
	  
	 	public double CalculerMoyG(double noteC, double noteEx ) {
	 		return (0.4*this.noteC)+(0.6*this.noteEx);
	 		
	 	}
	 	public void afficher() {
	 		System.out.println("Etudiant : "+ this.getNom() + " " +this.getPrenom() +" "+ this.getAge() +"ans "+" "+ this.getStatut() +" "+ this.getMatricule() +" "+ this.getFiliere() +" "+ this.getNoteC() +" "+ this.getNoteEx());
	 	}

		@Override
		public double CalculerMoyG() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double CalculerMoyGe() {
			// TODO Auto-generated method stub
			return 0;
		}
}
