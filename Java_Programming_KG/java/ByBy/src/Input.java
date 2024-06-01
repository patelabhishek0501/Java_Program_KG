
import java.util.Scanner;
public class Input {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
              String name = input.nextLine();//These are input line from user
        System.out.println("Good morning"+name);
        System.out.println(name+" also Tell you age");
           int age = input.nextInt();
        System.out.println("Your age is"+age);

    }
}
