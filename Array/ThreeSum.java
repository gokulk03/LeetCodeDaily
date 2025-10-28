package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    
     public List<List<Integer>> threeSum(int[] nums) {
        
        if(null == nums || nums.length<3){
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        Set<List<Integer>> resultSet = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int leftPointer = i+1;
            int righPointer = nums.length-1;

            while(leftPointer<righPointer){
                int sum = nums[i] + nums[leftPointer] + nums[righPointer];
                if(sum == 0){
                    resultSet.add(Arrays.asList(nums[i], nums[leftPointer], nums[righPointer]));
                    leftPointer++;
                    righPointer--;
                }
            

                else if(sum>0){
                    righPointer--;
                }
                else{
                    leftPointer++;
                }
            }
        }
        return new ArrayList<>(resultSet);
    }
}
