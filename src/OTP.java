import java.util.Random;
import java.util.Scanner;

public class OTP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "0123456789";
        char[] ch = new char[6];
        Random random = new Random();
        for (int i=0;i<6;i++)
            ch[i] = str.charAt(random.nextInt(10));
        String str1 = new String(ch);
        System.out.println("Your OTP is : "+str1);
        System.out.print("Enter your OTP : ");
        String otp = sc.next();

        if(otp.equals(str1))
            System.out.println("Welcome");
        else
            System.out.println("Err");
    }
}
