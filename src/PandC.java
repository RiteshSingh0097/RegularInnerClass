import java.util.Scanner;

public class PandC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();

        System.out.println("Permutation is : "+permutation(n,r));
        System.out.println("Combination is : "+combination(n,r));


    }

    private static long combination(int n, int r) {

        return permutation(n,r)/factorial(r);
    }

    private static long permutation(int n, int r) {

        return factorial(n)/factorial(n-r);
    }

    private static long factorial(int n) {
        long p = 1;
        while(n>0){
            p *= n;
            n--;
        }
        return p;
    }
}
