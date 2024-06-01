import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome the code sumOfDigit");
        int num = input.nextInt();
        int sum = sumOfDigit(num);
        System.out.println(sum);
    }
    public static int sumOfDigit(int num){
        int sum = 0;
        while(num >0){
            sum  =sum+ num%10;
            num = num/10;
        }
        return sum;
    }
}
