import java.util.Scanner;

public class ConditionQuThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = input.nextInt();
        System.out.println("Enter the sec number");
        int num2 = input.nextInt();
        System.out.println("Enter the third number");
        int num3 = input.nextInt();
       if(num1>=num3&&num1>=num2){
           System.out.println("Gre number num1");

       }else if(num2>=num1 && num2>=num3) {
           System.out.println("Gre number num2");
       }
       else if(num3>=num1 && num3>=num2) {
           System.out.println("Gre number num3");
       }
    }
}
