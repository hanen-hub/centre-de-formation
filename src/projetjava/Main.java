package projetjava;
import java.util.Scanner;
public class Main {
	public static void main(String arg[]) {
		int i=3 ; 
		Formation[] fr=new Formation[20] ; 
		fr[0]=new Formation("fr" ," monia");
		fr[1]=new Formation("English", "wael") ; 
		fr[2]=new Formation("java","iheb");		
while(true)
{
	System.out.println("1-tapez 1 pour repmlir des infromation sur votre centre \n2-tapez 2 pour remplir des infromation sur la formation \n3-tapez 3 pour avoir des  information sur une formation \n4-tapez 4 pour supprimer une formation   \n "  ) ; 
	Scanner sc= new Scanner(System.in) ; 
	int a  ; 
	a=sc.nextInt() ; 
	sc.nextLine();
	//System.out.println("\n");
	System.out.println(" vous ete choisi le nombre  " + a);
	switch  (a) {
	case 1 :
		String nom , c ; 
		System.out.println("donner le nom de votre centre  ");
		nom=sc.nextLine(); 
		sc.nextLine();
		System.out.println(nom);
		System.out.println("le nom de directeur  ");
		c=sc.nextLine() ; 
		System.out.println("donner votre site web") ; 
		String site  ; 
		site=sc.nextLine() ; 
		System.out.println(site);
		System.out.println("donner votre numero") ; 
		String num ; 
		num=sc.nextLine();
		System.out.println(num);
		System.out.println("alors le ") ;
		Centre_de_formation centre1 =new Centre_de_formation(nom,c,site,num) ; 
		System.out.println("Centre_de_formation nom_de_centre=" + centre1.getNom_de_centre() +  ", nom_de_directeur=" + centre1.getNom_de_directeur()+", le numero est="+ centre1.getNum_de_télé() +",notre site web est="+centre1.getSite_web_de_centre()  );
	    break ; 
	case 2 :
		String nom_langue ;
		System.out.println("svp donnez le nom de langue");
		nom_langue=sc.nextLine() ; 
	    String prof ;
		System.out.println("svp donnez le nom de prof");
		prof=sc.nextLine() ;
		fr[i]=new Formation(nom_langue,prof) ; 
		System.out.println("svp donnez le nombre heurs");
		String nombre_de_heurs=sc.nextLine(); ;
		fr[i].setNombre_de_heurs(nombre_de_heurs);
		System.out.println("svp donnez le prix");
		String prix=sc.nextLine();;
		fr[i].setPrix(prix);
		 System.out.println("voulez vous fixer la date de votre formation ?(y/n)");
         char  w=sc.next().charAt(0);
         sc.nextLine();
         if(w=='y'||w=='Y') {
         String date=sc.nextLine();
         fr[i].setDate(date);}
		System.out.println("voici les information que vous avez remplir ") ; 
		//System.out.println("Centre_de_formation nom_de_centre=" + fr[i].getNom_de_centre() +  ", nom_de_directeur=" + centre1.getNom_de_directeur()+", le numero est="+ centre1.getNum_de_télé() +",notre site web est="+centre1.getSite_web_de_centre()  );
		System.out.println(fr[i].getNom_langue()+" "+fr[i].getNom_de_prof() + " "+fr[i].getDate()+" "+fr[i].getNombre_de_heurs());
		i++ ;
		break ; 
	case 3 : 
		
		System.out.println("merci de vous donnez la langue    ");
		String la_langue=sc.nextLine(); 
		sc.nextLine();
		String prof1=sc.nextLine() ;
		int verif=0 ; 
		int j ;
		for(j=0;j<=i ; j++) {
			if(fr[j].getNom_langue().equals(la_langue) && fr[j].getNom_de_prof().equals(prof1))  {
				verif=1 ;
			break ;} }
		if(verif==1)
			System.out.println("la langue que vous cherchez exicte avec la date suivant " + fr[j].getDate());
		else
			System.out.println("la langue que vous cherchez n'exicte pas ");
		
		break ;
	case 4 : 
		System.out.println("merci de vous donnez la langue que vous voulez le supprimer  ");
		String la_langue_a_supprimer=sc.nextLine(); 
		sc.nextLine();
		
		
		
		for(j=0;j<=i ; j++) {
			if(fr[j].getNom_langue().equals(la_langue_a_supprimer)) {
				fr[j].setNom_de_prof(fr[i].getNom_de_prof());
				fr[j].setNom_langue(fr[i].getNom_langue());
				fr[j].setNombre_de_heurs(fr[i].getNombre_de_heurs());
				fr[j].setDate(fr[i].getDate()) ;
				i-- ;}
			
			
				a=1 ;
			break ;}
		if(a==1)
			System.out.println("on a supprimer ce langue");
		else
			System.out.println("la langue que vous cherchez n'exicte pas ");
				break ;
				
				
			
		
		
		
		
		
	  default:
	System.out.println("je suis pas sur que ce choix exicte ");
      break;
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
	
	}
	
	
}
	
}