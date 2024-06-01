public class Parameter {
    public static void main(String[] args) {
        int sum = addToNumber(4, 7);
        System.out.println(sum);
        int sum1 = addThreeNumber(7, 5, 6);
        System.out.println(sum1);
    }

    public static int addToNumber(int First, int Second) {

        int sum = First + Second;
        return sum;
    }

    public static int addThreeNumber(int First, int Second, int Third) {
        int sum1 = First + Second + Third;
        return sum1;

    }
}

