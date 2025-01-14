package assignment2;

public class Number_Square {
    public static void main(String[] args) {
        int n = 9;
        int m = n/2;
        int temp = m+1;
        int count = m+1;
        for(int i =1; i<=m+1; i++){
           //for space
              for(int j = 1; j<=i-1; j++){
                 System.out.print( count--);
              }
                //for character 
              for(int j = 1; j<=2*(m-i+1)+1; j++){
                    System.out.print(temp);
            }
            temp--;
               //for space
                for(int j = 1; j<=i-1; j++){
                     System.out.print(++count);
                }
                System.out.println();     
        }
         ++temp;
         count = m+1;
        for(int i =m; i>=1; i--){
            //for space
               for(int j = 1; j<=i-1; j++){
                  System.out.print(count--);
               }
                 //for character 
                 ++temp;
                 
               for(int j = 1; j<=2*(m-i+1)+1; j++){
                     System.out.print(temp);
             }
                //for space
                 for(int j = 1; j<=i-1; j++){
                      System.out.print(++count);
                 }
                 System.out.println();     
         }
 
    }
    
}
