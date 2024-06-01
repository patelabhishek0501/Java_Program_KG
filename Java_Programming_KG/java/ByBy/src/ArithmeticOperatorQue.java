import java.util.Scanner;
public class ArithmeticOperatorQue {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int f = input.nextInt();
        System.out.println("Enter the second number");
        int s = input.nextInt();
        System.out.println(f+s);
        System.out.println(f-s);
        System.out.println(f*s);
        System.out.println(f/s);
        System.out.println(f%s);
        System.out.println("Thank you");

    }
}
