package org.example.test_5;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap을활용한TwoSum문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        System.out.println("[" + result[0] + "," + result[1] + "]");


    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hM = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hM.containsKey(complement)) {
                return new int[]{hM.get(complement), i};
            }
            hM.put(nums[i], i);
        }
        return new int[]{};
    }
}
