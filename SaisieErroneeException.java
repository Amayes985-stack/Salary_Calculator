
/*Ici se retrouve la déclaration de 
ma classe d'exceptions afin de les utilisers pour les champs éventuellement 

*/

//bien sur cette classe va hériter de la classe Exception 
public class SaisieErroneeException extends Exception {
  String S ; 
    //Déclaration d'un constructeur 
    public SaisieErroneeException() {
        super();
      }
    
      //Surcharge
      public SaisieErroneeException(String s) {
        super(s);
          
      }
}