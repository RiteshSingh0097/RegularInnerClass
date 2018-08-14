import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b)
            System.out.println(gCD(a,b));
        else
            System.out.println(gCD(b,a));
    }

    private static int gCD(int a, int b) {
        if (b==0)
            return a;
        return gCD(b,a%b);
    }
}
