/* static function pass int parameter in it then calculate percentage of that number out of 150 and return
 percentage and print in main function. */
class PercentageOutOf150{
	public static void main(String args[]){
	
	int a = functionPercentage(80);
	System.out.println(a);
	
	
	}
	static int functionPercentage(int a ){
	int percentage = (a *100)/150;
	return percentage;
	
	}
}