package Array;


import java.util.Arrays;
import java.util.HashMap;

public class ArrayProdExceptSelf {
     public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        for(int i : nums){
            if(i!=0){
                product = product*i;
            }else{
                zeroCount++;
            }
        }
        
        int[] answer = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(zeroCount>1){
                answer[i] = 0;
            }
            else if(zeroCount==1){
               answer[i]= answer[i]==0?product:0;
            }else{
                answer[i] = product/nums[i];
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        ArrayProdExceptSelf arrayProdExceptSelf = new ArrayProdExceptSelf();
        int[] nums = {1,2,4,6};
        System.out.println("Answer : "+ Arrays.toString(arrayProdExceptSelf.productExceptSelf(nums)));
    }
}
