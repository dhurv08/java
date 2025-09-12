/*- non-static function with 2 parameters
   - First Parameter will be the one for which you will have to calculate percentage (Ex - 8)
   - Second Parameter will be the one according to which you will have to calculate percentage (Ex - 80)
   - Return percentage calculated (Ex-10) */
class PercentageOutOfVariable{
	public static void main(String args[]){
	
	PercentageOutOfVariable object = new PercentageOutOfVariable();
	int a = object.functionPercentage(8 , 80);
	System.out.println(a);
	
	
	}
	int functionPercentage(int a , int b ){
	int percentage = (a *100)/b;
	System.out.println("Hello");
	return percentage;
	a
	}
}