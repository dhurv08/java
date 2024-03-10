//Create a program which will store random integers values in an arrayList.

import java.util.Random;
public class RandomIntegerValue{
   public static void main(String[] args) {
      Random rd = new Random(); 				// creating Random object
	  //int[] arr=new int[5];
	  int a=1;
	  for(int i=0 ;i<10 ;i++){
      System.out.println("Random Variable number " + a +" = "+ rd.nextInt(500));			//nextInt will call out integer values 
		a++;
			}
		}
		
		
}