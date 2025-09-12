/* If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 )
, write a program to calculate his total marks and percentage marks.*/
class PercentageOfRobert{
	public static void main(String agrs[]){
	int a = 78;
	int b = 45; 
	int c = 62;
	int totalMarks = a+b+c;
	
	System.out.println("Total Marks = " +totalMarks);
	System.out.println("Percentage =" + ((totalMarks*100)/300));
	
	}
}