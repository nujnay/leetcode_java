package javastudy;

public class ByteShortIntTest {
    public static void main(String[] args) {
        int a = 11;
        a++;
        System.out.println(a);

        int b = 11;
        System.out.println(b);

        System.out.println(test1());
        System.out.println(test2());
        System.out.println(test3());
    }

    public static int test1() {
        byte a = 1;
        a++;
        return a;
    }
    public static int test2() {
        int a = 1;
        a++;
        return a;
    }

    public static int test3() {

        return 1;
    }
}
