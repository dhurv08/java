package Programs2;
import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        float temp;
        char unit;
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter the unit you would like to convert to (F/C) :");
        unit = scanner.next().charAt(0);

        if (unit == 'F')
        {
            System.out.println("Enter the temperature in Celsius :");
            temp = scanner.nextFloat();
            
            temp = (9/5 * temp ) + 32;
            System.out.println("Temperature in Fahrenheit is "+ temp);
    
        }else 
        {if (unit == 'C')
        {  
            System.out.println("Enter the temperature in Fahrenheit :");
            temp = scanner.nextFloat();
            temp = ((temp - 32) *5 )/9;
    
            System.out.println("Temperature in Celsius is " + temp);
            } 
            else
            {
                System.out.println("Error : Invalid Input");
            }
        } scanner.close();
    }
}
