package Array;

import java.util.Arrays;
import java.util.HashMap;

public class LongestConsequtiveSequence {
    
    // public int longestConsequtiveSeqImpl(int[] nums){
    //     if(nums == null || nums.length==0){
    //         return 0;
    //     }
    //     int longestSeqLen = 1;
    //     int counter = 1;
    //     Arrays.sort(nums);
    //     for(int i = 0;i<nums.length-1;i++){
    //         int num = nums[i];
    //        if(nums[i+1] == num+1){
    //         counter++;
    //        }else if((nums[i+1] == num)){
    //         longestSeqLen = Integer.max(counter, longestSeqLen);
    //        }else{
    //                     longestSeqLen = Integer.max(counter, longestSeqLen);

    //         counter = 1;

    //        }
    //     }

    //     return longestSeqLen;
    // }

    public int longestConsequtiveSeqSortingImpl(int[] nums){
        HashMap<Integer, Boolean> exploredMap = new HashMap<>();
        int lengthOfLongestSeq = 0;
        for(int num : nums){
            exploredMap.put(num, Boolean.FALSE);
        }

        for(int currentNo : nums){
            int currentLength = 1;
            //check in forward direction 
            int nextNum = currentNo + 1;
            while(exploredMap.containsKey(nextNum) && exploredMap.get(nextNum).equals(Boolean.FALSE)){
                currentLength+=1;
                exploredMap.put(currentNo, Boolean.TRUE);
                nextNum++;
            }


            int prevNo = currentNo - 1;
            while(exploredMap.containsKey(prevNo) && exploredMap.get(prevNo).equals(Boolean.FALSE)){
                currentLength++;
                exploredMap.put(prevNo, Boolean.TRUE);
                prevNo--;
            }

            lengthOfLongestSeq = Math.max(currentLength, lengthOfLongestSeq);
        }        


        return lengthOfLongestSeq;
    }

    public static void main(String[] args) {
        int[] nums = {2,20,4,10,3,4,5};
        LongestConsequtiveSequence solution = new LongestConsequtiveSequence();
        System.out.println("Answer : "+solution.longestConsequtiveSeqSortingImpl(nums));
    }
}
