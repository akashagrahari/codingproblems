package dynamic;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    Map<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        ClimbingStairs obj = new ClimbingStairs();
//        System.out.println(obj.climbStairs(2));
        System.out.println(obj.climbStairs(45));
        //1836311903
    }

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        if (!map.containsKey(n-1)) {
            map.put(n-1, climbStairs(n-1));
        }

        if (!map.containsKey(n-2)) {
            map.put(n-2, climbStairs(n-2));
        }

        return map.get(n-1) + map.get(n-2);
    }



//    public int climbStairs(int n) {
//        int last = 1;
//        int secondLast = 1;
//
//        for (int i = 0; i<(n-1); i++ ) {
//            int temp = secondLast;
//            secondLast = secondLast + last;
//            last = temp;
//        }
//        return secondLast;
////         if (n == 1) {
////             return 1;
////         } else if (n == 2) {
////             return 2;
////         }
//
////         return (climbStairs(n-1)) + (climbStairs(n-2));
//    }
}
