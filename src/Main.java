import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int[] arr = new int[N];
        int[] ar  = new int[R];
        int[] lr  = new int[R];
        int[] ans = new int[R];

        for(int i = 0; i<N; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<R;i++){
            ar[i] = sc.nextInt();
            lr[i] = sc.nextInt();
            int flag = 0;
            for(int j=0;j<N;j++){
                if(arr[j]>ar[i] && arr[j]<lr[i]) {
                    flag++;
                }
            }
            System.out.print(flag);

        }
    }
}
