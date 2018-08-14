import java.util.Scanner;

public class DivisibleBy11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (divisible(n)==1)
            System.out.println("div");
        else
            System.out.println("not div");
    }

    private static int divisible(int n) {
        int s1=0, s2=0, diff;
        if (n==0)
            return 1;
        if (n<10)
            return 0;
        while (n>0){

            s1 += n%10;
            n /= 10;
            s2 += n%10;
            n /= 10;
        }
        diff = s1>s2 ? (s1-s2) : (s2-s1);
        return divisible(diff);
    }
}
