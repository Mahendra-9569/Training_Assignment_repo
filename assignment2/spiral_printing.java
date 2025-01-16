package assignment2;
import java.util.*;
public class spiral_printing {
    public static void printSpiral(int[][] matrix , int n) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
      
        while (top <= bottom && left <= right) {
            int num = ((n*n - n)+1);
            int num2 = (n-2)*(n-2)+1;
    
        
            for (int i = left; i <= right; i++) {
                matrix[top][i] =  num++;
            }
            top++;

            
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num2++;
            }
            right--;

    
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num2++;
                }
                bottom--;
            }

            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num2++;
                }
                left++;
            }

            n -= 2;
        }
    }

     public static void printmatrix(int [][] matrix , int n){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        
        int[][] matrix = new int[n][n];
          
        
        printSpiral(matrix , n);

        printmatrix(matrix,n);
        
    }
    
}
