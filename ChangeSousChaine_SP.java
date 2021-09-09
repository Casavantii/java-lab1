import java.lang.*;
import java.util.*;
/* Programme Bonjour des notes transformé pour le premier numero. Je ne prends pas controle mais bien juste commmit le premier, pour le fun. On peut le changer */
public class ChangeSousChaine {
    
    // Le main prends une chaine, crée des Strings est les ajoutes a un vecteur (dynamique) et imprime ensuite les elements du vecteur un par ligne
    public static void main(String args[]) {
      if (args.length == 3) {
        String initString = args[0];
        String searchTerm = args[1];
        String newTerm = args[2];
      
      
      
      
          Vector strings = new Vector();
          String base = "";
          
          for (int i = 0; i < initString.length(); i++){
              if (initString.charAt(i) == ' ') {
                  strings.addElement(base);
                  base = "";
              }
              else if (i == initString.length() - 1) {
                  base += initString.charAt(i); 
                  strings.addElement(base);
              }
              else {
                  base += initString.charAt(i);
              }
          }
          
          int indexOfSearchTerm = strings.indexOf(searchTerm);
          
          if (indexOfSearchTerm == -1) {
              System.out.println("Ne contient pas ce terme");
          }
          else {
              strings.set(indexOfSearchTerm, newTerm) ;
                
          }
          
          for (int i = 0; i < strings.size(); i++) {
              System.out.print(strings.get(i) + " ");
          }
            
        }
    
    else {
        System.out.println("Pas assez ou trop d'elements. 3 elements necessaires");
    }
    }
}
