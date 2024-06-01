import java.util.Scanner;
public class UnaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int a = 5;
       int y = -a;
        System.out.println(y);//It is rule convert to the positive to negative
        //pre-increment
       int b =10;
        ++b;
        System.out.println(b);
        //Pre-decrement;
        --b;
        System.out.println(b);
        //post-increment
         int c = 20;
        c++;
        System.out.println(c);
        //post decrement;
        int d = 30;
        d--;
        System.out.println(d);
    }
}
