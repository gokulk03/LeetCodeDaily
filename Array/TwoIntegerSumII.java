package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoIntegerSumII {
    
    //brute force - O(n^2) 
    public int[] twoSumBruteForce(int[] numbers, int target) {
        for(int i = 1;i<=numbers.length;i++){
            for(int j= 1;j<=numbers.length; j++){
                if(i!=j && (numbers[i]+numbers[j]) == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //Optimzed Approach binary search - o(nlogn)
    public int[] twoSumOptimized(int[] numbers, int target) {
        int len = numbers.length;
        Arrays.sort(numbers);
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            if((numbers[i]+numbers[j])==target){
                return new int[]{i+1,j+1};
            }
            else if((numbers[i]+numbers[j])<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }

        public int[] twoSumMostOptimalSol(int[] numbers, int target) {
            HashMap<Integer, Integer> complementFreqMap = new HashMap<>();

            for(int i=0;i<numbers.length;i++){
                int complement = target - numbers[i];
                if(complementFreqMap.containsKey(complement)){
                    return new int[]{complementFreqMap.get(complement)+1, i+1};
                }

                complementFreqMap.put(numbers[i], i);
            }
            return new int[]{-1,-1};
        }



}
