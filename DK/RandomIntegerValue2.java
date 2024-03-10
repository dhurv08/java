//Create a program to enter 10 integers through Scanner class and add all those integers in an arrayList
import java.util.Scanner;
import java.util.ArrayList;

class RandomIntegerValue2{
	public static void main(String args[]){
		int sum;
		ArrayList <Integer> arylist= new ArrayList<Integer>();
		
		//int a[] = new int[];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 10 integers =");
		for(int i=0 ; i<10 ; i++){
			sum=sc.nextInt();
			arylist.add(sum);
		}
		System.out.println("Numbers in ArrayList = " + arylist);
		
	
	}
	
}