/*- Write a program to add 8 to the number 2345 and then divide it by 3.
Now, find the modulus of the quotient with 5 and then multiply the resultant value by 5. Display the final result.*/

/*Do the above question with assignment operator - +=, -=*/
class FinalResult{
	public static void main(String agrs[]){
		//funt1();
		funt2();
	}
	
	
	static void funt1(){
	int a = 2345;
	int b = (2345 + 8);
	int c = (b/3);
	int d = (c%5);
	int e = (d*5);
	System.out.println(e);
	}
	
	static void funt2(){
		int a = 2345;
		a+=8;
		a/=3;
		a%=5;
		a*=5;
		System.out.println(a);
	}
	
	
}