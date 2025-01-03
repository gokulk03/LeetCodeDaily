import java.util.Scanner;
public class NoOfWaysToSplitArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] inpt = new int[len];
        for(int i=0;i<len;i++){
            inpt[i] = sc.nextInt();
        }
        NoOfWaysToSplitArray noOfWaysToSplitArray = new NoOfWaysToSplitArray();
        int ans = noOfWaysToSplitArray.waysToSplitArray(inpt);
        System.out.println("Count: "+ans);
    }

    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] newSum = new long[n];
        long sum = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            newSum[i] = sum;
        }
        int count = 0;
        for(int i=0;i<n-1;i++){
            if(newSum[i]>=(newSum[n-1]-newSum[i])){
                count++;
            }
        }
        return count;
    }
}
