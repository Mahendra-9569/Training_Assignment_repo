package assignment2;

public class Hollow_hourglass {
    public static void main(String[] args) {
        int n = 9;
        int m = n/2;
        for(int i =1; i<=m+1; i++){
           //for space
              for(int j = 1; j<=i-1; j++){
                 System.out.print(" ");
              }
                //for character 
              for(int j = 1; j<=2*(m-i+1)+1; j++){
                if((i == 1)||(j==1 || j==2*(m-i+1)+1 )){
                    System.out.print((char)(j+64));
                }
                else{
                    System.out.print(" ");
                }
            }
               //for space
                for(int j = 1; j<=i-1; j++){
                     System.out.print(" ");
                }
                System.out.println();     
        }


        for(int i =m; i>=1; i--){
            //for space
               for(int j = 1; j<=i-1; j++){
                  System.out.print(" ");
               }
                 //for character 
               for(int j = 1; j<=2*(m-i+1)+1; j++){
                if((j==1 || j==2*(m-i+1)+1)||(i == 1)){
                    System.out.print((char)(j+64));
                }
                else{
                    System.out.print(" ");
                }
             }
                //for space
                 for(int j = 1; j<=i-1; j++){
                      System.out.print(" ");
                 }
                 System.out.println();     
         }
 
    }
    
}
