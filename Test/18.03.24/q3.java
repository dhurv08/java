//Write a program to check if the letter 'e' is present in the word 'Umbrella'. 
// import java.util.Scanner;
public class q3{
    public static void main(String args[]){
        String letter = "Umbrella";
        boolean present = false;

        for(int i = 0 ; i <= (letter.length()-1) ; i++){
            if (letter.charAt(i)  == 'z'){
                present = true;
                break;
            }
        }
    if(present){
        System.out.println("The letter is present");
    }else{
        System.out.println("Letter is not present");
    }
    }
}