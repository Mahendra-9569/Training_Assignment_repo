package assignment2;

public class pascal_traingle {
    public static int pascal(int i, int j){
        if(j==0 || j==i){
            return 1;
        }
        else{
            return pascal(i-1, j-1)+pascal(i-1, j);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i<n; i++){
            //for space
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            //for number
            for(int j = 0; j<=i; j++){
                System.out.print(pascal(i,j)+" ");
            }
            System.out.println();
        }
    }
    
}
