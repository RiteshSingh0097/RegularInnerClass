import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int nterms = sc.nextInt();

        for (int i=0; i<nterms; i++)
            System.out.print(fib(i)+" ");
        System.out.println();

    }

    private static int fib(int i) {
        if(i==0 || i==1)
            return 1;
        return (fib(i-1)+fib(i-2));
    }
}
