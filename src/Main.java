package Tp_java_exo1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("                                                               ");
		System.out.println("--------------Etudiant---------------");
		
		
		Etudiant E= new Etudiant("BOBO","Orne", 19,"Celibataire","01", "IRT", 15.75, 12.25);  
		E.etudier();
		
	    System.out.println("-----------Nom|Prenom|Age|Statut|Matricule|Filière|NoteC|NoteEx");
	    System.out.println("                                                               ");
	
		E.afficher();
	    System.out.println("La moyenne de l'etudiant est:"+E.CalculerMoyG(15.75 , 12.25));
	    System.out.println("                                                               ");
		
		System.out.println("---------------Eleve------------------");
		
		Eleve e= new Eleve("ADIDI","Toto", 12, "Celibataire","02","5eme",12.5, 15.2 , 14.3);
		e.etudier();
		
		
		 System.out.println("-----------Nom|Prenom|Age|Statut|Matricule|Classe|NoteIa|NoteIb|NoteD");
		 
		 System.out.println("                                                               ");
		e.afficher();
		System.out.println("La moyenne de l'etudiant est:"+ e.CalculerMoyGe(12.5 , 15.2 , 14.3));
	}

}
