//- Perform Transpose of an 2 D array
class Transpose{
	
	public static void main(String args[]){
	int col=3;
	int row=3;
	int a[][]={{1,2,3},{4,5,6},{7,8,9}};
	int b[][] = new int[row][col];
	
	
	System.out.println("Before Transpose :");
	for(int i=0 ;i<row ; i++){
		for(int j=0 ;j<col ;j++){
			System.out.print(a[i][j]);
		}System.out.println();
	}
	
	
	//Trasnpose
	for(int i = 0 ; i<row ; i++){
		for(int j = 0; j<col ; j++){
			b[i][j]=a[j][i];
		}
	}
	
	
	System.out.println("After Transpose = ");
	for(int i = 0 ; i<row ; i++){
		for(int j = 0 ; j<col ; j++){
			System.out.print(b[i][j]);
		}System.out.println();
	}

	
	}

}