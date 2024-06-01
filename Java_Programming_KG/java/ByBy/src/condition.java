import java.util.Scanner;
public class condition {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Challenge");
        System.out.println("Enter the number");
        int num = input.nextInt();

        if(0<num){
            System.out.println("Number is a positive");
        }
        else if(0==num){
            System.out.println("number is a zero");
        }
        else{
            System.out.println("number is negative");
        }


    }
}
