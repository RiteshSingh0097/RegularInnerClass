import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N>10){

            System.out.print(N+"->");
            N = sumOfDigit(N);

        }
        System.out.println(N);
    }

    private static int sumOfDigit(int n) {
        int sum=1;
        while (n>0)
        {
            sum *= n%10 ;
            n /= 10;
        }
        return sum;
    }
}
