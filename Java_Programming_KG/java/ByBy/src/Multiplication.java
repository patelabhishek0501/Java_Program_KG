import java.util.Scanner;

public class Multiplication {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiple in program to world");
        int num = input.nextInt();
        printMultiplicationTable(num);
    }
    public static void printMultiplicationTable(int num){
        int i=1;
        while(i <= 10){
            System.out.println( num+ "X" +i+ "=" + num*i);
            i++;
        }
    }
}
