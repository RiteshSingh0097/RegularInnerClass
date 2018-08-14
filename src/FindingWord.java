import java.util.Scanner;

public class FindingWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int n = sc.nextInt();

        for (int i=0;i<n;i++){

            int fac = sc.nextInt();
            int N = search(str,fac);
            System.out.println(N);
        }
    }
    private static int search(String str, int n){

        int a = str.indexOf(str.charAt(n),n+1);

        int b = str.lastIndexOf(str.charAt(n),n-1);

        if(a==-1 && b==-1)
            return -1;
        else if (a==-1 && b!=-1)
                return b;
            else if(b==-1 && a!=-1)
                return a;
        return (a-n)>(n-b)?b:a;
    }
}
