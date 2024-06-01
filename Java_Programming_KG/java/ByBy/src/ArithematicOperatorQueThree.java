import java.util.Scanner;
public class ArithematicOperatorQueThree {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome in this program ");
        //Perimeter calculate
        System.out.println("A=");
        int A = input.nextInt();
        System.out.println("B=");
        int B = input.nextInt();
        System.out.println("C=");
        int C = input.nextInt();
        System.out.println("D=");
        int D = input.nextInt();
         int E =   A+B+C+D;
        System.out.println("Perimeter of rectangle::"+E);

        System.out.println("H=");
        int H = input.nextInt();
           double k  =1.0/2.0*B*H;
        System.out.println("Area of rectangular"+k);

        System.out.println("P=");
        int P = input.nextInt();
        System.out.println("R=");
        float R = input.nextInt();
        System.out.println("T=");
        int T = input.nextInt();
          float M  = (P*R*T)/100;
        System.out.println("Simple interest"+H);
        System.out.println("t=");
        int t = input.nextInt();


          double  V = P*Math.pow((1 + R /100),t);
        System.out.println("Compound interest"+V);

        System.out.println("F=");
        int F= input.nextInt();
            C = (F-32)*5/9;
        System.out.println("Fahrenheit to calculate"+C);
    }


}
