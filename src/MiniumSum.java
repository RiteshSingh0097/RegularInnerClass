import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MiniumSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        Set<Integer> al = new TreeSet<>();

        for (int i=0;i<n;i++){
            al.add(arr[i]);
        }

        for(int i=0;i<n;i++){
            if(al.size() < n && al.contains(i)){
                al.add(i+1);
            }
        }

        Iterator it = al.iterator();

        while (it.hasNext())
            sum += (int)it.next();

        System.out.println(sum);
    }
}
