package javastudy;

public class ForTest {
    public static void main(String[] args) {
        int a = 1;
        for (String i = "1"; !i.equals("8"); i = String.valueOf(Integer.parseInt(i) * 2)) {
            System.out.println(i);
        }

    }
}
