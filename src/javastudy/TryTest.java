package javastudy;

public class TryTest {
    public static void main(String[] args) {
        System.out.println(test2());
    }

    public static int test1() {
        try {
            int a = 127;
            return a;
        } catch (Exception e) {

        }finally {
            System.out.println("I am finally");
        }
        return 0;
    }

    public static int test2() {
        try {
            int a = 127;
            return a;
        } catch (Exception e) {

        }finally {
            return 111;
        }
    }
}
