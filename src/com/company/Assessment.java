package com.company;

import java.util.HashMap;
import java.util.Hashtable;

public class Assessment {

    public Integer[] findIndexesWithNestedForLoops(Integer[] nums, Integer target){
        for (int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++){
                if (i != j && nums[i] + nums[j] == target) return new Integer[]{i, j};
            }
        }
        return null;
    }

    public Integer[] findIndexesWithHashTable(Integer[] nums, Integer target){
        Hashtable<Integer,Integer> numTable = new Hashtable<>();
        for (int i = 0; i < nums.length; i++){
            numTable.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++){
            int desiredValue = target - nums[j];
            if (numTable.containsKey(desiredValue)) return new Integer[]{j, numTable.get(desiredValue)};
        }
        return null;
    }

}
