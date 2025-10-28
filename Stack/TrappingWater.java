package Stack;

public class TrappingWater {
    
    public int trap(int[] height) {
        
        int total = 0;
        int width = height.length;
        int[] prefix = new int[width];
        int[] suffix = new int[width];

        prefix[width-1] = height[width-1];
        suffix[0] = height[0];

        for(int i=1;i<width;i++){
            suffix[i] = Integer.max(suffix[i-1], height[i]); 
        }

        for(int i=width-2;i>=0;i--){
            prefix[i] = Integer.max(prefix[i+1], height[i]);
        }
        for(int i=0;i<height.length;i++){
            int prefixEle = prefix[i];
            int suffixEle = suffix[i];
            if(height[i]<prefixEle && height[i]<suffixEle){
                total+=Integer.min(prefixEle, suffixEle) - height[i];
            }
        }
        return total;
    }


}
