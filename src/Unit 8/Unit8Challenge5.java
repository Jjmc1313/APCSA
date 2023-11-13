import java.util.Arrays;
import java.util.Scanner;

class Main{
  public static void main(String args[]){
    String[][] stuScores = new String[4][5];
    
    char a = 'a';
    for (int i = 0; i < 5; i++) {
      stuScores[0][i] = String.valueOf(a);
      a++;
    }
    
    System.out.println(Arrays.deepToString(stuScores));
  }    
}