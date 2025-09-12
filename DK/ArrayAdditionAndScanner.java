//Create a 2D Array and enter elements in it using, Scanner Class
//- Perform addition between two, 2D Arrays
import java.util.Scanner;
class ArrayAdditionAndScanner{
	public static void main(String agrs[]){
	int rows,coloumns;
	Scanner obj = new Scanner(System.in);

	System.out.println("Enter no. of rows = ");
	rows = obj.nextInt();
	System.out.println("Enter no. of coloumns = ");
	coloumns = obj.nextInt();
	
	System.out.println("Enter elements of matrix 1 = ");
	int a[][]=new int[rows][coloumns];
	for(int i = 0 ; i<rows ; i++){
		for(int j = 0 ; j<coloumns ; j++){
			a[i][j]=obj.nextInt();
		}
	}
	
	System.out.println("Enter elements of matrix 2 = ");
	int b[][]=new int[rows][coloumns];
	for(int i = 0 ; i<rows ; i++){
		for(int j = 0 ; j<coloumns ; j++){
			b[i][j]=obj.nextInt();
		}
	}
	
	//addition
	int c[][]=new int[rows][coloumns];
	for(int i=0 ; i<rows ;i++){
		for(int j=0 ; j<coloumns ;j++){
			c[i][j] = a[i][j]+b[i][j];
		}
	}
	
	System.out.println("Addition of Matrix = ");
	for(int i=0 ; i<rows ;i++){
		for(int j=0 ; j<coloumns ;j++){
			System.out.print(" "+c[i][j]+" ");
		}System.out.println();
	}
	
		}
}