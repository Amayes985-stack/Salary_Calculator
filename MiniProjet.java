/*bien le bonjour    
Ceci est en effet mon implémentation concernant le MiniProjet de Java 
Djermoune Amayes 2CP Groupe : 01 

Je tiens à noter que ce projet m'appatient et que j'ai mes droits d'auteurs
et que toute tentative de copier-coller est une violation aux 
droits d'auteurs */


//importation du package réservé pour le scanner 
import java.util.Scanner;




//je crée une classe personne avec ses attributs 
//ainsi que les getters et les setters 

class Person {
    private String FirstName ; 
    private String LastName ; 
    private String Date; 
    private int ChildrenNumber ; 
    
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setChildrenNumber(int childrenNumber) {
        ChildrenNumber = childrenNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getDate() {
        return Date;
    }

    public int getChildrenNumber() {
        return ChildrenNumber;
    }

} 

/*Puis je crée une classe employer qui va hériter des attributs de la
classe mère Person
puis je déclare les attributs, le salaire, nombre de retenues ainsi que ça fonction*/ 

class Employer extends Person {

    private String Function ; 
    private int DayOff ; 
    private double netSalary ; 

    public void setFunction(String function) {
        Function = function;
    }

    public void setDayOff(int dayOff) {
        DayOff = dayOff;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public String getFunction() {
        return Function;
    }

    public int getDayOff() {
        return DayOff;
    }

    public double getNetSalary() {
        return netSalary;
    }

    //puis je vais créer une méthode qui va me permettre de calculer le salaire net d'un employer
    public void netSalary(Employer E) {
        //Déclarations des variables 

        String C = "Chef de Bureau " ; 
        String D = "Chef de Service" ; 
        String J = "Employer" ; 
        double primes1 = 0 ;
        double primes2 = 0 ; 
        double retenues = 0 ; 
        double Socialsecurity = 0.07*E.netSalary ; 
        double p1 = 0.02 ; 
        double p2 = 0.03 ; 

  
        //Selon le choix de l'utilisateur, la prime reçue n'est pas la meme pour chaque employer 
        if (E.getFunction().equals(C) == true ) {
            primes2 += E.getNetSalary()*p1 ; 
        }

        if (E.getFunction().equals(D) == true ) {
            primes2 += E.getNetSalary()*p2 ; 

        }

        if (E.getFunction().equals(J) == true ) {
            primes2 += 0 ; 

        }



//Maintenant ça c'est réservé pour calculer la prime des enfants 
     for (int i = 0 ; i < E.getChildrenNumber() ; i++) {
         if (E.getChildrenNumber() == 0) {
             primes1 = 0 ; 
         } else { 
         primes1 += 300 ; 

        }

         

     }
     
     for (int j = 0 ; j<E.DayOff ; j++) {
          retenues += 100 ; 
         }
     
    //On applique la formule pour calculer le salaire aussi simple que ça 
     E.netSalary += primes1 + primes2 - retenues - Socialsecurity; 

    System.out.println("Votre Salaire est : "+E.getNetSalary()+ "DA");

        }

     
    }

    






public class MiniProjet {

    //afin de profiter de cet aspect des exceptions, la commande throxs nous sera utile
    public static void main(java.lang.String[] args)throws SaisieErroneeException {

        
        //clear screen 
        System.out.print("\033[H\033[2J");  
        System.out.flush();


        
        

        Scanner sc = new Scanner(System.in) ; //je déclare un scanner pour lire sur le clavier
        Employer E = new Employer() ; //je crée l'objet en question 

        //Déclaration des variables 

        String C = "Chef de Service" ; 
        String D = "Chef de Bureau" ; 
        String J = "Employer" ; 

        //je fixes mon salaire de base à 20000 DA comme dans l'énoncé 
        E.setNetSalary(20000);

        //je demande à l'utilisateur d'insérer son nom 

        System.out.println("Veuillez insérer votre Nom : " ) ; 
        E.setLastName(sc.nextLine());

        
            //exception si notre utilisateur insére un champ vide 
           if (E.getLastName().equals("") == true ) {
                sc.close(); //je ferme le scanner
                throw new SaisieErroneeException("Champ vide " ) ;//et j'affiche l'exception
                
            
            }
       

            //exception si l'utilisateur insert un nombre au lieu d'un caractère 
        if (E.getLastName().getClass().getSimpleName() == "Integer") {
            sc.close();
            throw new SaisieErroneeException("Veuillez insérer des caractères") ; 
        }

        System.out.println("Veuillez Insérer votre Prénom : ") ;

        E.setFirstName(sc.nextLine());

        //meme chose s'applique 
        if (E.getFirstName().equals("") == true ) {
            sc.close() ; 
            throw new SaisieErroneeException("Champ vide  "); 
        }

        if ((E.getFirstName().getClass().getSimpleName()== "Integer")) {
            sc.close();
            throw new SaisieErroneeException("Veuillez insérer des caractères") ; 
        }


        System.out.println("Veuillez Insérer votre Date de Naissance sous le format jj/mm/aa : ");
        E.setDate(sc.nextLine());

        //idem 
        if (E.getDate().equals("") == true ) {
            sc.close() ; 
            throw new SaisieErroneeException("Champ vide ") ; 
        }

        if (E.getDate().getClass().getSimpleName() == "Integer") {
            sc.close();
            throw new SaisieErroneeException("Veuillez insérer sous le format jj/mm/aa") ; 
        }

        //exception si l'utilisateur ne respectes pas le format jj/mm/aa
        //avec l'instruction indexOf()

        if (E.getDate().indexOf("/") != 2 || E.getDate().lastIndexOf("/") != 5 ) {
            sc.close();
            throw new SaisieErroneeException("Veuillez insérer sous le format jj/mm/aa") ; 
        } 

        //Exception si l'utilisateur insére un caractère au lieu d'un entier ou un nombre qui n'est pas un entier 
        System.out.println("Veuillez insérer le nombre d'enfants mineurs (-18 ans ) : ");
        try {

            E.setChildrenNumber(sc.nextInt());
            

        } catch (NumberFormatException e) {
            sc.close();
            throw new NumberFormatException("Veuillez insérer des nombres entiers " ) ; 
        }

        
        //idem 
        System.out.println("Veuillez Insérer le nombre de jours d'arret de travail  ") ; 
        try {

            E.setDayOff(sc.nextInt());
            

        } catch (NumberFormatException e) {
            sc.close();
            throw new NumberFormatException("Veuillez insérer des nombres entiers " ) ; 
        }

        sc.nextLine() ; 
        System.out.println("Occupez-vous un poste administratif ? si oui préciser : ");
        E.setFunction(sc.nextLine()) ; 

        //exception si le champ est vide
        if (E.getFunction().equals("") == true ) {
            sc.close();
            throw new SaisieErroneeException("Champ Vide")  ;

        }

        //exception si on insére un entier au lieu d'un caractère 
       if (E.getFunction().getClass().getSimpleName() == "Integer" ) {
            sc.close() ;
            throw new SaisieErroneeException("Veuillez insérer des caractères ") ; 
    
        }
        //exception si on insère une chaine différente de Chef de Service, Chef de Bureau & Employer 
        if (E.getFunction().equals(C) == false && E.getFunction().equals(D) == false  && E.getFunction().equals(J) == false  ){
            sc.close() ; 
            throw new SaisieErroneeException("Veuillez choisir entre Chef de Service , Chef de Bureau et Employer  ") ; 
        }

       

        sc.close() ; //je ferme mon scanner 
     
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        
        
        E.netSalary(E); //j'affiche mon salaire 

        
        



        
        }

        
        
    

   }


/*C'est le meme programme que j'ai implémenté pour la création de l'interface
graphique, sauf que y'a des différences et des améliorations :

1. emploi de la méthode isEmpty() pour vérifier si le champs est vide 
2. Utilisation des jTextField au lieu du Scanner 
3. Utilisations des boites dialogues (JOptionpanel) pour afficher les erreurs et les exceptions 
4. Emploi de l'interface graphique 
5. Utilisation d'un makefile 

Copyright 2021 : Djermoune Amayes 

pour dérouler le programme, taper make dans le compilateur 

*/ 