import java.util.Scanner;
public class PracticesInput {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the your name");
        String name = input.nextLine();
        System.out.println("Enter the Your Age");
        int age =input.nextInt();
        System.out.println("Enter the Id card number");
        float id = input.nextFloat();
        System.out.println("You want to some money avialble");

        boolean money = input.nextBoolean();
        System.out.println("Thank you");
    }
}
