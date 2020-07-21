package javatest;

import java.util.HashMap;

public class hashmapTest {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("", "");
        String test = "12";
        int h = 0;
        for (byte v : test.getBytes()) {
            System.out.println("v:::"+v);
            System.out.println("v2:::"+(v & 0xff));
            h = 31 * h + (v & 0xff);
            System.out.println("h:::"+h);
        }
    }
}
