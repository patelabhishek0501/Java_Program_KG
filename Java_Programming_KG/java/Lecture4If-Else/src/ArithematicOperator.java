import java.util.Scanner;
public class ArithematicOperator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
           int number = input.nextInt();
           System.out.println("Enter the second number");
            int sec = input.nextInt();
        System.out.println("Below the you answer");
       System.out.println(number + sec);
        System.out.println(number % sec);
        System.out.println(number / sec);
        System.out.println(number * sec);
        System.out.println(number - sec);
        System.out.println("Thank you");
    }
}
