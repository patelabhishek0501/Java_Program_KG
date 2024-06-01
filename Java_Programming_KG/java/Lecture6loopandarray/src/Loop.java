import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        int num = 1000;
        while(num>=4){
            System.out.println(num);
            num -= 1;
            Scanner input = new Scanner(System.in);
            int i = 0;
            while(i < 5){
              int ip= input.nextInt();
                System.out.println("Number is :"+ip);
                i++;
            }
        }
    }
}
