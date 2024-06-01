import java.util.Scanner;
public class InputChallenge {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the you name");
        String name = input.nextLine();
        System.out.println("Welcome " +name+ " to KG Coding");
        System.out.println("Enter the first number");
        int a =input.nextInt();
        System.out.println("Enter the second number");
        int b = input.nextInt();
        System.out.println(a+b);
    }
}
