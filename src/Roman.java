import java.util.Scanner;

public class Roman {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num>=1000)
            num = roman(num,1000,'m');
        if (num >= 500)
            num = roman(num,500,'d');
        if (num >= 100)
            num = roman(num,100,'c');
        if (num >= 50)
            num = roman(num,50,'l');
        if (num >= 10)
            num = roman(num,10,'x');
        if (num >= 5)
            num = roman(num,5,'v');
        if (num >= 1)
            num = roman(num,1,'i');
        System.out.println();

    }

    private static int roman(int n, int i, char m) {
        if (n==9){
            System.out.printf("ix");
            return 0;
        }
        if (n==4){
            System.out.print("iv");
            return 0;
        }
        while (n>=i){
            System.out.print(m);
            n = n-i;
        }
        return n;
    }
}
