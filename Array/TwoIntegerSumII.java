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

    //Optimzed Approach
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


}
