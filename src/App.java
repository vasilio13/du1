public class App {
    public static void main(String[] args) {

        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println("/0");
        } finally {
            System.out.println(10/2);
        }
        System.out.println("life is life");

    } //ffff ggg
}

