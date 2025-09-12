class MultipleCheckSecond{
	public static void main(String args[]){
	//static
	One.functOne(13);
	
	//non static 
	One nonStaticObject = new One();
	nonStaticObject.functTwo(13);
	}
}
class One{
	static void functOne(int a){
	int b = a%2;
	int c = a%5;
	int d = a%10;
	
	if(b==0){System.out.println("a is multiple of 2");}
	else{System.out.println("a is not a multiple of 2");}

	if(c==0){System.out.println("c is multiple of 5");}
	else{System.out.println("c is not a multiple of 5");}
	
	if(d==0){System.out.println("d is multiple of 10");}
	else{System.out.println("d is not a multiple of 10");}
		
	}
	
	void functTwo(int a){
	int c = a%5;
	int d = a%10;
	if(c==0){System.out.println("c is multiple of 5");}
	else{System.out.println("c is not a multiple of 5");}
	
	if(d==0){System.out.println("d is multiple of 10");}
	else{System.out.println("d is not a multiple of 10");}
	}
}