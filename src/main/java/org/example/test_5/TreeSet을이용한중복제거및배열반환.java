package org.example.test_5;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet을이용한중복제거및배열반환 {
    public static int[] uniqueSorted(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3, 4, 1};
        System.out.println(Arrays.toString(uniqueSorted(nums))); // [1,2,3,4]
    }
}
