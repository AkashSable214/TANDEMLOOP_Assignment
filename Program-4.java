
package test;

import java.util.*;

public class MultiplesCounter {
    public static void main(String[] args) {
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        for (int key = 1; key <= 9; key++) {
            int count = 0;
            for (int num : input) {
                if (num % key == 0) {
                    count++;
                }
            }
            countMap.put(key, count);
        }

        
        System.out.println("Output:");
        System.out.println(countMap);
    }
}

