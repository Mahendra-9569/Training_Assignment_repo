package assignment2;

public class butterfly {
    public static void main(String[] args) {
        int n = 9;
        int m = n/2;
        for(int i = 1; i<=m; i++){
            // for *
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // for space
            for(int j = 1; j<=2*(m-i)+1; j++){
                System.out.print(" ");
            }
            // for *
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
          for(int i = 1; i<=n; i++){
            System.out.print("*");
          }
            System.out.println();
  
        for(int i = m; i>=1; i--){
            // for *
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // for space
            for(int j = 1; j<=2*(m-i)+1; j++){
                System.out.print(" ");
            }
            // for *
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
