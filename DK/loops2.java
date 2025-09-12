class loops2{
	public static void main(String agrs[]){
	
	//loopQ1();
	//loopQ2();
	loopQ3();
	}
	//loop for (10101 - 10101 - 10101 )
	
	static void loopQ1(){
		for(int i=0 ; i<=4 ; i++){
				if(j%2==0){
			for(int j=0; j<=4 ; j++){
					System.out.print("1");
				}else{
					System.out.print("0");
				}
			}System.out.println();
		}
	}	
	
	
	//loop for (10101 - 01010 - 10101)
	static void loopQ2(){
		for(int i=0 ; i<=4 ; i++){
			for(int j=0 ; j<=4 ; j++){
				if((i+j)%2==0){
					System.out.print("1");
				}else{
					System.out.print("0");
				}
			}System.out.println();
		}
	}
	
	//loop for (1 -2 3 - 4 5 6 - 7 8 9 10)
	static void loopQ3(){
		int a=1;
		for(int i=0 ; i<=3 ; i++){
			for(int j=0 ; j<=i ; j++){
				System.out.print(a);
				a++;
			}System.out.println();
		}
	}
	
	
	
	
	
}