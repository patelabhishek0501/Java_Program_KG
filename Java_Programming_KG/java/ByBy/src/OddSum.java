import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num = input.nextInt();
       int sum =oddSum(num);
        System.out.println("Odd sum"+ num+"is:"+sum);
    }
    public static int oddSum(int num){
        int sum =0;
        int i  = 1;
        while(i <= num){
            sum += i;
           i += 2;
        }
        return sum;
    }
}
