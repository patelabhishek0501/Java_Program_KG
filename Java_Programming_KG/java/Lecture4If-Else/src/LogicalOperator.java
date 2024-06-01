import java.util.Scanner;
public class LogicalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome Vehicle in ride portal");

        System.out.println("Enter the age");
        int age = input.nextInt();
        System.out.println("you are female true/false");
        boolean isFemale = input.nextBoolean();
        if(age > 5){
            System.out.println("You got to 75% discount");
        }
        else if(isFemale){
            System.out.println("You got to 50% discount ");

        }
        else if(age>60 && !isFemale){
            System.out.println("You got to 25% discount");
        }

        else{
            System.out.println("You not found to discount");
        }
    }
}
