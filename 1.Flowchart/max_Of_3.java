import java.util.*;
public class max_Of_3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the number 3: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("num1 is GREATER : " + num1);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("num2 is GREATER : " + num2);
        }
        else{
            System.out.println("num3 is GREATER : " + num3);
        }
    }
}