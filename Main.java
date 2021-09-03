import java.lang.*;
import java.util.*;
/* Programme Bonjour des notes transformé pour le premier numero. Je ne prends pas controle mais bien juste commmit le premier, pour le fun. On peut le changer */
public class Main {
    
    // Le main prends une chaine, crée des Strings est les ajoutes a un vecteur (dynamique) et imprime ensuite les elements du vecteur un par ligne
    public static void main(String args[]) {
      
      String initString = args[0];
      
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
      
      for (int i = 0; i < strings.size(); i++) {
          System.out.println(strings.get(i));
      }
        
    }
}
// commentaire de Thierry
// hourra
// Steven: yes! java, qui l'eut cru que ca ressortirait du sol pour venir me donner des devoirs ca!
