class Pattern1{
	public static void main(String agrs[]){	
	loop1();
	// loop2();
	}
	
	static void loop1(){
		for(int i = 0 ; i < 5 ; i++){
			for (int j = 5 ; j>i ; j--){
				System.out.print(" ");
			}for (int j=0 ; j< i; j++){
				System.out.print("1");
			}System.out.println();
		}
	}
	
	
	static void loop2(){
		int b = 3;
		int v = b;
		for(int i = 0 ; i<=3 ; i++){
			for(int j = 0 ; j<=6 ; j++){
				if (j >= b && j <= v) { 
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			b --;
			v ++;
			System.out.println();
		}
	}
	
	
	
	//static void loop2(){
	//	for (int i=1 ; i<=5 ; i++){
	//		for(int k=3;k>=i;k--){
	//			System.out.print("1");
	//			}
	//			for(int j=1 ; j<=i ; j++){    i-j*2
	//			System.out.print("0 ");
	//		}System.out.println();
	//	}
	//}
	
	
	
	
}