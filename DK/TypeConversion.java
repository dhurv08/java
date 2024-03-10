class TypeConversion{
public static void main(String args[]){
	//explicit
	float a = 10.12f;
	int b  = (int)a;
	System.out.println(b);
	
	//implicit
	int c = 10 ;
	float d = c;
	System.out.println(d);
	
	//implicit
	float e = 10.12f;
	double f = e;
	System.out.println(f);
	
	//explicit
	double g = 10.12321423482436;
	float h = (float)g;
	System.out.println(h);

	
	}
}