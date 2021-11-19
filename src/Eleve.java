package Tp_java_exo1;

public class Eleve extends Apprenants implements Etude {
	


		private String matricule;
		private String classe;
		private double noteIa;
		private double noteIb;
		private double noteD;
	
		
		 public Eleve(String nom, String prenom, int age, String statut,
				 String matricule,String classe, double noteIa, double noteIb,
				double noteD) {
			 
			 super(nom,prenom,age,statut);
			  this.matricule=matricule;
			  this.noteIa=noteIa;
			  this.noteIb=noteIb;
			  this.classe=classe;
			  this.noteD=noteD;
			  
		  }
		  
		  public String getMatricule() {
			  return this.matricule;
		  }
		  
		  public void setMatricule( String matricule) {
			  this.matricule=matricule;
		  }
		  
		  public String getClasse() {
			  return this.classe;
		  }
		  
		  public void setClasse( String classe) {
			  this.classe=classe;
		  }
		  
		  public double getNoteIa() {
			  return this.noteIa;
		  }
		  
		  public void setNoteIa( double noteIa) {
			 this.noteIa=noteIa;
		  }
		  
		  public double getNoteIb() {
			  return this.noteIb;
		  }
		  
		  public void setNoteIb( double noteIb) {
			 this.noteIb=noteIb;
		  }
		  
		  public double getNoteD() {
			  return this.noteD;
		  }
		  
		  public void setNoteD( double noteD) {
			  this.noteD=noteD;
		  }
		  
		
		  public void etudier() {
		 		 System.out.println("j'etudie");
		 	}
		  
		  public double CalculerMoyI() {
			return ( noteIa+noteIb/2);
			  
		  }
		 	public double CalculerMoyGe(double noteIa,double noteIb,double noteD) {
		 		
		 		return( (( noteIa+noteIb/2)+noteD)/2);
		 		
		 		
		 	}
		 	public void afficher() {
		 		System.out.println("Elève : "+ this.getNom() + " " +this.getPrenom() +" "+ this.getAge() +"ans "+" "+ this.getStatut() +" "+ this.getMatricule() +" "+ this.getClasse() +" "+ this.getNoteIa() +" "+ this.getNoteIb()+" "+this.getNoteD());
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


