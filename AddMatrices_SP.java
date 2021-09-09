
// Finalement, utiliser le scanner

import java.lang.*;
import java.util.*;
import java.util.Scanner;

/* Programme Bonjour des notes transformé pour le premier numero. Je ne prends pas controle mais bien juste commmit le premier, pour le fun. On peut le changer */
public class AddMatrices {
    
    // Le main prends une chaine, crée des Strings est les ajoutes a un vecteur (dynamique) et imprime ensuite les elements du vecteur un par ligne
    public static void main(String args[]) {
      Scanner inUser = new Scanner(System.in);
      
      System.out.println("Entrer une matrice du format [x y] [a b] ...");
      
      String matrix = inUser.nextLine();
      System.out.println(matrix);
      
      char[] matrixChars = matrix.toCharArray();
      
      int parent_Check = 0;
      int niveaux = 0;
      int num_Elems = 0;
      int temp_Num = 0;
      String temp_Elem = "";
      
      float elems[][];
      Vector numbers = new Vector();
      
      for (char c : matrixChars) {
              if (c == '[') {
                  parent_Check++;
              }
              
              else if (c == ' ' && parent_Check == 1){
                  num_Elems++;
                  numbers.addElement(temp_Num);
                  temp_Num = 0;
              }
              else if (c == ' ' && parent_Check == 0) {}
              
              else if (Character.isDigit(c) && parent_Check == 1){
                temp_Num *= 10;
                int n = (int) c;
                temp_Num += c;
                //   num_Elems++;
                //   numbers.addElement(n);
              }
              
              else if ( c == ']') {
                  parent_Check--;
                  niveaux++;
                  numbers.addElement(temp_Num);
                  System.out.println("Fin de parenthese, niveaux : " + niveaux + " elements : " + num_Elems);
                  
              }
              
          }
        System.out.println(numbers);
      
      
      
          /*Vector strings = new Vector();
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
        */
    }
}
