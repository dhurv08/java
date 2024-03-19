/* A person landed in a country where he has no idea of the currency notes. He asked the locals about the notes available in the country and he had to pay in a shop. Given an amount, find the minimum number of notes of different denominations that sum up to the given amount.Starting from the highest denomination note, try to accommodate as many notes as possible for a given amount. (40 marks)
Test Case 1 :Enter the size of currency denominations
5
Enter the currency denomination 
100
Enter the currency denomination 
50
Enter the currency denomination 
20
Enter the currency denomination 
1
Enter the currency denomination 
5
Enter the amount you want to pay 450
450
Your payment approach in order to give min no of notes will be
100 : 4
50 : 1
Test Case 2:Enter the size of currency denominations
6
Enter the currency denomination 
100
Enter the currency denomination 
50
Enter the currency denomination 
20
Enter the currency denomination 
10
Enter the currency denomination
2
Enter the currency denomination 
5
Enter the amount you want to pay
1257
Your payment approach in order to give min no of notes will be
100 : 12
50 : 1
5 : 1
2 : 1 */
import java.util.Scanner;
public class q1{
    public static void main(String args[]){
        int size;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of denominations");
        size = scanner.nextInt();

        int[] denominations = new int[size];
        for(int i = 0 ; i< size ; i++){
            System.out.println("Enter the country denomination = ");
            denominations[i] = scanner.nextInt();
        }

        System.out.println("Enter the amount you want to pay = ");
        int amount = scanner.nextInt();
        int count[] = new int[denominations.length];
        // sort(denominations);
        for(int i = 0 ; i < denominations.length ; i++){
            count[i]= amount / denominations[i];
            amount -= count[i] * denominations[i];
        }

        System.out.println("Amount to be paid in denominations = ");
        for (int i = 0; i < denominations.length; i++) {
            if (count[i] > 0) {
                System.out.println(denominations[i] + " : " + count[i]);
            }
        }

    }
}