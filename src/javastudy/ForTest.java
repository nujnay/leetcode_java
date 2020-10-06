package javastudy;

public class ForTest {
    public static void main(String[] args) {
        int a = 1;
        test1();
        System.out.println("======");
        test2();
    }

    public static void test1() {
        String i = "1";
        for (; !i.equals("8"); ) {
            System.out.println(i);
            i = String.valueOf(Integer.parseInt(i) * 2);
        }
        System.out.println("end" + i);
    }

    public static void test2() {
        String i = "1";
        for (; !i.equals("8"); i = String.valueOf(Integer.parseInt(i) * 2)) {
            System.out.println(i);
        }
        System.out.println("end" + i);
    }

    public static void test3() {
        String i = "1";
        for (; !i.equals("8"); test2()) {
            System.out.println(i);
        }
        System.out.println("end" + i);
    }


}
