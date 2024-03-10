/*- one variable will be base(Ex-2) and other will be power(Ex-3)
- function will return calculated value example = 2 raise to power 3 will return 8  */
class RaiseToPower{
public static void main(String args []){
	int base = 2;
	int power = 3;
	int result = 1;
	
	
	result =  calcPower(base , power);
	
	System.out.println(base + " raised to the power of " + power + " is " + result);
	
	}

	public static int calcPower(int base , int power) {
		int result = 1;	
		for (int i = 0; i < power; i++) {
			result *= base;
		}
		return result;
	}
	
}
