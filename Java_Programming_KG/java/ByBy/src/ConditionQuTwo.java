import java.util.Scanner;

public class ConditionQuTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
       if(num%2==0){
           System.out.println("Your put the number even");
        }
       else{
           System.out.println("Your put the number odd");
       }
    }
}
