package assignment2;

public class pascal_traiingle {
    public static int factorial(int n) {
        if(n==0||n==1) return 1;
        return n*factorial(n-1);
    }

public static void main(String[] args) {
    int n=5;
    for (int i = 0; i<n; i++){
    
            // for space
            for (int k = 0; k<n-1-i; k++){
                System.out.print(" ");
            }

            // for number
            for (int j = 0; j<2*i+1; j++){
                System.out.print(factorial(i)/((factorial(j)*factorial(i-j))));
                System.out.println(" ");
            }  
            System.out.println();
    }    
}
}
