class Toast extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadSafe {

    public static void main(String[] args) {
        rotate(10);
    }

    private static void rotate(int n) {
        if (n > 0) {
            Toast t = new Toast();
            t.start();
            rotate(n - 1);
        }
    }
}