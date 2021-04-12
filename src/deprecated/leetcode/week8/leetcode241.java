//package deprecated.leetcode.week8;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
///**
// * Different ways to add Parentheses
// * Given s string of numbers and operateprs, return all possible results from computing all the different
// * possible ways to group numbers and operators. The valid operators are +,- and *.
// *
// * Example 1:
// * Input: "2-1-1"
// * Output: [0, 2]
// * Explanation:
// * ((2-1)-1) = 0
// * (2-(1-1)) = 2
// *
// * plural noun Parentheses
// * parenthesis
// * a word or phrase inserted as an explanation or afterthought into a passage which is grammatically complete without it, in writing usually marked off by brackets, dashes, or commas.
// *  passage
// *      the action or process of moving through or past somewhere on the way from one place to another.
// *
// */
//public class leetcode241 {
//
//
//    HashMap<String, List<Integer>> map = new HashMap<>();
//
//    public List<Integer> diffWaysToCompute(String input) {
//        if (input.length() == 0) {
//            return new ArrayList<>();
//        }
//        if (map.containsKey(input)) {
//            return map.get(input);
//        }
//        List<Integer> result = new ArrayList<>();
//        int num = 0;
//        int index = 0;
//        while ((index < input.length() && !isOperation(input.charAt(index)))) {
//            num = num * 10 + input.charAt(index) - '0';
//            index++;
//        }
//        if (index == input.length()) {
//            result.add(num);
//            map.put(input, result);
//            return result;
//        }
//        for (int i = 0; i < input.length(); i++) {
//            if (isOperation(input.charAt(i))) {
//                List<>
//            }
//        }
//    }
//
//
//    public static int caculate(int num1, char c, int num2) {
//        switch (c) {
//            case '+':
//                return num1 + num2;
//            case '-':
//                return num1 - num2;
//            case '*':
//                return num1 * num2;
//        }
//        return -1;
//    }
//
//    public static boolean isOperation(char c) {
//        return c == '+' || c == '-' || c == '*';
//    }
//}
