package HashMap;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    
    public int[] twoSumBruteForce(int[] nums, int target){
        for(int i=0;i<nums.length; i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }



    public int[] twoSumOptimized(int[] nums, int target){
        HashMap<Integer, Integer> indexValueMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remainingNo = target - nums[i];
            if(indexValueMap.containsKey(remainingNo)){
                return new int[]{indexValueMap.get(remainingNo), i};
            }
            indexValueMap.put(nums[i], i);
        }
        return nums;
    }


    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{3,4,5,6};
        System.out.println("Index : "+ Arrays.toString(twoSum.twoSumOptimized(nums, 7)));
    }
}
