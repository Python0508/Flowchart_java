import java.util.*;
public class sum_of_natural_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("Sum of Natural number is : " + sum);
    }
    
}
