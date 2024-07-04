package Programs2.arrays;

import java.util.Scanner;

// Input two matrices and print their sum.
// 2. Input a matrix and print the sum of its diagonal elements.
// 3. Input a matrix, and create another matrix containing the sum of its columns.
// 4. Input a matrix and print its transpose.
// 5. Create a class of your choice, create an array of objects, then input n objects and print their data.

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the m*n matrix you want to enter = ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int matrix1[][] = new int[m][n];
        System.out.println("Now Enter the "+ (m*n)+ " matrix = ");
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j< n ; j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }

        int matrix2[][] = new int[m][n];
        System.out.println("Now Enter the "+ (m*n)+ " matrix = ");
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j< n ; j++){
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Addition
        int addition[][] = new int[m][n];
        for(int i = 0 ; i<m ; i++){
            for (int j =  0 ; j< n ;j++){
                addition[i][j] = matrix1[i][j]+ matrix2[i][j];
            }
        }
        System.out.println("Sum of both the matrix = ");
        for(int i = 0 ; i < m ; i++){
            for (int j = 0 ; j< n ;j++){
                System.out.print(addition[i][j]+ " ");
            }System.out.println();
        }



        //Sum of diagonal elements 
        // System.out.println("The original matrix = ");
        // for(int i = 0 ; i < m ; i++){
        //     for(int j = 0 ; j< n ; j++){
        //         System.out.print(matrix1[i][j]+ " ");
        //     }System.out.println();
        // }
       
        // int diagonal = 0;
        // for(int i = 0 ; i< m ; i++){
        //     for(int j = 0 ; j<n ; j++){
        //         if(i ==j){
        //         diagonal += matrix1[i][j];
        //         }
        //     }
        // }
        // System.out.print("Sum of diagonal elements = "+ diagonal);




        //Trasnpose
        // System.out.println("The original matrix = ");
        // for(int i = 0 ; i < m ; i++){
        //     for(int j = 0 ; j< n ; j++){
        //         System.out.print(matrix1[i][j]+ " ");
        //     }System.out.println();
        // }
        // System.out.println("Trasnpose of the matrix = ");
        // for(int j = 0 ; j<n ; j++){
        //     for(int i = 0; i<m ;i++){
        //         System.out.print(matrix1[i][j] + " ");
        //     }System.out.println();
        // }


        //Sum of Coloumns 
    //     System.out.println("The original matrix = ");
    //     for(int i = 0 ; i < m ; i++){
    //         for(int j = 0 ; j< n ; j++){
    //             System.out.print(matrix1[i][j]+ " ");
    //         }System.out.println();
    //     }
    //     int sum = 0 ;
    //     int [] colSum = new int [n];
    //     for(int j = 0 ; j< n ; j++){
    //         for(int i = 0 ; i<m ;i++){
    //             sum += matrix1[i][j];
    //         }colSum [j] = sum;
    //     }
    //     System.out.println("Sum of coloumns of matrix = ");
    //     for(int j =0 ; j< n ; j++){
    //         System.err.print(colSum[j]+ "   ");
    // }

    scanner.close();
    }
}