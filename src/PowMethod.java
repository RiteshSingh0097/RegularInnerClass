import java.util.Scanner;

public class PowMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        double a = sc.nextDouble();
        System.out.print("Enter power : ");
        int n = sc.nextInt();

        double power= Math.pow(a,n);
        System.out.println(power);




    }
}

