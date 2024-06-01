import java.util.Scanner;
public class RelationalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your welcome in driving portal");
        System.out.println("Enter the age");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You can drive a car");
        } else {
            System.out.println("You can not drive a car");
        }
        System.out.println("Thank you");
    }
}
