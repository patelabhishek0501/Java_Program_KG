import java.util.Scanner;

public class OrderOfOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter the first number");
        int num = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();
        System.out.println(num-num2*num2);
        System.out.println(num*(num*num));
    }
}
