import java.util.Scanner;
public class ShortHandOperator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a=5;
        int x1 = input.nextInt();
             a += x1;
        System.out.println(a);
        int x2 = input.nextInt();
           a *= x2;
        System.out.println(a);
        int x3 = input.nextInt();
           a /= x3 ;
        System.out.println(a);
        System.out.println("Your work successful");

    }
}
