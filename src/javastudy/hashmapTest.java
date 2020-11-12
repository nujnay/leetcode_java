package javastudy;

import org.apache.commons.collections4.CollectionUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class hashmapTest {
    public static void main(String[] args) {
//        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("", "");
//        String test = new String(new char[]{1});
//        String test2 = "1";
//        int h = 0;
//        for (byte v : test.getBytes()) {
//            System.out.println("v:::" + v);
//            System.out.println("v2:::" + (v & 0xff));
//            h = 31 * h + (v & 0xff);
//            System.out.println("h:::" + h);
//        }
//


//
//        int hash = test.hashCode();
//        System.out.println("hash::" + hash);
//        int hash2 = test2.hashCode();
//        System.out.println("hash2::" + hash2);
//        int hashfinal = hash ^ (hash >>> 16);
//        System.out.println("hashfinal::" + hashfinal);
        test2();
    }


    public static void test2() {
        Map<String, Set<String>> registerWords = new HashMap<>();
        String platforms = "rr";
        Set<String> set = registerWords.get(platforms);
        if (CollectionUtils.isEmpty(set)) {
            set = new HashSet<>();
            System.out.println("ffff");
            registerWords.put(platforms, set);
        }
    }
}
