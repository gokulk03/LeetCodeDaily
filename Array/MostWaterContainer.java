package Array;

import java.util.HashMap;

public class MostWaterContainer {
    
    public int maxAreaBruteForce(int[] heights){
        int len = heights.length;
        int maxArea = Integer.MIN_VALUE;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                int minvalue = Integer.min(heights[i], heights[j]);
                maxArea = Integer.max(maxArea, minvalue*(j-i));
            }
        }
        return maxArea;
    }


    public int maxAreaOptimized(int[] heights){
        int len = heights.length;
        int leftPointer = 0;
        int rightPointer = len;
        
        
        int maxArea = 0;

        while(leftPointer<rightPointer){
            int width = Integer.min(heights[leftPointer], heights[rightPointer]);
            maxArea = Integer.max(maxArea, width*(rightPointer-leftPointer));
            if(heights[leftPointer]<heights[rightPointer]){
                leftPointer++;
            }
            else{
                rightPointer--;

                
            }
        }
        return maxArea;
    }
}
