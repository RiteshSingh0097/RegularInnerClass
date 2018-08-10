import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows for pascal's triangle : ");
        int k = sc.nextInt();
        for (int i=0;i<k;i++){
            for(int j=0;j<=i;j++){
                System.out.print(comb(i,j)+"  ");
            }
            System.out.println();
        }
    }

    private static long comb(int i, int j) {
        long c;
        c = fact(i)/(fact(j)*fact(i-j));
        return c;
    }

    private static long fact(int n) {
        long fact=1;
        if (n==0)
            return 1;
        for (int i=n;i>1;i--)
            fact *= i;
        return fact;
    }

}
