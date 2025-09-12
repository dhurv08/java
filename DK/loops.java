class loops{
public static void main(String args[]){
    //loop1_100();
	//loop1_10();
	//loop11_20();
	//loop11111();
	//loopQ5();
	//loopQ6();
	//loopQ7();
	//loopQ8();
	
	// loopQ11();
	loopQ12();
	}
	
	//loop from 1 - 100
	static void loop1_100(){
		for(int i=1 ; i<=100 ; i++){
			System.out.print(i+" ");
		}
	}
	
	//loop from 1-10
	static void loop1_10(){
		for(int i=1 ; i<=10 ; i++){
			System.out.print(i+" ");
		}
	}
	

	//loop from 11-20
	static void loop11_20(){
		for(int i=11 ; i<=20 ; i++){
			System.out.print(i+" ");
		}
	}
	
	//loop for (1 1 1 1 1)in 3 rows 
	static void loop11111(){
		for(int i=0 ; i<3 ; i++){
			for(int j = 0 ; j<5 ; j++){
				System.out.print("1");
			}System.out.println();
		}
	}

	
	//loop for (1111 - 2222 -3333)in 3 diff rows 
	static void loopQ5(){
		for(int i = 1 ; i <= 3 ; i++){
			for (int j = 1 ; j <= 5 ; j++){
				System.out.print(i);
			}System.out.println();
		}
	}
    
	//loop for (1111 - 2222 -3333)in 3 diff rows 
	//static void loopQ5(){
	//	for(int i = 0 ; i < 3 ; i++){
	//		for (int j = 0 ; j < 5 ; j++){
	//			System.out.print((i+1));
	//		}System.out.println();
	//	}
	//}
	
	//loop for (33333 - 22222 -11111) in 3 diff rows 
	static void loopQ6(){
		for(int i = 3 ; i >=1 ; i--){
			for (int j = 5 ; j >= 1 ; j--){
				System.out.print(i);
			}System.out.println();
		}
	}

	
	//loop for (11111 - 00000 - 11111 - 00000 )
	static void loopQ7(){
		for(int i = 0 ; i <4 ; i++){
			for(int j = 0 ; j<5 ; j++){
				if(i%2 == 0){
					System.out.print("1");
				}else{
					System.out.print("0");
				}
				//System.out.print(i);
			}System.out.println();
		}
	}


    // //loop for (10101 - 10101 - 10101 )
	// static void loopQ8(){
	// 	for(int i=0 ; i<=4 ; i++){
	// 			if(j%2==0){
	// 		for(int j=0; j<=4 ; j++){
	// 				System.out.print("1");
	// 			}else{
	// 				System.out.print("0");
	// 			}
	// 		}System.out.println();
	// 	}
	// }	
	
	


	
	
	
	
	
	
	
	
	//loop for pyrammid 
	static void loopQ11(){
		for (int i=1 ; i<=5 ; i++){
			for(int k=4;k>=i;k--){
				System.out.print(" ");
				}
				for(int j=1 ; j<=i ; j++){
				System.out.print("1 ");
			}System.out.println();
		}
	}
	
	
	//loop for pyrammid kind 2 
	static void loopQ12(){
		for (int i=1 ; i<=5 ; i++){
			for(int k=4;k>=i;k--){
				System.out.print("1");
				}
				for(int j=1 ; j<=i ; j++){
				System.out.print("0 ");
			}System.out.println();
		}
	}
	
	

}