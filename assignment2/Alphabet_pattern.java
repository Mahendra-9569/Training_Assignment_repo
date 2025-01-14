package assignment2;

public class Alphabet_pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
          //for character
          for(int j = 1; j<=i; j++){
            System.out.print((char)(j+64));
          }
          // for space
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //for character
            for(int j = i; j>=1; j--){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }

    }
    
}
