/*- create 2 functions receiving array as an parameter
- first function will be static named percentage and will return percentage
- second function will be non-static named average and will return average*/
class Array1{
	
	
	public static void main(String args[]){
	int a[]={90,80,70,89,89};
	
	//percentage
	int b = percentage(a);
	System.out.println("Percentage is = " + b+"%");
	
	//average
	Array1 obj = new Array1();
	int c = obj.average(a);
	System.out.println("Average = " + c);
	
	}	
	static int percentage(int a[]){
		int sum=0;
		for(int i=0 ; i<a.length; i++){
			sum += a[i];
			//System.out.print(sum+"\t");
		}
		System.out.println();
		int prcnt =((sum*100)/500);
		return prcnt;
	}
	
	int average(int a[]){
		int sum=0;
		for(int i=0 ; i<a.length; i++){
			sum += a[i];
		}
		int avg = sum/5;
		return avg;
	}
		
}