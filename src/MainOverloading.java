
public class MainOverloading {

    public static void main(String[] args) {

        System.out.println("In main");
        main("Ritesh Singh");
        main(728692);
    }

    public static void main(String args1) {
        System.out.println("In main : "+args1);
    }

    public static void main(int args) {
        System.out.println("in main : "+args);
    }
}
