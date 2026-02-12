package test.Map;

import java.util.HashMap;

public class FreqMap {
    public static void main(String [] args){
        String str = "TheworldisAstageAndAllthemandwomenareplayesr";
        String lower = str.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<lower.length();i++){
            char ch = lower.charAt(i);
//            if(map.containsKey(ch)){
//                map.put(ch,map.get(ch)+1);
//            }else{
//                map.put(ch,1);
//            }
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        System.out.println(lower);

    }
}
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        if (nums[0] + nums[1] == target) {
//            return new int[] {0, 1};
//        } else if (nums[0] + nums[2] == target) {
//            return new int[] {0, 2};
//        } else if (nums[1] + nums[2] == target) {
//            return new int[] {1, 2};
//        }
//        // add more conditions for larger arrays...
//        return new int[] {}; // return empty array if no solution found
//    }
//}

