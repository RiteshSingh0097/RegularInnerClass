import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int N = sc.nextInt();

        System.out.println("Decimal = "+N+" Binary = "+Integer.toBinaryString(N));
        System.out.println("Decimal = "+N+" Octal = "+Integer.toOctalString(N));
        System.out.println("Decimal = "+N+" Hexa = "+Integer.toHexString(N));

    }

    private static long binary(int n) {
        long rem,a=1,bin=0;
        while (n>0){
            rem = n%2;
            bin = bin + rem*a;
            n/=2;
            a *= 10;
        }
        return bin;
    }
}
