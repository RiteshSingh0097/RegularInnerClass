import java.util.Scanner;

public class PrimeFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        pfact(num);
        System.out.println();
    }

    private static void pfact(int num) {

        for (int i=2; num!=1;i++){
            while (num%i == 0){
                System.out.print(i+" ");
                num = num/i;
            }
        }
    }
}
