package javatest;

import java.util.HashMap;

public class hashmapTest {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("", "");
        String test = new String(new char[]{1});
        String test2 = "1";
        int h = 0;
        for (byte v : test.getBytes()) {
            System.out.println("v:::" + v);
            System.out.println("v2:::" + (v & 0xff));
            h = 31 * h + (v & 0xff);
            System.out.println("h:::" + h);
        }


        int hash = test.hashCode();
        System.out.println("hash::" + hash);
        int hash2 = test2.hashCode();
        System.out.println("hash2::" + hash2);
        int hashfinal = hash ^ (hash >>> 16);
        System.out.println("hashfinal::" + hashfinal);
    }
}
