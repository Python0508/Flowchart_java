package Pratice_Questions;
import java.util.*;
public class max_Of_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("Num1 is Greater: " + num1);
        }
        else{
            System.out.println("Num2 is GREATER: " + num2);
        }
    }
    
}
