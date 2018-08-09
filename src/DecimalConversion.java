import java.util.Scanner;

public class DecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println("Binary : "+Integer.parseInt(str,2));
        System.out.println("Octal : "+Integer.parseInt(str,8));
        System.out.println("Decimal : "+Integer.parseInt(str,10));
        System.out.println("Hexa : "+Integer.parseInt(str,16));
    }
}
